import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<>();
		while (st.hasMoreTokens())
			list.add(Integer.parseInt(st.nextToken()));

		int num1 = Collections.max(list);
		int num2 = Collections.min(list);

		int r;
		while (true) {
			r = num1 % num2;
			if (r == 0)
				break;
			num1 = num2;
			num2 = r;
		}
		System.out.printf("%d\n%d", num2, list.get(0) * list.get(1) / num2);
	}
}