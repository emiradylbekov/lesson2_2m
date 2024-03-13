public class Rectangle extends Figure{
    private int height;
    private int width;

    public Rectangle(String name, int height, int width) {
        super(name);
        this.height = height;
        this.width = width;
    }

    @Override
    public int calculatePerimeter() {
        return height*2 + width*2;
    }

    @Override
    public void draw() {
        System.out.println("▬");
    }
}
