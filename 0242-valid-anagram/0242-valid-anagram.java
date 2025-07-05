class Solution {
    public boolean isAnagram(String s, String t) {
        String str1 = s.toLowerCase();
        String str2 = t.toLowerCase();

        if(str1.length() == str2.length()){
         
         char[] str1charArray = str1.toCharArray();
         char[] str2charArray = str2.toCharArray();

         //sort the char array
         Arrays.sort(str1charArray);
         Arrays.sort(str2charArray);

        // if the sorted char arrays are sameor identical then the strings       areanagram.
    
    boolean result = Arrays.equals(str1charArray, str2charArray);
    if (result) {                    //true
        //System.out.println(str1+" and "+str2+" are anagrams of each other.");
        return true;
    }else{                           //false
        return false;
        //System.out.println(str1+" and "+str2+" are not anagrams of each other.");
    }
   }
   else{                             // case when lengths are not equal
                return false;
        //System.out.println(str1+" and "+str2+" are not anagrams of each other.");
        }
    }

    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        Solution result = new Solution();
        System.out.println(result.isAnagram(s,t));
    }
}
