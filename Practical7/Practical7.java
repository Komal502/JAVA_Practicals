class Practical7 
{
	String getString1(int ln,int size)
	{
		String blankString="";
		String pattern="";
		for(int space=ln-1;space>0;space--)
		{
			blankString+=" ";
		}
		for(int symbol=2*(size-ln)+1;symbol>0;symbol--)
		{
			pattern+="*";
		}
		return pattern+blankString;
	}
	String getString2(int ln,int size)
	{
		String blankString="";
		String pattern="";
		for(int space=size-ln;space>0;space--)
		{
			blankString+=" ";
		}
		for(int symbol=2*ln-1;symbol>0;symbol--)
		{
			pattern+="*";
		}
		return blankString+pattern+blankString;
	}
	
	String getStringK1(int ln,int size)
	{
		String blankString="";
		String pattern="";
		for(int symbols=1;symbols<=size-ln+1;symbols++)
		{
			if(((size+symbols)==size+1) || ((ln+symbols)==size+1))
			{
				pattern+="*";
			}else{
				pattern+=" ";
			}
		}
		for(int spaces=ln-1;spaces>0;spaces--)
		{
			blankString+=" ";
		}
		return pattern+blankString;
	}
	String getStringK2(int ln,int size)
	{
		String blankString="";
		String pattern="";
		for(int symbols=1;symbols<=size-ln+1;symbols++)
		{
			if(((size+symbols)==size+1) || ((ln+symbols)==size+1))
			{
				pattern+="*";
			}else{
				pattern+=" ";
			}
		}
		for(int spaces=ln-1;spaces>0;spaces--)
		{
			blankString+=" ";
		}
		return pattern+blankString;
	}	
	String getString_o1(int ln,int size)
	{
		String pattern="";
		String blankString="";
		for(int symbols=1;symbols<=size;symbols++)
		{
			if(ln==1)
			{
				if(symbols>1 && symbols<size)
				{
					pattern+="*";
				}else{
					pattern+=" ";
				}
			}else{
				if(symbols==1 || symbols==size)
				{
					pattern+="*";
				}else{
					pattern+=" ";
				}
			}
		}
		return pattern;
	}
	String getString_o2(int ln,int size)
	{
		String pattern="";
		String blankString="";
		for(int symbols=1;symbols<=size;symbols++)
		{
			if(ln==1)
			{
				if(symbols>1 && symbols<size)
				{
					pattern+="*";
				}else{
					pattern+=" ";
				}
			}else{
				if(symbols==1 || symbols==size)
				{
					pattern+="*";
				}else{
					pattern+=" ";
				}
			}
		}
		return pattern;
	}
	String getString_m1(int ln,int size)
	{
		String pattern="";
		for(int symbols=1;symbols<=size;symbols++)
		{
			if(symbols==1 || symbols==size)
			{
				pattern+="*";
			}
			else if((symbols==ln || symbols==(size-ln)+1) && ln<=(size)/2+1)
			{
				pattern+="*";
			}else{
				pattern+=" ";
			}
		}
		return pattern;
	}
	String getString_m2(int ln,int size)
	{
		String pattern="";
		for(int symbols=1;symbols<=size;symbols++)
		{
			if((symbols==1 || symbols==size))
			{
				pattern+="*";
			}else{
				pattern+=" ";
			}
		}
		return pattern;
	}
	String getString_A1(int ln,int size)
	{
		String pattern="";
		for(int symbols=1;symbols<=size;symbols++)
		{
			if((symbols==1 || symbols==size)|| (ln==1 && (symbols>1 && symbols<size))|| ln==size)
			{
				pattern+="*";
			}else{
				pattern+=" ";
			}
		}
		return pattern;
	}
	String getString_A2(int ln,int size)
	{
		String pattern="";
		for(int symbols=1;symbols<=size;symbols++)
		{
			if((symbols==1 || symbols==size))
			{
				pattern+="*";
			}else{
				pattern+=" ";
			}
		}
		return pattern;
	}
	String getString_L1(int ln,int size)
	{
		String pattern="";
		String blankString="";
		for(int symbols=1;symbols<=size;symbols++)
		{
			if(symbols==1)
			{
				pattern+="*";
			}else{
				blankString+=" ";
			}
		}
		return pattern+blankString;
	}
	String getString_L2(int ln,int size)
	{
		String pattern="";
		for(int symbols=1;symbols<=size;symbols++)
		{
			if(ln>1)
			{
				if(symbols==1)
				{
					pattern+="*";
				}else{
					pattern+=" ";
				}
			}else{
				pattern+="*";
			}
		}
		return pattern;
	}
	
	public static void main(String args[])
	{
	Practical7 obj=new Practical7();
		int size=Integer.parseInt(args[0])+2;
		for(int ln=1;ln<=size+2;ln++)
		{
			System.out.println(obj.getStringK1(ln,size+2)+"   "+obj.getString_o1(ln,size+2)+"   "+obj.getString_m1(ln,size+2)+"   "+obj.getString_A1(ln,size+2)+"   "+obj.getString_L1(ln,size+2));

		}
		for(int ln=(size+2)-1;ln>0;ln--)
		{
			System.out.println(obj.getStringK2(ln,size+2)+"   "+obj.getString_o2(ln,size+2)+"   "+obj.getString_m2(ln,size+2)+"   "+obj.getString_A2(ln,size+2)+"   "+obj.getString_L2(ln,size+2));
				
		}
		
	}
}
