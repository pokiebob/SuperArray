public class Demo {

	public static void removeDuplicates(SuperArray s) {
		int index;
		for (int i = s.size()-1; i >= 0; i--) {
			index = s.indexOf(s.get(i));
			while (index != i) {
				s.remove(index);
				index = s.indexOf(s.get(i));
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
	}
}