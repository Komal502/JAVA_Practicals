class Practical5{
//factorial Using for loop
	int factorial1(int number)
    	{
		if(number<2){
		   return 1;
		}
		int fact=2;
		for(;2<number;)
		{
		  fact*=number--;
		}
        	return fact;
    	}
//factorial using while loop
    	int factorial2(int number)
    	{
		if(number<2){
		   return 1;
		}
		int fact=2;
		while(2<number)
		{
		  fact*=number--;
		}
        	return fact;
    	}
 //factorial without using any looping statements
    	int factorial3(int number)
        {
		if(number<=1){
		   return 1;
		}
		return number*factorial3(number-1);
        }
//sum of array using for loop	
    	int getSum1(int[] numbers)
    	{
		int sum=0;
		for(int i=0;i<=numbers.length;i++)
		{
		    sum+=numbers[i];
		}
		return sum;
    	}
//sum of array without using any looping satements
	int getSum(int[] numbers){
		if(numbers.length==0){
		    return 0;
		}
		int[] arr=Arrays.copyOf(numbers,numbers.length-1);
		return numbers[numbers.length-1]+getSum(arr);
	    }

	public static void main(String[] args){
		Practical obj=new Practical();
	}
}

