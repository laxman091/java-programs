import java.io.File;
public class CreateDir {
public static void main(String args[]) {
String dirname = "E:\\Aartie\\st";
File d = new File(dirname);
// Create directory now.
System.out.println("Directory create..." + d.mkdirs());
}
}