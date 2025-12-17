class Solution {
    public boolean detectCapitalUse(String word) {
     	if(word.equals(word.toUpperCase()) || word.equals(word.toLowerCase())) return true;
		if(Character.isUpperCase(word.charAt(0))) {
			for(int i=1;i<word.length();i++) {
			    char c=word.charAt(i);
				if(Character.isUpperCase(c)) {
					return false;
				}
			}
			return true;
		}
		return false;
     
    }
}