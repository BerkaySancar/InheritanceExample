public class SecurityOfficer extends Officer{

    private String document;

    public SecurityOfficer(String nameSurname, String phoneNumber, String email, String departments, String shift, String document){
        super(nameSurname, phoneNumber, email, departments, shift);
        this.document = document;
    }
    public String getDocument(){
        return this.document;
    }
    public void setDocument(String document){
        this.document = document;
    }
    public void guardDuty(){
        System.out.println(this.getNameSurname() + " is now on duty!");
    }
}
