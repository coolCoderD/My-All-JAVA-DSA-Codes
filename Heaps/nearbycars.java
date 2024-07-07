import java.util.*;


public class nearbycars {
    // static class Point  implements Comparable<Point>{
    //     int x;
    //     int y;
    //     int distsq;
    //     int idx;

    //     public Point(int x,int y,int distsq,int idx){
    //         this.x=x;
    //         this.y=y;
    //         this.distsq=distsq;
    //         this.idx=idx;
    //     }


    //     public int compareTo(Point p2){
    //         return this.distsq-p2.distsq;
    //     }
    // }

    // public static void main(String args[]){
        // int pts[][]={{3,3},{5,-1},{-2,4}};
        // int k=2;

    //     PriorityQueue<Point> pq=new PriorityQueue<>();

    //     for(int i=0;i<pts.length;i++){
    //         int dist=pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
    //         pq.add(new Point(pts[i][0],pts[i][1],dist,i));
    //     }

    //     //nearest K cars
    //     for(int i=0;i<k;i++){
    //         System.out.println("C"+pq.remove().idx);
    //     }
    // }


    static class Point implements Comparable<Point>{
        int x;
        int y;
        int dist;
        int idx;

        public Point(int x,int y,int dist,int idx){
            this.x=x;
            this.y=y;
            this.dist=dist;
            this.idx=idx;
        }

        public int compareTo(Point p){
            return this.dist-p.dist;
        }
    }


        public static void main(String []args){
        int pts[][]={{3,3},{5,-1},{-2,4},{0,0}};
        int k=2;

        PriorityQueue<Point> pq=new PriorityQueue<>();
        for(int i=0;i<pts.length;i++){
            int dist=pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new Point(pts[i][0],pts[i][1],dist,i));
        }

        for(int i=0;i<k;i++){
            System.out.println("C"+pq.remove().idx);
        }

        }
    
}
