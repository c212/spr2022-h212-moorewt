public class LispTest {
    public static void main(String[] args){
        LispList testList = LispList.NIL.cons("C").cons("B").cons("A");
        System.out.println("Constructor Test");
        System.out.println("Expected result: A B C");
        System.out.println(testList);
        LispList testList2 = LispList.NIL;
        System.out.println("Expected result: blank line");
        System.out.println(testList2);
        System.out.println("Length Test");
        System.out.println("Expected result: 3");
        System.out.println(testList.length());
        System.out.println("Expected result: 0");
        System.out.println(testList2.length());
        System.out.println();
        System.out.println(LispList.NIL.merge(testList));
        LispList list1 = LispList.NIL.cons(4).cons(3).cons(2).cons(1);
        LispList list2 = LispList.NIL.cons(6).cons(5);
        System.out.println(list1.merge(list2));
        System.out.println(list2.merge(list1));
        System.out.println("Contains Test");
        System.out.println("Expected Result: true true true false");
        System.out.print(testList.contains("A")+ " ");
        System.out.print(testList.contains("B")+ " ");
        System.out.print(testList.contains("C")+ " ");
        System.out.println(testList.contains("D")+ " ");
        System.out.println("Test Complete");

    }
}
