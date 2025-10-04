
class isPalindrome{
    public static boolean siPalindrome(String str){
        int n = str.length()-1;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "ll";
        System.out.println(siPalindrome(str));
    }
}