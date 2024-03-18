import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char[] str = br.readLine().toUpperCase().toCharArray();
		int[] count = new int[26];
		for (char c : str) {
			count[c - 65]++;
		}

		int max = 0;
		int maxIndex = 0;
		int check=0;
		
		for (int i = 0; i < 26; i++) {
			if (count[i] > max) {
				maxIndex = i;
				max = count[i];
			}
		}
		
		for (int i : count) {
			if(i==max) {
				check++;
				if(check==2) {
					System.out.println("?");
					return;
				}
			}
		}
		
		System.out.println((char)(maxIndex+65));
        br.close();
	}
}