public class EmpWageCompute{
	public static void main(String[] arg){
		final int IS_FULL_TIME=1;
		final int EMP_WAGE_PR_HR=20;
		int empHrs=0;
		double empCheck=Math.floor(Math.random()*10)%2;
		if (empCheck == IS_FULL_TIME)
			empHrs=8;
		System.out.println("Daily Wage of emp is:"+empHrs*EMP_WAGE_PR_HR);
	}
}
