public class CeaserCipher {
    private StringBuffer mResult = new StringBuffer();
    private String mResultString = new String();

    public StringBuffer getResult(){

        return mResult;
    }
    public String getResultString(){

        return mResultString;
    }

    public String doCeaserCipher (String wordForCeaserCipher, int shiftIndex){
        for (int i=0; i < wordForCeaserCipher.length(); i++){
            if (Character.isUpperCase(wordForCeaserCipher.charAt(i))) {
                char charr = (char)(((int)wordForCeaserCipher.charAt(i) + shiftIndex - 65)% 26 + 65);
                mResult.append(charr);
                mResultString = mResult.toString();
            }
            else {
                char charr = (char)(((int)wordForCeaserCipher.charAt(i)+ shiftIndex -97)% 26 + 97);
                mResult.append(charr);
                mResultString = mResult.toString();
            }
        }
        return mResultString;
    }
    public String unDoCeaserCipher(String wordForCeaserCipher, int shiftIndex){
        return doCeaserCipher(wordForCeaserCipher, 26 - shiftIndex);
    }
}