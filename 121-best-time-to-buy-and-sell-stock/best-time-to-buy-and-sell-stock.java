class Solution {
    public int maxProfit(int[] prices) {
        
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i<prices.length; i++){
            if(buyprice < prices[i]){
            int profit = prices[i] - buyprice;
            //Maximum Profit Checking
            maxProfit = Math.max(profit , maxProfit);
        }else{
            buyprice = prices[i];
        } 
    }
       
         return maxProfit;
    }
    

    public static void main(String args[]){
      int prices[] = {7,1,5,3,6,4};
      Solution obj = new Solution();
      int result = obj.maxProfit(prices);
      System.out.println("Maximum Profit: " +result);
      
    }
}