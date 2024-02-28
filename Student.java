class Student{

		int marks1;
		int marks2;
		int marks3;
		String Name;
	
	public static void main(String []args)
	{
		
		Student std = new Student();
		std.getData();
		std.average();
		std.display();	
		
		
	}
	 void getData()
	{
	 marks1=75;
	 marks2=70;
	 marks3=60;
	 Name="Ashish";
	}
	void average()
	{
	System.out.println("average marks"+(marks1+marks2+marks3)/3);
	}
	void display()
	{
	System.out.println("Name of student"+Name);
	
	System.out.println("marks of student"+(marks1+marks2+marks3));
	}




}