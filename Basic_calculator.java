
public class Basic_calculator{
	public static void main(String[]args){
		double num1 =20;
		double num2 =20;
		char ch ='-';
		
		double result;
		
		if(ch == '+'){
			result = num1+num2;
			System.out.println("the result of the num1 + num2 shoult be"+result);
			
		}else if (ch == '-'){
			result = num1+num2;
			System.out.println("the result of the num1 - num2 shoult be"+result);
		}else if (ch == '/'){
			result =num1+num2;
			System.out.println("the result of the num1 /  num2 shoult be"+result);
		}else if (ch == '*'){
			result = num1*num2;
			System.out.println("the result of the num1 and num2 shoult be"+result);
		}else if(ch == '%'){
			result= num1%num2;
			System.out.println("the result of the num1 and num2 shoult be"+result);
		}else{
			System.out.println("invalied");
		}
	}
}