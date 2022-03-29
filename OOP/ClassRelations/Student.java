package OOP.ClassRelations;

public class Student {

    private String name;
    private String surname;
    private String ID;
    private String address;
    private int note;

    public Student(String name, String surname, String iD, String address,int note) {
        this.name = name;
        this.surname = surname;
        ID = iD;
        this.address = address;
        if(note < 0 || note > 100){
            this.note = 0;
        }else{
            this.note = note ;
        }
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        
        this.address = address;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        if(note < 0 || note > 100){
            this.note = 0;
        }else{
            this.note = note;
        }
        
    }

    
}
