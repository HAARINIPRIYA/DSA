class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
    String[] words = text.split(" ");
        int count = 0;
        for (String word : words) {
            boolean validWord = true;
            for (char c : brokenLetters.toCharArray()) {
                if (word.indexOf(c) != -1) {
                    validWord = false;
                    break;
                }
            }
            if (validWord){
              count++;   
            }
        }
        return count;    
    }
}