import com.sun.jdi.Value;

import java.util.Arrays;
import java.util.Scanner;

public class RotationArrayRight {
    public  void rotateInarrayright(int ValueRotate ,int ...taba){
        ValueRotate = ValueRotate % taba.length;

        int[] TheArrayValuesRotate = new int[ValueRotate];

        System.arraycopy(taba, 0, TheArrayValuesRotate, 0, ValueRotate);

        System.arraycopy(taba, ValueRotate, taba, 0,  taba.length-ValueRotate);

        System.arraycopy(TheArrayValuesRotate, 0, taba, taba.length-ValueRotate, ValueRotate);
        System.out.println("Rotation in array right:");
        System.out.println(Arrays.toString(taba));

    }



}
