class Room{
	
	public static void main(String []args)
	{
		int height=10;
		int width=20;
		int breadth=30;
		Room obj = new Room();
		obj.volume(height,width,breadth);
	}
 void volume(int height,int width, int breadth)
{
	System.out.println("volume of room is"+height*width*breadth);


}
}