import java.util.Scanner;

public class e44 {
    public static void main(String[] args){
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = numScanner.nextInt();
        int num2 = numScanner.nextInt();
        System.out.println(sum(num1, num2));
        System.out.println(diff(num1, num2));
        System.out.println(prod(num1, num2));
        System.out.println(avg(num1, num2));
        System.out.println(dist(num1, num2));
        System.out.println(max(num1, num2));
        System.out.println(min(num1, num2));
    }
    public static int sum(int num1, int num2){
        return num1 + num2;
    }
    public static int diff(int num1, int num2){
        return num1 - num2;
    }
    public static int prod(int num1, int num2){
        return num1 * num2;
    }
    public static float avg(int num1, int num2){
        float float1 = (float) num1;
        float float2 = (float) num2;
        return (float1 + float2) / 2;
    }
    public static int dist(int num1, int num2){
        int dist = num1 - num2;
        if (dist < 0){
            dist = dist * -1;
        }
        return dist;
    }
    public static int max(int num1, int num2){
        return Math.max(num1, num2);
    }
    public static int min(int num1, int num2){
        return Math.min(num1, num2);
    }
}
