public class LabAssistant extends Assistant{

    public LabAssistant(String nameSurname, String phoneNumber, String email, String department, String degree, String officeHours){
        super(nameSurname, phoneNumber, email, department, degree, officeHours);

    }
    public void lab(){
        System.out.println(this.getNameSurname() + " is in the lab.");
    }
}
