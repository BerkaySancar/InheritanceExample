public class Assistant extends Academician {

    private String officeHours;

    public Assistant(String nameSurname, String phoneNumber, String email, String department, String degree, String officeHours){
        super(nameSurname, phoneNumber, email, department, degree);
        this.officeHours = officeHours;
    }

    public String getOfficeHours(){
        return this.officeHours;
    }
    public void setOfficeHours(String officeHours){
        this.officeHours = officeHours;
    }

    public void quiz(){
        System.out.println("Examiner: " + this.getNameSurname());
    }


}
