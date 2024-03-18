import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		int num = Integer.parseInt(br.readLine());
		int[] quitNum = {1,2,4,7};
		
		for(int i:quitNum) {
			if(num==i) {
				System.out.println("-1");
				return;
			}
		}
		
		count += num / 5;
		num %= 5;
		count += num / 3;
		num %= 3;
		
		while (num != 0) {
			count--;
			num += 5;
			count += num / 3;
			num %= 3;
		}
		System.out.printf("%d\n", count);
		br.close();
	}
}