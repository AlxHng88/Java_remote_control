package Client.controller;

import java.io.*;
import java.net.*;
public class Connect {
    public static DataOutputStream dOut;
    public static Connect client;
    public static Process server;

    public Connect(String IP) throws IOException {
        Socket server = new Socket("localhost",8686);
        System.out.println("Client Connect Success!");

        DataOutputStream dOut = new DataOutputStream(server.getOutputStream());

        dOut.writeUTF("test1");
        dOut.flush();
        dOut.close();
    }
}
