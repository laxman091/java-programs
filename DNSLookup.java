import java.net.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.awt.*;

import javax.naming.*;

class DNSLookup extends JFrame
{
	InetAddress inetAddress;
	DefaultTableModel model;
	JScrollPane sp1,sp2;
	JTable tb1,tb2;
	//String host[];
	URL url;
	URLConnection connection;
	HttpURLConnection httpConnection;
	
	String r[]=new String[3];
	int code;
	

public DNSLookup()
	{
		setTitle("Domain Status");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setSize(600,600);
		setLocationRelativeTo(null);
		setLayout(null);
		
		
		tb1=new JTable();
		tb2=new JTable();

		tb1.setBackground(Color.yellow);
		//tb1.getColumnModel().getColumn(1).setPreferredWidth(50);
	
		sp1=new JScrollPane(tb1);
		sp2=new JScrollPane(tb2);

		sp1.setBounds(50,50,350,300);
		sp2.setBounds(320,50,250,400);
	
		model=new DefaultTableModel();
		//model.setRowColour(1, Color.YELLOW);
		model.addColumn("Domain");
		model.addColumn("Server IP");
		model.addColumn("Status");

		tb1.setModel(model);

		add(sp1);
		//setVisible(true);

	String host[] = {"www.sticholidays.com","www.cruisebooking.in","www.srilankanholidaysdelhi.com","www.travelppl.com",
			 "www.airchartersindia.net","www.pilgrimageindia.net","www.bedandbreakfastindia.in","www.africanholidays.co.in",
			 "www.alaskacruisebooking.com","www.balticcruise.in","www.subhashgoyal.com","www.sticcare.com","www.sticgroup.com","www.stictravel.com","www.indiatravelnews.com",
			 "www.discountsnsavings.com","www.isic.co.in","www.statravel.co.in","www.privatejetsindia.in","www.airhchartersindia.net",
			 "www.europecruise.in","www.southamericacruise.in","www.caribbeancruisebooking.com","www.southamericacruise.in ",
			 "www.ethiopianculturalcentredelhi.com"};


	try
        {	//System.out.println(host.length);
		for(int i=0;i<host.length;i++){
			
            		inetAddress = InetAddress.getByName(host[i]);

			r[0]=inetAddress.getHostName();
			r[1]=inetAddress.getHostAddress();
			//model.addRow(r);

			try{

			url = new URL (host[i]);
			connection = url.openConnection();

			connection.connect();

			// Cast to a HttpURLConnection
				if ( connection instanceof HttpURLConnection)
					{
   						httpConnection = (HttpURLConnection) connection;

   						code = httpConnection.getResponseCode();
						//System.out.println (host[i] + "-" +code);
						r[2]=Integer.toString(code);
						//tb1.setValueAt(code, 0, 2);

   						// do something with code .....

						//model.addRow(r);
						model.setValueAt(r[2] + " "+ "OK", i, 2);
						
					}
				else
					{
   						System.out.println ("error - not a http request!");

					}
				//model.addRow(r);
			//tb1.setValueAt(code, 0, 2);
				}
				catch(Exception eee)
					{}
			
            		// show the Internet Address as name/address
            		//System.out.println("Domain : " +inetAddress.getHostName() + " - " + inetAddress.getHostAddress());
			
			
			
			model.addRow(r);
			//tb1.setValueAt(code, 0, 2);
			//model.addRow(code);
			
				
		}
        }
        catch (UnknownHostException exception)
        {
           
			
			
				
		}




			//tb1.setModel(model);


        
        


		
		setVisible(true);
	}


    public static void main(String args[])
    {
		
       new DNSLookup(); 
    }
}