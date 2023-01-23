package ch3;

public class Ex3_2 {
    public static void main(String[] args) {
        int i = 5, j = 0;

        j = i++;
        System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);

        // 결과 비교를 위해 i, j의 값을 변경
        i=5;
        j=0;

        j= ++i;
        System.out.println("j=++i; 실행 후, i=" + i + ", j=" + j);
    }
}
