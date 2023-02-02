package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = cathetusLength; i > 0; i--) {

            // second for loop is used to identify number of
            // columns and here the values will be changed
            // according to the first for loop
            for (int j = 0; j <= cathetusLength; j++) {

                // if j is greater than i then it will print
                // the output otherwise print the space
                if (j >= i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
