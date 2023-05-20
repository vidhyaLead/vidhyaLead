package week1.day2;

public class ConvNeg {

	public static void main(String[] args) {
		int num = 47;
	
		
		if(num>0) {
			
			int num2 = (num)*(-1);
			
			System.out.println("The given number changed to negative" + num2);
		}
		
		if (num<0) {
			
			int num1 = (num)*(-1);
			System.out.println("Given number changed to postive " + num1);
		}
		
		else if (num==0)
		{
		System.out.println("the given number is neutral");
		}
	}

}
