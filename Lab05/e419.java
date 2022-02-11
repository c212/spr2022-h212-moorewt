import java.util.Scanner;

public class e419 {
    public static void main(String[] args){
        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Enter the number of the month you want: ");
        int dateNum = numberScanner.nextInt();
        String dateString = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";
        System.out.println(dateString.substring((dateNum - 1) * 9, ((dateNum - 1) * 9) + 9));
    }
}
