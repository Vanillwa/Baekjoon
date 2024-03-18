import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int count=0;
		
		for(String s : str) {
			if(!s.isEmpty())
				count++;
		}
		System.out.println(count);
	}
}