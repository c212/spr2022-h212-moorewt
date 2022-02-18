public class R530 {
    public static void main(String[] args){
        System.out.println(a());
        System.out.println(b());
        System.out.println(c());
        System.out.println(d());
        System.out.println(e());
        System.out.println(f());
        System.out.println(g());
        System.out.println(h());
    }
    public static boolean a(){
        boolean b = false;
        int x = 0;
        return b && x == 0; //b is false, x is 0, 0 is equivalent to false, false == false is true
    }
    public static boolean b(){
        boolean b = false;
        int x = 0;
        return b || x == 0; // or statement only needs one true statement to evaluate true
    }
    public static boolean c(){
        boolean b = false;
        int x = 0;
        return !b && x == 0; // true and true is true
    }
    public static boolean d(){
        boolean b = false;
        int x = 0;
        return !b || x == 0; // two trues in an or statement, true
    }
    public static boolean e() {
        boolean b = false;
        int x = 0;
        return b && x != 0; // false and false is always false
    }
    public static boolean f() {
        boolean b = false;
        int x = 0;
        return b || x != 0; // false or false is always false
    }
    public static boolean g() {
        boolean b = false;
        int x = 0;
        return !b && x != 0; //false because x not equaling 0 is false
    }
    public static boolean h() {
        boolean b = false;
        int x = 0;
        return !b || x != 0; //only have one true, but it's an or statement, so true
    }
}
