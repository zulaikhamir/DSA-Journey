//this question is to find all the subsequences or subsets of a given string. A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements. For example, for the string "abc", the subsequences are "", "a", "b", "c", "ab", "ac", "bc", and "abc". The code uses recursion to generate all possible subsequences by including or excluding each character of the string.
public class SubsequenceOrSubset {

    public static void main(String[] args) {
        String str = "abc";
        // int i = 0;
        // String cur = "";
        // subsets(str, cur, i);
        subsets(str, "", 0);

    }

    static void subsets(String str, String cur, int i) {

        if (i == str.length()) {
            //// Base case: if index reaches the end of string
            System.out.println(cur);
            return;
        }
        subsets(str, cur, i + 1); // Recursive case 1: exclude the current character and move to next
        subsets(str, cur + str.charAt(i), i + 1);// Recursive case 2: include the current character and move to next

    }
}
//the tree for the string "abc" will look like this:
//                 ""
//              /       \
//            ""         "a"
//          /   \        /   \
//        ""     "b"   "a"    "ab"
//       / \     / \   / \     / \
//     ""   "c" "b" "bc" "a" "ac"
// The leaf nodes of this tree represent all the possible subsequences of the string "abc".



[[1, 2], [3, 4], [5, 6]]
List<List<Integer> > res= new ArrayList<>();
List<Integer> arr= new ArrayList<>();
arr.add(1);
arr.add(2);
res.add(new ArrayList<>(arr));
arr.add(3);
arr.add(4);
res.add(new ArrayList<>(arr));
arr.add(5);
arr.add(6);
res.add(new ArrayList<>(arr));

//this piece of code will print [[1, 2], [1, 2, 3, 4], [1, 2, 3, 4, 5, 6]] because we are adding the same list reference to the result list and then modifying it. To avoid this issue, we should create a new list for each subsequence and add it to the result list. This way, each subsequence will be stored as a separate list in the result.
[[1, 2], [3, 4], [5, 6]]
List<List<Integer> > res= new ArrayList<>();
List<Integer> arr= new ArrayList<>();
arr.add(1);
arr.add(2);
res.add(new ArrayList<>(arr));
arr.clear(); // Clear the list to create a new subsequence
arr.add(3);
arr.add(4);
res.add(new ArrayList<>(arr));
arr.clear(); // Clear the list to create a new subsequence
arr.add(5);
arr.add(6);
res.add(new ArrayList<>(arr));
//this will print [[1, 2], [3, 4], [5, 6]] as expected because we are creating a new list for each subsequence and adding it to the result list. This way, each subsequence is stored as a separate list in the result.the other way to achive this is to create a new list for each subsequence without clearing the original list. For example:
[[1, 2], [3, 4], [5, 6]]
List<List<Integer> > res= new ArrayList<>();
List<Integer> arr1= new ArrayList<>();
arr1.add(1);
arr1.add(2);
res.add(arr1); // Add the first subsequence to the result list
List<Integer> arr2= new ArrayList<>();
arr2.add(3);
arr2.add(4);
res.add(arr2); // Add the second subsequence to the result list
List<Integer> arr3= new ArrayList<>();
arr3.add(5);
arr3.add(6);
res.add(arr3); // Add the third subsequence to the result list
//this will also print [[1, 2], [3, 4], [5, 6]] as expected because we are creating a new list for each subsequence and adding it to the result list. This way, each subsequence is stored as a separate list in the result



List<List<Integer>> res = new ArrayList<>();

res.add(new ArrayList<>(Arrays.asList(1, 2)));
res.add(new ArrayList<>(Arrays.asList(3, 4)));
res.add(new ArrayList<>(Arrays.asList(5, 6)));

System.out.println(res); // [[1, 2], [3, 4], [5, 6]]
//asList method of Arrays class is used to create a list from an array. In this case, we are creating a list for each subsequence and adding it to the result list. This way, each subsequence is stored as a separate list in the result.

