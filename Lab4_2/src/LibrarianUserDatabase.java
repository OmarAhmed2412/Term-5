import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LibrarianUserDatabase extends DataBase {

    public LibrarianUserDatabase(String fileName) {
        super(fileName);
    }


    public LibrarianUser createRecordFrom(String line) {
        String[] librarianData = line.split(",");
        LibrarianUser librarian = new LibrarianUser(librarianData[0], librarianData[1], librarianData[2], librarianData[3], librarianData[4]);
        return librarian;
    }

}
