import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<num;i++) {
			boolean fail = false;
			char[] charArr = br.readLine().toCharArray();
			
			int checkLeft = 0, checkRight = 0;
			for(char ch : charArr) {
				if(ch == '(')
					checkLeft++;
				if(ch == ')')
					checkRight++;
				if(checkRight > checkLeft)
					fail = true;
			}
			if(fail) {
				bw.append("NO\n");
				continue;
			}
			if(checkLeft == checkRight)
				bw.append("YES\n");
			else
				bw.append("NO\n");
				
		}
		bw.flush();
	}
}
