package Server;

import java.io.*;
import java.net.*;

public class CreateServer {
    public CreateServer() throws IOException {
        System.out.println("Server Start Success!");
        ServerSocket server=new ServerSocket(8686);
        Socket socket=server.accept();

    }
}
