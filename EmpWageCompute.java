public class EmpWageCompute{
	public static void main(String[] arg){
		final int IS_FULL_TIME=1;
		final int IS_PART_TIME=2;
		final int EMP_WAGE_PR_HR=20;
		int empHrs=0;
		double empCheck=Math.floor(Math.random()*10)%3;
		if (empCheck == IS_FULL_TIME)
			empHrs=8;
		else if (empCheck == IS_PART_TIME)
			empHrs=4;
		System.out.println("Daily Wage of emp is:"+empHrs*EMP_WAGE_PR_HR);
	}
}
