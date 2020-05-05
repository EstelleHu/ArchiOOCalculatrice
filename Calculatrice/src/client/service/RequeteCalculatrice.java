package client.service;


import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

import client.model.OperationModel;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class RequeteCalculatrice {
    private static final Logger LOGGER = Logger.getLogger( RequeteCalculatrice.class.getName() );
    
    private static int PORT = 33001;
    
    public static OperationModel call(OperationModel operation) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException {
        InetAddress host = InetAddress.getLocalHost();
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        
        Socket socket = new Socket(host.getHostName(), PORT);
        
        oos = new ObjectOutputStream(socket.getOutputStream());
        LOGGER.log(Level.INFO, "Connection to server established");
        
        
        LOGGER.log(Level.INFO, "Sending request to Socket Server");
        oos.writeObject(operation);
        
        ois = new ObjectInputStream(socket.getInputStream());
        OperationModel result = (OperationModel) ois.readObject();
        LOGGER.log(Level.INFO, "Received response : " + result);
        
        socket.close();

        return result;
    }
}