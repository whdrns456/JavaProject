public class Main {
    public static void main(String[] args) {

        /*
             - 변수 : 하나의 공간에 하나의 값을 저장
        *    - 배열 : 하나의 공간에 여러 개의 값을 저장
                              같은 자료형의 값만 저장
        * */
        // * 선언 자료형[] 참조변수명(배열이름);
        // * 선언과 동시에 할당 자료형[] 배열이름 = new 자료형[배열크기]

        // * 값을 대입
        // 배열이름[인덱스] = 값;

        int[] arr2 = new int[]{1,2};

        // 선언, 할당, 초기화 동시에 처리
        // 자료형[] 배열이름 = new 자료형[] {값,갑,가,ㄱ,}

        // - 일반 변수 : 실제 리터럴(값 자체)를 담을 수 있는 변수
        // = > 기본 자료형()

        // - 참조 변수(레퍼런스) : 주소 값을 담고 있는 변수
        // => 그 외 자료형 배열, String, Scanner


        System.out.println("-----------------------------------------------");

        // * 할당 배열이름 = new 자료형[배열 크기];
        double[] nArray = new double[5];

        for (int i = 0; i <nArray.length; i++) {
            System.out.print(nArray[i] + " ");
        } // 0 0 0 -> 초기화 안해서
        System.out.println();

        // 초기화를 하지 않아도 기본 값이 저장됨 ---> heap 공간에는 빈 공간을 두지 않는다.
        //                                      따라서 JVM이 기본 값으로 초기화


        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = (int)(Math.random() * 100 + 1);
            System.out.println("arr["+ i+ "] : "+  arr[i] + " ");
        }


        // TODO : 객체 배열 -
        //
























    }
}