import java.util.Scanner;
public class UserInputt{
	public static void main (String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("enter starting numbrer");
		int n = s.nextInt();
		System.out.println("enter ending number");
		int m = s.nextInt();
		
		for(int i=n;i<=m;i++){
			
				System.out.println(i);
			
			}
		System.out.println("enter ending number");
		int mm = s.nextInt();
		System.out.println("starting number");
		int nn = s.nextInt();
			for(int i=mm;i>=nn;i--){
			
				System.out.println(i);
			
			}
		}
}