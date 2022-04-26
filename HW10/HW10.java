public class HW10 {
    public static void main(String[] args){
        System.out.println("Problem R14.3");
        System.out.println("a. O(n^2)");
        System.out.println("b. O(n^10)");
        System.out.println("c. O(n^4)");
        System.out.println("d. O(n^4)");
        System.out.println("e. O(n^3)");
        System.out.println("f. O(n^9)");
        System.out.println("g. O(n)");
        System.out.println("h. O(n^2)");
        System.out.println("i. O(2^n)");
        System.out.println("j. O(n)");
        System.out.println();
        System.out.println("Problem R14.4");
        int n1 = 0;
        int n2 = 0;
        System.out.println("Part 1: 2,000/1,000");
        n1 = 2000;
        float tn1 = (float) (.5 * (n1*n1) + (2.5*n1) - 3);
        n2 = 1000;
        float tn2 = (float) (.5 * (n2*n2) + (2.5*n2) - 3);
        System.out.println("Actual ratio: " + tn1/tn2);

        System.out.println("n^2 ratio: " + (n1*n1)/(n2*n2));
        System.out.println("Part 2: 4,000/1,000");
        n1 = 4000;
        tn1 = (float) (.5 * (n1*n1) + (2.5*n1) - 3);
        n2 = 1000;
        tn2 = (float) (.5 * (n2*n2) + (2.5*n2) - 3);
        System.out.println("Actual ratio: " + tn1/tn2);
        System.out.println("n^2 ratio: " + (n1*n1)/(n2*n2));
        System.out.println("Part 3: 10,000/1,000");
        n1 = 10000;
        tn1 = (float) (.5 * (n1*n1) + (2.5*n1) - 3);
        n2 = 1000;
        tn2 = (float) (.5 * (n2*n2) + (2.5*n2) - 3);
        System.out.println("Actual ratio: " + tn1/tn2);
        System.out.println("n^2 ratio: " + (n1*n1)/(n2*n2));
        System.out.println();
        System.out.println("Problem R14.5");
        int records = 2000;
        int time = records/200;
        System.out.println("2,000 records will take " + time + " seconds");
        records = 10000;
        time = records/200;
        System.out.println("10,000 records will take " + time + " seconds");
        System.out.println();
        System.out.println("Problem R14.6");
        System.out.println("      O(n)  O(n^2)  O(n^3)  O(n log(n))  O(2^n)");
        System.out.println("1,000  5      5       5         5           5");
        System.out.println("2,000  10     20      40        ~3          20");
        System.out.println("3,000  15     45      135       ~7          40");
        System.out.println("10,000 50     500     5,000     50          5,120");
        System.out.println();
        System.out.println("Problem R14.7");
        System.out.println("Growth rates from slowest to fastest:");
        System.out.println("O(log(n)), O(sqrt(n)), O(n), O(n*log(n)), O(n*sqrt(n)), O(n^log(n)), O(n^2*log(n)), O(n^3), O(2^n), O(n^n)");


    }
}
