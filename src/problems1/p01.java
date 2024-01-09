package problems1;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class p01 {

    public int solution(String str, char t) {
        int answer=0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (char x : str.toCharArray()) {
            if(x == t) answer++;
        }

        /*for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==t) answer++;
        }*/
        /*int result = 0;
        // 대문자 검사(65 A) -> 소문자 검사(97 a)
        for (char x : s.toCharArray()) {
            if(x == c) result++;
            else if(x+32 == c) result++;
            else if(x-32 == c) result++;
        }
        System.out.println(result);*/

        return answer;
    }
    public static void main(String[] args) {
        // 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지
        // 알아내는 프로그램을 작성하세요. <- 빈도수 세기
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char t = scan.next().charAt(0);
        p01 T = new p01();

        System.out.println(T.solution(str, t));
    }
}
