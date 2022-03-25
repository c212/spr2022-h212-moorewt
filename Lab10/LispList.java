public interface LispList {
    boolean empty();
    Object head();
    LispList tail();
    static LispList NIL = new EmptyList();
    LispList cons(Object obj);
    int length();
    LispList merge(LispList other);
    boolean contains(Object obj);
}
