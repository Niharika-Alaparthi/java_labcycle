class Book{
    String bookname;
    String ISBNnum,authorname,publishername;
    Book(String bn,String isbn,String an,String pn){
       this.bookname=bn;
        this.ISBNnum=isbn;
        this.authorname=an;
        this.publishername=pn;
    }
    void setbookname(String bookname) {
    	this.bookname=bookname;
    }
    String getbookname() {
    	return bookname;
    }
    void setISBNnum(String ISBNnum) {
    	this.ISBNnum=ISBNnum;
    }
    String getISBNnum() {
    	return ISBNnum;
    }
    void setauthorname(String authorname) {
    	this.authorname=authorname;
    }
    String getauthorname() {
    	return authorname;
    }
    void setpublishername(String publishername) {
    	this.publishername=publishername;
    }
    String getpublishername() {
    	return publishername;
    }
    void getBookInfo() {
    	System.out.println("name of the book:"+bookname);
    	System.out.println("ISBN number:"+ISBNnum);
    	System.out.println("author:"+authorname);
    	System.out.println("publisher:"+publishername);
    	
    	
    }
    
    
}
public class BookTest {
	public static void main(String args[]) {
		Book b[]=new Book[30];
		b[0]=new Book("wings of fire","1-23456-789-0","abdulkalam","universities press");
		b[0].getBookInfo();
		b[1]=new Book("the open boa","1-86092-025-x","stephen crane","uniersities press");
		b[1].getBookInfo();	
		b[2]=new Book("java:the complete reference","93-90491-62-2","herbert schildt","oracle press");
		b[2].getBookInfo();
	}
}
