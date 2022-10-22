/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import data.User;
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

/**
 *
 * @author CARLA LLENAS
 */
public class ClientTest {

    private static Socket socketClient;
    private static ObjectInputStream ois;
    private static ObjectOutputStream oos;
    private static DataOutputStream outData;
    private static DataInputStream inData;
    private static User user;
    final static int PORT = 5000;
    final static String IP = "90.170.253.138";
    final static int connection_time_out = 8000;
    private static login log;

//    @BeforeAll
//    public static void setUpClass() {
//        try {
//            socketClient = new Socket();
//            socketClient.connect(new InetSocketAddress(IP, PORT), connection_time_out);
//            oos = new ObjectOutputStream(socketClient.getOutputStream());
//            ois = new ObjectInputStream(socketClient.getInputStream());
//            inData = new DataInputStream(socketClient.getInputStream());
//            outData = new DataOutputStream(socketClient.getOutputStream());
//        } catch (IOException ex) {
//            Logger.getLogger(ClientTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    @AfterAll
//    public static void tearDownClass() {
//        try {
//            inData.close();
//            outData.close();
//            ois.close();
//            oos.close();
//            socketClient.close();
//        } catch (IOException ex) {
//            Logger.getLogger(ClientTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    @Test
    public void testRegistro() {
//         log = new login();
//         log.doLogin("admin", "admin");     
        assertFalse(registro.textEmpty("Carla", "a", "a", "a", "a"));
    }
    @Test
    public void testRegistroMal() {    
        assertTrue(registro.textEmpty("Carla", "", "a", "a", "a"));
    }
}
