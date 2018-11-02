import java.io.*;  
import java.net.*;  
  
public class URLDemo{  
public static void main(String[] args){  
try{  
URL url=new URL("http://www.cruisebooking.in/filter.php");  
  
System.out.println("Protocol: "+url.getProtocol());  
System.out.println("Host Name: "+url.getHost());  
System.out.println("Port Number: "+url.getPort());  
System.out.println("Port no: "+url.getDefaultPort()); 
System.out.printn(url.getAuthority());
  
}catch(Exception e){System.out.println(e);}  
}  
}