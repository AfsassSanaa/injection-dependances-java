package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.util.Scanner;
public class PresentationDynamic {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("src/main/resources/config.txt"));
        String daoClassName = scanner.nextLine();
        String metierClassName = scanner.nextLine();

        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.getConstructor().newInstance();

        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor().newInstance();

        // Injecter dao dans metier
        cMetier.getMethod("setDao", IDao.class).invoke(metier, dao);

        System.out.println("Résultat = " + metier.calcul());

    }

}
