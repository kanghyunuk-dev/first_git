public class Ex04 {
    public static void main(String[] args) {
        int[][] score = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        // 모든수의 합
        int korsum = 0;
//        korsum = score[0][0]+score[0][1]+score[0][2]+
//                score[1][0]+score[1][1]+score[1][2]+
//                score[2][0]+score[2][1]+score[2][2];

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                korsum += score[i][j];
            }
        }
        System.out.println(korsum);
    }


}
