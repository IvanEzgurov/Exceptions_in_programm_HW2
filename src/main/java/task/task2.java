package task;

import java.util.Scanner;

public class task2 {
    public void method(){

        int x = 0;
        while (x != 1) {

            System.out.println("введите текст: ");
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();

            try {
                if (str.equals("")){
                    throw new Exception();
                }
                System.out.println(str);
                System.out.println("Ввод осуществлен");
                x = 1;
            } catch (Exception e) {
                System.out.println("Exception e: Пустые строки вводить нельзя, повторите ввод");
            }
        }

    }
}
