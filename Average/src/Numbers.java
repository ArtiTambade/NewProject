import java.util.Scanner;

public class Numbers {
	
	Scanner inp = new Scanner(System.in);
	int a[] = new int[10] ;
	double Avg=0;
	double sum = 0 ;
	
   public void Accept(int a[]) {
	   System.out.println("Enter 10 numbers : ");
	   for (int i = 0 ; i<10 ; i++) {
		   a[i]= inp.nextInt();
		   
	   }   }
   
   public void Display(int a[]) {
	   System.out.println("Entered numbers are : ");
	   for (int i = 0 ; i<10 ; i++) {
		 System.out.println(a[i]);
	   }
   }
   
   public void Average(int a[]) {
	   for (int i = 0 ; i<10 ; i++) {
			sum = sum + a[i];
		   }
	   Avg = sum/10;
	   System.out.println("Average = "+Avg);
   }
}





