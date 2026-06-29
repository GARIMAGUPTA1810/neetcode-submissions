class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] fArray = new int[26];
        for(int i =0;i<s.length();i++){
            fArray[s.charAt(i) - 'a']++;
            fArray[t.charAt(i) - 'a']--;
        }
        for(int val : fArray){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
}
