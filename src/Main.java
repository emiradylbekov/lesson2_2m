public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Круг", 12);
        Triangle triangle = new Triangle("Треугольник", 2, 3, 4);
        Square square = new Square("Квадрат", 5);
        Rectangle rectangle = new Rectangle("Прямоугольник", 8, 4);

        Dog dog = new Dog("Rex");
        Cat cat = new Cat("Bars");

        /* Figure[] figures = {circle, square, triangle, rectangle};
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i].getName() + " Периметр => "
                    + figures[i].calculatePerimeter());

        }*/

        Drawable[] drawables = {circle, square, triangle, rectangle, dog, cat};
        for (int i = 0; i < drawables.length; i++) {
            drawables[i].draw();
            if (drawables[i] instanceof Figure){
                System.out.println(((Figure)drawables[i]).getName() + " Периметр => " +
                        ((Figure)drawables[i]).calculatePerimeter());
            }
            if (drawables[i] instanceof Animal){
                System.out.println(((Animal) drawables[i]).getName());
            }
        }

    }
}