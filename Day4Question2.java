class Day4Question2{
		
		public static void main(String args[]){
		
		int arr[] ={5,4,3,9,1,7,9};
		int min=arr[0];
		int max=arr[0];
		 
		
		for(int i=0;i<7;i++)
		{
			if(max>arr[i])
			{
				max=arr[i];
			}
		}

		for(int i=0;i<7;i++)
		{
			if(min<arr[i])
			{
				min=arr[i];
			}
		}




		System.out.println("maximum number is"+ max);
		System.out.println("minimum number is"+ min);
		}


}