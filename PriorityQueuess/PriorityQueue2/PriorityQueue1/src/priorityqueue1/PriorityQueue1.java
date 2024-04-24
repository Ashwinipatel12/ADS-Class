package PriorityQueue1;

/**
 *
 * @author sures
 */import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;


public class PriorityQueue1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PriorityQueue<Integer> pq=new PriorityQueue <>(Collections.reverseOrder());
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            pq.offer(s.nextInt());
            if(i<2)
            {
                System.out.println(-1);
            }
            else
            {
                int first=pq.poll();
                int second=pq.poll();
                int third=pq.poll();
                int res=first*second*third;
                System.out.println(res);
                pq.offer(first);
                pq.offer(second);
                pq.offer(third);
            }
            
        }
        
    }
    
}