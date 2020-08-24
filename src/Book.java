public class Book implements LibraryInterface{
    private String title, author;
    private String id;
    private static boolean isAvailable = true;

    public static void setIsAvailable(boolean available) {
        isAvailable = available;
    }

    public static boolean getIsAvailable(){
        return isAvailable;
    }
    public Book(String title, String author, String id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }
    public Book (String title){
        this.title = title;
    }
    public Book() {

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getID() {
        return id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
