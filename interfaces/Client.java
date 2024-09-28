interface call
    {
		void call();
     }
interface Callback extends call
{
	int x=10;//final and static automatically
	void callback(int param);
}
class client1 implements Callback 
{
	// Implement Callback's interface
	public void callback(int p) 
	{
		System.out.println("callback called with " + p);
		System.out.println("x=" + x);
	 // x=112;   //can't assign a value for final variable
	}
	public void call(){}//empty method definition
}
class Client
{
	public static void main(String args[])
	{
		client1 c =new client1();
		c.callback(10);
	}
}
