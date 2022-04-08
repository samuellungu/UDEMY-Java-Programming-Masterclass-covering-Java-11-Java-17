public class SumOddRange {
    public static boolean isOdd(int num){
        if(num<0){
            return false;
        }
        if(num%2==1){
            return true;
        }
        else return false;
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        
        if((start>0) && (end>0) && (end>=start)){
            for(int i=start;i<=end;i++){
                if(isOdd(i)){
                    sum = sum + i;
                }
            }
        return sum;
        } else return -1;

    }

    public static void main(String [] args){
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -1));
        System.out.println(sumOdd(100, 1000));
        }
    }
