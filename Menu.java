package Java_kurs.HomeWork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    public void Men() throws IOException {
        boolean choise = false;
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i < 4; i++) {
            System.out.println(i +". Menu item #"+i);
        }
        System.out.println("4. Quit program");

        do {
            System.out.println("Make your choise:");
            String s = reader.readLine();
            int number = Integer.parseInt(s);
            switch (number){
                case 1:
                    System.out.println("Your choise item 1");
                    break;
                case 2:
                    System.out.println("Your choise item 2");
                    break;
                case 3:
                    System.out.println("Your choise item 3");
                    break;
                case 4:
                    choise = true;
                    break;
                default:
                    System.out.println("Такого пункту меню не існує");
                    System.out.println("Повторить Ваш вибір");
            }
        } while (!choise) ;
    }

}
