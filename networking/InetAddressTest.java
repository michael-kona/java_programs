import java.net.*;
class InetAddressTest
{
public static void main(String[] args)  throws UnknownHostException
	{
System.out.println("Using getLocalHost():\n");
InetAddress Address =InetAddress.getLocalHost();
System.out.println(Address);

System.out.println("\nUsing getByName():\n");
Address=InetAddress.getByName("DTP");
System.out.println(Address);

System.out.println("\nUsing getAllByName():\n");
InetAddress sw[]=InetAddress.getAllByName("NICT");

for(int i=0;i<sw.length;i++)
{
System.out.println(sw[i]);
}
}
}
