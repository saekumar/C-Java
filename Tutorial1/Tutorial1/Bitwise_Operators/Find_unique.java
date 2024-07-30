package Tutorial1.Bitwise_Operators;
// In the array every element appears twice except one number .Find it
// Bit wise operators:
//   XOR(^):
//   a^0=a
//   a^1=-a
//   a^a=0
// So XOR the every element int the array.
public class Find_unique {
    public static void main(String[] args) {
        int arr[]={2,3,4,4,3,2,5,7,7};
        System.out.println(ans(arr));

    }

    private static int ans(int[] arr) {
       int c=0;
       for(int n:arr)
       {
        c^=n;
       }
       return c;
    }
}
