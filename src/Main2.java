public class Main2 {
    public static void main(String[] args) {
        Point point1 = new Point(4,5);
        Point point2 = new Point(6,8);

        point1.setOffset(4, 4);
        point2.setOffset(4,4);

        System.out.println(point1.toString());
        System.out.println(point2.toString());

    }
}
