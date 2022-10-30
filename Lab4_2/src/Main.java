import java.io.IOException;
import java.time.LocalDate;
import java.util.ConcurrentModificationException;
import java.util.Locale;
import java.time.LocalDate;

//public class Main {
//    public static void main(String[] args) throws IOException, ConcurrentModificationException {
//        //Book b1 = new Book("B2394","Physics","Albert Einstein","Princeton University",10);
//        //Book b2 = new Book("B2394","Physics","Albert Einstein","Princeton University",2);
//        //BookDatabase d1 = new BookDatabase("Book.txt");
//        //d1.readFromFile();
//        //d1.insertRecord(b1);
//        //d1.saveToFile();
//        //d1.insertRecord(b2);
//        //d1.saveToFile();
////        d1.readFromFile();
////        Book book =(Book) d1.returnAllRecords().get(0);
////        book.setQuantity(book.getQuantity()+1);
////        d1.saveToFile();
//        //System.out.println(LocalDate.now());
//
//        //System.out.println(d1.returnAllRecords());
//
//    }
//}
public class Main {

    public static void test1() throws IOException {
        AdminRole admin = new AdminRole("Librarians.txt");
        LibrarianUser[] arrayOfLibrarianUsers = admin.getListOfLibrarians();
        System.out.println("Current number of librarian users  = " + arrayOfLibrarianUsers.length);
        admin.addLibrarian("L1100", "Mariam", "mariam@gmail.com", "Alexandria", "01011845684");
        arrayOfLibrarianUsers = admin.getListOfLibrarians();
        System.out.println("Current number of librarian users  = " + arrayOfLibrarianUsers.length);
        System.out.println(arrayOfLibrarianUsers[2].lineRepresentation());
        admin.removeLibrarian("L1400");
        arrayOfLibrarianUsers = admin.getListOfLibrarians();
        System.out.println("Current number of librarian users  = " + arrayOfLibrarianUsers.length);
        System.out.println(arrayOfLibrarianUsers[2].lineRepresentation());
        admin.removeLibrarian("L1600");
        arrayOfLibrarianUsers = admin.getListOfLibrarians();
        System.out.println("Current number of librarian users  = " + arrayOfLibrarianUsers.length);
        System.out.println(arrayOfLibrarianUsers[3].lineRepresentation());
        admin.logout();
    }

    public static void main(String[] args) throws IOException {

        test1();
    }
}
