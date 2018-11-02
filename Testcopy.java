import java.io.*;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Testcopy
{
public static void main(String args[])
{

File source = new File("D:\\Excel Videos");
File dest = new File("C:\\Users\\Lenov\\Desktop\\videoexcl");
try {
    FileUtils.copyDirectory(source, dest);
} catch (IOException e) {
    e.printStackTrace();
}






}
}