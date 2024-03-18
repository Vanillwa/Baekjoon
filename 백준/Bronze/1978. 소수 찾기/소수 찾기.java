import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());
		int numCount = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < count; i++)
			list.add(Integer.parseInt(st.nextToken()));
		loop1:
		for (int i : list) {
			if(i==1) {
				continue;
			}else if(i==2) {
				numCount++;
				continue;
			}
			for (int j = 2; j < i; j++) {
				if(i%j==0)
					continue loop1;
			}
			numCount++;
		}
		System.out.println(numCount);
		br.close();
	}
}