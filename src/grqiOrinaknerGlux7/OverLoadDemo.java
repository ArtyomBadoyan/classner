package grqiOrinaknerGlux7;

public class OverLoadDemo {
    void test(){
        System.out.println(" ");
    }
    void test(int a){
        System.out.println("a: " + a);
    }
    void test(int a, int b){
        System.out.println("a b: " + a + " " + b);
    }
    double test(double a){
        System.out.println("a b: " +a);
        return a*a;
    }
}

