class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded= new StringBuilder();
        if(strs.size()==0) return "";
        for(String word:strs){
            int n=word.length();
            encoded.append(n+"#"+word);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {

        List<String> res=new ArrayList<>();
        if(str.length()==0){
            return res;
        }

        int i=0;
        while( i <  str.length()){
            int len=0;
            while(str.charAt(i)!='#'){
                int num=str.charAt(i)-'0';
                len=len*10+num;
                i++;
            }
            int j=i+1;
            i=j+len;
            res.add(str.substring(j,i));
        }
        return res;
    }
}
