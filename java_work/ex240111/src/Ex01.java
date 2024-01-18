public class Ex01 {
    public static void main(String[] args) {
        // 이름을 Stirng[] 배열 안에 넣고 향상된 for구문으로 출력
        String[] names = {"박길동", "이길동", "홍길동"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}

