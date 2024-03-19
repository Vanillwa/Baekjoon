import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		long num = Long.parseLong(br.readLine());

		long i = 1;
		long cnt = 0;
		while (true) {
			num -= i++;
			if (num < 0) {
				break;
			}
			cnt++;
		}
		bw.append(cnt + "");
		bw.flush();
	}
}