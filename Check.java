import java.net.*;
 import java.util.*;
 
public class Check {
 public static void main(String[] args) {
 boolean connectivity;
 try {
 URL url = new URL("http://www.cruisebooking.in/");
 URLConnection conn = url.openConnection();
 conn.connect();
 connectivity = true;
 System.out.println(conn);
 } catch (Exception e) {
 connectivity = false;
 System.out.println("Not Working" + e);
 }
 
}
}