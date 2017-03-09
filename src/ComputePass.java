import java.util.Random;

/**
 * Created by gedeiswara on 3/9/2017.
 */
import java.util.Random;

public class ComputePass {
	String PassMaker(int Length) {
		String charUsed = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String sChar = "!@#$%^&*()_{}=[]|";
		int sCharCount = sChar.length();
		int charCount = charUsed.length();
		Random rdr = new Random();
		StringBuilder str = new StringBuilder();
		int z = 1;
		for (int i = 0; i < Length - 1; i++) {
			str.append(charUsed.charAt(rdr.nextInt(charCount)));
		}
		str.append(sChar.charAt(rdr.nextInt(sCharCount)));
		z++;
		return (str.toString());
	}
}
