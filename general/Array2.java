class Array2 
 {
  public static void main(String args[]) 
	{
	int twoD[][] = new int[4][3];
	int i, j, k;
	for(i=0,k=0; i<4; i++)
        {
 	     for(j=0; j<3; j++,k++) 
	       {
		  twoD[i][j] = k;
		   }
        }
	for(i=0; i<4; i++) 
	   {
	   for(j=0; j<3; j++)
	       {
            System.out.print(twoD[i][j] + " ");
            }
	   System.out.println();
	   }
  }
}