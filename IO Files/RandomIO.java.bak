//writing and reading with random access
import java.io.*;
class RandomIO 
{
	public static void main(String[] args) 
	{
	RandomAccessFile file=null;
	try{
	file=new RandomAccessFile("rand.txt","rw");
	//writing to the file
	file.writeChar('X');
	file.writeInt(555);
	file.writeDouble(3.1412);
	file.seek(0);//goto the beginning
	//reading from the file
	System.out.println(file.readChar());
    System.out.println(file.readInt());
    System.out.println(file.readDouble());

    file.seek(1);	//goto second item
	System.out.println(file.readInt());
	    file.seek(2);	//goto second item
	System.out.println(file.readDouble());
     //goto end of the file
    file.seek(file.length());
    file.writeBoolean(false);
	
	file.seek(3);
	System.out.println(file.readBoolean());
	file.close();
}
catch(IOException e)
		{
	System.out.println(e);
	    }
	}
}
