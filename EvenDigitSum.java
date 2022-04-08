public class EvenDigitSum {
    public static int getEvenDigitSum(int num){
        int digit=0;
        int sum=0;

        if(num<0){
            return -1;
        }
        while(num>0){
            digit=num%10;
            if((digit%2)==0){
                sum=sum+digit;
            }
            num=num/10;
        }
        return sum;
    }
        
    
    public static void main(String [] args){
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
}
