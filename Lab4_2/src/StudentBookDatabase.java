import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class StudentBookDatabase extends DataBase{

    public StudentBookDatabase(String fileName) {
        super(fileName);
    }


    public StudentBook createRecordFrom (String line)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MMM-dd");
        formatter = formatter.withLocale(Locale.US);
        String[] BookData = line.split(",");
        StudentBook studentBook = new StudentBook(BookData[0], BookData[1], LocalDate.parse(BookData[2], formatter) );
        return studentBook;
    }
}
