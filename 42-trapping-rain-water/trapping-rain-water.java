class Solution {
    public int trap(int[] height) {
        int n = height.length;
         
        //leftmax boundary - array
        int leftmax[] = new int[n];

        leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(height[i] , leftmax[i-1]);
        }

        //rightmax boundary - array
        int rightmax[] = new int[n];

        rightmax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i] , rightmax[i+1]);
        }
   
        int trappedwater = 0;
        for(int i=0; i<n; i++){

        //Waterlevel = min(leftmax , rightmax)
        int waterlevel = Math.min(leftmax[i] , rightmax[i]);

        //Trapped Water = Waterlevel - Bar Height
        trappedwater += waterlevel - height[i];

        }
        
        return trappedwater;
    }

    public static void main(String args[]){
        int height[]= {0,1,0,2,1,0,1,3,2,1,2,1};
        Solution obj = new Solution();   //  object created
        int result = obj.trap(height); 
        System.out.println("Trapped water: " + result);

    }
}