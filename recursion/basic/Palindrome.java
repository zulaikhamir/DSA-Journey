class Palindrome{
public boolean isPalindrome(String str){
    if(str.length()==0 || str.length()==1){
        return true;
    }
    return str.charAt(0)==str.charAt(str.length()-1) && isPalindrome(str.substring(1,str.length()-1));
    //substring() creates a NEW string
    //indexes reset starting from 0
}
}



boolean isPalindrome(String s, int left, int right){
    if(left >= right) return true;

    if(s.charAt(left) != s.charAt(right))
        return false;

    return isPalindrome(s, left+1, right-1);
    //if i do left++ or right-- then the value of left and right will be changed for the next recursive call and it will not work as expected
}


//
class Solution {
    boolean isPalindrome(String s) {
        // code here
        if(s.length()==0 || s.length()==1) return true;

        return isPalindrome(s,0,s.length()-1);
    }
    boolean isPalindrome(String s,int left,int right){
        if(left>=right) return true;
        if(s.charAt(left)!=s.charAt(right)) return false;

        return isPalindrome(s,left+1,right-1);

    }
}

//only one function
class Solution {
    boolean isPalindrome(String s) {
        // code here
        if(s.length()==0 || s.length()==1) return true;

        if(s.charAt(0)!=s.charAt(s.length()-1)) return false;

        return isPalindrome(s.substring(1,s.length()-1));//however substring creates a new string each time and it is not space efficient
    }
}
