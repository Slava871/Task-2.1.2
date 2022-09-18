import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");


        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(bean1 == bean2);


        Cat bean_cat1 =
                (Cat) applicationContext.getBean("cat");

        Cat bean_cat2 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean_cat1 == bean_cat2);


    }
}