package Tutorial1.Greedy;
import java.util.*;
public class NMeetingOneRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st[] = new int[n];
        int end[] = new int[n];
        for (int i = 0; i < n; i++) {
            st[i] = sc.nextInt();
            end[i] = sc.nextInt();
            
        }
        Meeting meeting[] = new Meeting[n];
        for ( int i = 0; i < n; i++) {

            meeting[i] = new Meeting(st[i], end[i], i);
        }

        
        // for ( int i = 0; i < end.length; i++) {

        //     System.out.print(st[i]+" "+end[i]);
        //     System.out.println();
        // }
        ArrayList<Integer> list = checkAvailability(meeting, n);
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println(list.size());
        sc.close();
    }

    private static ArrayList<Integer> checkAvailability(Meeting meeting[],int n) {
        Arrays.sort(meeting);
        int freeTime = meeting[0].endTime;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(meeting[0].idx);

        for(int i=1;i<n;i++)
        {
            if(meeting[i].stTime>freeTime)
            {
                freeTime = meeting[i].endTime;
                list.add(meeting[i].idx);

                
            }

        }
        return list;

        
    }
}

class Meeting implements Comparable<Meeting> {
    int stTime,endTime,idx;

    Meeting(int stTime,int endTime,int idx)
    {
        this.stTime = stTime;
        this.endTime = endTime;
        this.idx = idx;
    }

    @Override
    public int compareTo(Meeting other)
    {
        return this.endTime-other.endTime;//asc order
    }
}
