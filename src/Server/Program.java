package Server;

import Client.controller.Connect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class Program extends JFrame{

    private JPanel contentPane;
    private JButton btnOpen;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Program frame = new Program();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Program(){
        setTitle("Server");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        contentPane = new JPanel();

        setContentPane(contentPane);
        contentPane.setLayout(null);

        btnOpen.setBounds(150, 100, 100, 50);
        btnOpen.setText("Open");
        contentPane.add(btnOpen);
        btnOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    CreateServer server = new CreateServer();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

}