import java.io.*;
class CopyBytes
{
	public static void main(String[] args) 
	{
		FileInputStream infile =null;
		FileOutputStream outfile=null;
		byte byteRead;
		try
		{
		 infile=new FileInputStream("city.txt");
		outfile=new FileOutputStream("output.txt");
		 int ch;
		 do{
		             byteRead=(byte)infile.read();
			 outfile.write(byteRead);
		    }while(byteRead!=-1);
	              }
		catch(FileNotFoundException e)
		{
		System.out.println("file is not there");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
			System.exit(-1);
		}
		finally
		{
			try{
				infile.close();
			    outfile.close();
			}
        	catch(IOException e){}
		}
	}
}
