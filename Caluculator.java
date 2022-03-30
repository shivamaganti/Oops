
public class Caluculator {
	
    static double powerInt(int num1, int num2) {
		double res1 = Math.pow(num1, num2);
		return res1;
	}
	 static double powerDouble(double num1, int num2) {
		double res = Math.pow(num1, num2);
		return res;
	}	

	public static void main(String args[]) {
		
		System.out.println(Caluculator.powerInt(3,2));
		System.out.println(Caluculator.powerDouble(4.1,2));
	}


}

