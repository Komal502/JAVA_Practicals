public class GetNumber{
	public static void main(String[] args)
	{
	//function to conver given num(+ve or -ve) into (byte or short)
	int getNumber(int num,String str_type){
		int ans;
		if(str_type.equalIgnoreCase("byte"))
		{
			int temp=num/128;
			if(num>=0){
				if(temp%2==0){
					ans=num%128;
				}else{
					ans=num%128-128;
				}
			}else{
				if(temp%2==0){
					ans=num%128;
				}else{
					if(num%128==0){
						ans=num%128-128;
					}else{
						ans=num%128+128;
					}
				}
			}
		}else if(str_type.equalIgnoreCase("short")){
			int temp=num/32768;
			if(num>=0){
				if(temp%2==0){
					ans=num%32768;
				}else{
					ans=num%32768-32768;
				}
			}else{
				if(temp%2==0){
					ans=num%32768;
				}else{
					if(num%32768==0){
						ans=num%32768-32768;
					}else{
						ans=num%32768+32768;
					}
				}
			}
		}
		return ans;
	}
}

