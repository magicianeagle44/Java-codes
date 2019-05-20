interface Flying{
	int i=50;
	void fly();
}


class Bird implements Flying{
	public void fly()
	{
		System.out.println("In Bird");
	}
}

class Plane implements Flying{
	public void fly()
	{
		System.out.println("In Plane");
	}
}

class Inhr3{
	public static void main(String[] args) {
		Bird b = new Bird();
		System.out.println(b.i);
		b.fly();

		Plane p = new Plane();
		System.out.println("\n"+p.i);
		p.fly();

		Flying f1 = new Bird();
		System.out.println("\n"+f1.i);
		f1.fly();

		Flying f2 = new Plane();
		System.out.println("\n"+f2.i);
		f2.fly();
	}
}