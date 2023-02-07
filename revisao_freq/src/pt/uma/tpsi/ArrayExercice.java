package pt.uma.tpsi;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExercice {
    public int[][] array;
    public int x;
    public int y;
    public int sum;
    public void Exercice(){
        System.out.println("\nArray Exercise:");
        array = new int[][]{{2,2}, {7, 1}, {5, 4}, {9, 1}, {3, 5}, {2, 1}};
        System.out.println(Arrays.deepToString(array));
        ArrayList<Integer> arrays = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                x = array[i][0];
                y = array[i][1];
                sum = x + y;
            }
            if ( sum % 2 == 0 ){
                arrays.add(sum);
            }
        }
        System.out.println("Só arrays com somas Pares:");
        System.out.println(arrays);
    }
}
