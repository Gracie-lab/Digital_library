import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    Library library;
    Book book;
    Borrower person;
    Librarian worker;

    @BeforeEach
    void setUp() {
        library = new Library();
        book = new Book();
        person = new Borrower();
        worker = new Librarian();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void libraryHasBooksTest(){
        library.getBooks();
    }
    @Test
    void bookHasTitleAuthorId(){
        Book book1 = new Book("Java", "Deitel", "0");
        book1.getTitle();
        assertEquals("Java", book1.getTitle());
        assertEquals("Deitel", book1.getAuthor());
        assertEquals("0", book1.getID());
   }

   @Test
    void borrowHasName(){
        person.setName("Grace");
        person.getName();
        assertEquals("Grace", person.getName());
        Borrower newBorrower = new Borrower("Tope");
       assertEquals("Tope", newBorrower.getName());
   }

   @Test
    void borrowerCanBorrowBook(){
        person.borrowBook("Java");
        assertEquals("Java", person.getBookToBorrow());
   }

   @Test
    void borrowerCanReturnBook(){
        person.returnBook("Java");
   }
   @Test
    void librarianCanArrangeBooks(){
        worker.arrangeBooks();
   }
   @Test
   void librarianCanAddBooksToLibrary(){
        worker.addBook(new Book("Java", "Deitel", "0"));
        for (Book book : LibraryInterface.books){
            System.out.println(book.toString());
       }
   }
   @Test
    void librarianCanCheckIfBookIsAvailable(){
       worker.addBook(new Book("Java", "Deitel", "0"));
       worker.addBook(new Book("Python", "Chibuzor", "1"));
        boolean check = worker.checkIfBookIsAvailable("Java", "Deitel");
        assertTrue(check);


        boolean check1 = worker.checkIfBookIsAvailable("Python");
        assertTrue(check1);
    }

    @Test
    void librarianCanGiveOutBooks(){
        assertTrue(worker.giveBook("Java"));
    }
}