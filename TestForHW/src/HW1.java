import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class HW1 {
	public static String reverseString(String s) {
		Stack<String> sentence = new Stack<String>();
		String[] words = s.split(" |,|\\.|-|\\r?\\n|:|;");
				for(int i = 0;i < words.length; i++) {
					sentence.push(words[i]);
				}
		String rs = ""; 
		for(int i = 0;i < words.length; i++) {
			rs = rs.concat(" " + sentence.pop());
		}
		return rs;
	}
	
	public static void smartIter(int M, int N,List<String> x) {
		String str = "";
		str = str + "(";
		for (int i = 0;i<M;i++) {
			
			if (N == 1) {
				str = str + i + ",";
			} else {
			smartIter(M,N-1,x);
			}
			
		}
		str = str + ")";
		x.add(str);
	}
	
	
	public static void main(String[] args) {
		String x = "The cup broke";
		System.out.println(reverseString(x));
		
		List<String> stringList = new ArrayList<String>();
		// Program M ( Generic Version )
		
		smartIter(2,3,stringList);
		System.out.println(stringList);
	}
}
