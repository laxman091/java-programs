import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Authentication extends JFrame implements ActionListener

{	
	JMenuBar mb;
	JMenu file;
	JMenuItem ex;
	JLabel userlabel,passlabel,loginas;
	JTextField textfield;
	JPasswordField passfield;
	JButton log,res,press;
	JComboBox combobox;
	InputMap im;
	
	
	public Authentication()
		{
			setTitle("Master Login");
			setSize(250,200);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(null);
			
			
			String comboboxlist[]={"Root","User"};
				
			userlabel=new JLabel("Username:");
			passlabel=new JLabel("Password:");
			textfield=new JTextField(20);
			textfield.requestFocus();	
				
			passfield=new JPasswordField(20);
			log=new JButton("Login");
			
			im = log.getInputMap();
			im.put(KeyStroke.getKeyStroke("ENTER"), "none");
        		im.put(KeyStroke.getKeyStroke("released ENTER"), "released");	


			log.addActionListener(this);
			mb=new JMenuBar();
			file=new JMenu("Option");

			//press=new JButton();
			
			
			loginas=new JLabel("Login as:");
			combobox=new JComboBox(comboboxlist);
			
			ex=new JMenuItem("Quit");
			file.add(ex);
			mb.add(file);
			ex.addActionListener(this);
			
			res=new JButton("Reset");
			res.addActionListener(this);

			userlabel.setBounds(25,20,70,25);
			textfield.setBounds(90,20,95,25);

			passlabel.setBounds(25,50,70,25);
			passfield.setBounds(90,50,95,25);
			
			loginas.setBounds(60,75,60,25);
			
			combobox.setBounds(120,80,65,20);
			combobox.setSelectedIndex(0);
			
			
				
			log.setBounds(50,110,70,25);
			res.setBounds(140,110,70,25);

			//getRootPane().setDefaultButton(log);

			add(userlabel);
			add(passlabel);
			add(textfield);
			add(passfield);
			add(loginas);
			add(combobox);
			add(log);
			add(res);
			setJMenuBar(mb);
			setResizable( false );

	
			setVisible(true);
			
		
		}
	
	public void actionPerformed(ActionEvent event)
		{
			
			
			String u=new String("admin");
			String p=new String("pass");
			String value=(String)combobox.getSelectedItem();
			
			

			if(event.getSource()==ex)
				{
					System.exit(0);
				}
			
			if(event.getSource()==log)
				{
					

							
							
					if(textfield.getText()=="" && passfield.getText()=="")
						{
							JOptionPane.showMessageDialog(this,"Please Enter Credentials to Login!");	
								
						}
					
					if(textfield.getText().equals(u) && passfield.getText().equals(p) && value.equalsIgnoreCase("Root"))
						{
							dispose();
							new GeneralPage3();
							JOptionPane.showMessageDialog(this,"Welcome To Stic Travel Group!","STIC Group",JOptionPane.PLAIN_MESSAGE);	
						}
					if(textfield.getText().equals(u) && passfield.getText().equals(p) && value.equalsIgnoreCase("User"))
						{
							dispose();
							new GeneralPage4();
							JOptionPane.showMessageDialog(this,"Welcome To Stic Travel Group!","STIC Group",JOptionPane.PLAIN_MESSAGE);	
						}
						
						
						

				}
			//if(event.getSource()==log && textfield.getText()=="" && passfield.getText()=="")
				//{
					//if(textfield.getText()=="" && passfield.getText()=="")
						//{
						//JOptionPane.showMessageDialog(this,"Please Enter Credentials to Login!");	
								
						//}
				//}
			
			if(event.getSource()==res)
				{
					textfield.setText("");
					passfield.setText("");
					
					
				}
			
				
		}
	
public static void main(String[] args)
	{
		Authentication atn=new Authentication();
	}


}