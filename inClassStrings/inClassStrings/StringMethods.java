package inClassStrings;

public class StringMethods {

	public static void main(String[] args) {
		// Test the String Methods
		System.out.println(toUpperCase("iasgfpPSIUUHGD[IOIGL;KJASDDIohfao"));
		System.out.println(subString("aA,zZ,st", 1, 7));
		System.out.println(toCharArray("Hello people"));
		String[] rere = {"hello", "people"};
		System.out.println(arrayToString(rere));
		System.out.println(arrayToString(split("1,,,,2", ',')));

		
	}
	
	public static String toUpperCase(String str) {
		String Uplet = "";
		for (int i = 0; i < str.length(); i++) {
			int abcNumber = (int) str.charAt(i);
			
			if (abcNumber >= 97 && abcNumber <= 122) {
				abcNumber -= 32;
				Uplet += (char) abcNumber;
			}
			else {
				Uplet += (char) abcNumber;
			}
		}
		return Uplet;
	}
	
	public static String subString(String str, int beginIndex, int endIndex) {
		String result = "";
		if (endIndex >= str.length() || endIndex < beginIndex) {
			return "String Error";
		}
		for (int s = beginIndex; s <= endIndex; s++) {
			result += str.charAt(s);
		}
		return result;
	}

	public static char[] toCharArray(String str) {
		char[] result = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			result[i] = str.charAt(i);
		}
		return result;
	}
	
	public static String[] split(String str,char delim) {
		int delimLength = 0;
		String empty = "";
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			empty += str.charAt(i);
			if (str.charAt(i) == delim) {
				if (empty != ",") {
					delimLength += 1;
					newStr += empty;
					empty = "";
				}
				
			}
		}
		
		String[] result = new String[delimLength+1];
		String PH = "";
		int resultPlace = 0;
		for (int i = 0; i < newStr.length(); i++) {
			if (newStr.charAt(i) == delim) {
				result[resultPlace] = PH;
				resultPlace++;
				PH = "";
			}
			else {
				PH += newStr.charAt(i);
			}
		}
		result[resultPlace] = PH;
		return result;
	}
	
	public static String arrayToString(String[] array) {
		String str = "[";
		for (int i = 0; i < array.length; i++) {
			str += array[i];
			if (!(i == array.length-1)) {
				str += ", ";
			}
		}
		str += "]";
		return str;
	}
}
