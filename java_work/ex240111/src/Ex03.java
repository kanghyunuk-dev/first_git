import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
        // 이차원배열 : 1차원 배열을 묶어놓은것
        int a[] = {80,90,100};
        int [][] score = {{10,20,30}, {40,50,60,70}};
        System.out.println(score[0].length);
        System.out.println(score[1].length);

        score[1] = a;
        System.out.println(score[1].length);

        a[0] = 300;
        System.out.println(score[0]);

        System.out.println(Arrays.toString(score));

    }
}
