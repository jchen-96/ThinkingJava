package Cp_18.Code;

import java.io.IOException;
import java.io.StringReader;

public class MemoryInput {
    public static void main(String[] args)throws IOException {
        StringReader reader=new StringReader(BufferedInputFile.read("./.gitignore"));
        int c;
        while ((c=reader.read())!=-1){
            System.out.println((char)c);
        }
    }
}
