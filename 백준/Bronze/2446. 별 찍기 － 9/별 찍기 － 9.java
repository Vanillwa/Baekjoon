import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		for (int i = num; i > 0; i--) {
			for (int j = i; j < num; j++) {
				System.out.printf(" ");
			}
			for (int j = 1; j <= (i * 2) - 1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		for (int i = 2; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.printf(" ");
			}
			for (int j = 1; j <= (i * 2) - 1; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
