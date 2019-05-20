class CmdLineArgs{
	public static void main(String args[]){
		System.out.println("The commandline arguments are --------");
		for(int i=0;i<args.length;i++)
		{
			System.out.println("Argument "+(i+1)+": "+args[i]);
		}
	}
}