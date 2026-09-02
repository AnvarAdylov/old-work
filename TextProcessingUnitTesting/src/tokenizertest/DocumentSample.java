package tokenizertest;


import java.util.HashMap;


public class DocumentSample {
	private HashMap<String, Integer> wordcount;
		
	
	public DocumentSample(String s) {
		wordcount = new HashMap<String,Integer>();
		String[] words = s.split(" |,|\\.|-|\\r?\\n|:|;");
		for(int i = 0;i < words.length; i++) {
			if (wordcount.containsKey(words[i])) {
				int x = wordcount.get(words[i]);
				wordcount.remove(words[i]);
			wordcount.put(words[i], x + 1);
			} else {
			wordcount.put(words[i], 1);
			}
		}
		wordcount.remove("");
	}

	public int getNumberUniqueTerms() {
		return wordcount.size();
		
	}

	public void addDocument(String string) {
		String[] words = string.split(" |,|\\.|-|\\r?\\n|:|;");
		for(int i = 0;i < words.length; i++) {
			if (wordcount.containsKey(words[i]) == true) {
				int x = wordcount.get(words[i]);
				wordcount.remove(words[i]);
				wordcount.put(words[i], x + 1);
			} else {
			wordcount.put(words[i], 1);
			}
		}
		wordcount.remove("");
	}

	public int getCountForToken(String string) {
		return wordcount.get(string);
	}
	
}
