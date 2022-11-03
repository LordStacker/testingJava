public class TheOnlyClassYouShouldAddCodeTo implements InterfaceWhichYouShouldNotEdit {
    @Override
    public int addTwoNumbers(int x, int y) {
        return x + y;
    }

    @Override
    public boolean doesStringContainExactlyTwoS(String s) {
        char[] chars = s.toCharArray();
        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == Character.toLowerCase('s')) {
                counter++;

            }
            if (counter > 2) {
                return false;
            }
        }
        return counter == 2;
    }

    @Override
    public int returnTheLastNumberInArray(int[] array) {
        return array[array.length - 1];
    }

    @Override
    public String reverseString(String s) {
        String reverse = "";
        char ch;
        for (int i = 0; i<s.length(); i++){
            ch = s.charAt(i);
            reverse = ch+reverse;
        }
        return reverse;
    }

    @Override
    public String combineTwoStringsButLeaveOutTheLastCharOfStringOne(String a, String b) {
        char [] chars= a.toCharArray();
        String newString = "";
        for (int i = 0; i < a.length() - 1; i++){
            newString = newString + Character.toString(chars[i]);
        }
        System.out.println(newString + b);
        return newString+b;
    }

    @Override
    public boolean isArraySumEven(int[] array) {
        int sum = 0;
        for(int i = 0; i<array.length; i++){
            sum += array[i];
        }
        if( sum % 2 == 0){
            return true;
        }
        else {
        return false;
        }
    }

    @Override
    public boolean isPrime(int i) {
        if(i<= 1){
            return false;
        }
        for(int k=2; k<=i/2;k++){
            if((i%k)==0){
                return false;
            }
        }
        return true;
    }
}
