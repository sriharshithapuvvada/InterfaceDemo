import java.util.*;
public class Student implements Imath {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
	   System.out.println("Enter any two integer values to perform addition");
	   int a=kb.nextInt();
	   int b=kb.nextInt();
       int s=a+b;
	   System.out.println("Sum of "+a+" and "+b+" is "+s);


	}

	@Override
	public void sub () {
		// TODO Auto-generated method stub

Scanner kb = new Scanner(System.in);

System.out.println("Enter any two integer values to perform substraction");

int a=kb.nextInt();

int b=kb.nextInt();

int s=a-b;

System.out.println("Difference of "+a+" and "+b+" is "+s);


	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub

Scanner kb = new Scanner(System.in);

System.out.println("Enter any two integer values to perform substraction");

int a=kb.nextInt();

int b=kb.nextInt();

int s=a*b;

System.out.println(" Multiplication  of "+a+" and "+b+" is "+s);

	}

	@Override
	public void div() {
		// TODO Auto-generated method stub

Scanner kb = new Scanner(System.in);

System.out.println("Enter any two integer values to perform substraction");

int a=kb.nextInt();

int b=kb.nextInt();

int s=a/b;

System.out.println("quotient of "+a+" and "+b+" is "+s);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.add();
		s1.sub();
		s1.mul();
		s1.div();

	}

}
