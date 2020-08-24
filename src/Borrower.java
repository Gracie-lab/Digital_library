public class Borrower {
    private String name;
    private  String bookToBorrow;
    private  String bookToReturn;

    public  String getBookToBorrow() {
        return bookToBorrow;
    }

    public String getBookToReturn() {
        return bookToReturn;
    }



    public Borrower(){

    }
    public Borrower(String name){
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(String title) {
        bookToBorrow = title;
    }

    public void returnBook(String title) {
        bookToReturn = title;
    }
}
