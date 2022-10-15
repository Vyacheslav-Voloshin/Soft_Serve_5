package Java_kurs.HomeWork5;
//
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//*Клас Menu рефлізує інтефейс меню для роботи з програмою.
//fv


public class Menu {
    public void Menu1() throws IOException {
        boolean choise = false;
        AnimalWrite w = new AnimalWrite();
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("*******************************************************************************************************");
        System.out.println("Програма яка  формує список тварин з видачею їх динамічного списку та виведенням списку названих тварин");
        System.out.println("*******************************************************************************************************");
        do {
            w.PrintMenu();
            System.out.println("Зробіть вибір пункту меню");
            String s = reader.readLine();
            int number = Integer.parseInt(s);
            switch (number){
                case 1:
                    w.AnimalCount();
                    break;
                case 2:
                    w.AnimalWriting();
                    break;
                case 3:
                    w.AnimalPrint();
                    break;
                case 4:
                    choise = true;
                    break;
                default:
                    System.out.println("Такого пункту меню не існує");
            }
        } while (!choise) ;
    }

}
