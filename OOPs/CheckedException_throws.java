package OOPs;

import java.io.IOException;
public class CheckedException_throws {
    public static void readFile() throws IOException{
        throw new IOException("File not found...");
    }
    public static void main(String[] args) {
        try{
            readFile();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
