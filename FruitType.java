abstract class Fruit{
	String clr,shp;
	abstract void getDetails();
}


class Mango extends Fruit{
	public Mango(String c,String s)
	{
		clr=c;
		shp=s;
	}

	void getDetails()
	{
		System.out.println("\n\n\t\t:: Class Mango ::");
		System.out.println("\n\n\tColor: "+clr);
		System.out.println("\n\n\tShape: "+ shp+"\n\n");

	}
}

class Apple extends Fruit{
	String typ;
	public Apple(String c,String s)
	{
		clr=c;
		shp=s;
		typ="UNKNOWN";
	}

	public Apple(String c,String s,String t)
	{
		clr=c;
		shp=s;
		typ=t;
	}

	void getDetails()
	{
		System.out.println("\n\n\t\t:: Class Apple ::");
		System.out.println("\n\n\tColor: "+clr);
		System.out.println("\n\n\tShape: "+ shp);
		System.out.println("\n\n\tType: "+ typ+"\n\n");

	}
}

public class FruitType{
	public static void main(String[] args) {
		Mango m1= new Mango("Green","Round");
		m1.getDetails();

		Mango m2= new Mango("Red","Rectangular");
		m2.getDetails();

		Apple a1= new Apple("Green","Round");
		a1.getDetails();

		Apple a2= new Apple("Red","Round","Kashmir");
		a2.getDetails();
	}
}
