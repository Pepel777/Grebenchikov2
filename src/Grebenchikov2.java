import java.util.Scanner;

public class Grebenchikov2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введи имя:");
        String name = s.nextLine();
        if (name.equals("Вячеслав")){
            System.out.println("Привет, Вячеслав");
        }else{
            System.out.println("Нет такого имени");
        }
    }
}
