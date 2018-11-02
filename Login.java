import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{
JLabel userlabel,passlabel,loginas;
JTextField t1,t2;
JButton btn1,btn2;
JComboBox combobox;
InputMap im;

Connection con=null;
Statement smt;
ResultSet rs;
String dbuser,dbpass,dbtype;

	public Login()
			{	
		
				
				setTitle("STIC Authentication...");

				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				setLayout(null);
				
				setSize(250,200);
				setLocationRelativeTo(null);

				userlabel=new JLabel("Username");
				passlabel=new JLabel("Password");
			
				String comboboxlist[]={"Admin","User","Control"};

				t1=new JTextField(50);
				t2=new JTextField(50);

				t2.requestFocus();

				btn1=new JButton("Login");
				btn2=new JButton("Close");

				//im = btn1.getInputMap();
				//im.put(KeyStroke.getKeyStroke("ENTER"), "none");
        			//im.put(KeyStroke.getKeyStroke("released ENTER"), "released");

				loginas=new JLabel("Login as:");
				combobox=new JComboBox(comboboxlist);

				userlabel.setBounds(25,20,70,25);
				t1.setBounds(90,20,95,25);

				passlabel.setBounds(25,50,70,25);
				t2.setBounds(90,50,95,25);

				btn1.setBounds(30,125,70,30);
				btn2.setBounds(115,125,70,30);
			
				//userlabel.setBounds(25,20,70,25);
							
			
				loginas.setBounds(30,75,60,25);
			
				combobox.setBounds(90,80,65,20);
				combobox.setSelectedIndex(0);
			
			
				btn1.addActionListener(this);
				btn2.addActionListener(this);

				//getRootPane().setDefaultButton(btn1);
				
				add(userlabel);
				add(t1);
				add(passlabel);
				add(t2);
				add(combobox);	
					
				add(btn1);
				add(btn2);



				setVisible(true);
			}

		public void actionPerformed(ActionEvent event) 
			{

					if(event.getSource()==btn1)
						{
							String str1=t1.getText();
							String str2=t2.getText();
							String str3=(String)combobox.getSelectedItem();
							int count=0;

							try
							{
								Class.forName("com.mysql.jdbc.Driver");
								con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sticdb","root","mysql");
								smt=con.createStatement();
					 
								String query = " SELECT * FROM authentication WHERE username='"+ str1 +"'  AND  password = '" + str2 + "' AND login_type = '" + str3 + "'";	
								 
								rs=smt.executeQuery(query);
								//rs=smt.getResultSet();
								//count=rs.getRow();
								//JOptionPane.showMessageDialog(this,"Welcome To STIC Group! ","STIC Group",JOptionPane.PLAIN_MESSAGE);	
								//dispose();
								//new Authentication();
								while(rs.next())
								{
										dbuser=rs.getString(1); dbpass=rs.getString(2);dbtype=rs.getString(3);
										//System.out.println(val);
									if(str1.equals(dbuser) && str2.equals(dbpass) && str3.equalsIgnoreCase(dbtype))
										{dispose(); new MainWindow();}
								
									if(str1.equals("") || str2.equals(""))
										{
											//JOptionPane.showMessageDialog(null,"Please enter the credentials! ");
										}
									
									
								}
								t1.setText("");
								t2.setText("");
								smt.close();
								rs.close();
								con.close();
							}
							

							catch(Exception ex)
							{
								ex.printStackTrace();
								
							}
							
								
							
							
							
						}
					if(event.getSource()==btn2)
						{
							System.exit(0);
						}



			}


	public static void main(String args[])

		{
			new Login();

		}

}