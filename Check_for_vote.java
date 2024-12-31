public class Chect_for_army{
	public static void main(String[]args){
		int age =18;
		double weight =60;
		double height = 5.8;
		
		if(age >=18){
			System.out.println("you are eligible for army");
			
		else if(weight>=60){
			System.out.println("your weight is ok for army");
		}	
		else{
			System.out.println("your weight is not ok for army");
		}
		else if(height >=5.8){
			System.out.println("your height is ok for army");
		}
		else{
			System.out.println("your height is not ok for army");
		}
		}else{
			System.out.println("you are not eligible for army");
		}
	}
}