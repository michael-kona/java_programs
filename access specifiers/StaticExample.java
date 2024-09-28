class SE
    {
    public int x;//instance/non-static variable
    static int y;//static variable
    
    public static void main(String args[])
        {
        SE e1=new SE();
        e1.x=10;//use obj. name  - non static var.
        SE.y=20;//use class name - static var.
        System.out.println("e1.x:"+e1.x);
        System.out.println("SE.y:"+SE.y);
        
        SE e2=new SE();
        e2.y=30;//use obj. name
        System.out.println("e1.y:"+e1.y);
        System.out.println("SE.y:"+SE.y);
        }
    }