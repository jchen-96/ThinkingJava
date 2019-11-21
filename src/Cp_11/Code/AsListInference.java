package Cp_11.Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}


public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snows= Arrays.asList(new Crusty(),new Slush(),new Powder());
//        编译通过，和书上的不一样
        List<Snow> snows1=Arrays.asList(new Light(),new Heavy());
        List<Snow> snows2=new ArrayList<>();
        Collections.addAll(snows2,new Light(),new Heavy());
        List<Snow> snows3=Arrays.<Snow>asList(new Heavy(),new Light());
    }
}

