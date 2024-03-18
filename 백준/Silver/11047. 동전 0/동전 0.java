import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int cnt = 0;
		List<Integer> coin = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++)
			coin.add(Integer.parseInt(br.readLine()));

		Collections.reverse(coin);
		
		for (int i : coin) {
			if (i <= k) {
				while (k / i != 0) {
					cnt += k / i;
					k %= i;
				}
			}
		}
		System.out.println(cnt);
	}
}