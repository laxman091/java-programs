import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.sql.*;

public class Testdemo extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4;
JTextField t1,t2;
JButton btn1,btn2;
Connection con=null;
Statement smt;
ResultSet rs;

	public Testdemo()
			{	
		
				
				setTitle("Database Demo");

				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

				setLayout(null);
				
				setSize(450,500);
				setLocationRelativeTo(null);

				t1=new JTextField(50);
				t2=new JTextField(50);

				btn1=new JButton("show");
				btn2=new JButton("Close");

				t1.setBounds(10,100,80,35);
				t2.setBounds(10,150,80,35);

				btn1.setBounds(80,200,70,40);
				btn2.setBounds(200,200,70,40);

				btn1.addActionListener(this);
				btn2.addActionListener(this);
				
				add(t1);
				add(t2);
				add(btn1);
				add(btn2);


				setVisible(true);
			}

		public void actionPerformed(ActionEvent event) 
			{

					if(event.getSource()==btn1)
						{
							String str1=t1.getText();
							//String str2=t2.getText();

							try
							{
								Class.forName("com.mysql.jdbc.Driver");
								con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","mysql");
								smt=con.createStatement();
					
				
							
							
							//JOptionPane.showMessageDialog(this, "You entered :"+ str,"check",INFORMATION_MESSAGE);
							//JOptionPane.showMessageDialog(this,"Please Enter Credentials to Login!"+ str);
							//JOptionPane.showMessageDialog(this,"Record is Added!","STIC Group",JOptionPane.PLAIN_MESSAGE);	
							//String qry="insert into dbin(st) values('str')";
							System.out.println(str1);
							
								
							//smt.executeUpdate('insert into dbin(st) values(str)');
							int update=smt.executeUpdate("INSERT INTO dbin (st) " + "VALUES('" + str1 + "')");
							
							//System.out.printn(" Row inserted Successfule " + update );
							JOptionPane.showMessageDialog(this,"Record is Added! " + update,"STIC Group",JOptionPane.PLAIN_MESSAGE);	
							t1.setText("");
							smt.close();
							rs.close();
							//con.close();
							}

							catch(Exception ex)
							{
								//con.close();
								System.out.println(ex);
							}
							
							finally {
									if( con != null ) {

												try { con.close( ); }
												catch( SQLException e ) { e.printStackTrace( ); }
											   }
								}
							
							
							
						}
					if(event.getSource()==btn2)
						{
							System.exit(0);
						}



			}


	public static void main(String args[])

		{
			new Testdemo();

		}

}