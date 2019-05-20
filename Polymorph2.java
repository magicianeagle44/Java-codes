class Shape{

	
	void getArea(double x, double y,String nm)
	{
		if(nm=="rectangle")
		{
			double area=x*y;
			System.out.println("Area of the "+nm+" is "+area+" sq. units");
		}
	}


	void getArea(double x,String nm)
	{
		if(nm=="circle")
		{
			double area=3.14*x*x;
			System.out.println("Area of the "+nm+" is "+area+" sq. units");
		}
		else if (nm=="square") {
			double area=x*x;
			System.out.println("Area of the "+nm+" is "+area+" sq. units");
		}
	}
}



public class Polymorph2{
	public static void main(String[] args) {
		Shape rect = new Shape();
		Shape cir = new Shape();
		Shape sqr = new Shape();

		rect.getArea(15,12,"rectangle");
		cir.getArea(7,"circle");
		sqr.getArea(10,"square");
	}

}