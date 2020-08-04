public class EmpWageCompute{
	public static void main(String[] arg){
		final int IS_FULL_TIME=1;
		final int IS_PART_TIME=2;
		final int EMP_WAGE_PR_HR=20;
		int empHrs=0;
		int empCheck=(int)Math.floor(Math.random()*10)%3;
		switch(empCheck){
			case IS_FULL_TIME:
					empHrs=8;
					break;
			case IS_PART_TIME:
					empHrs=4;
					break;
			default:
					empHrs=0;
					break;
		}
		System.out.println("Daily Wage of emp is:"+empHrs*EMP_WAGE_PR_HR);
	}
}
