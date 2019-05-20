interface Students{
	int roll=6;
	String name= "Ankit";

	void getDetails();
}

class Marks implements Students{
	double sub1,sub2,sub3,total;
	double average;
	public Marks(double s1,double s2,double s3)
	{
		sub1=s1;
		sub2=s2;
		sub3=s3;
	
		total = sub1+sub2+sub3;
		average = total/3;
	}
	
	public void studDetails()
	{
		System.out.println("Student's name: "+name);
		System.out.println("Student's roll: "+roll);
		System.out.println("\n");
	}

	public void marksDetails()
	{
		System.out.println("Marks in subject 1: "+sub1);
		System.out.println("Marks in subject 2: "+sub2);
		System.out.println("Marks in subject 3: "+sub3);
		System.out.println(name+" have obtained total "+total+" marks");
		System.out.println("Average marks of "+name+" is "+average);
		System.out.println("\n");
	}

	public void getDetails()
	{
		studDetails();
		marksDetails();
	}
}


class Sports implements Students{
	int total_match,total_run,total_wicket;
	double bat_avg,bowl_avg;

	public Sports(int match,int run,int wicket)
	{
		total_match=match;
		total_run=run;
		total_wicket=wicket;
	
		bat_avg=total_run/(double)total_match;
		bowl_avg=total_wicket/(double)total_match;
	}

	public void sportsDetails()
	{
		System.out.println("Total match played: "+total_match);
		System.out.println("Total run scored: "+total_run);
		System.out.println("Total wickets taken: "+total_wicket);
		System.out.println("Batting Average: "+bat_avg);
		System.out.println("Bowling Average: "+bowl_avg);
		System.out.println("\n");
	}

	public void getDetails()
	{
		sportsDetails();
	}
}


class Inhr4{
	public static void main(String args[]){
		Students obj = new Marks(87,92,89);
		obj.getDetails();

		obj= new Sports(5,410,6);
		obj.getDetails();

		obj = new Marks(71,77,69);
		obj.getDetails();

		obj= new Sports(7,337,13);
		obj.getDetails();

	}
}