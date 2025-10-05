public class Misc {
    public static void main(String[] args) {
        /*Revising pattern for livivng
        */ 

        /*  1
            12
            123
            1234
            12345 */

        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        /*54321
        5432
        543
        54
        5
         */

        //  for(int i=1; i<=5; i++){
        //     for(int j=5; j>=i; j--){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        /*
         * 5
         * 54
         * 543
         * 5432
         * 54321
         */

        // for(int i=5; i>=1; i--){
        //     for(int j=5; j>=i; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /*
         * *****
            ****
             ***
              **
               *
        */

        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=i-1; j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=5; j>=i; j--){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }

        /*
            *
           **
          ***
         ****
        *****
         */

        // for(int i=1; i<=5; i++){
        //     for(int space=1; space<=5-i; space++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /*
         * pyramid for the win
         */

        //  for(int i=1; i<=5; i++){
        //     for(int space=1; space<=5-i; space++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1; j<=2*i-1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //  }

        /*
           *********
            *******
             *****
              ***
               *    
        */

        // Number of rows
        int n = 5;

        // // Outer loop runs N times, once for each row
        // for (int i = 1; i <= N; i++) {
        //     // Inner loop prints 'i - 1' spaces
        //     for (int j = 1; j <= i - 1; j++) {
        //         System.out.print("  ");
        //     }

        //     // Inner loop prints '2 * (N - i) + 1' stars
        //     for (int j = 1; j <= 2 * (N - i) + 1; j++) {
        //         System.out.print("*");
        //     }

        //     // Move to the next line
        //     System.out.println();
        // }
            // *
            // **
            // ***
            // ****
            // *****
            // *****
            // ****
            // ***
            // **
            // *
    //     for(int i=1; i<=n; i++){
    //         for(int j=1; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

    //     for(int i=1; i<=n; i++){
    //         for(int j=i; j<=n; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }

        for(int i=1; i<=n; i++){
            
        }
    }

    
}
