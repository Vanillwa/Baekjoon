import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<3;i++)
			list.add(Integer.parseInt(st.nextToken()));
		
		Set<Integer> set = new HashSet<>(list);
		
		int max = list.stream().mapToInt(Integer::intValue).max().orElseThrow();
		
		if(set.size()==3) //주사위 중복 없을 경우
			System.out.println(max*100);
		else if(set.size()==2) { //주사위 한쌍만 중복인 경우
			for(Integer i : set)
				list.remove(i);
			System.out.println(1000+list.get(0)*100);
		}else //주사위 3개 중복
			System.out.println(10000+max*1000);
		br.close();
	}
}