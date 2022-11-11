package Client;
import Client.view.client;

import java.awt.*;
import java.io.*;
import java.net.*;

public class Program {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    client frame = new client();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
