package Cp_11.Code;

import com.sun.xml.internal.ws.api.client.WSPortInfo;

import java.util.*;


public class PrintingContainers {
    static Collection fill(Collection<String> collection){
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }
    static Map fill(Map<String,String> map){
        map.put("rat","fuzzy");
        map.put("cat","rags");
        map.put("dog","bosco");
        map.put("dog","spot");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new LinkedHashSet<>()));
        System.out.println(fill(new HashMap<String,String>()));
        System.out.println(fill(new TreeMap<String,String>()));
        System.out.println(fill(new LinkedHashMap<String,String>()));
    }
}
