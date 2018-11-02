    import java.net.HttpURLConnection;  
    import java.net.URL;  
      
    class Main2 {  
      
        public static void main(String[] args){  
              
            String command;  
            command="netsh interface ip set address"+  
            " \"VMWare Network Adapter VMNet1\""+  
            " static 192.150.5.222 255.255.255.0 192.150.1.5 1";  
                      
            Runtime r=Runtime.getRuntime();  
      
            try{  
                  
                try{  
                    URL url=new URL("http://www.google.com");  
                    HttpURLConnection con=(HttpURLConnection) url.openConnection();  
                    con.connect();  
                    System.out.println(con.getResponseCode());  
                }catch(Exception x){  
                    System.out.println("No Connection");  
                }  
                  
                Process p=r.exec(command);  
      
                try{  
                    URL url=new URL("http://www.google.com");  
                    HttpURLConnection con=(HttpURLConnection) url.openConnection();  
                    con.connect();  
                    System.out.println(con.getResponseCode());  
                }catch(Exception x){  
                    System.out.println("No Connection");  
                }  
                  
            }catch(Exception e){  
                e.printStackTrace();  
            }  
              
        }  
          
    }  