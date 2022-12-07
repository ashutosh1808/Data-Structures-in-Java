public class Main{
public static void main(String[] args){
System.out.println(factorial(10));
System.out.println(power(3,5));
}

public static int factorial(int num){
	if(num<1)		return 1;
	return num*factorial(num-1);
}

public static int power(int base,int exponent){
	if(exponent<1)		return 1;
	return base*power(base,exponent-1);
}
}