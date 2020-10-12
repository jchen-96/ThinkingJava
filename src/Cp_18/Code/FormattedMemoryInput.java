package Cp_18.Code;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try{
            DataInputStream in=new DataInputStream(
                    new ByteArrayInputStream(
                            BufferedInputFile.read("./.gitignore").getBytes()));
            while (true)
                System.out.println((char)in.readByte());
        }catch (IOException e){
            System.err.println("end ofStream");
        }
    }

}
