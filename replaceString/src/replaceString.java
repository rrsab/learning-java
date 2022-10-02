public class replaceString {
    public static void main(String[] args) {
        String s1 = "Welcome";
        String s2 = "welcome";
        String s3 = s1.replace("e", "E");
        String s4 = "Welcome to Java and HTML";
        System.out.println("s1= " + s1);
        System.out.println("s2= " + s2);
        System.out.println("s3= " + s3);

        String[] s5 = s4.split(" ");
        s1 = s5[0];
        s2 = s5[1];
        System.out.println("s1= " + s1);
        System.out.println("s2= " + s2);
    }
}
