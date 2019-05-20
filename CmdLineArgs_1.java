class CmdLineArgs_1{
	public static void main(String[] args){
		int a,b,sum;
		System.out.println("Sum of "+args[0]+" and "+args[1]+" is "+(args[0]+args[1]));
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);

		sum=a+b;

		System.out.println("Sum of "+a+" and "+b+" is "+sum);
	}
}