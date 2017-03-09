/**
 * Created by gedeiswara on 3/9/2017.
 */
public class HowManyPass {
    static void LoopPass(int Length, int PassCount){
        ComputePass s = new ComputePass();
        int v = 1;
        while(v <= PassCount){
            String pass = s.PassMaker(Length);
            System.out.println(pass);
            v++;
        }

    }
}
