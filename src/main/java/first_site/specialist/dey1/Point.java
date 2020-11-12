package first_site.specialist.dey1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("shapePoint")
public class Point implements Shape {
    private Coords coords;

    @Autowired
    public Point(Coords coords){
        this.coords = coords;
        x = coords.getX();
        y = coords.getY();
//        r = ((x*x)+(y*y));
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

    private int x;
    private int y;
    private int r;

    public int drawRadius(){
        return ((x*x)+(y*y));
    }

    @Override
    public void draw() {
        System.out.printf("Точка находится на следующих координатах: x: %d и по y: %d\n", x, y);
    }
}
