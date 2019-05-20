public class ExceptTest2{
	public static void main(String[] args) {
		for(int i=0;i<4;i++)
		{
			int k;
			try{
				switch(i)
				{
					case 0:	int z=0;
							k=258/z;
							break;

					case 1:	int a[]= null;
							k=a[0];
							break;

					case 2:	int arr[]= new int[2];
							k=arr[5];
							break;

					case 3:	char ch="bcd".charAt(5);
							break;
				}
			}

			catch(Exception e)
			{
				System.out.println("Test case: "+i);
				System.out.println("\t"+e+"\n");
			}
		}
	}
}