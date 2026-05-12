class twoOdd{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,1,2,3,4,5,8};
		int res1=0;
		int res2=0;
		int xor=0;
		for(int i=0;i<arr.length;i++){
			xor=xor^arr[i];//others get cancelled what i am left with is the xor of the two odd occurring numbers thats zor of 5 and 8 in this case

		}

		int lastbitset = xor & (-xor);  //it can be written as int lastbitset=xor&(~(xor-1)); too
		//what it does is it gives us the rightmost set bit of the xor value which is the bit where the two odd occurring numbers differ

		// 	xor      =  1101  (13)
// -xor     =  0011  (two's complement)
// & result =  0001  → rightmost set bit
		for(int i=0;i<arr.length;i++){
			if(((arr[i]&lastbitset)!=0))
			{
				res1=res1^arr[i];
			}
			else{
				res2=res2^arr[i];
			}
		}
		System.out.println("ist "+res1+" 2nd "+res2);

	}
}


// Say the rightmost set bit separates the array like this:
// Group 1 (bit is set): 1, 1, 3, 3, 5
// Group 2 (bit is not set): 2, 2, 4, 4, 8
// XOR Group 1:
// 1^1 = 0
// 3^3 = 0
// 0^5 = 5  ✅
// XOR Group 2:
// 2^2 = 0
// 4^4 = 0
// 0^8 = 8  ✅
// The pairs still cancel because they both have the same bit pattern — so both elements of a pair land in the same group, and XOR wipes them out.

// The key insight

// A pair like {3, 3} always goes to the same group because both elements are identical — same bits, same result when checked against lastbitset.
