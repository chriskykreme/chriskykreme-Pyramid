
public class Pyramid {
    /**
     * TODO: Return a string that is a pyramid of size n, made of of asterisks and no spaces.
     *
     *     for example:
     *
     *     size 3:
     *     *
     *     **
     *     ***
     *
     *     size 5:
     *     *
     *     **
     *     ***
     *     ****
     *     *****
     *
     * The newline character can be written as \n .
     * The tests will not be affected by a newline character at the beginning or end of the entire pyramid.
     *
     * Here's a hint: you could use a for loop inside of a for loop for this problem. The outer for loop
     * can determine the current 'row', and the inner for loop can print an asterisk an amount of times based on the
     * current 'row'.
     *
     * @param n the size of the pyramid.
     * @return a string representation of the pyramid.
     */
    public String returnPyramid(int n){
        int col_ctr = 0;
        String result = "";

        for (int row_ctr = 0; row_ctr < n; row_ctr++) {
            col_ctr = 0;
            while (col_ctr < row_ctr+1) {
                result = result + "*";
                col_ctr++;
            }
            result = result + "\n";
        } 
        return result;


/* 
        5

        0*\n
        1**\n
        2***\n
        3****\n
        4*****\n
*/
    }
}
