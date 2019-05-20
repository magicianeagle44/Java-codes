public class ArrList{
	public static void main(String[] args) {
		MyList m1[]= new MyList[10];

		m1[0]= new IntArr(10);

		m1[1]= new DoubArr(20);

		m1[2]= new EmpArr(5);


		m1[0].sort();
		m1[1].sort();
		m1[2].sort();

		System.out.println("The sorted integer array  is: ");
		m1[0].show();

		System.out.println("The sorted double array is: ");
		m1[1].show();

		System.out.println("The sorted Employee array is: ");
		m1[2].show();
	}
}