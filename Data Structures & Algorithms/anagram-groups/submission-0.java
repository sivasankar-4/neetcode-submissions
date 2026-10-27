class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    
        HashMap<String, List<String>> hm = new HashMap<>();

        for(int i=0;i<strs.length;i++){

            String word = strs[i];

            char []ch = word.toCharArray();

             Arrays.sort(ch);
            
            String sorted = new String(ch);

            if(!hm.containsKey(sorted)){
                hm.put(sorted,new ArrayList<>());
            }
            hm.get(sorted).add(word);
        }
        return new ArrayList<>(hm.values());
    }
}
