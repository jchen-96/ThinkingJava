package Cp_11.Code;

import java.util.*;

public class PriorityQueueDemon {
    public static void printQ(Queue queue){
        while (queue.peek()!=null){
            System.out.print(queue.remove()+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        Random rand=new Random(47);
        for(int i=0;i<10;i++){
            queue.offer(rand.nextInt((i+10)));
        }
        printQ(queue);
        List<Integer> ints=Arrays.asList(25,22,20,18,14,9,3,1,1,2,3,14,18,21,23,25);

        queue=new PriorityQueue<>(ints);

        printQ(queue);
//        对于整数来说，默认按照大小排序，reverseOrder可以进行逆序排列
        queue=new PriorityQueue<Integer>(ints.size(),Collections.reverseOrder());
        queue.addAll(ints);
        printQ(queue);

        String fact="EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings=Arrays.asList(fact.split(" "));

        PriorityQueue<String> stringQueue=new PriorityQueue<>(strings.size(),Collections.reverseOrder());
        stringQueue.addAll(strings);
        printQ(stringQueue);

        Set<Character> chaSets=new HashSet<>();
        for (char c:fact.toCharArray()){
            chaSets.add(c);
        }
        PriorityQueue<Character> characters=new PriorityQueue<>(chaSets);
        printQ(characters);

    }
}
