import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			list1.add(br.readLine());
		}
		for (int i = 0; i < m; i++) {
			list2.add(br.readLine());
		}

		Set<String> set = new HashSet<String>(list1);
		List<String> result = new ArrayList<String>();
		for (String str : list2) {
			if (!set.add(str)) {
				result.add(str);
			}
		}

		Collections.sort(result);

		bw.append(result.size() + "\n");
		for (String str : result) {
			bw.append(str + "\n");
		}

		bw.flush();
	}
}