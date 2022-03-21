public class Computing extends Officer{

    private String mission;

    public Computing(String nameSurname, String phoneNumber, String email, String departments, String shift, String mission){
        super(nameSurname, phoneNumber, email, departments, shift);
        this.mission = mission;

    }
    public String getMission(){
        return this.mission;
    }
    public void setMission(String mission){
        this.mission = mission;
    }
    public void setUpNetwork(){
        System.out.println(this.getNameSurname() + " is set up the network! ");
    }
}
