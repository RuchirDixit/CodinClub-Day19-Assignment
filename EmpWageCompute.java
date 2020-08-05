public class EmpWageCompute
{
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PR_HOUR=20;
	public static final int EMP_DAYS_PR_MONTH=20;
	public static void main(String[] args)
	{
	int empHrs=0;
	int empWage=0;
	int totalEmpWage=0;
	for(int day=0;day<EMP_DAYS_PR_MONTH;day++)
	{
		int empCheck=(int)Math.floor(Math.random()*10)%3;
		System.out.println("Emp Check is:"+empCheck);
		switch(empCheck){
			case	IS_FULL_TIME:
					empHrs=8;
					break;
			case IS_PART_TIME:
					empHrs=4;
					break;
			default:
					empHrs=0;
					break;
		}
		empWage=empHrs*EMP_RATE_PR_HOUR;
		totalEmpWage=totalEmpWage+empWage;
	}
		System.out.println("Total Employee wage is:"+totalEmpWage);
	}
}
