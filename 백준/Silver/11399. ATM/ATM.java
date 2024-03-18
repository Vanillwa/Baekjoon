import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int p = Integer.parseInt(br.readLine());
		int time = 0;
		List<Integer> list = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list);
		
		List<Integer> newList = new ArrayList<Integer>();
		for(int i : list) {
			time += i;
			newList.add(time);
		}
		
		int sum = newList.stream().mapToInt(i -> i).sum();
		System.out.printf("%d", sum);
	}
}