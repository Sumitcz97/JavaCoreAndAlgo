package BasicJava.numberSystem;

public class AnyBaseTODecimal {

   public static int anyBaseTODecimal(int number,int anybase){
        int convertedNumber=0;
        int count=0;
        while(number>0){
            convertedNumber=convertedNumber+number%10*(int)(Math.pow(anybase,count));
            count++;
            number=number/10;
        }
        return convertedNumber;
    }
    public static void main(String[] args) {
        System.out.println(anyBaseTODecimal(634,8));
    }
}
