import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        System.out.println("Is the year a leap year? " + isLeapYear());
    }

    public static Boolean isLeapYear() {
        Scanner yearScanner = new Scanner(System.in);
        System.out.println("Enter the year you want to check: ");
        String year = yearScanner.nextLine();
        int yearInt = Integer.parseInt(year);
        // divisible by 4, leap year
        //divisible by 100, not
        //divisible by 400, leap year
        if (yearInt % 4 == 0){
            if (yearInt % 100 == 0 && yearInt % 400 != 0) {
                return false;
            }else{
                return true;
            }
        }
        else{
            return false;
        }
    }
}
