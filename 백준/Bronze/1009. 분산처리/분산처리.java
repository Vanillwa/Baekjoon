import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt;
		cnt = Integer.parseInt(br.readLine());
		int[] answer = new int[cnt];
		int[] num;

		for (int i = 0; i < cnt; i++) {
			num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			answer[i] = 1;
			for (int j = 1; j <= num[1]; j++) {
				answer[i] = (answer[i] * num[0]) % 10;
			}
		}
		for (int i = 0; i < cnt; i++) {
			if (answer[i] == 0)
				System.out.println(10);
			else
				System.out.println(answer[i]);
		}
	}
}