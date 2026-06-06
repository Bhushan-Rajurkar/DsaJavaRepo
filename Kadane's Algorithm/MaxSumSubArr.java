class MaxSumSubArr {
  public static void main(String args[]){
    int[] nums={-2,1,-3,4,-1,2,1,-5,4};
    MaxSumSubArr obj = new MaxSumSubArr();
        System.out.println(obj.maxSubArray(nums));
  }
    public int maxSubArray(int[] nums) {
          int n=nums.length;
          int i=0;
          int bestend=nums[0];
          int sum=nums[0];
          for(i=1;i<n ;i++){
            int v1=bestend+nums[i];
            int v2= nums[i];
            bestend= Math.max(v1,v2);
            sum= Math.max(sum,bestend); 
            } 
            return sum;
        
    }
}
