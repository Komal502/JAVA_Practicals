class Practical8{
	void pattern_1(int ln,int size)
	{
		if(ln<=size+1)
		{
			print_pattern1(ln);
			System.out.println();
			pattern_1(ln+1,size);
			print_pattern1(ln-1);
			System.out.println();
		}
	}
	void print_pattern1(int star)
	{
		if(star>0)
		{
			System.out.print("*");
			print_pattern1(star-1);
		}
	}
	void pattern_2(int ln,int size)
	{
		if(ln<=size+1)
		{
			print_space2(size-ln+1);
			print_pattern2(ln,size);
			System.out.println();
			pattern_2(ln+1,size);
			print_space2(size-ln+2);
			print_pattern2_slash(ln-1);
			System.out.println();
		}
	}
	
	void print_space2(int space)
	{
		if(space>0)
		{
			System.out.print(" ");
			print_space2(space-1);
		}
	}
	void print_pattern2(int star,int size)
	{
		if(star>0)
		{
			if(star==size+1)
			{
				System.out.print("+");
				print_pattern2(star-1,size-1);
			}else{
				System.out.print("*");
				print_pattern2(star-1,size);
			}
		}
	}
	void print_pattern2_slash(int star)
	{
		if(star>0)
		{
			System.out.print("/");
			print_pattern2_slash(star-1);
		}
	}
	void pattern_3(int ln,int size)
	{
		if(ln<=Math.ceil(size/2f))
		{
			print_space3((int)Math.ceil(size/2f)-ln);
			print_pattern3(ln*2-1);
			System.out.println();
			pattern_3(ln+1,size);
			if(ln<(int)Math.ceil(size/2f))
			{
				print_space3((int)Math.ceil(size/2f)-ln);
				print_pattern3(ln*2-1);
				System.out.println();
			}
		}
	}

	void print_tail(int tail,int size)
	{
		if(tail>size)
		{
			return;
		}
			print_space3((int)Math.floor(size/2f));
			System.out.print("+");
			System.out.println();
			print_tail(tail+1,size);
	}
		
	void print_pattern3(int star)
	{
		if(star>0)
		{
			System.out.print("*");
			print_pattern3(star-1);
		}
	}
	void print_space3(int space)
	{
		if(space>0)
		{
			System.out.print(" ");
			print_space3(space-1);
		}
	}
	public static void main(String args[])
	{
		Practical8 obj=new Practical8();
		//obj.pattern_1(1,5);
		obj.pattern_2(1,5);
		//obj.pattern_3(1,5);
		//obj.print_tail(1,5);
	}
}
