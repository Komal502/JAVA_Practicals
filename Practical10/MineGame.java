class MineGame{
	public String[][] layout;
	public int size;
	MineGame(int size)
	{
		this.size=size;
		layout=new String[size][size];
		generateArray(layout);
		generateGrid(size);
	}
	void generateArray(String[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{ int count=i+1;
			for(int j=0;j<arr.length;j++)
			{
				
				if(count==size+1)
				{
					count=1;
				}
				layout[i][j]=String.valueOf(count);
				count++;
			}
		}
		for(int i=0;i<size*size;i++)
		{
			int row=Math.abs((int)(System.nanoTime()%arr.length));
			int col=Math.abs((int)(System.nanoTime()%arr.length));
			layout[row][col]=" ";
		}
	}
	void generateGrid(int size)
	{
		int row=0;
		int col=0;
		for(int i=1;i<=(size*2)+1;i++)
		{
			for(int j=1;j<=(size*2)+1;j++)
			{
				if(j%2==0 && i%2==1)
				{
					System.out.print("---");
				}else if(j%2==1 && i%2==0)
				{
					System.out.print("|");
				}else if(j%2==0 && i%2==0)
				{
					if(col==size)
					{
						col=0;
						row++;
					}
					System.out.print(String.format("%3s",layout[row][col]));
					col++;
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		int size=Integer.parseInt(args[0]);;
		MineGame obj=new MineGame(size);	
	}
}
