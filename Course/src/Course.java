public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        // System.out.println("numberOfStudents= " + numberOfStudents + "length=" + students.length);
        if (students.length == numberOfStudents) {

        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    private void increaseSize() {
        String[] tmp = new String[students.length * 2 + 1];
        System.arraycopy(students, 0, tmp, 0, students.length);
        students = tmp;
    }

    public String[] getStudents() {
        String[] tmp = new String[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            tmp[i] = students[i];
        }
        return tmp;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < students.length; i++) {
            // System.out.println(students[i] + " " + student);
            if (students[i].equals(student)) {
                for (int j = i; j < students.length - 1; j++) {
                    students[j] = students[j + 1];
                }
                numberOfStudents--;
                break;
            }
        }
    }

    public void clear() {
        for (int i = 0; i < numberOfStudents; i++)
            students[i] = null;
        numberOfStudents = 0;
    }
}
