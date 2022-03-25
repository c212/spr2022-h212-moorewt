public class NonEmptyList implements LispList{
    Object head = head();
    LispList tail = tail();


    public NonEmptyList(Object obj, LispList tail) {
        this.head = obj;
        this.tail = tail;
    }

    public String toString() {
        return head() + " " + tail().toString();
    }
    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public Object head() {
        return head;
    }

    @Override
    public LispList tail() {
        return tail;
    }

    @Override
    public LispList cons(Object obj) {
        return new NonEmptyList(obj, new NonEmptyList(head(),tail));
    }

    @Override
    public int length() {
        return 1 + tail.length();
    }

    @Override
    public LispList merge(LispList other) {
        Object[] arr = new Object[Math.max(other.length(),length()) + Math.abs(other.length() - length())];
        int i = 0;
        LispList temp = this;
        while (i < arr.length){
            if (!temp.empty()){
                arr[i] = temp.head();
                temp = temp.tail();
                i++;
            }
            if (!other.empty()){
                arr[i] = other.head();
                other = other.tail();
                i++;
            }
        }
        LispList returnList = LispList.NIL;
        for (i = arr.length-1; i >= 0; i--){
            returnList = returnList.cons(arr[i]);
        }
        return returnList;
    }

    @Override
    public boolean contains(Object obj) {
        if (obj == head()){
            return true;
        }else{
            return tail.contains(obj);
        }
    }


}
