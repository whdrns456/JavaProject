package practice;

import java.io.IOException;
import java.net.BindException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class UDP {

    public static void main(String[] args) throws IOException {

        // 1. IP(PC에 지정되어있음) // 포트(!!
        int port = 8090;
        // 이 서버는 8090 포트를 사용하여 요청 받을 준비!
        try (DatagramSocket ds = new DatagramSocket(port)){
            while (true) {
                System.out.println("......요청 대기중......");
                // 클라이언트로부터 받은 packet 객체 생성
                byte[] data = new byte[1024];
                DatagramPacket dp = new DatagramPacket(data, data.length);

                ds.receive(dp); // 전송된 데이터 받기
                System.out.println(dp.getAddress());

                System.out.println("클라이언트 IP " + dp.getAddress());
                String messge = new String(dp.getData(), StandardCharsets.UTF_8);
                // UTF_8
                System.out.println("전송 데이터 : " + messge);
            }   // 예외 처리
        } catch (SocketException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
