package Java_kurs.HomeWork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/* лас AnimalWrite реал≥зуЇ методи, €к≥ необх≥дн≥ дл€ функц≥онуванн€ класу Menu

* ћетод AnimalWriting реал≥зуЇ введенн€ з клав≥атури типу тварини
* ћетод AnimalPrint реал≥зуЇ виведенн€ на екран списку введених тварин
* ћетод AnimalCount реал≥зуЇ введенн€ з клав≥атури к≥лькост≥ тварин
* ћетод PrintMenu реал≥зуЇ виведенн€ на екран пункт≥в меню*/
public class AnimalWrite {
    private int animalcount;

    ArrayList<String> array1 = new ArrayList<>();
    public void AnimalWriting() throws IOException {
        if (animalcount==0) {
            System.out.println("¬вед≥ть спочатку к≥льк≥сть тварин");
        } else
        for (int i = 1; i <= animalcount; i++) {
            System.out.println("¬вед≥ть тип "+i+" тварини");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String animaltype = reader.readLine();
            array1.add(animaltype);
        }
    }
    public void AnimalPrint (){
        if (!array1.isEmpty()==true) {
            System.out.println("—писок тварин:"+array1);
        } else
        System.out.println("—писок тварин пустий");
    }
    public void AnimalCount() throws IOException {
        System.out.println("¬вед≥ть к≥льк≥сть тварин");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String q = reader.readLine();
        animalcount = Integer.parseInt(q);
    }
    public void PrintMenu(){
        System.out.println("1. ¬вед≥ть к≥льк≥сть тварин");
        System.out.println("2. ¬вед≥ть тип тварини");
        System.out.println("3. ¬иведенн€ списку тварин на екран");
        System.out.println("4. ¬их≥д ≥з програми");
    }

}
