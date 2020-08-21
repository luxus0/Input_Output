import java.io.IOException;

public class Input_Output2 {
    public static void main(String args[])
    {
        System.out.println("Wprowadz dowolny znak z klawiatury:");
        try {

            byte b[] = {23,45,78,99};
            char c = (char)System.in.read();

            System.out.println("Wprowadzony znak to:");
            System.out.println(c);
            System.out.print("Jego znak to :");
            System.out.println((int) c);

            char numberBytes = (char)System.in.available();
            System.out.println("numer byte przedstawiony jako char:" +numberBytes);


                int numberBytesinTab = System.in.read(b, 0, b.length);

                System.out.println("Liczba bajtów wynosi: " +numberBytesinTab);

        } catch (IOException e) {
            System.out.println("Błąd odczytu strumienia");
        }
    }
}
