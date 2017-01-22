package TestTasks;

import java.util.*;

/**
 * Created by artem on 22.01.17.
 */
public class PBook {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> pbook = new HashMap<String, ArrayList<String>>();
        ArrayList<String> firstPerson = new ArrayList<String>();
        firstPerson.add("+8 800 2000 500 ");
        firstPerson.add("+8 800 200 600");
        ArrayList<String> secondPerson  = new ArrayList<String>();
        secondPerson .add("+8 800 2000 700");
        ArrayList<String> thirdPerson = new ArrayList<String>();
        thirdPerson.add("+8 800 2000 000");
        thirdPerson.add("+8 800 2000 800");
        thirdPerson.add("+8 800 2000 900");
        pbook.put("Иванов И.И.", firstPerson);
        pbook.put("Петров П.П.", secondPerson);
        pbook.put("Сидоров С.С.", thirdPerson);
        System.out.print("ENTER NAME IN RUSSIAN: ");
        Scanner sc = new Scanner(System.in);
        String fio = sc.nextLine();
        ArrayList<String> oneName = pbook.get(fio);
        int count = 0;
        for(String aString : oneName){
            count++;
            System.out.println(count + "." + aString);
        }
    }
}
