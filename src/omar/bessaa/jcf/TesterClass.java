package omar.bessaa.jcf;

public abstract class TesterClass {

	public static void main(String[] args) {
		Library lib = new Library();
		
		lib.addBook(new Book("1234", "The java book", "Omar Bessaa"));
		lib.addBook(new Book("4567", "The java book 2", "Omar Bessaa"));
		System.out.println(lib.getTotalNumberOfBooks());
		System.out.println(lib.getBook("1234"));
		System.out.println(lib.getAllBooks());
		
		lib.removeBook("1234");
		System.out.println(lib.getTotalNumberOfBooks());
		System.out.println(lib.getAllBooks());
		
		
		
	}
}

/*
 * Inside the main
 * 
 * List<String> test = new ArrayList<>();
 * 
 * test.add("helloWorld.doc"); String s = test.get(0); test.remove(0);
 * System.out.println(s); System.out.println(test);
 * 
 * List<String> lst = new LinkedList<>(); lst.add("NoSql");
 * //System.out.println(lst.get(0));
 * 
 * //********************************************************
 * lst.add("casandra"); lst.add("MongoDB"); Iterator<String> elements =
 * lst.iterator(); System.out.println(lst); elements.next(); elements.remove();
 * System.out.println(lst); if (elements.hasNext())
 * System.out.println(elements.next());
 * 
 * //*************************** //MAp Map<String, String> dict = new
 * HashMap<>(); dict.put("Omar", "Bessaa"); System.out.println(dict); // ****
 * iterator on the keys Iterator<String> keys = dict.keySet().iterator();
 * 
 * //** for each implements a special interface for map (BiConsumer)
 * dict.forEach((firstName , lastName) -> { System.out.println(firstName + " "
 * +lastName); }
 * 
 * ); }
 * 
 */