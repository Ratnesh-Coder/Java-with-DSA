import java.io.*;
class Test {
    void readFile() throws IOException {
        FileReader f =
            new FileReader("abc.txt");
    }
    public static void main(String args[]) {
        Test t = new Test();
        try {
            t.readFile();
        }
        catch(IOException e) {
            System.out.println("File Error");
        }
    }
}