import javax.swing.*;


public class ControlWindow extends JFrame
{

ControlWindow()
{
setTitle("Controller Access");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(800,700);
setLocationRelativeTo(null);
setVisible(true);

}

public static void main(String args[])
{

new ControlWindow();


}


}