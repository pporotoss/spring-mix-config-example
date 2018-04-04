package soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExam01 {
    
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SoundSystemConfig.class);
        
    }
    
}
