import java.net.NetworkInterface;  
import java.net.SocketException;  
import java.util.Enumeration;  
  
public class InternetConnection {  
    public static void main(String[] args) throws InterruptedException {  
        Enumeration<NetworkInterface> interfaces = null;  
        try {  
            interfaces = NetworkInterface.getNetworkInterfaces();  
        } catch (SocketException e) {  
            e.printStackTrace();  
        }    
        while (interfaces.hasMoreElements()) {    
            NetworkInterface nic = interfaces.nextElement();    
  
            System.out.print("Interface Name : [" + nic.getDisplayName() + "]");    
            try {  
                System.out.println(", Is connected : [" + nic.isUp() + "]");  
            } catch (SocketException e) {  
                e.printStackTrace();  
            }    
        }    
    }    
}