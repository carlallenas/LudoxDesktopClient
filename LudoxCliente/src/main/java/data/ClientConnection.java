/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author CARLA LLENAS
 */
public class ClientConnection extends Thread {

    static private Socket socket;
    static private DataOutputStream dos;
    static private DataInputStream dis;
    static private ObjectInputStream ois;
    static private ObjectOutputStream oos;

    public ClientConnection(Socket socket) {
        try {
            this.socket = socket;
            dos = new DataOutputStream(socket.getOutputStream());
            dis = new DataInputStream(socket.getInputStream());
            oos = new ObjectOutputStream(socket.getOutputStream());
            oos.flush();
            ois = new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("No hay conexion");
        }

    }

    public static DataOutputStream getDos() {
        return dos;
    }

    public static DataInputStream getDis() {
        return dis;
    }

    public static ObjectInputStream getOis() {
        return ois;
    }

    public static ObjectOutputStream getOos() {
        return oos;
    }

}
