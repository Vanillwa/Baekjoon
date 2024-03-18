import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		int check = 0;
		for (int i = 1; i <= num; i++) {
			char[] str = br.readLine().toCharArray();
			List<Character> list = new ArrayList<Character>();
			list.add(str[0]);
			char prev = str[0];
			for (int j = 1; j < str.length; j++) {
				if (str[j] != prev) {
					list.add(str[j]);
					prev = str[j];
				}
			}
			Set<Character> set = new HashSet<Character>(list);
			if(set.size() == list.size()) {
				check++;
			}
		}
		bw.append(check+"");
		bw.flush();
	}
}