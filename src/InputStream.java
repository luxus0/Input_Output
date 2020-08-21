import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStream {

    public static void main(String args[])
    {
        BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in));

        System.out.println("Wprowadz tekst i naciśnij Enter");
        try {
            String line = "";
                do {


            line  = br.readLine();
            System.out.println("Wprowadzona linia to: " +line);
            System.out.println("Podaj hasło dostępu :)");

                    if(line == "lukasz")
                    {
                        break;
                    }
                }
                while(line != "lukasz");


        } catch (IOException e) {
            System.out.println("Błąd odczytu strumienia");
        }
    }
}
