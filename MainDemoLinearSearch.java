class MainDemoLinearSearch
{
	public static void main(String[] arg)
	{
		int[] m= new int[arg.length];
		int key=4;
		int index=-1;
		//for Array Initialization
		for(int i=0;i<m.length;i++)
		{
			m[i]=Integer.parseInt(arg[i]);
			
		}//for-end
		//LinearSearch
		for(int i=0;i<m.length;i++)
		{
			if(m[i]==key)
			{
				index=i;
				break;
			}
		}//for-end
		if(index>=0)
		{
			System.out.println("Search is Successful");
			System.out.println(m[index] +" is at "+ index);
		}
		if(index==-1)
		{
			System.out.println("Search is not Successful");
		}
	
	}

}