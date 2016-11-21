package tpe.testate.crypter;

public class CrypterImpl implements Crypter{

	@Override
	public String encrypt(String input) {
		return crypt(input.toLowerCase());
	}

	@Override
	public String decrypt(String input) throws IllegalArgumentException {
		return crypt(input);
	}
	
	public String crypt(String input) throws IllegalArgumentException{
		String output = "";
 		for (int i = 0; i < input.length(); i++) {
			switch (input.charAt(i)) {
			case 'a':
				output = output + '4';
				break;
			case '4':
				output = output + 'a';
				break;
			case 'e':
				output = output + '3';
				break;
			case '3':
				output = output + 'e';
				break;
			case 'l' :
				output = output + '1';
				break;
			case '1' :
				output = output + 'l';
				break;
			case 'o' :
				output = output + '0';
				break;
			case '0' :
				output = output + 'o';
				break;
			case 't' :
				output = output + '7';
				break;
			case '7' :
				output = output + 't';
				break;
			case 'b' :
			case 'c' :
			case 'd' :
			case 'f' :
			case 'g' :
			case 'h' :
			case 'i' :
			case 'j' :
			case 'k' :
			case 'm' :
			case 'n' :
			case 'p' :
			case 'q' :
			case 'r' :
			case 's' :
			case 'u' :
			case 'v' :
			case 'w' :
			case 'x' :
			case 'y' :
			case 'z' :
			case '2' :
			case '5' :
			case '6' :
			case '8' :
			case '9' :
			case ' ' :
				output = output + input.charAt(i);
				break;
            default:
            	throw new IllegalArgumentException();
			}
		}
		return output;
	}
}
