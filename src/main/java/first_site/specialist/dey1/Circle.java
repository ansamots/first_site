package first_site.specialist.dey1;

import org.springframework.stereotype.Component;

@Component("shapeCircle")
public class Circle implements Shape {
    private int x;
    private int y;
    private int r;

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

    public int getR(){
        return r;
    }

    public void setR(int r){
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.printf("Круг находится на следующих координатах: x: %d и по y: %d\nОкружность r: %d\n", x, y, r);
    }
}
