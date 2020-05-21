public class StringReversion {
    public String reverseString(String str){
        if (str == null) return null;

        String inputString = str;
        String outputString = "";

        for(int i = inputString.length()-1; i >= 0; i--){
            outputString += inputString.charAt(i);
        }
        return outputString;
    }
}
