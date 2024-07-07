enum week{
    mon,tue,wed,thu,fri,sat,sun;
}


public class lanuchenum {
    public static void main(String[] args) {
        week w=week.mon;
        System.out.println(w);
        int index=w.ordinal();
        System.out.println(index);

        week [] we=week.values();
        for(week h:we){
            System.out.println(h+" "+h.ordinal());
        }
    }
    
}
