package dsa.strings;

public class MethodString {

    public static boolean checkPalindrom(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.equals(sb.reverse())? true : false;
    }


    public static String reverseWord(String str){
        // i like java ->  i ekil avaj;
        String [] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String word : words){
            sb.append(new StringBuilder(word).reverse().toString()+" ");
        }

        return sb.toString();
    }


    public static String reveseStatement(String str){
        String [] word = str.split(" ");
        StringBuilder sb =new StringBuilder();
        for(int i=word.length-1; i>=0; i--){
            sb.append(word[i]+" ");
        }
        return sb.toString();
    }


    public static void rotationStr(String str){
        // if()
    } 
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        int min = strs[0].length();
        String small =strs[0];
        for(int i=0; i<strs.length; i++){
            if(min > strs[i].length()){
                min = strs[i].length();
                small = strs[i];
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strs.length; i++){
            for(int j=1; j<min; j++){
                if(strs[i].substring(0,j).equals(small.substring(0,j))){
                    sb.append(strs[i].substring(0,j));
                }else{
                    sb.setLength(0);
                    sb.append(strs[i].substring(0,j-1));
                    break;
                }
            }
        }

        return sb.toString();
    }

       public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

    //     sb.append("hello");
    //     sb.insert(3, "world");
    //     sb.replace(2,6, "hello");
    //     sb.delete(0, 0);
    //     sb.deleteCharAt(0);
    //     sb.toString();
    //     sb.length();
    //    System.out.println( sb.capacity());
    //     sb.reverse();

    //     System.out.println(sb);

    System.out.println(checkPalindrom("madam"));

    System.out.println(reverseWord("i love java"));
    System.out.println(reveseStatement("i love java"));

    // print the first non-repeating character
    // longesct common prefix
    // roman to integer

    System.out.println(longestCommonPrefix(new String[]{"aa","a"}));
    }
}
