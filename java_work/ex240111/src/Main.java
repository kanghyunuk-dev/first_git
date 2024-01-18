// 로또만들기

public class Main {
    public static void main(String[] args) {
        int[] lottoNumber = new int[100];

        // 입력하는 for
        // 1번째 부터 비교
        // 0 ~ 끝까지 비교, 같은게 있으면 counter 증가
        // 똑같은게 없을때까지
        // ctrl + alt + l 자동정렬
        int counter = -1;
        for (int i = 0; i < lottoNumber.length; i++) {
            lottoNumber[i] = (int) (Math.random() * 46) + 1;
            while(true) {
                counter = 0;
                for (int j = 0; j < i; j++) {
                    if (lottoNumber[i] == lottoNumber[j]) {
                        counter++;
                    }
                }
                if (counter > 0) {
                    lottoNumber[i] = (int) (Math.random() * 46) + 1;
                } else {
                    break;
                }
            }
            System.out.println("conter = " + counter);
        }

        // 출력하는 for
        for (int i = 0; i < lottoNumber.length; i++) {
            System.out.print(lottoNumber[i] + " ");
        }
    }
}