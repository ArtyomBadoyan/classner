package outer;

public class Outer {
    int a = 4;

    void test() {
        System.out.println("Outer.test");
    }
    static class Inner{
        int a =34;
        void showA(){
            System.out.println(a);
        }
    }
}
