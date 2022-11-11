package Client.view;
import Client.controller.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class client extends JFrame {

    private JPanel contentPane;
    private JTextField txtIP;

    /**
     * Create the frame.
     */
    public client() {
        setTitle("Client");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 452, 284);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        txtIP = new JTextField();
        txtIP.setText(" Enter IP:");
        txtIP.setBounds(20, 10, 305, 34);
        contentPane.add(txtIP);
        txtIP.setColumns(10);

        JButton btnConnect = new JButton("Connect");
        btnConnect.setBounds(335, 9, 85, 35);
        contentPane.add(btnConnect);
        btnConnect.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(txtIP != null){
                    try {
                        Connect connect = new Connect(txtIP.getText());
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            };
        });

        JButton btnApp = new JButton("App Running");
        btnApp.setBounds(20, 54, 140, 80);
        contentPane.add(btnApp);

        JButton btnKeystroke = new JButton("Keystroke");
        btnKeystroke.setBounds(170, 54, 120, 80);
        contentPane.add(btnKeystroke);

        JButton btnCapture = new JButton("Capture");
        btnCapture.setBounds(300, 54, 120, 80);
        contentPane.add(btnCapture);

        JButton btnProcess = new JButton("Process Running");
        btnProcess.setBounds(20, 144, 140, 80);
        contentPane.add(btnProcess);

        JButton btnShutdown = new JButton("Shutdown");
        btnShutdown.setBounds(170, 144, 120, 80);
        contentPane.add(btnShutdown);

        JButton btnExit = new JButton("Exit");
        btnExit.setBounds(300, 144, 120, 80);
        contentPane.add(btnExit);
    }
}

