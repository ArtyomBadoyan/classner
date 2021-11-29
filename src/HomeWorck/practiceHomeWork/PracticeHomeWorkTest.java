package HomeWorck.practiceHomeWork;

public class PracticeHomeWorkTest {
    public static void main(String[] args) {
        PracticeHomeWork ph = new PracticeHomeWork();
        System.out.println(ph.convert(10));
        System.out.println(ph.calcAge(20));
        System.out.println(ph.nextNumber(8));
        System.out.println(ph.isSameNum(5, 5));
        System.out.println(ph.lessThanOrEqualToZero(10));
        System.out.println(ph.reverseBool(true));
        int[] array1 = {2, 8, 5,};
        int[] array2 = {5, 5, 8, 7, 9,};
        System.out.println(ph.maxLength(array1, array2));


    }
}
