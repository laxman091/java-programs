// Use a BufferedReader to read characters from the console.
import java.io.*;

public class BRRead
{
public static void main(String args[]) throws IOException

{

try
{
InputStream in=new FileInputStream("copy3.txt");
int c;

while(c=in.read()!=-1)
{

System.out.println((Char)c);


}

}
catch(Excetion e)
{}


}

}