import java.net.*;
import javax.naming.*;
import java.util.*;


public class DNSLookup2
{
public static void main(String args[])
{
try
{
URL url = new URL ("http://www.cruisebooking.in/");
URLConnection connection = url.openConnection();

connection.connect();

// Cast to a HttpURLConnection
if ( connection instanceof HttpURLConnection)
{
   HttpURLConnection httpConnection = (HttpURLConnection) connection;

   int code = httpConnection.getResponseCode();
System.err.println (String.valueOf(code));

   // do something with code .....
}
else
{
   System.err.println ("error - not a http request!");

}
}
catch(Exception ex)
{
ex.printStackTrace();
}


}
}