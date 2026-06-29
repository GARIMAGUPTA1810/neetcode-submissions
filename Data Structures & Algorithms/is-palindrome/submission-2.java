class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        char[] chArray = str.toCharArray();
        int i =0;
        int j= chArray.length-1;
        while(i < j){
            if(chArray[i] != chArray[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
