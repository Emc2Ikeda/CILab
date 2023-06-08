public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        String s = getString();
        char[] arr = s.toCharArray();
        int upperCaseCount = 0;
        for (int i=0; i<s.length(); i++) {
            if (Character.isUpperCase(arr[i])) {
                upperCaseCount++;
            }
        }

        // if s[i] is uppercase and one of the uppercase character does not come after whitespace, return false
        if (Character.isUpperCase(arr[0])) {
            for (int j=1; j<s.length(); j++) {
                // find an uppercase char where previous char is not a whitespace
                if((arr[j-1] == ' ' && Character.isLowerCase(arr[j]) && j != 0) ||
                        (Character.isLowerCase(arr[j-1]) && Character.isUpperCase(arr[j]))) {
                    return false;
                }
            }
            return true;
        }

        // if all the chars in s is lowercase or uppercase, return true
        if (upperCaseCount == s.length() || upperCaseCount == 0) {
            return true;
        }

        return false;
    }

}

