import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PhoneBook {

    public PhoneBook() throws Exception {
    }
    public static void printContactBook() throws Exception {
        int count = 1;
        for (Object contact : PhoneBook.addContact()) {
            System.out.println("Contact Id : " + ((Contact) contact).getContactId());
            System.out.println("Contact Name : " + ((Contact) contact).getContactName());
        }
    }

    public static List<Object> addContact() throws Exception {
        Contact con = new Contact();
        List<Object> lstObject = new ArrayList<Object>();
        System.out.println("Введите ID и имя нового контакта");
        int id=Util.mScanerInt();
        String name=" "+Util.mScanerString();
        con.setContactId(String.valueOf(id));
        con.setContactName(name);
        lstObject.add(con);
        return lstObject;
    }

    Scanner scanner = new Scanner(System.in);
    public static void AddFolder(String folderName) {
        try {
            File folder = new File(folderName);
            if (!folder.exists()) {
                folder.mkdir();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void AddFileInFolder(String folderName, String fileName) {
        try {
            File folder = new File(folderName);
            if (!folder.exists()) {
                folder.mkdir();
            }
            File file = new File(folder.getAbsolutePath() + "/" + fileName + ".txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void newDataFile(/*String folderName String fileName*/) throws Exception {
        try {
//            File folder = new File("BD");

            File file = new File("C:\\Users\\Jazzman\\IdeaProjects\\PhoneBook\\BD\\1.txt");

                for (Object contact : PhoneBook.addContact()) {
                    BufferedWriter output = new BufferedWriter(new FileWriter(file, true));
                    output.write(((Contact) contact).getContactId());
                    output.write(((Contact) contact).getContactName()+"\n");
                    output.close();
                }

            }
         catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

public static void ReadFromFile ()
{    String filePath = "C:\\Users\\Jazzman\\IdeaProjects\\PhoneBook\\BD\\1.txt";
    List<String> listString = new ArrayList<>();
    try (FileReader fr= new FileReader(filePath)){
            Scanner scan = new Scanner(fr);
        while (scan.hasNextLine()) {
                listString.add(scan.nextLine());}
            for (String word : listString)
            System.out.println(word);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
public static void DeleteFromFile()
{
    String filePath = "C:\\Users\\Jazzman\\IdeaProjects\\PhoneBook\\BD\\1.txt";
    List<String> listString = new ArrayList<>();
    System.out.println("Выбирите ID контакта, который хотите удалить:");
    try (FileReader fr= new FileReader(filePath)){
        Scanner scan = new Scanner(fr);
        while (scan.hasNextLine()) {
            listString.add(scan.nextLine());}
        for (String word : listString)
            System.out.println(word);
        String m;
        m = Util.mScanerString();
            BufferedWriter output = new BufferedWriter(new FileWriter("C:\\Users\\Jazzman\\IdeaProjects\\PhoneBook\\BD\\1.txt"));
        listString = listString.stream().filter(elem -> !elem.startsWith(m)).collect(Collectors.toList());
        Scanner scan1 = new Scanner(fr);
        while (scan1.hasNextLine()) {
            listString.add(scan1.nextLine());}
        for (String word : listString)
            output.write(word+"\n");
            output.close();
        System.out.println("Теперь остались такие контакты:");
            for (String word : listString)
            {System.out.println(word);}
    } catch (Exception ignored) {
    }
}
}
