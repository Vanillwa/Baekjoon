import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		int sum = 0;
		ArrayList<Integer>[] lists = new ArrayList[2];

		for (int i = 0; i < 2; i++) {
			lists[i] = new ArrayList<Integer>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				lists[i].add(Integer.parseInt(st.nextToken()));
			}
		}

		Collections.sort(lists[0], Collections.reverseOrder());
		Collections.sort(lists[1]);

		for (int i = 0; i < num; i++) {
			sum += (lists[0].get(i) * lists[1].get(i));
		}

		bw.append(sum + "");
		bw.flush();
	}
}
