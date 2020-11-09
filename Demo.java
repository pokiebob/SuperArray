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
	    removeDuplicates(words);
	    System.out.println(words);

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
	    removeDuplicates(words);
	    System.out.println(words);

	}
}