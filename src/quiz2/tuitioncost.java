package quiz2;

import java.util.Scanner;

public class tuitioncost {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the initial tuition cost at your University? ");
		double Tuition = input.nextInt();
		double Total = 0;
	
		
		for (int i=1;i<=4;i++){
			System.out.println("What is the percent increase for year "+ i + "?(number 0 to 100)");
			double TuitionRise = input.nextInt();
			
			double TuitionNow = Tuition*(1+(TuitionRise/100)) ;
			
			Total += TuitionNow;
		}
		
		System.out.printf("To complete your degree, the total tuition cost will be: $%10.2f", Total);
			
			
		}
	}
