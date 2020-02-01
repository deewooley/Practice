import java.lang.*;

class ReverseString {

    public static String reverseString(String input){
      char[] arrayOfChars = input.toCharArray();

      for (int i = arrayOfChars.length-1; i>=0; i--) {
        System.out.print(arrayOfChars[i]);
    }
    return input;
    }



    public static int simpleMultiply(int one,int two){
        return one*two;
    }



    public static String upperFirstLetterOfEachWord(String sdr){
        char[] caps = sdr.toCharArray();
        for (int i = 0; i>=caps.length-1; i++) {
        if(i==0){
          Character.toUpperCase(caps[0]);
        }
        if(caps[i] == ' ' ){
            Character.toUpperCase(caps[i+1]);
        }

        }

    return sdr;
    }


    public static String isSecondBigger(int first, int second){
        if(second>first){
         return "True";
    }
        else if(second<first){
        return "False";
    }
        else{
         return "-1";
        }

    }
}