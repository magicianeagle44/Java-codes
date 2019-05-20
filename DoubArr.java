class DoubArr implements MyList{
	double d[];
	int size;

	DoubArr(int s1)
	{
		d=  new double[size =s1];
		for(int x=0; x<size;x++){
			d[x]= size--;
		}
	}


	public void sort()
	{
		for(int x=0;x<size;x++){
			for(int y=x+1;y<size;y++){
				if(d[y]<d[x])
				{
					double temp =d[x];
					d[x]=d[y];
					d[y]=temp;
				}
			}
		}
		System.out.println("\nDouble array is sorted\n");
	}


	public void show()
	{
		for(int x=0;x<size;x++){
			System.out.println(d[x]);
		}
	}
}



