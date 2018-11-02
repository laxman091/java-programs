// UDPServer.java: A simple UDP server program.
import java.net.*;
import java.io.*;
public class UDPServer {

public static void main(String args[]){
DatagramSocket aSocket=null;


try {
//int socket_no = Integer.valueOf(args[0]).intValue();
aSocket = new DatagramSocket(23000);
byte[] buffer = new byte[1000];
while(true) {
DatagramPacket request = new DatagramPacket(buffer,buffer.length);
aSocket.receive(request);
System.out.println("Request from client " + request.getAddress() + " Port: " +  request.getPort());

DatagramPacket reply = new DatagramPacket(request.getData(),request.getLength(),request.getAddress(),request.getPort());
aSocket.send(reply);
}
}
catch (SocketException e) {
System.out.println("Socket: "+e.getMessage());
}
catch (IOException e) {
System.out.println("IO: " + e.getMessage());
}
finally {

aSocket.close();
}
}
}