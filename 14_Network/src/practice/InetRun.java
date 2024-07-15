package practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRun {

    /*
    *
    *   네트워크(Network) : 여러 대의 컴퓨터들이 연결되어 있는 통신망
    *                       => 네트워크를 통해 서로 데이터를 주고 받을 수 있음
    *
    *  * IP 주소 : 네트워크 상에 각 컴퓨터들을 식별해주는 번호
    *  * 포트(port) : 한 컴퓨터 내에 프로그램들을 식별해주는 번호
    *  * 서버 : 클라이언트(고객)에게 서비스를 제공해주는 프로그램
    *           - > 클라이언트에게 요청을 받아 처리 후 응답
    *
    * * 클라이언트 : 서비스를 제공 받는 고객
    *        - > 서버에 요청을 보내는 프로그램
    *
    *
    */


    public static void main(String[] args) throws UnknownHostException {

        // 네트워크 정보를 확인할 수 있는 기본 클래스
        // java.net.InetAddress
        InetAddress iNest = InetAddress.getLocalHost();
        System.out.println(iNest); // "PC 정보(호스트이름)/IP주소 출력

        // = > getLocalHost() : 현재 pc에 대한 네트워크 정보를 확인할 수 있음

        System.out.println("내 PC 정보 : " + iNest.getHostName());  // 내 pc 정보
        System.out.println("내 IP 정보 : " + iNest.getHostAddress());  // 내 ip
       // System.out.println("내 IP 정보 : " + iNest.getAddress().toString());

        System.out.println("--------------------------------");
        // 도메인 정보를 사용하여 서버 정보 확인

        InetAddress iNet2 = InetAddress.getByName("www.naver.com");
        // => getByName (도메인)


        System.out.println("네이버 서버명 : " + iNet2.getHostName());
        System.out.println("네이버 IP : " + iNet2.getHostAddress());

        System.out.println("===========================================");
        // 도메인을 통해 서버 관련 정보를 배열로 받아 확인

        InetAddress[] iNet3 = InetAddress.getAllByName("www.naver.com");

        System.out.println("네이버 호스트 개수 : " + iNet3.length);
        System.out.println("-----------------------------------");

        for (InetAddress i : iNet3){
            System.out.println(i);
            System.out.println(i.getHostAddress());

        }



    }
}