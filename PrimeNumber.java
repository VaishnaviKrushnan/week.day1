package week1.Day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input =11;
		boolean isPrimeNumb = false;
		 for (int i = 2; i <= input / 2; ++i) {
		      
		      if (input % i == 0) {
		    	  isPrimeNumb = true;
		        break;
		      }
		    }
		 if(!isPrimeNumb) {
			 System.out.println(input + " is a Prime Number");
		 }else
			 System.out.println(input + " is not a Prime Number");

	}

}
