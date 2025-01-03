public class Upper_lower{
	public static void main(String[]args){
		char ch ='@';
		
		if(ch >='A' && ch <='Z'){
			System.out.println("upper_case");
		}else if(ch >='a' && ch<='z'){
			System.out.println("lower_case");
		}else if(ch >'0' && ch<='9'){
			System.out.println("numaric");
		}else{
			System.out.println("special characters");
		}
	}
}