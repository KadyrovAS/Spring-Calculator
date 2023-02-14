package app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:application.properties")
public class Config {
    @Value("${spring.calculator.type}")
    private String type;

    @Bean
    public Calculator getCalculator(){
        Calculator calculator = null;
        switch (type){
            case "simple":
                calculator = new SimpleCalculator();
                break;
            case "advanced":
                calculator = new AdvancedCalculator();
                break;
            default:
                calculator = new SimpleCalculator();
        }
        return calculator;
    }
}
