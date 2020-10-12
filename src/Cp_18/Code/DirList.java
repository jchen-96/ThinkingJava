package Cp_18.Code;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList {
    public static void main(String[] args) {
        File path=new File(".");
        String[] list;
        if(args.length==0)
            list=path.list();
        else
            list=path.list(new DirFilter(args[0]));
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for (String s:list)
            System.out.println(s);
    }
}

class DirFilter implements FilenameFilter{
    private Pattern pattern;
    public DirFilter(String regx){
        pattern=Pattern.compile(regx);
    }
    public boolean accept(File dir,String name){
        return pattern.matcher(name).matches();
    }
}
