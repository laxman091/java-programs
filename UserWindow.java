import javax.swing.*;


public class UserWindow extends JFrame
{

UserWindow()
{
setTitle("User Access");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(800,700);
setLocationRelativeTo(null);

setVisible(true);

}

public static void main(String args[])
{

new UserWindow();


}


}