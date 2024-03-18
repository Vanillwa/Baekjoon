import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = Integer.parseInt(br.readLine());
		int[] num = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < cnt; i++) {
			System.out.println(check(num[i]));
		}
	}

	public static int check(int num) {
		if (num == 1)
			return 1;
		if (num == 2)
			return 2;
		if (num == 3)
			return 4;

		return check(num - 1) + check(num - 2) + check(num - 3);
	}
}