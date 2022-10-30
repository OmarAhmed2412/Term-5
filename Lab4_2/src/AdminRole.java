import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.Key;

public class AdminRole extends LibrarianUserDatabase {
    private LibrarianUserDatabase database;
    private String fileName;

    public AdminRole(String fileName) {
        super(fileName);
        this.fileName = fileName;
    }

    public void addLibrarian(String librarianId, String name, String email, String address, String phoneNumber) throws IOException {
        LibrarianUser newLibrarian = new LibrarianUser(librarianId, name, email, address, phoneNumber);
        this.insertRecord(newLibrarian);
        this.saveToFile();
    }


    public LibrarianUser[] getListOfLibrarians(){
        return this.returnAllRecords().toArray(new LibrarianUser[0]);
    }


    public void removeLibrarian(String key) throws IOException {
        this.deleteRecord(key);
        this.saveToFile();
    }


    public void logout() throws IOException {
        this.saveToFile();
    }
}
