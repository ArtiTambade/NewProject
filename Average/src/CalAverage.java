import java.util.Scanner;

public class CalAverage {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int ch;
        
		Numbers obj = new Numbers();

	do {	System.out.println("\nChoose : \n1]Accept \n2]Display \n3]Show Average \n4]Exit");
		System.out.print("Enter Your choice : ");
		ch = in.nextInt();
		
		switch(ch) {
		
		case 1: obj.Accept(obj.a);
		break;
		
		case 2: obj.Display(obj.a);
		break;
		
		case 3: obj.Average(obj.a);
		break;
		
		}
		
	}while(ch<4);
	}
}
