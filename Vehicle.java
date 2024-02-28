class Vehicle{

		int price;
		String color;
		String model;
	Vehicle(int p,String c,String m)
	{
		price=p;
		color=c;
		model=m;
	}
	
	public static void main(String []args)
	{
		
		Vehicle veh = new Vehicle(5000,"Red","Leader");
		veh.display();
	
		
		
	}
	
	void display()
	{
	System.out.println("price of vehicle " + price);
	
	System.out.println("price of vehicle " + color);
	

	System.out.println("price of vehicle " + model); 
		
	}
	
}