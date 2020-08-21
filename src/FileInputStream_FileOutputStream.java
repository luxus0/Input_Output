import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputStream_FileOutputStream {


    public static void main(String args[])
    {

        FileInputStream input;
        FileOutputStream output;

        try {
            input = new FileInputStream("d:/input.txt");

            output = new FileOutputStream("d:/output.txt");

            byte buffer[] = new byte[1000];

            while(input.available() > 0)
            {
                int count = input.read(buffer);
                output.write(buffer,0,count);
            }

            while(input.available() == 0)
            {
                byte b[] = new byte[100];
                for(int i = 0; i < 45; i++) {
                    output.write(i);
                }
            }

            input.close();
            output.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
