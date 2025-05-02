
public class lookuptable {

    // Lookup table to store the count of set bits for all 8-bit numbers (0 to 255)
    static int[] table = new int[256];

    // Function to initialize the lookup table
    static void initialise() {
        for (int i = 0; i < 256; i++) {
            // Count set bits in 'i' using the formula:
            // table[i] = (i & 1) + table[i / 2]
            // (i & 1) checks if the last bit is 1 (odd number)
            // table[i / 2] gives the set bit count for the number without the last bit
            table[i] = (i & 1) + table[i / 2];
        }
    }

    // Function to count set bits in a 32-bit integer using the lookup table
    static int count(int n) {
        // Extract each byte (8 bits) and sum the set bits using the lookup table

        int res = table[n & 0xff]; // Count set bits in the least significant 8 bits
        n = n >> 8;                // Shift right by 8 bits to get the next byte

        res = res + table[n & 0xff]; // Count set bits in the next 8 bits
        n = n >> 8;                  // Shift right again

        res = res + table[n & 0xff]; // Count set bits in the third byte
        n = n >> 8;                  // Shift right again

        res = res + table[n & 0xff]; // Count set bits in the most significant 8 bits

        return res; // Return total count of set bits in 32-bit integer
    }

    public static void main(String[] args) {

        int n = 13;
        initialise(); // Fill the lookup table before counting
        int x = count(n); // Count set bits using the lookup method
        System.out.println("Total set bits are: " + x);

    }

}
