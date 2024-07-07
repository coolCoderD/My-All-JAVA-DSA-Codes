public class pattern {
    
public  static void p1(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            int min=(i<j)? i:j;
            System.out.print(n-min+1);
        }
        for(int j=n-1;j>=1;j--){
            int min=(i<j)? i:j;
            System.out.print(n-min+1);

        }
        System.out.println();

    }

    for(int i=n-1;i>=1;i--){
        for(int j=1;j<=n;j++){
            int min=(i<j)? i:j;
            System.out.print(n-min+1);
        }
        for(int j=n-1;j>=1;j--){
            int min=(i<j)? i:j;
            System.out.print(n-min+1);

        }
        System.out.println();

    }
}
    public static void p2(int n){
        int num=1;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void p3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void p4(int n){
        int num=1;
        int num2=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
        
        for(int j=num;j<=(2*i)-1;j++){
            System.out.print(j);
        }
        num++;
        for(int h=num2;h>=i;h--){
            System.out.print(h);
        }
        num2+=2;
        System.out.println();
    }
    }

    public static void p5(int n){
        int a=65;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(a));
                a++;
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        p5(5);
        
    }
}


