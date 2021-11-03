package HomeWorck.practiceHomeWork;

public class PracticeHomeWork {
    //փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել
    double convert(int minutes, int seconds) {
        return minutes / seconds;
    }

    //ընդունել տարին, վերադարձնել օրերի քանակը։
    double calcAge(int years, int days) {
        return years / days;
    }

    //        //վերադարձնել տրված թվի հաջորդ թիվը
    int nextNumber(int number) {
        return number + 1;
    }

    //վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false
    boolean isSameNum(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    //վերադարձնել true-եթե թիվը փոքր կամ հավասար է 0-ին։
    //մնացած դեպքերում վերադարձնել false
    boolean lessThanOrEqualToZero(int number) {

        int a = 0;
        if (a <= 0) {
            return true;
        } else {
            return false;
        }
    }
}


