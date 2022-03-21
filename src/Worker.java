public class Worker {

    private String nameSurname;
    private String phoneNumber;
    private String email;

    public Worker(String nameSurname, String phoneNumber, String email){

        this.nameSurname = nameSurname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getNameSurname(){
        return this.nameSurname;
    }
    public void setNameSurname(String nameSurname){
        this.nameSurname = nameSurname;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public void entry(){
        System.out.println(this.nameSurname + " is entered!");
    }
    public void exit(){
        System.out.println(this.nameSurname + " is out!");
    }
    public void refectory(){   // refectory is "Yemekhane(tr)".
        System.out.println(this.nameSurname + " is entered the refectory!");
    }

}
