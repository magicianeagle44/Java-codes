class IntArr implements MyList{
	int i[];
	int size;

	IntArr(int s1)
	{
		i=  new int[size =s1];
		for(int x=0; x<size;x++){
			i[x]= size--;
		}
	}


	public void sort()
	{
		for(int x=0;x<size;x++){
			for(int y=x+1;y<size;y++){
				if(i[y]<i[x])
				{
					int temp =i[x];
					i[x]=i[y];
					i[y]=temp;
				}
			}
		}
		System.out.println("\nInteger array is sorted\n");
	}


	public void show()
	{
		for(int x=0;x<size;x++){
			System.out.println(i[x]);
		}
	}
}



