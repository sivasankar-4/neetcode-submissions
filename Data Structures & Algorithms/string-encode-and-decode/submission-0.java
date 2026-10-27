class Solution {

    public String encode(List<String> strs) {
         
     StringBuilder sb = new StringBuilder();

     for(int i=0;i<strs.size();i++){
         
          sb.append(strs.get(i).length());
          sb.append('#');
          sb.append(strs.get(i));
     }

     return sb.toString();

    }

    public List<String> decode(String str) {
         
           List<String> ans = new ArrayList<>();

           int i=0;

              while(i < str.length()){
                int symbol = str.indexOf('#',i);
                int length = Integer.parseInt(str.substring(i,symbol));

                int start = symbol+1;
                String word = str.substring(start , start+length);
                ans.add(word);

                i = start + length;
                
            }
           return ans;
    }
}
