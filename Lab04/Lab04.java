import java.math.BigDecimal;

public class Lab04 {
    public static void main(String[] args){
        Lab04.one();
        Lab04.two();
        Lab04.three();
        Lab04.four();
        Lab04.five();
        Lab04.six();
        Lab04.seven();
        Lab04.eight();
        Lab04.nine();
        Lab04.ten();
        Lab04.eleven();
        Lab04.twelve();
        Lab04.thirteen();
        Lab04.fourteen();
        Lab04.fifteen();
        Lab04.sixteen();
        Lab04.seventeen();
        Lab04.eighteen();
        Lab04.nineteen();
        Lab04.twenty();
        Lab04.twentyone();
        Lab04.twentytwo();
        Lab04.twentythree();
        Lab04.twentyfour();
        Lab04.twentyfive();
        Lab04.twentysix();
        Lab04.twentyseven();
        Lab04.twentyeight();

    }
    public static void one() {
        System.out.println("1. What does this line of code print: System.out.println(\"+---+\\n|   |\\n+---+\"); ");
        // expected output is printing a square shape
        System.out.println("+---+\n|   |\n+---+");
    }
    public static void two() {
        System.out.println("2. Write code to calculate the following expression with BigDecimal objects: 4.35 * 100 ");
        // after using BigDecimal, 4.35 * 100 should be 435.00
        BigDecimal a = new BigDecimal("4.35");
        BigDecimal b = new BigDecimal("100");
        BigDecimal c = a.multiply(b);
        System.out.println(c);
    }
    public static void three() {
        System.out.println("3. Evaluate: 3 - 4 + 5");
        // should do 3 - 4, then that result plus 5, equals 4
        System.out.println(3 - 4 + 5);
    }
    public static void four() {
        System.out.println("4. Evaluate: 3 - 4 * 5");
        // should do 3 - 4, then the result (-1) times 5, equals -5
        System.out.println(3 - 4 * 5);
    }
    public static void five() {
        System.out.println("5. Evaluate: 2 / 3 * 4");
        // should do 2 / 3, which truncates to 0, times 4 is still 0
        System.out.println(2 / 3 * 4);
    }
    public static void six() {
        System.out.println("6. 2 * 3 / 4");
        // should do 2 * 3 first, which is 6. Then divide by 4. Truncates down to 1
        System.out.println(2 * 3 / 4);
    }
    public static void seven() {
        System.out.println("7. 3 % 5");
        // do 3 % 5, 5 goes into  3 0 times, so 3 is the remainder
        System.out.println(3 % 5);
    }
    public static void eight() {
        System.out.println("8. -3 % 5");
        // the first number determines the positivity or negativity, so -3
        System.out.println(-3 % 5);
    }
    public static void nine() {
        System.out.println("9. 5 % 3");
        // basic modulus, 5 / 3, 2 leftover
        System.out.println(5 % 3);
    }
    public static void ten() {
        System.out.println("10. 5 % -3");
        // first number is what matters, still 2
        System.out.println(5 % -3);
    }
    public static void eleven() {
        System.out.println("11. 3 % -5");
        // If these were both positive, we would expect 3. So we'll stick with 3 for this one
        System.out.println(3 % -5);
    }
    public static void twelve() {
        System.out.println("12. 49 / 17 % 5");
        // 49 / 17 first, round down to 2, 2 % 5, 2 remainder
        System.out.println(49 / 17 % 5);
    }
    public static void thirteen() {
        System.out.println("13. 49 / (17 % 5)");
        // 17 % 5 is 2, 49 / 2 is 24.5, rounds down to 24
        System.out.println(49 / (17 % 5));
    }
    public static void fourteen() {
        System.out.println("14. ('a' + 'b') % 2");
        // the ascii value is what matters here, a + b is 195
        System.out.println(('a' + 'b') % 2);
    }
    public static void fifteen() {
        System.out.println("15. false || true");
        // contains at least one true, should be true
        System.out.println(false || true);
    }
    public static void sixteen() {
        System.out.println("16. ! true && false");
        // it's an "and" statement, and there's already a false, so false
        System.out.println(! true && false);
    }
    public static void seventeen() {
        System.out.println("17. ! (true && false)");
        // should be true, because true && false is false, then the ! makes it true
        System.out.println(! (true && false));
    }
    public static void eighteen() {
        int n = 3;
        System.out.println("18. n > ++n");
        // n is 3, the ++ is before the second n, so the second n is seen as 4, and 3 is not greater than 4
        System.out.println(n > ++n);
    }
    public static void nineteen() {
        int n = 3;
        System.out.println("19. ++n – n");
        // n increases by 1 before we do any other operations, so 0
        System.out.println(++n - n);
    }
    public static void twenty() {
        int n = 3;
        System.out.println("20. n++ == n++");
        // at the end of the equation, n = 5, but to get there, the equation reads the first part as 3, and the second part as 4
        System.out.println(n++ == n++);
    }
    public static void twentyone() {
        int n = 3;
        System.out.println("21. ++n == n++");
        // "n++ doesn't increase that instance of n, but all later instances" - Jack , so it sees 4 == 4
        System.out.println(++n == n++);
    }
    public static void twentytwo() {
        int n = 3;
        System.out.println("22. n++");
        // the ++ is after the n, so it prints 3
        System.out.println(n++);

    }
    public static void twentythree() {
        int n = 3;
        System.out.println("23. ++n");
        // the ++ is before the n, so it prints 4
        System.out.println(++n);
    }
    public static void twentyfour() {
        int n = 3;
        System.out.println("24. (n = n++ - ++n) < 0");
        // parentheses first, first n is read as 3, second n is read as 5, 3 - 5 = -2, -2 < 0, so true
        n = n++ - ++n;
        System.out.println(n < 0);
    }
    public static void twentyfive() {
        System.out.println("25. (n = n++ - ++n) < 0");
        int n = 3;
        n = n++ - ++n;
        System.out.println(n);
    }
    public static void twentysix(){
        System.out.println("26. \"1\" + (2 + 3)");
        // 2 + 3 = 5, concatenate 1 and 5 for 15
        System.out.println("1" + (2 + 3));
    }
    public static void twentyseven(){
        System.out.println("27. \"1\" + 2 + 3");
        System.out.println("1" + 2 + 3);
    }
    public static void twentyeight(){
        System.out.println("28. 1 + \"2\" + 3");
        System.out.println(1 + "2" + 3);
    }

}
