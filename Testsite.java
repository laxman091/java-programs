import java.net.*;
import java.io.*;
import java.util.*;



class Testsite
{
public static void main(String[] args) {
    System.out.println(
        "Online: " +
        (testInet("myownsite.example.com") || testInet("google.com") || testInet("amazon.com"))
    );
}


public static boolean testInet(String site) {
    Socket sock = new Socket();
    InetSocketAddress addr = new InetSocketAddress(site,80);
    try {
        sock.connect(addr,3000);
        return true;
    } catch (IOException e) {
        return false;
    } finally {
        try {sock.close();}
        catch (IOException e) {}
    }
}


}