public class Academician extends Worker{

    private String department;
    private String degree;

    Academician(String nameSurname, String phoneNumber, String email, String department, String degree){
        super(nameSurname, phoneNumber, email); //bir sınıfı extend ediyorsak constructor metodunu yazmak zorundayız.
                                                //super metodu bu işe yarıyor.
                                                //bunun yerine Worker sınıfında boş bir constructor da yazabiliriz.
                                                //--> Worker --> public Worker(){} 
                                                //super metodu constructor yazılırken en başa yazılır!
        this.department = department;
        this.degree = degree;

    }
    public String getDepartment(){
        return this.department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public String getDegree(){
        return this.degree;
    }
    public void setDegree(String degree){
        this.degree = degree;
    }
    public void attendClass(){   //derse girmek anlanımda kullandık.
        System.out.println(this.getNameSurname() + " is attended class!");
    }
}
