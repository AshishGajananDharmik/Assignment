class Box{

		int height;
		int width;
		int breadth;
	Box(int h,int w,int b)
	{
		height=h;
		width=w;
		breadth=b;
	}
	
	public static void main(String []args)
	{
		Box box1 = new Box(10,20,30);
		int area=box1.getArea();
		System.out.println("Area of box1 is " + area);
		int volume=box1.getVolume();
		System.out.println("volume of box1 is " + volume);
		
		Box box2 = new Box(40,50,60);
		int area2=box2.getArea();
		System.out.println("Area of box1 is " + area2);
		int volume2=box2.getVolume();
		System.out.println("volume of box1 is " + volume2);

	
		
		
	}
	int getArea()
	{
		return (2*(height*width +height*breadth+ width*breadth));
	}
	int getVolume()
	{
		return (height*width*breadth);
	}
	
}