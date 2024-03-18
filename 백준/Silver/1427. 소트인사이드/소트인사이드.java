import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] str = br.readLine().toCharArray();
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < str.length; i++)
			list.add(Character.getNumericValue(str[i]));

		Collections.sort(list, Collections.reverseOrder());

		for (int i : list)
			System.out.printf("%d", i);
	}
}