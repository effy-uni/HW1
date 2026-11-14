import java.util.Arrays;


public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        if (array.length == 0 || (direction != 'R' && direction != 'L')) {
            return array;
        }
        if ((direction == 'R' && move > 0) || (direction == 'L' && move < 0))
        {
            for (int i=0; i<Math.abs(move)%array.length; i++)
            {
                int temp=array[array.length-1];
                for (int j=array.length-1; j>0; j--)
                {
                    array[j]=array[j-1];
                }
                array[0]=temp;
            }
        }
        else if ((direction == 'L' && move > 0) || (direction == 'R' && move < 0))
        {
            for (int i=0; i<Math.abs(move)%array.length; i++)
            {
                int temp=array[0];
                for (int j=0; j<array.length-1; j++)
                {
                    array[j]=array[j+1];
                }
                array[array.length-1]=temp;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}