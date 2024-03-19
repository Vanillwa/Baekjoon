import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[] charArr = br.readLine().toCharArray();

		int[] count = new int[9];

		for (char ch : charArr) {
			int num = Character.getNumericValue(ch);
			if (num == 9)
				num = 6;
			count[num]++;
		}

		if(count[6]%2 != 0) {
			count[6] /= 2;
			count[6]++;
		}else {
			count[6] /= 2;
		}
		
		int max = Arrays.stream(count).max().getAsInt();
		
		bw.append(max+"");
		bw.flush();
	}
}