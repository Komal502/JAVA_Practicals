public class IntToByte{
	public static void main(String[] args)
	{
	Scanner sc=new  Scanner(System.in);
		int num;
		System.out.print("Enter number:");
		num=sc.nextInt();
		int ans;
		int temp=num/128;
		if(num>=0)
		{
			if(temp%2==0)
			{
				ans=num%128;
			}else{
				ans=num%128-128;
			}
		}else{
			if(temp%2==0)
			{
				ans=num%128;
			}else{
				if(num%128==0)
				{
					ans=num%128-128;
				}else{
					ans=num%128+128;
				}
			}
		}
		System.out.println("Value in byte is:"+ans);
	}
}
