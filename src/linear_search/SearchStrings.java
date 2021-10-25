package linear_search;

public class SearchStrings {
    public static void main(String[] args) {
        String name = "Chaithanya Kumar";
        String quote = "My name is Khan";
        String num = "123456789";
        int Num = 102856854;
        char target = 'a';
        System.out.println(searchString(name, target));
        System.out.println(countOfChar(name, target));
        System.out.println(reverseString(name));
        System.out.println(reverseSentences(quote));
        System.out.println(reverseNum(Num));
        System.out.println(reverseNumByString(Num));
    }

    private static boolean searchString(String name, char target) {
        for (char each : name.toCharArray()) {
            if(each == target){
                return true;
            }
        }
        return false;
    }

    private static int countOfChar(String name, char target){
        int count = 0;
        for( char each : name.toCharArray()){
            if(each == target){
                count++;
            }
        }
        return count;
    }

    private static String reverseString(String str){
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int index = arr.length -1; index >= 0; index--){
            sb.append(arr[index]);
        }
        return sb.toString();
    }

    private static String reverseSentences(String sen){
        String[] rev = sen.split( " ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = rev.length - 1; i >=0 ; i-- ){
            stringBuilder.append(rev[i]).append(" ");
        }
        return stringBuilder.toString();
    }

    private static int reverseNum(int num){
        int con = num;
        int rev = 0;

        while(con > 0){
            int rem = con % 10;
            rev = (rev * 10) + rem;
            con /= 10;
        }
        return rev;
    }

    static String reverseNumByString(int num){
      String a= String.valueOf(num);
      StringBuilder sb = new StringBuilder();
        for (int i = a.length() -1 ; i >= 0; i--) {
            sb.append(a.charAt(i));
        }
        return sb.toString();
    }
}
