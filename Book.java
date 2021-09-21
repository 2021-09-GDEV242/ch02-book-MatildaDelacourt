/** 
 * A class that maintains information on a book called Melted Cranberries
 *
 * @author (Matilda Delacourt)
 * @version (09/20/2021)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
    }
    //returns the author of this book
    public String getAuthor(){
        return author;
    }
    // returns the title of this book
    public String getTitle(){
        return title;
        
    }
    //prints author
    public void printAuthor(){
        System.out.println("The Authors Name is " + author);
    }
    // prints book title
    public void printBookTitle(){
        System.out.println("The Books Name is " + title);
    }
    //returns the pages of this book
    public int getPages(){
        return pages;
    }
    

}
