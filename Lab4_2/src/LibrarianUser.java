public class LibrarianUser implements Record{
    private String librarianId;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;


    public LibrarianUser(String librarianId, String name, String email, String address, String phoneNumber) {
        this.librarianId = librarianId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    public String getLibrarianId() {
        return librarianId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setLibrarianId(String librarianId) {
        this.librarianId = librarianId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String lineRepresentation(){
        String line;
        line = this.librarianId + "," + this.name + "," + this.email + "," + this.address + "," + this.phoneNumber + "\n";
        return line;
    }

    public String getSearchKey(){
        return this.librarianId;
    }
}
