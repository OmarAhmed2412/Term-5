import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class DataBase {
    private ArrayList<Record> records = new ArrayList<Record>();
    private String fileName;


    public DataBase(String fileName){this.fileName = fileName;}


    public void readFromFile(){
            try {
                File file = new File(fileName);
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    this.insertRecord(createRecordFrom(line));
                }
                sc.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
            }
        }


    public abstract Record createRecordFrom(String line);


    public ArrayList<Record> returnAllRecords() {return this.records;}


    public boolean contains(String key){
        for(Record record : this.records)
        {
            if(record.getSearchKey().equals(key))
                return true;
        }
        return false;
    }


    public Record getRecord(String key){
        for(Record record : this.records)
        {
            if(record.getSearchKey().equals(key))
                return record;
        }
        return null;
    }


    public void insertRecord(Record record){
        if(contains(record.getSearchKey()))
            System.out.println("a record with the same ID already exists");
        else
            this.records.add(record);
    }


    public void deleteRecord(String key){

        for(Record record : new ArrayList<>(this.records))
        {
            if(record.getSearchKey().equals(key))
                this.records.remove(record);
        }
    }


    public void saveToFile() throws IOException {
        File file = new File(this.fileName);
        FileWriter myWriter = new FileWriter(file, false);
        for(Record record: this.records)
            myWriter.write(record.lineRepresentation());
        myWriter.close();
    }
}

