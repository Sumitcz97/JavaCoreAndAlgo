package BasicJava.numberSystem;

import static BasicJava.numberSystem.AnyBaseTODecimal.anyBaseTODecimal;

public class AnyBaseToAnyBase {
    AnyBaseToAnyBase(int digit,int fromBase,int toBase){
        if(toBase==10){
            System.out.println(anyBaseTODecimal(digit,fromBase));
        }
        else {
            System.out.println(DecimalToAnyBase.decimalToAnyBase(anyBaseTODecimal(digit,fromBase),toBase));
        }
    }
}
