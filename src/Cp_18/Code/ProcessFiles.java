package Cp_18.Code;

import java.io.File;
import java.io.IOException;

public class ProcessFiles {
    public interface Strategy{
        void process(File file);
    }
    private Strategy strategy;

    private String ext;
    public ProcessFiles(Strategy strategy,String ext){
        this.strategy=strategy;
        this.ext=ext;
    }
    public void start(String[] args){
        try {
            if(args.length==0)
                processDirectoryTree(new File("."));
            else
                for(String s:args){
                    File fileArg=new File(s);
                    if(fileArg.isDirectory()){
                        processDirectoryTree(fileArg);
                    }else{
                        if(s.endsWith("."+ext))
                            s+="."+ext;
                        strategy.process(new File(s).getCanonicalFile());
                    }
                }

        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public void processDirectoryTree(File root)throws IOException{
        for(File file:Directory.walk(root.getAbsolutePath(),".*\\."+ext))
            strategy.process(file.getCanonicalFile());
    }

    public static void main(String[] args) {
        new ProcessFiles(new ProcessFiles.Strategy(){
            @Override
            public void process(File file) {
                System.out.println(file);
            }
        },"java").start(args);
    }
}
