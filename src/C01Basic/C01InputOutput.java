package C01Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C01InputOutput {
    public static void main(String[] args) throws IOException {
        // 출력 sistem.out을 통해 콘솔풀렷
        System.out.println(20);// sout 탄축어 사용 가능
        System.out.print("hello world");
        System.out.print("hello world2");

//      입력 : System.in(키보드 입력) + Scanner 활용
        int a = 10; //10이라는 숫자를 변수명 a에 할당
//

        Scanner myScanner =new Scanner(System.in);
        String inputline1 = myScanner.nextLine();
        String inputline2 = myScanner.nextLine();
        int count = myScanner.nextInt();
        System.out.println("입력사항" + inputline1);
        System.out.println("입력사항" + inputline2);
        System.out.println("입력사항" + count);
//       입력 : System.in + BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        System.out.println(input1);

        String[] input2 = br.readLine().split(" ");
        System.out.println(input2[0]);
        System.out.println(input2[1]);
        System.out.println(input2[2]);

        String input3 = br.readLine();
        // StringTokenizer를 통해 공백을 기준으로 문자열을 하나씩 잘라서 담음
        StringTokenizer st = new StringTokenizer(input3);
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
    }
}
