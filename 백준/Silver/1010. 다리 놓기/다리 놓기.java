import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());

		for (int i = 1; i <= num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());

			long result = combination(n, r);
			bw.append(result + "\n");
		}
		bw.flush();
	}

	public static long combination(int n, int r) {
		if (r > n / 2) {
			r = n - r;
		}

		long nPr = 1;
		long rfacto = 1;

		for (int i = 1; i <= r; i++) {
			nPr *= (n - i + 1);
			rfacto *= i;
		}

		return nPr / rfacto;
	}
}