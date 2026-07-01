class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i =0;i<strs.length;i++){
            String s = strs[i];
            char[] chArray =s.toCharArray();
            Arrays.sort(chArray);
            String sortedString = new String(chArray);

            if(!map.containsKey(sortedString)){
                map.put(sortedString,new ArrayList<>());
                map.get(sortedString).add(s);
            }
            else{
                map.get(sortedString).add(s);
            }
        }
    return new ArrayList<>(map.values());
    }
}
