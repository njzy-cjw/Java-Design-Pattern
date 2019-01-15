public class Main{
	public static void main(String[] args){
		BookShelf bookshelf = new BookShelf(3);
		bookshelf.appenedBook(new Book("世界秩序"));
		bookshelf.appenedBook(new Book("富兰克林传"));
		bookshelf.appenedBook(new Book("社会心理学"));
		Iterator it = bookshelf.iterator();
		while(it.hasNext()){
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}
