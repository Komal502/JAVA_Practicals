public class Practical4{
	public static void main(String args[]){
		Practical4 obj=new Practical4();
		String nm="10";
		String xx="b";
		String ans=obj.toXxSystem(nm,xx);
		System.out.println(ans);
	}
	
	//Main function that perform all conversion depending on type of number(i.e num) and type that number in converted into(i.e xx)
	String toXxSystem(String num,String xx){ 
	    String ans;
   ...>     if(!num.startsWith("0b") && !num.startsWith("0x") && !num.startsWith("0") && xx.equals("b")){
   ...>         ans=decToBin(num.substring(2));
   ...>     }else if(!num.startsWith("0b") && !num.startsWith("0x") && !num.startsWith("0") && xx.equals("h")){
   ...>         ans=decToHex(num.substring(2));
   ...>     }else if(!num.startsWith("0b") && !num.startsWith("0x") && !num.startsWith("0") && xx.equals("o")){
   ...>         ans=decToOct(num.substring(2));
   ...>     }else if(num.startsWith("0b") && xx.equals("d")){
   ...>         ans=binToDec(num.substring(2));
   ...>     }else if(num.startsWith("0b") && xx.equals("o")){
   ...>         ans=binToOct(num.substring(2));
   ...>     }else if(num.startsWith("0b") && xx.equalsIgnoreCase("h")){
   ...>         ans=binToHex(num.substring(2));
   ...>     }else if(num.startsWith("0") && !num.startsWith("0x") && xx.equalsIgnoreCase("b")){
   ...>         ans=octToBin(num.substring(1));
   ...>     }else if(num.startsWith("0") && !num.startsWith("0x") && xx.equalsIgnoreCase("d")){
   ...>         ans=octToDec(num.substring(1));
   ...>     }else if(num.startsWith("0") && !num.startsWith("0x") && xx.equalsIgnoreCase("h")){
   ...>         ans=octToHex(num.substring(1));
   ...>     }else if(num.startsWith("0x") && xx.equalsIgnoreCase("d")){
   ...>         ans=hexToDec(num.substring(2));
   ...>     }else if(num.startsWith("0x") && xx.equalsIgnoreCase("b")){
   ...>         ans=hexToBin(num.substring(2));
   ...>     }else if(num.startsWith("0x") && xx.equalsIgnoreCase("o")){
   ...>         ans=hexToOct(num.substring(2));
   ...>     }else{
   ...>         ans="somethig went wrong...!";
   ...>     }
   ...>     return ans;
   ...> }
   
   //1.decimal to binary conversion function that is calling here from main function(i.e toXxSystem)
   public String decToBin(String nm){
   ...>     Integer num=Integer.parseInt(nm);
   ...>     Integer ans=0,rem,place=1;
   ...>     while(num!=0){
   ...>         rem=num%2;
   ...>         ans+=(rem*place);
   ...>         place=place*10;
   ...>         num=num/2;
   ...>     }
   ...>     return "ob"+ans.toString();
   ...> }

   //2.decimal to octal conversion function that is calling here from main function(i.e toXxSystem)
   public String decToOct(String nm){
   ...>     Integer num=Integer.parseInt(nm);
   ...>     Integer ans=0,rem,place=1;
   ...>     while(num!=0){
   ...>         rem=num%8;
   ...>         ans+=(rem*place);
   ...>         place*=10;
   ...>         num/=8;
   ...>     }
   ...>     return "0"+ans.toString();
   ...> }

   //3.decimal to hexadecmial conversion function that is calling here from main function(i.e toXxSystem)
   String decToHex(String nm){
   ...>     Integer num=Integer.parseInt(nm);
   ...>     int rem;
   ...>     String ans="";
   ...>     while(num!=0){
   ...>         rem=num%16;
   ...>         if(rem>9){
   ...>             switch(rem){
   ...>                 case 10:
   ...>                 ans="A"+ans;
   ...>                 break;
   ...>                 case 11:
   ...>                 ans="B"+ans;
   ...>                 break;
   ...>                 case 12:
   ...>                 ans="C"+ans;
   ...>                 break;
   ...>                 case 13:
   ...>                 ans="D"+ans;
   ...>                 break; 
   ...>                 case 14:
   ...>                 ans="E"+ans;
   ...>                 break;
   ...>                 case 15:
   ...>                 ans="F"+ans;
   ...>                 break;
   ...>                 default:
   ...>                 break;
   ...>             }
   ...>         }else{
   ...>             ans=rem+ans;
   ...>         }
   ...>         num=num/16;
   ...>     }
   ...>     return "ox"+ans;
   ...> }

   //4.binary to decimal conversion function that is calling here from main function(i.e toXxSystem)
   String binToDec(String nm){
   ...>     Integer num=Integer.parseInt(nm);
   ...>     Integer ans=0,rem,pow=1;
   ...>     while(num!=0){
   ...>         rem=num%10;
   ...>         ans=ans+(rem*pow);
   ...>         pow=pow*2;
   ...>         num=num/10;
   ...>     }
   ...>     return ans.toString();
   ...> }
   
   //5.oct to decimal conversion function that is calling here from main function(i.e toXxSystem)
   String octToDec(String nm){
   ...>     Integer num=Integer.parseInt(nm);
   ...>     Integer ans=0,rem,pow=1;
   ...>     while(num!=0){
   ...>         rem=num%10;
   ...>         ans=ans+(rem*pow);
   ...>         pow=pow*8;
   ...>         num=num/10;
   ...>     }
   ...>     return ans.toString();
   ...> }

   //6.hex to decimal conversion function that is calling here from main function(i.e toXxSystem)
  String hexToDec(String nm){
   ...>     Integer ans=0,pow=1;
   ...>     for(int i=nm.length()-1;i>=0;i--){
   ...>         char ch=nm.charAt(i);
   ...>         if(ch>='A'){
   ...>             switch(ch){
   ...>                 case 'A':
   ...>                 ans+=(pow*10);
   ...>                 break;
   ...>                 case 'B':
   ...>                 ans+=(pow*11);
   ...>                 break;
   ...>                 case 'C':
   ...>                 ans+=(pow*12);
   ...>                 break;
   ...>                 case 'D':
   ...>                 ans+=(pow*13);
   ...>                 break;
   ...>                 case 'E':
   ...>                 ans+=(pow*14);
   ...>                 break;
   ...>                 case 'F':
   ...>                 ans+=(pow*15);
   ...>                 break;
   ...>                 default:
   ...>                 break;
   ...>             }
   ...>         }else{
   ...>             ans+=pow*Character.getNumericValue(ch);
   ...> }    pow=pow*16;
   ...>     }
   ...>     return ans.toString();
   ...> }

   //7.binary to hexadecimal conversion function that is calling here from main function(i.e toXxSystem)
   String binToOct(String nm){
   ...>     String dec=binToDec(nm);
   ...>     String oct=decToOct(dec);
   ...>     return oct;
   ...> }

   //8.binary to hexadecimal conversion function that is calling here from main function(i.e toXxSystem)
  String binToHex(String nm){
   ...>     String dec=binToDec(nm);
   ...>     String hex=decToHex(dec);
   ...>     return hex;
   ...> }

   //9.octal to binary conversion function that is calling here from main function(i.e toXxSystem)
   String octToBin(String nm){
   ...>     String dec=octToDec(nm);
   ...>     String bin=decToBin(dec);
   ...>     return bin;
   ...> }

   //10.octal to hexadecimal conversion function that is calling here from main function(i.e toXxSystem)
   String octToHex(String nm){
   ...>     String dec=octToDec(nm);
   ...>     String hex=decToHex(dec);
   ...>     return hex;
   ...> }

   //11.hex to binary conversion function that is calling here from main function(i.e toXxSystem)
   String hexToBin(String nm){
   ...>     String dec=hexToDec(nm);
   ...>     String bin=decToBin(dec);
   ...>     return bin;
   ...> }

   //12.hex to octal conversion function that is calling here from main function(i.e toXxSystem)
   String hexToOct(String nm){
   ...>     String dec=hexToDec(nm);
   ...>     String oct=decToOct(dec);
   ...>     return oct;
   ...> }

  }
