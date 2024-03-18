import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int newNum, a, b, cnt = 0;
		int num = sc.nextInt();
		newNum = num;
		while (true) {
			a = newNum / 10;
			b = newNum % 10;
			newNum = (b * 10) + ((a + b) % 10);
			cnt++;
			if (num == newNum)
				break;
		}
		System.out.println(cnt);
		sc.close();
	}
}