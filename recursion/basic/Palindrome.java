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
}
