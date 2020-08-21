import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.MessageFormat;
import java.util.List;
import java.util.Scanner;

public class Input_Output {

    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    System.out.println("::Please tell me name of file input::");
    String UsersourceFilePath = sc.nextLine();

        System.out.println("::Please tell me name of file output::");
        String UserResultsourceFilePath = sc.nextLine();

        Path sourcePath = Paths.get(UsersourceFilePath);
        Path resultPath = Paths.get(UserResultsourceFilePath);

        if(Files.exists(sourcePath))
        {
            try {
                List<String> lines = Files.readAllLines(sourcePath);
                Integer sizeLine = lines.size();

                System.out.println(MessageFormat.format("W pliku jest {0} linii.", sizeLine));

                Files.write(resultPath,sizeLine.toString().getBytes(), StandardOpenOption.CREATE);

            } catch (IOException e) {
                System.out.println("Błąd dostępu do pliku: " + UsersourceFilePath);
            }
        }

    }
}
