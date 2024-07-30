package Tutorial1.Math;

import java.util.Scanner;

/**
 * InnerShoes
 */

public class Shoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int men = sc.nextInt();
        int shoes = sc.nextInt();

        if(men<=shoes)
        {
            System.out.println(men);
        }
        else{

        

        men*=2;
        if(men>shoes)
        {
            System.out.println(men-shoes);
        }
    }
        

        
    }
}
