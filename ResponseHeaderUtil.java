import org.apache.http.*;
 
public class ResponseHeaderUtil {
 
  public static void main(String[] args) {
 
    try {
 
	HttpClient client = new DefaultHttpClient();
	HttpGet request = new HttpGet("http://mkyong.com");
	HttpResponse response = client.execute(request);
 
	System.out.println("Printing Response Header...\n");
 
	Header[] headers = response.getAllHeaders();
	for (Header header : headers) {
		System.out.println("Key : " + header.getName() 
                           + " ,Value : " + header.getValue());
 
	}
 
	System.out.println("\nGet Response Header By Key ...\n");
	String server = response.getFirstHeader("Server").getValue();
 
	if (server == null) {
		System.out.println("Key 'Server' is not found!");
	} else {
		System.out.println("Server - " + server);
	}
 
	System.out.println("\n Done");
 
    } catch (Exception e) {
	e.printStackTrace();
    }
  }
}