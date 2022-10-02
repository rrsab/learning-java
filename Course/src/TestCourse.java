public class TestCourse {
    public static void main(String[] args) {
        Course course1 = new Course("«Основы программирования»");
        Course course2 = new Course("«Объектно-ориентированное программирование»");

        course1.addStudent("Петр Иванович Н.");
        course1.addStudent("Борис Сергеевич П.");
        course1.addStudent("Анна Дмитриевна К.");
        course1.addStudent("Иван Дмитриевич К.");
        //course1.addStudent("Маша Дмитриевна Л.");

        course2.addStudent("Петр Иванович Н.");
        course2.addStudent("Анна Сергеевна Д.");

        System.out.println("Количество студентов по дисциплине\n"
                + course1.getCourseName() + ": " + course1.getNumberOfStudents());

        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + ", ");


        course1.dropStudent("Борис Сергеевич П.");

        System.out.println("Количество студентов по дисциплине\n"
                + course1.getCourseName() + ": " + course1.getNumberOfStudents());

        String[] students1 = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students1[i] + ", ");


        System.out.println();
        System.out.print("Количество студентов по дисциплине\n"
                + course2.getCourseName() + ": " + course2.getNumberOfStudents());
    }
}
