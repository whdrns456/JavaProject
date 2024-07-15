package ch11;

import java.util.StringTokenizer;

public class API02_String {
    public static void main(String[] args) {

        // java.lang.String
        System.out.println("======java.lang.String");

        String str = "Hello, World";

        System.out.println(str.toString());

        // 문자열.chartAt(인덱스) : char
        //  => 문자열에서 해당 인덱스 위치의 문자를 추출해서 반환

        System.out.println(str.charAt(7));

        char c = str.charAt(7);
        System.out.println(c);

        // 문자열.concat String
        System.out.println(str.concat(", akakka"));

        String str3 = str + "###";

        System.out.println(str3);

        // => 저장된 값은 동일하나 저장된 위치가 다르므로 false
        // 저장된 값은 동일하나 저장된 위치가 다르므로 false
        // 문자열A.equals(문자열B)에 저장된 값을 비교하여 같으면 true, 다르면 false를 반환


        // 문자열 trim() : String

        // => 문자열의 앞, 뒤의 공백을 제거한 후 새로운 문자열을 반환
        System.out.println("str,trim " + str3.trim());

        System.out.println("str4.trim() : " + str3.trim());

        String str5 = "ss-ss-ss-ss-ss-ss-ss";
        // 문자열의 길이 반환
        System.out.println(str5.length());

        System.out.println(str5.toUpperCase());

        char[] chArr = str5.toCharArray();

        for (int i = 0; i < chArr.length; i++) {
            System.out.println(i + "번째 " + chArr[i]);
        }

        // 문자열을 문자형 배열로 변환




    /*  //  String[] length = language.split(",");

        for (int i = 0; i < length.length; i++) {
            System.out.print(length[i] + " ");
        }
        for (String lang : length){
            System.out.println(lang);
        }*/

        // 2) - StringTokenizer
        String language = "Java,Oracle,JDBC,HTML,CSS,JS,Spring";

        StringTokenizer st = new StringTokenizer(language, ",");

        System.out.println(st.countTokens());

            for (int i = 0; i < 7; i++) { // 7번 반복 :
                System.out.println(st.nextToken());
        }
        System.out.println("--------------");

        while (st.hasMoreTokens()){
                System.out.println(st.nextToken());
            }


        /*
        System.out.println(st.hasMoreTokens());
        */



      /*  for (int i = 0; i < st.countTokens(); i++) { // 7번 반복 :
            System.out.println(st.nextToken());
        }*/



    }
}
