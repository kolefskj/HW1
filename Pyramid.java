package HW1;
/*
Make the output look like this:
#
##
###
####
#####
####
###
##
#
Hint: the object is created for you (Pyramid) and so is the method (Output)
Hint2: Also notice the method is void meaning you will not be returning anything
*/
public class Pyramid {
    public static void Output() {
        // Put your code here
        int rows = 1;
        int rows1 = 5;
        for(int i = 1; i<= rows; ++i){
            for(int j = 1; j <= i; ++j){
                System.out.println("#"); 
            }
            System.out.println();
        for(int k = rows1; k >= 1; --k){
            for(int w = 1; w <= k; ++w);
            }
                System.out.println("#");
            }
            System.out.println();
        }
    }   