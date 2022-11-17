package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import controller.ControlListener;
import model.Client;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class ControlDesign extends JFrame {
    public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    try {
                        ControlDesign frame = new ControlDesign();
                        frame.setVisible(true);
                        frame.addWindowListener(new WindowAdapter() {
                            public void windowClosing(WindowEvent e) {
                                String s = "EXIT_CONTROL";
                                try {
                                    Client.out.write(s);
                                    Client.out.newLine();
                                    Client.out.flush();
                                } catch (IOException e1) {
                                    e1.printStackTrace();
                            }
                         }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public CaptureDesign(){
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
