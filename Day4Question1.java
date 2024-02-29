class Day4Question1{
		
		public static void main(String args[]){
		
		int arr[] ={5,4,3,9,1,7,9};
		
		float sum=0;
		
		for(int i=0;i<7;i++)
		{
			sum+=arr[i];
		}

		float average=sum/7;

		System.out.println("average of array number"+ average);
		}


}