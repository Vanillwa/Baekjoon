import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		Set<Integer> set = new HashSet<Integer>();
		while (st.hasMoreTokens()) {
			set.add(Integer.parseInt(st.nextToken()));
		}

		int m = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());

		List<Integer> list = new ArrayList<Integer>();
		while (st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}

		for (int i : list) {
			int prevSize = set.size();
			set.add(i);
			if (prevSize == set.size()) {
				bw.append("1 ");
			} else {
				bw.append("0 ");
			}
		}

		bw.flush();
	}
}