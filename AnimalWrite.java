package Java_kurs.HomeWork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class AnimalWrite {
    private String animalname;
    private String animaltype;

    

    public void animalWriting() throws IOException {
        System.out.println("¬вед≥ть вид тварини");
        ArrayList<String> arrays = new ArrayList<>();
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        animaltype =reader1.readLine();
        arrays.add(animaltype);
        System.out.println("¬вед≥ть ≥м€ тварини");

    }
    public void print(ArrayList a){

            System.out.println();

            
        }

}
