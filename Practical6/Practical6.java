class Practical6
{
	void displayPattern1(int size)
	{
		for(int ln=1;ln<=size;ln++)
		{
			for(int spaces=1;spaces<=size-ln;spaces++)
			{
				System.out.print(" ");
			}
			for(int symbols=1;symbols<=2*ln-1;symbols++)
			{
				System.out.print("+");
			}
			System.out.println();
		}
		for(int ln=size-1;ln>0;ln--)
		{
			for(int spaces=size-ln;spaces>0;spaces--)
			{
				System.out.print(" ");
			}
			for(int symbols=2*ln-1;symbols>0;symbols--)
			{
				System.out.print("+");
			}
			System.out.println();
		}
	}
	void displayPattern2(int size)
	{
		for(int ln=1;ln<=size;ln++)
		{
			for(int spaces=size-ln;spaces>0;spaces--)
			{
				System.out.print(" ");
			}
			for(int symbols=1;symbols<=ln;symbols++)
			{
				System.out.print("+ ");
			}
			System.out.println();
		}
		for(int ln=size-1;ln>0;ln--)
		{
			for(int spaces=size-ln;spaces>0;spaces--)
			{
				System.out.print(" ");
			}
			for(int symbols=1;symbols<=ln;symbols++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	void displayPattern3(int size)
	{
		for(int ln=1;ln<=size;ln++)
		{
			for(int spaces=1;spaces<=size-ln;spaces++)
			{
				System.out.print(" ");
			}
			for(int symbols=1;symbols<=2*ln-1;symbols++)
			{
				if((symbols+ln)%2==0)
				{
					System.out.print("*");
				}else{
					System.out.print("+");
				}
			}
			System.out.println();
		}
		for(int ln=size;ln>0;ln--)
		{
			for(int spaces=1;spaces<=size-ln;spaces++)
			{
				System.out.print(" ");
			}
			for(int symbols=1;symbols<=2*ln-1;symbols++)
			{
				if((symbols+ln)%2==0)
				{
					System.out.print("+");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}			

	public static void main(String[] args)
	{
		Practical6 obj=new Practical6();
		obj.displayPattern3(3);
	}
}









