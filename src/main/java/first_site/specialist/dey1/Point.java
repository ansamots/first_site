package first_site.specialist.dey1;

public class Point implements Shape {
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private int x;
    private int y;

    @Override
    public void draw() {
        System.out.printf("Точка находится на следующих координатах: x: %d и по y: %d\n", x, y);
    }
}
