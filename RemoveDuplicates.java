class RemoveDuplicatesFromArray {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the number of elements in array: ");
 int n = scanner.nextInt();
 int[] arr = new int[n];
 for (int i = 0; i < n; i++) {
 System.out.print("Enter element" + (i + 1) + ": ");
 arr[i] = scanner.nextInt();
 }
 int[] result = removeDuplicates(arr);
 System.out.println("Non-duplicate items:");
 System.out.println(Arrays.toString(result));
 }
 static int[] removeDuplicates(int[] arr) {
 Set<Integer> set = new LinkedHashSet<>();
 for (int num : arr) {
 set.add(num);
 }
 int[] result = new int[set.size()];
 int index = 0;
 for (int num : set) {
 result[index++] = num;
 }
 return result;
 }
}