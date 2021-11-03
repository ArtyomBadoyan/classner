package HomeWorck.classner;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox1 = new Box();
        double vol;
        myBox.setDim(10,20, 15);

        System.out.println(myBox.volium());

        myBox1.setDim(3, 6, 9);

        myBox1.volium();



    }
}
