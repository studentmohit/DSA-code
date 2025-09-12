import java.util.*;

public class LiftCapacity {
    public static int maxPeople(int[] weights, int X) {
        Arrays.sort(weights); 
        int sum = 0, count = 0;
        
        for (int w : weights) {
            if (sum + w <= X) {
                sum += w;
                count++;
            } else {
                break; 
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] people = new int[n];
        for(int i=0;i<n;i++){
            people[i]=sc.nextInt();
        }
        System.out.println("Capacity of Lift=");
        int capacity=sc.nextInt();
        int ans= maxPeople(people, capacity);
        System.out.println("Maximum people in lift = " + ans) ; 
    }
}