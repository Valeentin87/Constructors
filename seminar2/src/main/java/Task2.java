public class Task2 {
    public static void main(String[] args) {
        String str = "Privet";
        String[] str_array = str.split("");
        String[] str_array_reverse = ArrayReverse(str_array);
        StringBuilder res_str = new StringBuilder(str_array_reverse.toString());


        System.out.println(res_str);


    }
    static String[] ArrayReverse(String[] arr) {
        String[] array_reverse = new String[arr.length];
        int j = arr.length-1;
        for(int i = 0; i<arr.length; i++) {
            array_reverse[i] = arr[j];
            j--;
        }
        return array_reverse;
    }
}
