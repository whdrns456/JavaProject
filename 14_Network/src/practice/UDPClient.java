package practice;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) {

        // 사용자에게 메세지 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("전송 메세지 입력 : ");

        String message =sc.nextLine();
        // --------------------------------
        // IP주소, 포트번호(8090)
        try (DatagramSocket ds = new DatagramSocket()){
            InetAddress iNet = InetAddress.getByName("192.168.10.15");
            int port = 8090;

            // 데이터 통신을 위한 packet 객체 생성

            DatagramPacket dp = new DatagramPacket(message.getBytes()
                                            , message.getBytes().length
                                                    ,iNet
                                                ,port);
            ds.send(dp);

        }catch (SocketException e){
            e.printStackTrace();
        }catch (UnknownHostException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }









    }
}
