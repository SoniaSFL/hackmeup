package app;

public class Tools {
	
	public static String[] split(String string, String delimiter) {
		String newString = "";
		int stringLength = string.length();
		int delimiterLength = delimiter.length();
		String[] stringArray = new String[0];
		if (stringLength == 0) {
			return stringArray;
		} else if (delimiterLength == 0 || delimiterLength > stringLength) {
			return addString(stringArray, string);
		}
		for (int i = 0; i < stringLength; i++) {
			if (findDelimiter(string, i, delimiter)) {
				if (newString.length() != 0) {
					stringArray = addString(stringArray, newString);
					newString = "";
				}
				i = i + delimiterLength - 1;
			} else {
				newString = newString + string.charAt(i);
			}
		}
		if (newString.length() != 0) {
			stringArray = addString(stringArray, newString);
		}
		return stringArray;
	}
	
	private static boolean findDelimiter(String string, int i, String delimiter) {
		for (int j = 0; j < delimiter.length(); j++) {
			if (i >= string.length()) {
				return false;
			} else {
				if (string.charAt(i) == delimiter.charAt(j)) {
					i++;
				} else {
					return false;
				}
			}
		}
		return true;
	}
	
	private static String[] addString(String[] array, String newString) {
		int arrayLength = array.length;
		String[] newArray = new String[arrayLength + 1];
		int i = 0;
		for (i = 0; i < arrayLength; i++) {
			newArray[i] = array[i];
		}
		newArray[i] = newString;
		return newArray;
	}
	
}
