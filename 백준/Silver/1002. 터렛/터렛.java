import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		for(int i=0;i<cnt;i++) {
			int[] num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			int c1_x = num[0];
			int c1_y = num[1];
			int c1_r = num[2];
			int c2_x = num[3];
			int c2_y = num[4];
			int c2_r = num[5];
			
			double distance = Math.sqrt((Math.pow((c1_x-c2_x), 2))+(Math.pow((c1_y-c2_y), 2)));
			double radPlus = c1_r+c2_r;
			double radMinus = Math.abs(c1_r-c2_r);
			
			int dot=0;
			if(distance<radPlus&&distance>radMinus)
				dot=2;
			if(distance==radPlus&&distance>radMinus)
				dot=1;
			if(distance==radMinus&&distance<radPlus)
				dot=1;
			if(distance>radPlus)
				dot=0;
			if(distance<radMinus)
				dot=0;
			if(distance==0&&c1_r==c2_r)
				dot=-1;
			System.out.println(dot);
		}
	}
}