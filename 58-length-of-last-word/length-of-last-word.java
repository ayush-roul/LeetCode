class Solution {
    public int lengthOfLastWord(String s) {
       
       return lengthchar(s);



        
    }
    public int lengthchar(String str){
        String s1=str.trim();
        int count=0;
        for(int i=s1.length()-1;i>=0;i--){
            
            if(s1.charAt(i)!=' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}