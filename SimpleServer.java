// SimpleServer.java: A simple server program.
import java.net.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.Dimension;
import java.awt.event.*;


public class SimpleServer extends JFrame  {

// Register service on port 1254 and network component part
ServerSocket s;
Socket s1;
OutputStream s1out;
DataOutputStream dos;

//display component part
JTextArea textarea;
JTextField textfield;
JScrollPane scroll;
JButton btn;
	SimpleServer()
			{
				s = new ServerSocket(1254);
				setTitle("Server");
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setSize(500,450);
				setLocationRelativeTo(null);
				setLayout(null);
				setVisible(true);
				textarea = new JTextArea("text area");
				textarea.setPreferredSize(new Dimension(100, 100));
				scroll=new JScrollPane(textarea);
				textfield=new JTextField(50);
				btn=new JButton("Send");
				

				//add compenent
				textarea.setBounds(10,50,200,200);
				textfield.setBounds(10,255,100,50);
				btn.setBounds(300,300,80,80);
				add(textarea);
				add(textfield);
				add(btn);
				pack();
					
				//setVisible(true);
					while(true)
						{
							try{
							s1=s.accept(); // Wait and accept a connection

							// Get a communication stream associated with the socket
							s1out = s1.getOutputStream();
							dos = new DataOutputStream(s1out);
							
							// Send a string!
							dos.writeUTF("Hi Client");
							}

						

						catch(IOException ioe)
							{

							//dos.close();
							//s1out.close();
							//s1.close();
							}
							finally()
							{
							
							dos.close();
							s1out.close();
							s1.close();
							}
						}





	
			}

public static void main(String args[])
{
new SimpleServer();
}
}