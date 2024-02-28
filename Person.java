class Person{

		int age;
		int height;
		int weight;
	Person(int a)
	{
		age=a;
		height=125;
		weight=60;
		
	}
	Person(int b, int c)
	{
		age=10;
		height=b;
		weight=c;
	}
	
	public static void main(String []args)
	{
		Person per = new Person(18);
		Person per1= new Person(122,50);
		
		per.display();
		per1.display();
	
		
		
	}
	
	void display()
	{
	System.out.println("price of vehicle " + age);
	
	System.out.println("price of vehicle " + height);
	

	System.out.println("price of vehicle " + weight); 
		
	}
	
}
