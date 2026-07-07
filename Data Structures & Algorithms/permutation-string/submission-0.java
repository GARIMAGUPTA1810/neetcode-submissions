class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        int[] s1Array = new int[26];
        int[] winArray = new int[26];

        for(int i = 0; i< s1.length();i++){
            s1Array[s1.charAt(i)-'a']++;
            winArray[s2.charAt(i)-'a']++;
        }
        if(arrayMatches(s1Array,winArray)){
            return true;
        }
        //slide window
        for(int j = s1.length();j<s2.length();j++){
            winArray[s2.charAt(j)-'a']++;
            winArray[s2.charAt(j-s1.length())-'a']--;

            if(arrayMatches(s1Array,winArray)){
                return true;
            }
        }
        return false;

    }
    public boolean arrayMatches(int[] a, int [] b){
        for(int i = 0;i<26;i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}
