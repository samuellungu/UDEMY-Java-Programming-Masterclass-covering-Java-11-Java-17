public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        long years=0; 
        long days=0; 
        long remainderMinutes=0;

        if(minutes<0){
            System.out.println("Invalid Value");
            return;

        }else{
            if(minutes > 525600){
                years= minutes/525600;
                remainderMinutes=minutes%525600;
                days=remainderMinutes/1440;
                                
            }else{
                years=0;
                days = minutes /1440;                
    
            }
        }    

        System.out.println(minutes+" min = "+years+" y"+" and "+days+" d");        

    }
    public static void main (String [] args){
        printYearsAndDays(1440);
        printYearsAndDays(581760);

    }
}
