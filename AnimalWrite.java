package Java_kurs.HomeWork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
/*���� AnimalWrite ������ ������, �� �������� ��� �������������� ����� Menu

* ����� AnimalWriting ������ �������� � ��������� ���� �������
* ����� AnimalPrint ������ ��������� �� ����� ������ �������� ������
* ����� AnimalCount ������ �������� � ��������� ������� ������
* ����� PrintMenu ������ ��������� �� ����� ������ ����*/
public class AnimalWrite {
    private int animalcount;

    ArrayList<String> array1 = new ArrayList<>();
    public void AnimalWriting() throws IOException {
        if (animalcount==0) {
            System.out.println("������ �������� ������� ������");
        } else
        for (int i = 1; i <= animalcount; i++) {
            System.out.println("������ ��� "+i+" �������");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String animaltype = reader.readLine();
            array1.add(animaltype);
        }
    }
    public void AnimalPrint (){
        if (!array1.isEmpty()==true) {
            System.out.println("������ ������:"+array1);
        } else
        System.out.println("������ ������ ������");
    }
    public void AnimalCount() throws IOException {
        System.out.println("������ ������� ������");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String q = reader.readLine();
        animalcount = Integer.parseInt(q);
    }
    public void PrintMenu(){
        System.out.println("1. ������ ������� ������");
        System.out.println("2. ������ ��� �������");
        System.out.println("3. ��������� ������ ������ �� �����");
        System.out.println("4. ����� �� ��������");
    }

}
