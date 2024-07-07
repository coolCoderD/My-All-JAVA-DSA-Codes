import java.util.*;
import java.util.stream.Stream;

//package LecProgram;

public class lecAPIStream {
    public static void main(String[] args) {
        List<Integer> al= Arrays.asList(2,3,4,0,5,6,7);
        Stream <Integer> streamData=al.stream();
        Stream<Integer> even=streamData.filter(n->n%2==0);
        Stream<Integer> sort=even.sorted();
        Stream<Integer> doubledStream=sort.map(n->n*2);
        doubledStream.forEach(n->System.out.println(n));

    }
}
