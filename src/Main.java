public class Main {
    public static void main(String[] args) {

        Worker w1 = new Worker("Berkay Sancar", "1","@mail");
        Academician a1 = new Academician("ArdaA","123","@email","Android","Master");

        Worker o1 = new Officer("ElonM", "123","@mail","Space","10-11");
        //o1.getShift() --> o1 nesnesi bu metoda ulaşamıyor çünkü Worker(super) sınıfı Officer(sub) sınıfında ki bir metoda ulaşamaz.
        Officer o2 = new Officer("Nakamura", "11","@mail","Geophysics", "9-5");
        //o2.getShift(); --> o2 nesnesi bu metoda ulaşabilir.

        Lecturer l1 = new Lecturer("NikolaT","5","@mail","Electric","BD","1");
        l1.attendClass(); //Lecturer sınıfı Academician sınıfını extend ettiği için derse girebilir.

        Assistant assistant1 = new Assistant("AlbertA","1212","@mail","Physics","MD","10-12");
        assistant1.quiz();

        LabAssistant lA1 = new LabAssistant("LouisP","122","@mail","Chemistry","BD","7-19");
        lA1.attendClass();
        //LabAssistant sınıfı Assistant sınıfını extend ettiği için ve Asistant sınıfı da Academician sınıfını extend ettiği için,
        //LabAsistant da oluşturduğumuz nesne olan lA1, Academician sınıfında oluşturduğumuz attendClass() metodunu kullanabilir.

        Computing c1 = new Computing("SteveJ", "111","@mail","Software","7/24","Network");
        c1.setUpNetwork();
        c1.refectory(); //Worker sınıfı diğer bütün sınıfların atası olduğu için erişilebilir.

        SecurityOfficer sc1 = new SecurityOfficer("MKA","121","@mail","Security","9.05-...", "1");
        sc1.guardDuty();

    }
}
