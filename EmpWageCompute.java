public class EmpWageCompute{
	public static void main(String[] arg){
		final int IS_FULL_TIME=1;
		double empCheck=Math.floor(Math.random()*10)%2;
		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee present");
		else
			System.out.println("Employee absent");
	}
}
