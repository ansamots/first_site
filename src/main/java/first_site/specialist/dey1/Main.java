package first_site.specialist.dey1;

import first_site.specialist.day2.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){
//        ApplicationContext context = new ClassPathXmlApplicationContext("specialistAppContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);


//        Scene s = context.getBean("sceneBean", Scene.class);
//        s.draw();

        Point p = context.getBean("shapePoint", Point.class);
        Circle c = context.getBean("shapeCircle", Circle.class);

        p.draw();
        c.draw();
    }
}
