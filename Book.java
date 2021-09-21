/** 
 * A class that maintains information on a book called Melted Cranberries
 *
 * @author (Matilda Delacourt)
 * @version (09/20/2021)
 */
class Book
{
    // The fields.
    private String author = ("Matilda Delacourt");
    private String title = ("Melted Cranberries");
    private int pages = 200;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
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
    //sets the ref number
    public void setRefNumber(String ref)
    {
        if (ref.length() >= 3){
            refNumber = ref;
        }
        else{
            System.out.println("Error! You need at least 3 characters");
        }
    }
    // returns the ref number
    public String getRefNumber()
    {
        return refNumber;
    }
        // print the details and refnumber if present
    public void printDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);

        if (refNumber.length() > 0){
            System.out.println("Refnumber + " + refNumber);
        }
        else{
            System.out.println("Refnumber = ZZZ");
        }
    }
}

