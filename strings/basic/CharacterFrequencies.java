public class CharacterFrequencies{
	public static void main(String[] args) {
		String str="geeksforgeeks";

		int freq[]= new int[26];

		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			freq[ch-'a']++;//converting to index and incrementing one at that index
		}
System.out.println("char frequncies");
for(int i=0;i<26;i++){
	if(freq[i]>0){
		char ch= (char)(i+'a');//converting back to character
		System.out.println(" "+ch+"|"+freq[i]);
	}
}


	}
}
