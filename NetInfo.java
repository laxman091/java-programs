import java.net.*;
import java.io.*;
import java.util.*;



public class NetInfo {
     public static void main(String[] args) {
        new NetInfo().say();
        }
 
     public void say() {
       try {
       java.net.InetAddress i = java.net.InetAddress.getLocalHost();
       System.out.println(i+ " " +java.net.InetAddress.getLocalHost());                  // name and IP address
       System.out.println(i.getHostName());    // name
       System.out.println(i.getHostAddress()); // IP address only
       }
       catch(Exception e){e.printStackTrace();}
     }
    }