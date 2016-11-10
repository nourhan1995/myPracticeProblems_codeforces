import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class DaVinciPowers_656A {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger davinci [] = {new BigInteger("1"),new BigInteger("2"),new BigInteger("4"),new BigInteger("8"),new BigInteger("16"),new BigInteger("32"),new BigInteger("64"),new BigInteger("128"),new BigInteger("256"),new BigInteger("512"),new BigInteger("1024"),new BigInteger("2048"),new BigInteger("4096"),new BigInteger("8092"),new BigInteger("16184"),new BigInteger("32368"),new BigInteger("64736"),new BigInteger("129472"),new BigInteger("258944"),new BigInteger("517888"),new BigInteger("1035776"),new BigInteger("2071552"),new BigInteger("4143104"),new BigInteger("8286208"),new BigInteger("16572416"),new BigInteger("33144832"),new BigInteger("66289664"),new BigInteger("132579328"),new BigInteger("265158656"),new BigInteger("530317312"),new BigInteger("1060634624"),new BigInteger("2121269248"),new BigInteger("4242538496"),new BigInteger("8485076992"),new BigInteger("16970153984"),new BigInteger("33940307968")};
		int a = new Integer(br.readLine());
		System.out.println(davinci[a]);
	}

}
