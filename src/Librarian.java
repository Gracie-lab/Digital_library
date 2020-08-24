public class Librarian implements LibraryInterface{

    public void arrangeBooks() {
    }

    public void addBook(Book bookToAdd){
        books.add(bookToAdd);
    }

    Borrower borrower = new Borrower();
//    String bookToBorrow = borrower.getBookToBorrow();
    public boolean checkIfBookIsAvailable(String titleOfBookToBorrow) {
//        titleOfBookToBorrow = borrower.getBookToBorrow();
        for (Book book : books){
            if(book.getTitle() == titleOfBookToBorrow && Book.getIsAvailable() == true){
                Book.setIsAvailable(true);
            }
        }
        boolean confirm = Book.getIsAvailable();
        return confirm;
    }

    public boolean checkIfBookIsAvailable(String title, String author) {
//        title = borrower.getBookToBorrow();
        for (Book book : books){
            if(book.getTitle() == title && book.getAuthor() == author && Book.getIsAvailable() == true){
                Book.setIsAvailable(true);
            }
            else{
                System.out.println("Book is not available");
            }
        }
        boolean confirm = Book.getIsAvailable();
        return confirm;
    }


    public boolean giveBook(String title) {
        for (Book book : books){
            if(book.getTitle() == title){
                book.setIsAvailable(false);  //book is given out to borrower
                return true;
            }
        }
        return false;
    }
}
