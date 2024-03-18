import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());

		boolean[] num = new boolean[num2 + 1];

		num[0] = num[1] = false;
		for (int i = 2; i <= num2; i++)
			num[i] = true;

		for (int i = 2; i <= Math.sqrt(num2); i++) {
			if (num[i] == true) {
				for (int j = i * i; j <= num2; j += i)
					num[j] = false;
			}
		}

		int sum = 0, min = 0;
		for (int i = num1; i <= num2; i++) {
			if (num[i]) {
				if (min == 0)
					min = i;
				sum += i;
			}
		}

		if (sum == 0)
			System.out.println(-1);
		else
			System.out.printf("%d\n%d", sum, min);
	}
}