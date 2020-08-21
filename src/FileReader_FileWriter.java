import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReader_FileWriter {
    public static void main(String args[])
    {

    FileReader fileReader;
    FileWriter fileWriter;

        try {
            fileReader = new FileReader("d:/fileReader.txt");
            fileWriter = new FileWriter("d:/fileWriter.txt");

            int c;
            while((c = fileReader.read()) != -1)
            {
                fileWriter.write(c);
            }

            if(fileReader.read() == 0)
            {
                System.out.println("Dokument txt pusty");
                fileWriter.write("mam na imię Lukasz");
            }
            fileReader.close();
            fileWriter.close();
        }
        catch (Exception e) {

        }






    }
}
