public class BinarySearch {

    public static int searchForIndex(int nums[], int target){
        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = (start + end)/2;

            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else
                end = mid -1 ;
        }
        return -1;
    }

    public static void main(String[] args) {

        int nums[] = {47, 53, 57, 59, 75, 81, 99};
        int target = 75;
        int result = searchForIndex(nums, target);

        if( result != -1){
            System.out.println( result);
        } else
            System.out.println("Number not found!");
    }
}
