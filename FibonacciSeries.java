package week1.Day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 10;
		int firstNum = 0;
		int secNum  = 1;
		int sum;
		
		for(int i=2;i<=range;i++) {
			//System.out.println(firstNum + " " + secNum);
			sum = firstNum+secNum;
			firstNum=secNum;
			secNum = sum;
			System.out.println(secNum);
			
		}

	}

}
