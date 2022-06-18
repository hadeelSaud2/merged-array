
import java.util.Scanner;

/**
 *
 * @author hadee
 */
public class GROUP3 {

    static Scanner read = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("enter the size of the first data");
        int size1 = read.nextInt();
        int[] array1 = new int[size1];

        System.out.println("enter the elements set of the first data :");
        for (int i = 0; i < array1.length; i++) {

            array1[i] = read.nextInt();

        }
        
        System.out.println("enter the size of the second data");
        int size2 = read.nextInt();
        int[] array2 = new int[size2];
         System.out.println("enter the elements set of the second data:");

        for (int i = 0; i < array2.length; i++) {

            array2[i] = read.nextInt();

        }
        
        
    mergedArray(size1,size2,array1,array2);
    }

    public static void mergedArray(int size1,int size2,
            int []array1,int[]array2) {//hadeel saud alsahly

        int[] MergedArray = new int[size2 + size1];
        int con = 0;
        for (int i = 0; i < array1.length; i++) {
            MergedArray[i] = array1[i];
            con++;

        }
        for (int i = 0; i < array2.length; i++) {
            MergedArray[con] = array2[i];
            con++;
        }
        System.out.print("The First Array: ");
        display(array1);

        System.out.print("The Second Array: ");
        display(array2);

        System.out.print("The merged array: ");
        display(MergedArray);

    }

    public static void display(int[] array) {
        int size = array.length;
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i != size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}





