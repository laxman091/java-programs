/*
 * Author: Havard Rast Blok
 * E-mail:  
 * Web   : www.rememberjava.com
 */

import java.io.*;
import java.net.*;

/**
 * This small application takes an URL as argument, and
 * outputs the HTTP response
 * 
 * Refer to the main() method for how to read a local file instead.
 */
public class GetResponse  
{
  public GetResponse( URL theURL )
  {

    HttpURLConnection con;
    int reCode;
    String reMessage,headerfield;
    
    try
    {
      //get the HTTP response
      con = (HttpURLConnection)theURL.openConnection();
      reCode = con.getResponseCode();
      reMessage = con.getResponseMessage();
	//headerfield=con.getHeaderFields();
	//System.out.println(headerfield);
      System.out.println("HTTP response and message: " + reCode  + " - " + reMessage );
      
    }
    catch( IOException e )
    {
      System.out.println( "GetResponse.GetResponse - error opening or reading URL: " + e );
    }
  }
  
  
  public static void main( String args[] )
  {
    try
    {
      new GetResponse(new URL("http://www.cruisebooking.in"));
      
      //Open file from disk instead
      //File f = new File( args[0] );
      //new GetResponse( f.toURL() );
    }
    catch (MalformedURLException e)
    {
      System.out.println("GetResponse.main - wrong url: " +e );
    }
    
  }
}