public class DeleteElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int x = 8;

        int i = 0;
        for(i = 0; i < n; i++) {
            if(arr[i] == x) {
                break; // When the element is found, break out of loop
            }
        }

        if(i == n) {
            System.out.println("Element to be deleted not present");
        } else {
            System.out.println("Array after deleting");
            
            // Shift elements to the left
            for(int j = i; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            
            n--; // Decrease logical size after shifting
            
            // Print the array
            System.out.println("Array elements:");
            for(i = 0; i < n; i++) {
                System.out.println("" + arr[i]);
            }
        }
    }
}