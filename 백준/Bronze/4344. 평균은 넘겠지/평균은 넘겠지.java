import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());

		for (int i = 0; i < count; i++) {
			double sum = 0;
			double avg = 0;
			String[] str = br.readLine().split(" ");
			for (int j = 1; j < str.length; j++) {
				sum += Integer.parseInt(str[j]);
			}
			avg = sum / Integer.parseInt(str[0]);
			int p = 0;
			for (int j = 1; j < str.length; j++) {
				if (Integer.parseInt(str[j]) > avg) {
					p++;
				}
			}
			System.out.printf("%.3f%%\n", (double) p / Integer.parseInt(str[0]) * 100);
		}
	}
}