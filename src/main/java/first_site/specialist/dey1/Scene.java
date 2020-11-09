package first_site.specialist.dey1;

import java.util.ArrayList;

public class Scene {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Shape> getObjects() {
        return objects;
    }

    public void setObjects(ArrayList<Shape> objects) {
        this.objects = objects;
    }

    private ArrayList<Shape> objects = new ArrayList<>();

    public void draw(){
        for(Shape s: objects){
            s.draw();
        }
        System.out.println("Цвет сцены - "+color);
    }
}
