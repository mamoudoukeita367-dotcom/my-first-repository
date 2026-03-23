import java.util.Arrays;
import java.util.Scanner;

public class RotationArrayLeft {
    public void rotateInarrayleft(int ValueRotate,int ...taba) {

            ValueRotate = ValueRotate % taba.length;

            int[] TheArrayValuesRotate = new int[ValueRotate];

            System.arraycopy(taba, taba.length - ValueRotate, TheArrayValuesRotate, 0, ValueRotate);

            System.arraycopy(taba, 0, taba, ValueRotate, taba.length - ValueRotate);

            System.arraycopy(TheArrayValuesRotate, 0, taba, 0, ValueRotate);
            System.out.println("Rotation in array left:");
            System.out.println(Arrays.toString(taba));






    }

}
