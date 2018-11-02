import java.io.*;  
import java.net.*;  
  
public class WriteData {  
public static void main(String[] args){  
try{  
URL url=new URL("http://www.cruisebooking.in/prb.txt");  
URLConnection urlcon=url.openConnection();  
  
//InputStream stream=urlcon.getInputStream(); 
DataOutputStream out = new DataOutputStream(new 
                                 FileOutputStream(urlcon));

     // String count;
     // while((count = d.readLine()) != null){
          String u = count.toUpperCase();
          //System.out.println(u);
          out.writeBytes("Hello Prabash");
      //}
      d.close();
      out.close(); 
//int i;  
//while((i=stream.read())!=-1){  
//System.out.print((char)i);  
//}  
  
}
catch(Exception e){System.out.println(e);}  
}  
}