package Sept.ex24092024;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Year");
        int year=scanner.nextInt();
        boolean is_leap_year=false;
        if((year%4==0)&&(year%100!=0) || (year %400==0))
        {
            System.out.println(year +"\s is leap year");
        }
        else {
            System.out.println(year +"\s is not a leap year");
        }
    }
}
