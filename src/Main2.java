public class Main2 {
    public static void main(String[] args) {
        Point point1 = new Point(4,5);
        Point point2 = new Point(6,8);

        point1.setX(point1.getX() + 4);
        point1.setY(point1.getY() + 4);

        point2.setX(point2.getX() + 4);
        point2.setY(point2.getY() + 4);

        System.out.println(point1.toString());
        System.out.println(point2.toString());

    }
}
