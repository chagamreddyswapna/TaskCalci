package epamcalci;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Simple Calculator");
		
		System.out.println("Here are the options:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		
		System.out.println("Choose your option:");
		int choice=sc.nextInt();
		System.out.println();
		
		if(choice==1)
			addition();
		else if(choice==2)
			subtraction();
		else if(choice==3)
			multiplication();
		else if(choice==4)
			division();
		
		System.out.println();
		sc.close();
		
	}
	
	public static void addition()
	{
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Addition");
		System.out.println("First Number");
		n1=sc.nextInt();
		System.out.println("Second Number");
		n2=sc.nextInt();
		sc.close();
		System.out.println("Sum: "+n1+" + "+n2 +" = "+(n1+n2));
		
	}
	
	public static void subtraction()
	{
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Subtraction");
		System.out.println("First Number");
		n1=sc.nextInt();
		System.out.println("Second Number");
		n2=sc.nextInt();
		sc.close();
		System.out.println("Difference: "+n1+" - "+n2 +" = "+(n1-n2));
		
	}
	
	public static void multiplication()
	{
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Multiplication");
		System.out.println("First Number");
		n1=sc.nextInt();
		System.out.println("Second Number");
		n2=sc.nextInt();
		sc.close();
		System.out.println("Multiplication: "+n1+" x "+n2 +" = "+(n1*n2));
		
	}
	
	public static void division()
	{
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Division");
		System.out.println("First Number");
		n1=sc.nextInt();
		System.out.println("Second Number");
		n2=sc.nextInt();
		sc.close();
		System.out.println("Division Quotient: "+n1+" / "+n2 +" = "+(n1/n2));
		System.out.println("Division Remainder: "+n1+" % "+n2 +" = "+(n1%n2));
	}

}