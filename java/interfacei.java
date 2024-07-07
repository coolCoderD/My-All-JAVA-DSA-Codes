interface A{
    void show(int a);

}
// class B implements A{
//     public void show(){
//         System.out.println("in show");
//     }
// }
public class interfacei{
    public static void main(String[] args) {
        A obj = new A() {
            public void show(int a){
                System.out.println(a);
            }
        };
        obj.show(50);

    }
}