public class Rectangle extends Point{

    private Integer width;
    private Integer height;

    public Rectangle(){
        super();
        width = 0;
        height = 0;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + ", " + super.getY() + ") width:"
                + this.width + "   height: " + this.height;
    }
}
