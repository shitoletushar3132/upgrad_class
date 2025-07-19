class Solution {
    public static int secondLargestElement(int[] nums) {
        int firstMax = -1;
        int lastMax = -1;

        for (int num : nums) {
            if (num > firstMax) {
                lastMax = firstMax;
                firstMax = num;
            }else if(num>lastMax && num!=firstMax){
                lastMax = num;    
            }
        }
        return lastMax;
    }

    public static void main(String[] args) {
        System.out.println(secondLargestElement(new int[] { 10, 10, 10, 10, 10 }));
    }
}