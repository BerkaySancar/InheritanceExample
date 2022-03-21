public class Lecturer extends Academician{

    private String doorNumber;

    public Lecturer(String nameSurname, String phoneNumber, String email, String department, String degree, String doorNumber){
        super(nameSurname, phoneNumber, email, department, degree); //Academician sınıfını extend ettiğimiz için o sınıfın değerlerini aldık.
        this.doorNumber = doorNumber;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }
    public void exam(){
        System.out.println("Examiner: " + this.getNameSurname());
    }
}
