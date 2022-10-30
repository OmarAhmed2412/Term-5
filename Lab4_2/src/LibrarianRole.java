import java.io.IOException;
import java.time.LocalDate;

public class LibrarianRole {
    private BookDatabase bookDatabase;
    private StudentBookDatabase sBDatabase;

    public LibrarianRole() {
    }


    public void addBook(String id, String title, String authorName, String publisherName, int quantity) throws IOException {

        this.bookDatabase.insertRecord(new Book(id, title, authorName, publisherName, quantity));
        this.bookDatabase.saveToFile();
    }


    public Book[] getListOfBooks(){
        return this.bookDatabase.returnAllRecords().toArray(new Book[0]);
    }


    public StudentBook[] getListOfBorrowingOperations(){
        return this.sBDatabase.returnAllRecords().toArray(new StudentBook[0]);
    }


    public int borrowBook(String studentId, String bookId, LocalDate borrowDate) throws IOException {
        for(Record book : (this.bookDatabase.returnAllRecords()))
        {
            book = (Book)book;
            if(book.getSearchKey().equals(bookId))
            {
                if(((Book) book).getQuantity() == 0)
                    return 0;
            }
        }
        for(Record studentBook : this.sBDatabase.returnAllRecords())
        {
            studentBook = (StudentBook)studentBook;
            if(((StudentBook) studentBook).getStudentId().equals(studentId))     ///////////
            {
                if(studentBook.getSearchKey().equals(bookId))
                    return 1;
            }
        }
        for(Record book : this.bookDatabase.returnAllRecords()){
            book = (Book) book;
            if(book.getSearchKey().equals(bookId)) {
                ((Book) book).setQuantity(((Book) book).getQuantity() + 1);
                this.bookDatabase.saveToFile();
            }

        }
        this.sBDatabase.insertRecord(new StudentBook(studentId, bookId, borrowDate));
        this.sBDatabase.saveToFile();
        return 2;
    }
}
