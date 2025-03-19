import java.util.*;
class MineGameVersion2{
	public String[][] layout;
	public int size;
	MineGameVersion2(int size)
	{
		this.size=size;
		layout=new String[size][size];
		generateArray(layout);
		generateGrid();
		System.out.println(getSolution());
	}
	String getSolution()
	{
		Scanner sc=new Scanner(System.in);
		String choice;
		String ans;
		do{
			System.out.println("Enter row and col u want to fill:");
			int row=sc.nextInt();
			int col=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter input that u want to fill:");
			String input=sc.nextLine();
				if(!isValidEntry(row,col,input))
				{
					ans="You failed to solve...please try again...!";
					System.out.println("Do U want to continue this?");
					return ans;
				}
				
			
			layout[row][col]=input;
			generateGrid();
			//Checking weather grid is full
			int count=0;
			for(int i=0;i<size;i++)
			{
				for(int j=0;j<size;j++)
				{
					count++;
					if(layout[i][j].equals(" "))
					{
						count--;
					}
				}
			}	
			if(count==size*size)
			{
				return ans="Good";
			}else{
				ans="failed";
			}
			System.out.println("Do you want to continue the game:");
			choice=sc.nextLine();
		}while(choice.equals("Y"));
		
		generateGrid();
		return ans;
	}
	boolean isValidEntry(int row,int col,String input)
	{
		boolean isValid=true;
		for (int i = 0; i < size; i++) {
            		if (layout[row][i] != null && layout[row][i].equals(input) && Integer.valueOf(input)>size) {
                		isValid = false; // Input is already in the row
               			 break;
            		}
            		if (layout[i][col] != null && layout[i][col].equals(input)) {
				isValid = false; // Input is already in the column
				break;
			}
		}
		return isValid;
	}
	void generateArray(String[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{ 	
			int count=i+1;
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
	void generateGrid()
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
		MineGameVersion2 obj=new MineGameVersion2(size);	
	}
}
