package presentation;

import metier.IMetier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresentationSpringAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("dao", "metier");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println(metier.calcul());
    }

}
