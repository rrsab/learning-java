public class testRectangle {
    public static void main(String[] args) {
        System.out.println("_____________________________________");
        Rectangle rectangle1 = new Rectangle(4,40);
        System.out.println(("Ширина = " + rectangle1.width));
        System.out.println(("Высота = " + rectangle1.height));
        System.out.println(("Периметр = " + rectangle1.getPerimeter()));
        System.out.println(("Площадь = " + rectangle1.getArea()));
        System.out.println("_____________________________________");
        Rectangle rectangle2 = new Rectangle(3.5,35.9);
        System.out.println(("Ширина = " + rectangle2.width));
        System.out.println(("Высота = " + rectangle2.height));
        System.out.println(("Периметр = " + rectangle2.getPerimeter()));
        System.out.println(("Площадь = " + rectangle2.getArea()));
    }
}
