/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import data.User;
import data.Videogame;
import forms.admin.AltaVideojuegos;
import forms.login;
import forms.registro;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.mockito.Mock;
import org.mockito.Mockito;

/**
 *
 * @author CARLA LLENAS
 */
@DisplayName("Client Test")
public class ClientTest {

    private static Socket socketClient;
    private static ObjectInputStream ois;
    private static ObjectOutputStream oos;
    private static DataOutputStream outData;
    private static DataInputStream inData;
    final static int PORT = 5000;
    final static String IP = "localhost";
    //final static String IP = "90.170.253.138";
    final static int connection_time_out = 8000;
    private static login log;
    private static User user;
    private static User userOk;
    private static User userFail;
    private static User userExistingMail;

    private static Videogame game;
    private static Videogame gameOk;
    private static Videogame gameExisting;
    private static Videogame gameFail;

    @Mock
    registro reg = Mockito.mock(registro.class);

    @Mock
    login login = Mockito.mock(login.class);

    @Mock
    AltaVideojuegos altaVid = Mockito.mock(AltaVideojuegos.class);

    @BeforeAll
    public static void setUpClass() {

        //usuario registrado correctamente
        userOk = new User();
        userOk.setIsAdmin(true);
        userOk.setMail("client@mail.cat");
        userOk.setName("Client");
        userOk.setPassword("123");
        userOk.setUsername("client");

        //usuario ya existe
        userFail = new User();
        userFail.setIsAdmin(true);
        userFail.setMail("client@mail.cat");
        userFail.setName("Client");
        userFail.setPassword("123");
        userFail.setUsername("client");

        //usuario intenta registrarse con un correo ya registrado
        userExistingMail = new User();
        userExistingMail.setIsAdmin(true);
        userExistingMail.setMail("client@mail.cat");
        userExistingMail.setName("Desktop");
        userExistingMail.setPassword("desktop");
        userExistingMail.setUsername("123456");

        //videogame registrado correctamente
        gameOk = new Videogame();
        gameOk.setName("Zelda");
        gameOk.setDescription("a Nintendo game");
        gameOk.setDeveloper("Nintendo");
        gameOk.setPublisher("Nintendo");

        //videogame ya existe
        gameExisting = new Videogame();
        gameExisting.setName("Zelda");
        gameExisting.setDescription("game");
        gameExisting.setDeveloper("developer");
        gameExisting.setPublisher("developer");

    }

    /**
     * Comprovem que l'usuari ha omplert tots els camps de text necessaris per
     * al registre
     */
    @Test
    @DisplayName("Correcto campo de texto")
    public void testPruebaEmptyFalse() {
        assertFalse(registro.textEmpty("Carla", "a", "a", "a", "a"));
    }

    /**
     * Comprovem que l'usuari s'ha deixat per emplenar algun camp de text
     * necessari per al registre
     */
    @Test
    @DisplayName("Error campo de texto")
    public void testPruebaEmptyTrue() {
        assertTrue(registro.textEmpty("Carla", "", "a", "a", "a"));
    }

    /**
     * Amb Mockito, comprovem que l'usuari existeix per tant podra iniciar
     * sessió.
     */
    @Test
    @DisplayName("LoginOK")
    public void loginOk() {
        Mockito.when(login.sendLogin("client", "123")).thenReturn(Boolean.TRUE);
        assertTrue(login.sendLogin("client", "123"));
    }

    /**
     * Amb Mockito, comprovem que l'usuari no existeix per tant no podra iniciar
     * sessió.
     */
    @Test
    @DisplayName("LoginFail")
    public void loginFail() {
        Mockito.when(login.sendLogin("aaa", "123")).thenReturn(false);
        assertFalse(login.sendLogin("aaa", "123"));
    }

    /**
     * Amb Mockito comprovem que l'usuari s'ha registrat correctament mitjançant
     * el byte rebut del servidor.
     */
    @Test
    @DisplayName("Test Registro Bien")
    public void testRegistro() {
        Mockito.when(reg.sendRegister(userOk)).thenReturn((byte) 0);
        byte ok = reg.sendRegister(userOk);
        assertEquals(0, ok);
    }

    /**
     * Amb Mockito, comprovem que l'usuari ja està registrat amb les mateixes
     * dades mitjançant el byte rebut pel servidor.
     */
    @Test
    @DisplayName("Test Registro Fail")
    public void testRegistroRepetido() {
        Mockito.when(reg.sendRegister(userFail)).thenReturn((byte) 1);
        byte ok = reg.sendRegister(userFail);
        assertEquals(1, ok);
    }

    /**
     * Amb Mockito, comprovem que l'usuari s'està intentant registrar amb un
     * correu ja registrat anteriorment mitjançant el byte rebut pel servidor
     */
    @Test
    @DisplayName("Test Registro Mail Existente")
    public void testRegistroMailEncontrado() {
        Mockito.when(reg.sendRegister(userExistingMail)).thenReturn((byte) 2);
        byte ok = reg.sendRegister(userExistingMail);
        assertEquals(2, ok);
    }

    /**
     * metode per comprovar la connexió del client amb el servidor.
     */
    @Test
    @DisplayName("Servidor conectado")
    public void serverConn() {
        try {
            socketClient = new Socket(IP, PORT);
            assertTrue(socketClient.isConnected());
        } catch (IOException ex) {
            Logger.getLogger(ClientTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * metode per comprovar la desconnexió del client amb el servidor.
     */
    @Test
    @DisplayName("Servidor desconectado")
    public void serverDisconn() {
        try {
            socketClient.close();
            assertTrue(socketClient.isClosed());
        } catch (IOException ex) {
            Logger.getLogger(ClientTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //------------------------------------------------------------------TEA 3-----------------------------------------------------------------------------------------------
    /**
     * Amb Mockito comprovem que el videojoc s'ha donat d'alta correctament
     * mitjançant el byte rebut del servidor.
     */
    @Test
    @DisplayName("Alta Videojuego Bien")
    public void testAltaVideojuegoBien() {
        Mockito.when(altaVid.sendVideogame(gameOk)).thenReturn((byte) 0);
        byte ok = altaVid.sendVideogame(gameOk);
        assertEquals(0, ok);
    }

    /**
     * Amb Mockito, comprovem s'està intentant donar d'alta un videojoc amb un
     * nom ja registrat anteriorment mitjançant el byte rebut pel servidor
     */
    @Test
    @DisplayName("Alta Videojuego Existente")
    public void testAltaVideojuegoYaExiste() {
        Mockito.when(altaVid.sendVideogame(gameExisting)).thenReturn((byte) 1);
        byte ok = altaVid.sendVideogame(gameExisting);
        assertEquals(1, ok);
    }

    /**
     * Amb Mockito, comprovem s'està intentant donar d'alta un videojoc pero
     * alguna cosa ha fallat i no s'ha completat correctament l'alta
     */
    @Test
    @DisplayName("Alta Videojuego Error")
    public void testAltaVideojuegoError() {
        Mockito.when(altaVid.sendVideogame(gameFail)).thenReturn((byte) 2);
        byte ok = altaVid.sendVideogame(gameFail);
        assertEquals(2, ok);
    }

}
