import java.net.*;
import java.util.*;
import java.io.*;
import java.nio.*;
 
public class IPAddress2 {

 
   public static void main(String[] args) {
    URL iana = new URL("http://www.iana.org/assignments/service-names-port-numbers/service-names-port-numbers.xml");
int port = 80;
String protocol = "tcp";
DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
Document doc = db.parse(iana.openStream());
XPathExpression expr = XPathFactory.newInstance().newXPath().compile("//record[number="+port+" and protocol='"+protocol+"']/name"); //or/and description ...
Node name = (Node) expr.evaluate(doc, XPathConstants.NODE);
System.out.println(name.getTextContent()); //http
   }
}