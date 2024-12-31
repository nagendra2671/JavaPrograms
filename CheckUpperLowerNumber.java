
import java.util.Scanner;

public class CheckUpperLowerNumber {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		
		System.out.println("enter a character");
		char ch = n.next().charAt(0);
		
		if(ch >= 'A' && ch <='Z'  ) {
			System.out.println("Uppar case");
		}
		else if(ch >='a' && ch <='z') {
			System.out.println("Lower case");
			
		}
		else if(ch > '0' && ch <= '9') {
			System.out.println("numuric");
			
		}
		else {
			System.out.println("invalied key");
		}
	}

} 
