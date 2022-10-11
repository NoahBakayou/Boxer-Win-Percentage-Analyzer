public class Pair<A,B> {
    private A first;
    private B second;

    /**
     * Constructor to force initial values to be passed in upon instantiation.
     */
    public Pair(A a, B b){ //constructor method bc no return type and same name as class
        first = a;
        second = b;
    }

    public A getFirst(){
        return first;
    }

    public B getSecond(){
        return second;
    }
}
