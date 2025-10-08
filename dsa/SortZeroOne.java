public class SortZeroOne {
    public static void main(String[] args) {
        int [] nums = {0,1,1,0,1,1,0};
        int countZero = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0 ){
                countZero++;
            }
        }
        for(int i=0; i<countZero; i++){
            nums[i] = 0;
        }
        for(int i =countZero; i<nums.length; i++){
            nums[i] =1;
        }

        for(int i:nums){
            System.out.println(i);
        }
    }
}
