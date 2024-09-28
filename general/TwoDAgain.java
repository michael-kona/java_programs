// Manually allocate differing size second dimensions.
class TwoDAgain 
 {
  public static void main(String args[]) 
	{
	int twoD[][] = new int[4][];
	twoD[0] = new int[1];//first row
	twoD[1] = new int[2];//second row
	twoD[2] = new int[4];//third row
	twoD[3] = new int[6];//fourth row
	int i, j, k = 0;
	for(i=0; i<4; i++)
		for(j=0; j<2*i||j==0; j++) 
			{
			twoD[i][j] = k;
			k++;
			}
	for(i=0; i<4; i++) 
		{
		for(j=0; j<2*i||j==0; j++)
			System.out.print(twoD[i][j] + " ");
			System.out.println();
		}
  }
}