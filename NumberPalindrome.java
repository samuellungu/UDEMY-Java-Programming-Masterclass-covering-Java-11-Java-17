public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        
        int num=Math.abs(number);
        int original=num;
        int reverse=0;
        int lastDigit = 0;//num%10; 

        while(num>0){
            lastDigit=num%10;
            reverse = (reverse*10)  + lastDigit;    
            num=num/10;
        }
        if(reverse==original){
            return true;
        }
        else return false;


    }
 
}
