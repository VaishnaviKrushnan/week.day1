package week1.Day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 5;
		int fact=1;
		
		for(int i=1; i <=input;i++) {
			//5*4*3*2*1
			fact = fact*i;
		}
		System.out.println(fact);

	}

}
