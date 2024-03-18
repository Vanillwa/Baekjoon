import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt=0;
		for (int i = 1; i <= 8; i++) {
			String str = br.readLine();
			if (i % 2 != 0) {
				for (int j = 0; j < 8; j++) {
					if(j%2==0 && str.toCharArray()[j]=='F') {
						cnt++;
					}
				}
			}else {
				for (int j = 0; j < 8; j++) {
					if(j%2!=0 && str.toCharArray()[j]=='F') {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}