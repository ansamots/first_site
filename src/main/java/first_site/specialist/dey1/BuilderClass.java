package first_site.specialist.dey1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BuilderClass {

    @Bean("xAxis")
    @Scope("prototype")
    public int axisX(){
        return (int)(Math.random() * 100);
    }

    @Bean("yAxis")
    @Scope("prototype")
    public int axisY(){
        return (int)(Math.random() * 100);
    }

}
