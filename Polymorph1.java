class Concat{
	void addValue(double x,double y)
	{
		System.out.println("Sum of "+x+" and "+y+" is "+(x+y));
	}


	void addValue(String x,String y)
	{
		System.out.println("Sum of "+x+" and "+y+" is "+(x+y));
	}
}


public class Polymorph1{
	public static void main(String[] args) {
		Concat obj1= new Concat();
		Concat obj2= new Concat();

		obj1.addValue(187,255);
		obj2.addValue("Ankit","Charan");
	}
}