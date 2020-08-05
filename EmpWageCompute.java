public class EmpWageCompute
{
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PR_HOUR=20;
	public static final int EMP_DAYS_PR_MONTH=2;
	public static final int MAX_HRS_PER_MONTH=10;
	public static void main(String[] args)
	{
		int empHrs=0,empWage=0,totalEmpWage=0,totalWorkingDays=0,totalEmpHrs=0;
		while(totalWorkingDays<EMP_DAYS_PR_MONTH && totalEmpHrs<=MAX_HRS_PER_MONTH)
		{
			totalWorkingDays++;
			int empCheck=(int)Math.floor(Math.random()*10)%3;
			switch(empCheck)
			{
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
			totalEmpHrs+=empHrs;
			empWage=empHrs*EMP_RATE_PR_HOUR;
			totalEmpWage=totalEmpWage+empWage;
		}
		System.out.println("Employee wage is:"+totalEmpWage);
	}
}
