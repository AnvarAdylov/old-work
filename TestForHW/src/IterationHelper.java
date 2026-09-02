import java.util.ArrayList;
import java.util.List;

public class IterationHelper {
	public List<String> stringList;
	int m;
	int n;
	
	public IterationHelper(int M,int N, List<String> ls) {
		m = M;
		n = N;
		stringList = ls;
	}
	
	public void Iterate() {
		smartIter(m,n,0,"");
	}
	
	private String smartIter(int M,int N, int a, String s) {
		if (a == 0) {
				for(int c = a;c<=N-M;c++) { 
					s = "(";
					s = s + Integer.toString(c);
					smartIterHelper(M,N,c,s);
				}
			} else {
				if (M == 1) {
					smartIterHelper(M,N,a,s);
				} else {
					if (M > 0) {	
						smartIterHelper(M,N,a,s);
						return s;
					}
				}
			}
			return "";
		}
		
	private void smartIterHelper(int M,int N, int a, String s) {
			if (M == 1) {
				String z = s;
				z = z + ")";
				stringList.add(z);
				z = "";
			} else {
				for (int b = a + 1;b<N;b++) {
					String v = s;
					v = v + "," + Integer.toString(b);
					v = v + smartIter(M - 1,N,b,v);
					if (M == 0) {
						String z = v;
						z = z + smartIter(M - 1,N,b,z);
						z = z + ")";
						stringList.add(z);
						z = "";
					}
					v = "";
				}	
			}
		}
		
		
	public static void main(String[] args) {
			int M = 3;
			int N = 4;
			List<String> stringList = new ArrayList<String>();
			IterationHelper x = new IterationHelper(M, N, stringList);
			x.Iterate();
			System.out.println(stringList.size());
			System.out.println(stringList);
		}
}
