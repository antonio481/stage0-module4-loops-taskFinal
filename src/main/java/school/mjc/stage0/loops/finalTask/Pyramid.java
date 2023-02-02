package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int i, j, k, l;



        for (i = 1 ; i <= cathetusLength; i++ )
        {
            for (j = 1 ; j <= cathetusLength - i; j++ )
            {
                System.out.print(" ");
            }
            for (k = i ; k >= 1; k-- )
            {
                System.out.print(k);
            }
            for (l = 2 ; l <= i; l++)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
