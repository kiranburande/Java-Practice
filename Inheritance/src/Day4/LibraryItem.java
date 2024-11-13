package Day4;

 class LibraryItem 
{
	String title;
	
	public void displayInfo()
	{
		System.out.println("Title :"+title);
	}

	public LibraryItem(String title) {
		super();
		this.title = title;
	}
	

}

class Book extends LibraryItem
{
	String author;
	
	public void displayBookInfo()
	{
		super.displayInfo();
		System.out.println("Autor :"+author);
	}

	public Book(String title, String author) {
		super(title);
		this.author = author;
	}
	
}

 class Ebook extends Book
{
	String fileFormat;
	
	public void displayEbookInfo()
	{
		super.displayBookInfo();
		System.out.println("File Format :"+fileFormat);
	}

	public Ebook(String title, String author, String fileFormat) {
		super(title, author);
		this.fileFormat = fileFormat;
	}

	 
	
}



