class CPolygon
    {
    int area(int s){return s*s;}
    int area(int l,int b){return l*b;}
    float area(float r){return 3.14F*r*r;}
    }
class MethodOverload
    {
    public static void main(String args[])
        {
            CPolygon c=new CPolygon(); 
            System.out.println("Square:"+c.area(3));
            System.out.println("Circle:"+c.area(2.3F));
            System.out.println("Rectangle:"+c.area(3,4));
        }
    }