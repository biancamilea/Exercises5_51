public class Main4 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.toString());
        rectangle.moveTo(4, 7);
        System.out.println(rectangle.toString());

        Point point = new Point(1, 1);

        Rectangle rectangle2 = new Rectangle(point, 8, 6);
        System.out.println(rectangle2.toString());

    }
}
