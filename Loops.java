
public class Loops {

	public static void main(String[] args) {
		
		// do while loop
		int i=1;  
		do{  
		System.out.println(i);  
		i++;  
		}while(i<=10); 
		
		
		// nested for loop
		for(int j = 1; j<3; j++)
		{
			for(int k = 1; k<3; k++)
			{
				System.out.println(j + " " + k);
			}
		}
		
		
		// star printing half pyramid
	/*  *
		* *
		* * *    */
		for(int l = 1; l<=4; l++) {
			for(int m = 1; m<=l; m++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		//star printing half invertical pyramid
				/*  * * *
				    * * 
				    *              */
				for(int m = 4; m>=1; --m) {
					for(int n = 1; n<=m; n++) {
						System.out.print("* ");
					}
					System.out.println();
				}
				
				//for each loop
				
				int arr[] = {10,20,30,40,50};
				for(int d :arr) {
					System.out.println(d);
				}
				
				
				// Labeled for loop
				kk :
					for(int o = 1;o<=3;o++) {
						dd :
						for(int p = 1;p <=3; p++) {
							if(o==2 && p==2) {
								break dd;
								
							
						}
				System.out.println(o + " " + p);
					}
					}
				
				//Infinite loop
				
				
				/*for(;;) {
					System.out.println("Infinite loop");
				}   */
				
		
	}

}
