package BasicJava.numberSystem;

public class DecimalToAnyBase {
    public static int decimalToAnyBase(int number,int anybase){
        int convertedNumber=0;
        int count=0;
        while(number>0){
            convertedNumber=convertedNumber+number%anybase*(int)(Math.pow(10,count));
            count++;
            number=number/anybase;
        }
        return convertedNumber;
    }
    public static void main(String[] args) {
        System.out.println(decimalToAnyBase(634,8));
    }

}
