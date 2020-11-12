package first_site.specialist.dey1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component("shapeCircle")
public class Circle implements Shape {
    private int x;
    private int y;

    @Value("#{shapePoint.drawRadius()}")
    private int r;
    private Coords coords;

    @Autowired
    public Circle(Coords coords){
        this.coords = coords;
    }

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
        x = coords.getX();
        y = coords.getY();
        System.out.printf("Круг находится на следующих координатах: x: %d и по y: %d\nОкружность r: %d\n", x, y, r);
    }
}
