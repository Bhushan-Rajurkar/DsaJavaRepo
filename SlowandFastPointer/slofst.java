class slofst {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4,1, 2};

        slofst obj = new slofst();
        int duplicate = obj.findDuplicate(nums);

        System.out.println("Duplicate number: " + duplicate);
    }

    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;

        while (true) {
            slow = nums[slow];
            fast = nums[fast];
            fast = nums[fast];

            if (slow == fast) {
                slow = 0;

                while (slow != fast) {
                    slow = nums[slow];
                    fast = nums[fast];
                }

                return slow;
            }
        }
    }
}
