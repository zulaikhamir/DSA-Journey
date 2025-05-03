
// public class moveall0s {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 0, 4, 0, 5, 6, 0, 0, 7, 8};
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             if (arr[i] == 0) {
//                 for (int j = i + 1; j < n; j++) {
//                     if (arr[j] != 0) {
//                         int temp = arr[i];
//                         arr[i] = arr[j];
//                         arr[j] = temp;
//                     }
//                 }
//             }
//         }
//         for (int i = 0; i < n; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }
public class moveall0s {

    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 4, 0, 5, 6, 0, 0, 7, 8};
        int n = arr.length;

        int count = 0;// 'count' keeps track of the index to place the next non-zero element
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
