package ueb01;

class Palindrom {
	static boolean istPalindrom(String s) {
		// Verwenden Sie die Klasse CharStackImpl um auf Palindrom zu testen!
		String temp = s.toLowerCase();
		temp = temp.replaceAll(" ", "");
		char[] ca = temp.toCharArray();

		for(int i = 0; i < ca.length;i++){
			if (ca[i] != ca[ca.length-i-1]){
				return false;
			}
		}

		return true;
	}
}
