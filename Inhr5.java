interface Shape{
	void getArea();
}


class Rectangle implements Shape{
	double l,w;
	public Rectangle(double x, double y)
	{
		l=x;
		w=y;
	}

	public void getArea()
	{
		System.out.println("Area of the rectange of length "+l+" unit and width "+w+" unit is "+(l*w)+" sq. unit\n");
	}
}


class Circle implements Shape{
	double r;
	public Circle(double z)
	{
		r=z;
	}

	public void getArea()
	{
		System.out.println("Area of the circle of radius "+r+" unit is "+(3.14*r*r)+" sq. unit\n");
	}
}

class Inhr5{
	public static void main(String[] args) {
		Circle c = new Circle(10);
		c.getArea();

		Rectangle r =new Rectangle(11,15);
		r.getArea();
	}
}