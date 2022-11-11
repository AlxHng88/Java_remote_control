package Client;

import Client.view.client;

import java.awt.*;

public class Program {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    client frame = new client();
                    System.out.println("Start Success!");
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
