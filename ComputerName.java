import java.io.IOException;
import java.net.InetAddress;
 
public class ComputerName {
 
	/**
	 * JavaProgrammingForums.com
	 */
	public static void main(String[] args) throws IOException {
 
		

String computername1=InetAddress.getLocalHost().getHostName();
System.out.println(computername1);
System.out.println(System.getenv("computername"));


 
	}
}