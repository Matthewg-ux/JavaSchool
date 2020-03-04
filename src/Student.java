public class Student extends Person {
    private Section[] section = new Section[10];
    private int grade;
    private int sectionCount;

    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public String toString4(){
        return(this.getName() + " is in " + this.grade + " grade and is enrolled in the following sections: " + buildSections() + this.getName());
    }

    public String buildSections() {

        String o = "";

        for(int i = 0; i < sectionCount; i++) {
            o += section[i].getName() + " ";
        }

        return o;
    }

    public Section[] getSection() {
        return section;
    }

    public void setSection(Section[] section) {
        this.section = section;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    public void setSectionCount(int sectionCount) {
        this.sectionCount = sectionCount;
    }

    public void addSection(Section m) {
        section[sectionCount] = m;
        sectionCount++;
    }
}
