package Client.controller;

import java.io.*;
import java.net.*;
public class Connect {
    public Connect(String IP) throws IOException {
        Socket server = new Socket("localhost",8686);
        System.out.println("Client Connect Success!");
    }
}
