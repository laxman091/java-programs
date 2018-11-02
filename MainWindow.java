import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;


public class MainWindow extends JFrame
{

MainWindow()
{
setTitle("Welcome to STIC Group");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(800,700);

setLocationRelativeTo(null);

//Toolkit toolkit = getToolkit();

//Dimension size = toolkit.getScreenSize();
//setLocation(size.width/2 - getWidth(),size.height/2 - getHeight());



setVisible(true);
}

public static void main(String args[])
{

new MainWindow();


}


}