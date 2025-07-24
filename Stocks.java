class Stocks{

    public static int Stockprices(int prices[]){
        // buying price should be less then the selling price;
        int buyingPrice=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i<prices.length;i++){
            if(buyingPrice < prices[i]){
                int profit = prices[i] - buyingPrice;
                maxprofit= Math.max(maxprofit, profit);
            }

            else{
                buyingPrice = prices[i];
            }
        }

        return maxprofit;
    }
    public static void main(String[] args){
        int prices[]={7,20,4,9,2,6};
        System.out.println(Stockprices(prices));

    }
}