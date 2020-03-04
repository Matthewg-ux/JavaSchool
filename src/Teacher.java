public class Teacher extends Person{
    private Section[] section = new Section[10];
    private String subject;
    private int sectionCount;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String toString3(){
         return(this.getName() + " teaches the following sections " + this.subject + listOfSections() );
    }

    public String listOfSections(){

        String listOfSections = "";
        for(int i = 0; i < sectionCount; i++){
            listOfSections += section[i].getName() + ", ";
        }
        return listOfSections;

    }

    public Section[] getSection() {
        return section;
    }

    public void setSection(Section[] section) {
        this.section = section;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    public void setSectionCount(int sectionCount) {
        this.sectionCount = sectionCount;
    }
}
