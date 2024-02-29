class Day4Question5{
		
		public static void main(String args[]){
		
		int matrix1[][] ={{1,2},
				{3,4}};
		
		int matrix2[][] ={{1,2},
				{3,4}};

		int count=0;
		
		for(int i=0;i<2;i++)
		{

			for(int j=0;j<2;j++)
			{
				
				if(matrix1[i][j]!=matrix2[i][j])
				{
				System.out.println("matrix not equal");
				}else{
					++count;
				     }
			}	
			

		}
		
			if(count==4)	
			{
				System.out.println("matrix is equal");
			}


		}


}