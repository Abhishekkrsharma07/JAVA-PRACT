class CountingNo{
public static int Countno(int num[], int key){
    int count = 0;
    for(int i=0;i<num.length;i++){
        if(num[i] == key){
            count= count+1;

        }
    }

    return count;
}


    public static void main(String[] args) {
        int num[] = {1,4,3,5,1,1,3,2};
        int key = 1;
        System.out.println(Countno(num, key));
    }
}