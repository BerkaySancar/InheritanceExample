public class Officer extends Worker{

     private String departments;
     private String shift;

    public Officer(String nameSurname, String phoneNumber, String email, String departments, String shift) {
        super(nameSurname, phoneNumber, email);
        this.departments = departments;
        this.shift = shift;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
    public void work(){
        System.out.println(this.getNameSurname() + " is working.");
    }
}
