package outer;

public class OuterDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.Inner inner = new Outer.Inner();
    }
}
