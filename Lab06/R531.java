public class R531 {
    public static void main(String[] args){
        // part a
        // our expression is b == true
        Boolean b = true;
        System.out.println(b);
        System.out.println(b == true);
        //When b is true, b == true and b are both true
        //When b is false, b == true and b are both false
        b = false;
        System.out.println(b);
        System.out.println(b == true);

        //part b
        b = true;
        //when b is true, b == false and !b are both false
        System.out.println(!b);
        System.out.println(b == false);
        b = false;
        System.out.println(!b);
        System.out.println(b == false);

        //part c
        // b != true
        b = true;
        System.out.println(!b);
        System.out.println(b != true);
        b = false;
        System.out.println(!b);
        System.out.println(b != true);

        //part d
        // b != false
        b = true;
        System.out.println(b);
        System.out.println(b != false);
        b = false;
        System.out.println(b);
        System.out.println(b != false);
    }
}
