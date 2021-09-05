public class LinearSearch {

    public static void main(String[] args) {

        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        int elementMatched = getElementMatched(nums, target);
        int indexOfElementMatched = getIndexOfElementMatched(nums, target);
        System.out.println("Element matched : "+elementMatched + " -- at index : "+ indexOfElementMatched);
    }

    /***
     * Get the element equal to target
     *
     * @param nums
     * @param target
     * @return
     */
    static int getElementMatched(int[] nums, int target) {

        // if no element in array , don't check further
        if (nums.length == 0) {
            return Integer.MIN_VALUE;
        }

        for (int element : nums) {
            if (element == target) {
                return element;
            }
        }

        // if none of the above condition matches, then it will return the below value
        return Integer.MAX_VALUE;
    }

    /***
     * Get the index of the element that matches target
     *
     * @param nums
     * @param target
     * @return
     */
    static int getIndexOfElementMatched(int[] nums, int target) {

        // if no element in array , don't check further
        if (nums.length == 0) {
            return -1;
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == target) {
                return index;
            }
        }

        // if none of the above condition matches, then it will return the below value
        return -1;
    }




}
