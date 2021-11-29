package grqiOrinaknerGlux7;

public class OverLoadDemoTest {
    public static void main(String[] args) {
        OverLoadDemo ob = new OverLoadDemo();
        double result;
        ob.test(1);
        ob.test(10);
        ob.test(10,20);
        ob.test(123.25);
        System.out.println(ob);


    }
}
