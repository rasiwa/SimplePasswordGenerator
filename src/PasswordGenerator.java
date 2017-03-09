/**
 * Created by Gema Abriantini on 3/9/2017.
 */
public class PasswordGenerator {
    public static void main(String[] args) {
        int passLength= Integer.parseInt(args[0]);
        int passCount= Integer.parseInt(args[1]);
        HowManyPass.LoopPass(passLength,passCount);
    }
}
