import java.util.Scanner;
public class Calc{
	public static void main(String args[]){
		float a,b,res;
		char choice,ch;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("1.Addition");
			System.out.println("4.Exit");
			System.out.println("Enter your choice:");
			choice = sc.next().charAt(0);
			switch(choice){
				case '1':System.out.println("Enter two numbers");
					   a = sc.nextFloat();
					   b = sc.nextFloat();
					   res=a+b;
					   System.out.println("Result = " + res);
					   break;
				case '4':System.exit(0);
						 break;
				default: System.out.println("Invalid choice!!");
				break;
			}
		}while(choice != '4');
	}
}