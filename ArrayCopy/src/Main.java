import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = scanner.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        System.out.println("Enter elements in the first array: ");
        for(int i = 0; i < arr1.length; i++){
            arr1[i] = scanner.nextInt();
            arr2[i] = arr1[i];
        }

        System.out.print("Elements in the first array: ");
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }

        System.out.println();
        System.out.print("Elements in the second array: ");
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}