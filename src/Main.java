// https://leetcode.com/problems/reverse-bits/solutions/54738/sharing-my-2ms-java-solution-with-explanation/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
        sb.reverse();
        while (sb.length() != 32) sb.append('0');
        return Integer.parseUnsignedInt(String.valueOf(sb),2);
    }
    public static int reverseBitsbyBits(int n) {
        if (n == 0) return 0;

        int result = 0;
        for(int i=0; i<32; i++){
            result <<= 1;
            result += n&1;
            n >>= 1;
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.reverseBitsbyBits(43261596));
    }
}