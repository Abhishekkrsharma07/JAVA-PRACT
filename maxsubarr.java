class maxsubarr{
    
    public static int number(int num[]){
        int res = num[0];
        for(int i=0;i<num.length-1;i++){
            int currsum=0;
            for(int j=i;j<num.length-1;j++){
                currsum= currsum+num[j];
                
                res = Math.max(currsum, res);
            }
        }
        
        return res;
    }
    public static void main(String[] args){
        int num[]={2,3,4,5,-1,-2,2};
        System.out.println(number(num));
    }
}