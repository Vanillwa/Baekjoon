import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				list.add(Integer.parseInt(st.nextToken()));
			}
		}
		int max = Collections.max(list);
		int idx = list.indexOf(max);
		System.out.printf("%d\n%d %d", max, (idx / 9) + 1, (idx % 9) + 1);
	}
}