public class Section {
    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize;
    int studentCount = 0;

    public Section(String name) {
        this.name = name;
    }

    public String toString2(){
        return(this.getName()+" is tought by "+teacher.getName()+" and has "+this.getCurrentSize()+" students: "+ listOfStudents());
    }

    public void addStudents(Student s){
        students[studentCount] = s;
        studentCount++;
    }

    public String listOfStudents(){

        String listOfStudents = "";
        for(int i = 0; i < studentCount; i++){
            listOfStudents += students[i].getName() + ", ";
        }
        return listOfStudents;

    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudent(Student[] students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }
}
