import java.util.*;
class TrapWater{
    public static int trappedWater(int height[]){
        
        int n=height.length;

        //leftMax
        int leftMax[]=new int[n];
        leftMax[0]=heigth[0];
        for(int i=0;i<n;i++){
            leftMax[i]=Math.max(height[i],height[i-1]);
        }

        //RightMax
        int rightMax[] =new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i<=0;i--){
            rightMax[i]= Math.max(height[i], height[i+1]);
        }

        //loops
        int trpwater=0;

        int WaterLevel= Math.max(leftMax[i], rightMax[i]);

        trappedWater+=WaterLevel - height[i];

    }
    return trappedWater;
}
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedWater(height));
    }
}