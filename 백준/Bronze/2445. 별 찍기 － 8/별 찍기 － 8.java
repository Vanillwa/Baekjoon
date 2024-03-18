import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			for (int j = 1; j <= 2 * (num - i); j++) {
				System.out.printf(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		for (int i = num-1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			for (int j = 1; j <= 2 * (num - i); j++) {
				System.out.printf(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}