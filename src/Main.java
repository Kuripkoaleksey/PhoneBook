import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int m = 0;
        System.out.println("Добро пожаловать!\nВыберите пункт меню:");
        do {
            System.out.println("1. Записать новый контакт");
            System.out.println("2. Посмотреть существующие контакты");
            System.out.println("3. Удалить контакт");
            System.out.println("8. Выход");

            m = Util.mScanerInt();
            switch (m) {
                case 1:
                    /*System.out.println("Ввдите название папки, которую хотите создать для сохранения контакта телефонной книги ДА");
                    String newFolderName = scanner.nextLine();
                    String newFileName = scanner.nextLine();*/
                    PhoneBook.newDataFile (/*newFolderName,newFileName*/);
                    break;
                case 2:
                    PhoneBook.ReadFromFile();
        break;
        case 3:
                    PhoneBook.DeleteFromFile();
        break;
        case 4:

            break;
                case 8:
                    System.out.println("До свидания!");
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}