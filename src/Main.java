import java.util.Arrays;

public class Main {
    public static void main (String[] args) {

        double [] mass= {6.1 , 7.1, -7.1, 11.2, 66.1, 3.1, 4.1, 5.2, 9.2, 10.1, -11.1, 12.2, 20.1, 30.1, 70.1};
        double bob = 0;
        double java = 0;

        for (double i: mass) {
            bob=bob+i;
            java++;
            if(i<=0){
                bob=0;
                java=0;
            }

        }
        // show message
        System.out.println("среднее массива "+bob / java);

        // recount from lower to bigger
        int [] massiv = {8,  3,  6, -4, -2, 2};
        System.out.println(Arrays.toString(massiv));
        for (int i = 0; i < massiv.length; i++) {
            int minimum = massiv[i];
            int index = i;
            for (int j = i + 1; j < massiv.length; j++) {
                if (massiv [j] < minimum) {
                    minimum = massiv [j];
                    index = j;}

            }
            int number = massiv[i];
            massiv [i] = minimum;
            massiv [index] = number;
        }
        System.out.println(Arrays.toString(massiv));


    }
}

