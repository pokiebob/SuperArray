public class Demo {

	public static void removeDuplicates(SuperArray s) {
		int initialSize = s.size();
		int offset = 0;
		for (int i = 0; i < initialSize; i++) {
			if (i-offset != s.indexOf(s.get(i-offset))) {
				s.remove(i-offset);
				offset++;
			}
		}
	}

	public static SuperArray findOverlap(SuperArray a, SuperArray b) {
		SuperArray s = new SuperArray();
		for (int i = 0; i < a.size(); i++) {
			if (b.contains(a.get(i))) {
				s.add(a.get(i));
			}
		}
		return s;
	}

	public static void main(String[] args) {
		SuperArray words = new SuperArray();
		words.add("kani");
		words.add("uni");
		words.add("ebi");
		words.add("una");     
    	words.add("una");
    	words.add("ebi");
    	words.add("kani");
    	words.add("una");
    	words.add("una");
    	words.add("ebi");
    	words.add("toro"); 

	    System.out.println(words);
	    System.out.println(words.lastIndexOf("una"));
	    removeDuplicates(words);
	    System.out.println(words);


	    SuperArray words2 = new SuperArray();
	    words2.add("kari");
	    words2.add("to");
	    words2.add("toro");
	    words2.add("uno");
	    words2.add("kari");
	    words2.add("ebi");

	    System.out.println(words2);
	    System.out.println(words2.lastIndexOf("kari"));
	    removeDuplicates(words2);
	    System.out.println(words2);

	    SuperArray wordss = findOverlap(words, words2);
	    System.out.println(wordss);

	    SuperArray words3 = new SuperArray();
	    words3.add("ebi");
	    words3.add("toro");

	    System.out.println(words.equals(words2));
	    System.out.println(wordss.equals(words3));

	}
}