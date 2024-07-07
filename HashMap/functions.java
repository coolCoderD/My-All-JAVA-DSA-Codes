import java.io.*;
import java.net.SocketTimeoutException;
import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class functions {
    public static void main(String[] args) {
        
    
    Map hm=new HashMap<>();

    hm.put(8,"abc");
    hm.put(4,"kl");
    hm.put(5,"mk");
    System.out.println(hm);
    System.out.println(hm.get(8));
    System.out.println(hm.containsKey(1));
    hm.remove(4);
    System.out.println(hm);
    // for(Map.Entry  e: hm.entrySet()){
    //     System.out.println(e.getKey()+": "+e.getValue());
    // }
    hm.put(8,null);
    hm.put(9,null);
    hm.put(6,null);
    System.out.println(hm);
    }

}
