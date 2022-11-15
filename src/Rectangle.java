public class Rectangle extends Point{

    private Integer width;
    private Integer height;

    public Rectangle(){
        super();
        width = 0;
        height = 0;
    }

    public Rectangle(Point p, int newWidth, int newHeight){
        super(p.getX(), p.getY());
        this.width = newWidth;
        this.height = newHeight;
    }

    public Rectangle(Point p1, Point p2){
    }

    public double getArea(){
        return width * height;
    }


    @Override
    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + ") width:"
                + this.width + "   height: " + this.height;
    }
}
