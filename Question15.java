class Question15{

	public static void main(String args[]){
	
	int a=567;
	int b=0;

	do
	{
		b+=a%10;
		a/=10;
		
	}while(a!=0);
	System.out.println("Sum of a number"+b);	

	
	}

}