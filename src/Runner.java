public class Runner {

    public static void main(String[] args) {

        School BHS = new School("Berkeley High");

        Section math = new Section("math");
        Section bio = new Section("bio");
        Section compSci = new Section("compSci");

        Teacher Albinson = new Teacher("Albinson","compSci");
        Teacher Austera = new Teacher("Austera","math");
        Teacher Mueller = new Teacher("Mueller","bio");

        Student Matthew = new Student("Matthew", 11);
        Student Keenan = new Student("Keenan",11);
        Student Safiya = new Student("Safiya", 11);
        Student Elliot = new Student("Elliot",11);
        Student Lily = new Student("Lily", 11);
        Student Matteo = new Student("Matteo",11);

        BHS.addSection(compSci);
        BHS.addSection(math);
        BHS.addSection(bio);

        compSci.setTeacher(Albinson);
        math.setTeacher(Austera);
        bio.setTeacher(Mueller);

        compSci.addStudents(Matthew);
        compSci.addStudents(Keenan);
        compSci.addStudents(Safiya);
        compSci.addStudents(Elliot);
        compSci.addStudents(Lily);
        compSci.addStudents(Matteo);

        math.addStudents(Matthew);
        math.addStudents(Keenan);
        math.addStudents(Safiya);
        math.addStudents(Elliot);
        math.addStudents(Lily);
        math.addStudents(Matteo);

        bio.addStudents(Matthew);
        bio.addStudents(Keenan);
        bio.addStudents(Safiya);
        bio.addStudents(Elliot);
        bio.addStudents(Lily);
        bio.addStudents(Matteo);

        Matthew.addSection(bio);
        Keenan.addSection(bio);
        Safiya.addSection(bio);
        Elliot.addSection(bio);
        Lily.addSection(bio);
        Matteo.addSection(bio);

        Matthew.addSection(compSci);
        Keenan.addSection(compSci);
        Safiya.addSection(compSci);
        Elliot.addSection(compSci);
        Lily.addSection(compSci);
        Matteo.addSection(compSci);

        Matthew.addSection(math);
        Keenan.addSection(math);
        Safiya.addSection(math);
        Elliot.addSection(math);
        Lily.addSection(math);
        Matteo.addSection(math);

        System.out.println(BHS.toString1());
        System.out.println(compSci.toString2());
        System.out.println(math.toString2());
        System.out.println(bio.toString2());
        System.out.println(Albinson.toString3());
        System.out.println(Austera.toString3());
        System.out.println(Mueller.toString3());
        System.out.println(Matthew.toString4());
        System.out.println(Keenan.toString4());
        System.out.println(Safiya.toString4());
        System.out.println(Elliot.toString4());
        System.out.println(Lily.toString4());
        System.out.println(Matteo.toString4());
    }

}


