package OOP.Inheritance;

public class SecurityGuard extends Officer {
    
    public SecurityGuard(String name, String phoneNo, String email, String department, String shift) {
        super(name, phoneNo, email, department, shift);
        //TODO Auto-generated constructor stub
    }

    private String document;

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void keepWatch(){
        System.out.println(this.getName()+" is keeping watch");
    }

}
