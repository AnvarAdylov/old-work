import java.util.ArrayList;
import java.util.List;



public class HW2 {
	public static String smartIter(int M,int N, int a,List<String> ls, String s) {
	if (a == 0) {
			for(int c = a;c<=N-M;c++) { 
				s = "(";
				s = s + Integer.toString(c);
				smartIterHelper(M,N,c,ls,s);
			}
		} else {
			if (M == 1) {
				smartIterHelper(M,N,a,ls,s);
			} else {
				if (M > 0) {	
					smartIterHelper(M,N,a,ls,s);
					return s;
				}
			}
		}
		return "";
	}
	
	public static void smartIterHelper(int M,int N, int a,List<String> ls, String s) {
		if (M == 1) {
			String z = s;
			z = z + ")";
			ls.add(z);
			z = "";
		} else {
			for (int b = a + 1;b<N;b++) {
				String v = s;
				v = v + "," + Integer.toString(b);
				v = v + smartIter(M - 1,N,b,ls,v);
				if (M == 0) {
					String z = v;
					z = z + smartIter(M - 1,N,b,ls,z);
					z = z + ")";
					ls.add(z);
					z = "";
				}
				v = "";
			}	
		}
	}
	
	
	public static void main(String[] args) {
		int M = 1;
		int N = 5;
		List<String> stringList = new ArrayList<String>();
		smartIter(M,N,0,stringList,"");
		System.out.println(stringList.size());
		System.out.println(stringList);
	}
	
}
