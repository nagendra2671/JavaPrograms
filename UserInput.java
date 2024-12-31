import java.util.Scanner;
public class UserInput{
	public static void main (String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("enter stating number");
		int n = s.nextInt();
		System.out.println("enter ending number");
		int m = s.nextInt();
		
		for(int i=n;i<=m;i++){
			if(i%2==0){
				System.out.println("hi");
			}else{
					System.out.println("hello");
				}
			}
		}
}