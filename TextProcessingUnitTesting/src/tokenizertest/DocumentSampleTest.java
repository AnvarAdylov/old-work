package tokenizertest;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DocumentSampleTest {

	private int nFailures = 0;
	
	public void firstTest() {
		
		String s = "The cat meowed.";
		DocumentSample ds = new DocumentSample(s);
		
		int nterms = ds.getNumberUniqueTerms();
		
		if (nterms != 3) {
			throw new IllegalStateException("Error encountered!");
		}
		
	}
	
	public void secondTest() {
		
		String s = "This is a string for testing a document.";
		DocumentSample ds = new DocumentSample(s);
		
		int nterms = ds.getNumberUniqueTerms();
		
		if (nterms != 7) {
			throw new IllegalStateException("Error encountered!");
		}
		
	}
	
	public void thirdTest() {
		
		String s = "This is a string for testing a document.";
		DocumentSample ds = new DocumentSample(s);
		
		ds.addDocument(" And this is another.");
		
		int nterms = ds.getNumberUniqueTerms();
		
		if (nterms != 10) {
			throw new IllegalStateException("Error encountered!");
		}
		
	}
	
	public void fourthTest() {
		
		String s = "The cat meowed.";
		DocumentSample ds = new DocumentSample(s);
		
		int ncount = ds.getCountForToken("The");
		
		if (ncount != 1) {
			throw new IllegalStateException("Error encountered!");
		}
		
	}
	
    public void fifthTest() {
		
		String s = "This is a string for testing a document.";
		DocumentSample ds = new DocumentSample(s);
		
		int ncount = ds.getCountForToken("a");
		
		if (ncount != 2) {
			throw new IllegalStateException("Error encountered!");
		}
		
	}
 
    public void sixthTest() {
    	
    	String s = null;
    	
		try {
			int c;
			InputStream is = (new BufferedInputStream(new FileInputStream("./text3.txt")));
			
			BufferedReader bufr = new BufferedReader(new InputStreamReader(is));
			StringBuilder sb = new StringBuilder();
			String line = new String();
			while((line = bufr.readLine()) != null) {
				sb.append(line);
			}
			bufr.close();
			is.close();
			
			s = sb.toString();
					
		
		} catch (IOException e) {};
    	
		DocumentSample ds = new DocumentSample(s);
		
		int nterms = ds.getNumberUniqueTerms();
		
		if (nterms != 113) {
			throw new IllegalStateException("Error encountered!");
		}
		
	}
    
 public void seventhTest() {
    	
    	String s = null;
    	
		try {
			int c;
			InputStream is = (new BufferedInputStream(new FileInputStream("./text3.txt")));
			
			BufferedReader bufr = new BufferedReader(new InputStreamReader(is));
			StringBuilder sb = new StringBuilder();
			String line = new String();
			while((line = bufr.readLine()) != null) {
				sb.append(line);
			}
			bufr.close();
			is.close();
			
			s = sb.toString();
					
		
		} catch (IOException e) {};
    	
		
		DocumentSample ds = new DocumentSample(s);
		System.out.println(ds.getCountForToken("to"));
		int ncount = ds.getCountForToken("to");
		
		if (ncount != 7) {
			throw new IllegalStateException("Error encountered!");
		}
		
	}
	
	public static void main(String[] args) {
		
		DocumentSampleTest test = new DocumentSampleTest();
		
		try {
			test.firstTest();
		} catch (Exception e) {
			test.nFailures++;
		}
		
		try {
			test.secondTest();
		} catch (Exception e) {
			test.nFailures++;
		}
		
		try {
			test.thirdTest();
		} catch (Exception e) {
			test.nFailures++;
		}
		
		try {
			test.fourthTest();
		} catch (Exception e) {
			test.nFailures++;
		}
		
		try {
			test.fifthTest();
		} catch (Exception e) {
			test.nFailures++;
		}
		
		try {
			test.sixthTest();
		} catch (Exception e) {
			test.nFailures++;
		}
		
		try {
			test.seventhTest();
		} catch (Exception e) {
			test.nFailures++;
		}
			
		System.out.println("Failures: " + Integer.toString(test.nFailures));
		
		if (test.nFailures > 0) {
			throw new IllegalStateException("There were failures in tests");
		};
		
	}
	
}
