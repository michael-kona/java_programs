//client socket to access server socket that runs at port 2000

import java.net.*;
import java.io.*;

public class CSocket
    {
     public static void main(String args[])throws Exception
        {
         Socket cs=new Socket("server",21);
         InputStream is=cs.getInputStream();
       BufferedReader br=new BufferedReader(new InputStreamReader(is));
       String line=br.readLine();
       System.out.println(line);
          }
     }