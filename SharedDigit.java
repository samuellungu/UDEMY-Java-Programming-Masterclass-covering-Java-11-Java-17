public class SharedDigit {
    public static boolean hasSharedDigit(int x, int y){
        int firstDigitX;
        int secondDigitX;
        
        int firstDigitY;
        int secondDigitY;
        
        if(x<10 || x>99 || y<10 || y>99){
            return false;
        }
        else {
            firstDigitX =x /10;
            secondDigitX = x % 10;
            
            firstDigitY = y / 10;
            secondDigitY = y % 10;
            

            if((firstDigitX==firstDigitY) || (firstDigitX==secondDigitY) || (secondDigitX==firstDigitY) || (secondDigitX==secondDigitY) ){
                return true;
            }
            return false;
        }
            
    }
    public static void main(String [] args){
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(88, 23));

    }
}
