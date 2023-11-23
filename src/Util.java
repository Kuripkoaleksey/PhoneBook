import java.util.Scanner;

class Util {
    public static String mScanerString() {
        String k = null;
        Scanner scanner = new Scanner(System.in);
        boolean isString = scanner.hasNextLine();
        if (isString) k = scanner.nextLine();
        {
            return k;
        }
    }

    public static String[] mScanerStringArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько значений перевода слов вы хотите ввести? ");
        int numWords = scanner.nextInt();
        String dumb = scanner.nextLine();
        String words[] = new String[numWords];
        for (int i = 0; i < numWords; i++) {
            words[i] = scanner.nextLine();
        }
        return words;
    }

    public static int mScanerInt() throws Exception {
        int k = 0;
        Scanner scanner = new Scanner(System.in);
        boolean isInt = scanner.hasNextInt();
        if (isInt) k = scanner.nextInt();
        if (k >= 1 & k <= 10) {
            return k;
        }
        throw new Exception("Ввести нужно только число число от 1 до 10, буквы вводить нельзя");


    }
}