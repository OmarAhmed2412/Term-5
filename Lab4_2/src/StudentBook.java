import java.time.LocalDate;

public class StudentBook implements Record{
    private String StudentId;
    private String bookId;
    private LocalDate borrowDate;

    public StudentBook(String studentId, String bookId, LocalDate borrowDate) {
        StudentId = studentId;
        this.bookId = bookId;
        this.borrowDate = borrowDate;
    }


    public String getStudentId() {return StudentId;}

    public String getBookId() {return bookId;}

    public LocalDate getBorrowDate() {return borrowDate;}

    public String getSearchKey(){return this.StudentId + "," + this.bookId;}


    public String lineRepresentation(){return this.StudentId + "," + this.bookId + "," + this.bookId;}
}
