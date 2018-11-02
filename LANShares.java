import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
 
public class LANShares {
 
	/**
	 * JavaProgrammingForums.com
	 */
	public static void main(String[] args) {
 
		try {
	        String line = null;
	        String[] commands = new String[] { "cmd", "/C", "net share" };
	        Process child = Runtime.getRuntime().exec(commands);
	        InputStream ins = child.getInputStream();
	        BufferedReader buffReader = new BufferedReader(new InputStreamReader(ins));
	        while (!(line = buffReader.readLine()).trim().equals(
	                "The command completed successfully.")) {
	            System.out.println(line);
	             }
	    } catch (Exception exp) {
	    	System.out.println("Ouch - " + exp);
	    }
	}
}