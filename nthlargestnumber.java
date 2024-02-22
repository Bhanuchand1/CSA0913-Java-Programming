import java.util.Arrays;
import java.util.;
class NthLargestNumber {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the size of the array: ");
 int size = scanner.nextInt();

 int[] array = new int[size];
 System.out.println("Enter the array elements:");
 for (int i = 0; i < size; i++) {
 array[i] = scanner.nextInt();
 }

 System.out.print("Enter the value of N: ");
 int N = scanner.nextInt();

 int nthLargest = findNthLargest(array, N);

 System.out.println("The " + N + "th largest number in the array
is: " + nthLargest);
 }
 public static int findNthLargest(int[] array, int N) {
 Arrays.sort(array);
 return array[array.length - N];
 }
}
