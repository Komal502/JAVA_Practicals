public class intToShort{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any Integer number:");
		int num=sc.nextInt();
		int ans;
		int temp=num/32768;
		if(num<0){
			if(temp%2==0)
			{
				ans=num%32768;
			}else{
				if(num%32768==0)
				{
					ans=num%32768-32768;
				}else{
					ans=num%32768+32768;
				}
			}
		}else{
			if(temp%2==0){
				ans=num%32768;
			}else{
				ans=num%32768-32768;
			}
		}
		System.out.println("Entered number in byte is:"+ans);
	}
}
