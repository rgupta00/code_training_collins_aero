package day_1.basics;

public class B_DateProblem {

	
	public static void main(String[] args) {
		
		//c style of coding :(
		// OO style
		
		//i want to find out next date 31st Dec 2022
		
		//first to take values form the user
		int d=28, m=2 , y=2001;
		System.out.println("date :" +d+"/"+m+"/"+y);
		//u need to check if it is a leap year Feb 29 days and keep the records of days in every month
		
		int noOfDays[]={-1, 31,28 ,31, 30,31,30,31,31,30,31,30,31 };
		if(isLeapYear(y))
			noOfDays[2]=29;
		
		
		//u need to write logic to find out next day
		d=d+1;
		if(d>noOfDays[m]){
			d=1;
			m++;
			if(m>12){
				m=1;
				y++;
			}
		}
		System.out.println("date :" +d+"/"+m+"/"+y);
		
	}
	
	public static boolean isLeapYear(int y){
		return (y%4==0 && y%100!=0 || y%400==0);
	}
}
