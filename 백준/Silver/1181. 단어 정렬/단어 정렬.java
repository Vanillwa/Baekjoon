import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		Set<String> set = new HashSet<String>();
		String str = "";
		for (int i = 0; i < cnt; i++) {
			str = br.readLine();
			set.add(str);
		}

		List<String> list = new ArrayList<String>(set);
		Collections.sort(list);
		Collections.sort(list, (String a, String b) -> a.length() - b.length());
		for(String s : list)
			System.out.println(s);
	}
}