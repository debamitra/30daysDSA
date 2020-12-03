class Reverse
{
    public static String reverseWord(String str)
    {
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i=length-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
