import java.io.*;
import java.util.Scanner;

class File_ {


    String choose;

    public static void createFile() throws Exception {
        File f = new File("d:/file.txt");
        PrintWriter writer = new PrintWriter(f);
        System.out.println("File created");


        writer.println("Some special for you :)");
        if(!f.exists())
        {
            f.createNewFile();
        }
        writer.close();
    }
        public static void readFile() throws Exception {
            Scanner sc = new Scanner(new File("d:/file.txt"));
            String read = sc.nextLine();
            System.out.println(read);
        }

        public static void deleteFile() throws Exception
        {
            File f = new File("file.txt");
            boolean del = f.delete();
            System.out.println("DELETE?? : " +del);
        }
        public static void read_write()
        {
            File f = new File("file.txt");
            f.setReadable(true,true);
            f.setWritable(true,true);
        }

        public static void infoFile() throws Exception {

            File f = new File("file.txt");

            System.out.println("Name : " +f.getName());
            System.out.println("Parent: " +f.getParent());
            System.out.println("Parent File: " +f.getParentFile());
            System.out.println("Absolute File: " +f.getAbsoluteFile());
            System.out.println("Absolute Path: " +f.getAbsolutePath());
            System.out.println("Canonical Path: " +f.getCanonicalPath());
            System.out.println("Readable file: " +f.canRead());
            System.out.println("Writable file: " +f.canWrite());
            System.out.println("Free space: " +f.getFreeSpace());
            System.out.println("Total space: " +f.getTotalSpace());
            System.out.println("Last modified: " +f.lastModified());



        }

    public static void main(String args[]) throws Exception {


        createFile();
        readFile();
        read_write();
        infoFile();
        deleteFile();
    }

}
