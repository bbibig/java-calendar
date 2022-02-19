package calendar;
import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		//입력: 키보드로 두 수의 입력받기
		Scanner scanner = new Scanner(System.in);
		int a,b;
		System.out.println("두 수를 입력하세요.");
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		//출력: 화면에 두 수의 합 출력하기
		System.out.printf("%d와 %d의 합은 %d입니다.", a, b, a+b);
		scanner.close();
	}
}
