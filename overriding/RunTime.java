class c1
      {
	public void print()
 	 {
	   System.out.println("super class:print()");
	  }
	public void display()
 	 {
	   System.out.println("super class:display()");
	  }

        }

class c2 extends c1
      {
	public void print()
 	 {
	   System.out.println("sub class:print()");
	  }
	public void view()
 	 {
	   System.out.println("sub class:view()");
	  }

        }
class RunTime
       {
        public static void main(String args[])
           {
            c1 obj_ref;

            obj_ref=new c1();
            obj_ref.print();
            obj_ref.display();	    

//obj ref of super holding sub obj
            obj_ref=new c2();
//RunTime polymorphism
           obj_ref.print();
//obj ref of super holding sub obj,can call its own members in sub
            obj_ref.display();
//obj ref of super holding sub obj,cant call sub own members   
           //obj_ref.view();
          }
        }

