package controller;

import compare.SortedLottery;
import model.vo.Lottery;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class LotteryController {

    HashSet lotterry = new HashSet();
    HashSet win = new HashSet();
    // 추첨 대상을 담을 HashSet 객체 생성(lottery)
    // 당첨 대상을 담을 HashSet 객체 생성(win)

    public boolean insertObject(Lottery l){
        // 전달 받은 l을 lottery에 추가 후, 추가 결과인 boolean 값 반환
        return lotterry.add(l);

        // 중복된 데이터인 경우 Set에 추가하지 않고 false 반환
    }


    public boolean deleteObject(Lottery l){
        // 전달 받은 l을 lottery에서 삭제
        // 당첨자 목록(win) 중에 삭제된 추첨 대상자가 존재할 수 있으니
        // 삭제 결과인 boolean 값과 win객체가 null이 아닐 때에만
        // win에도 해당 추첨 대상자 삭제

        boolean result = lotterry.remove(l);
        if(result && win != null){
            // 값을 비교하는

            return win.remove(l);
        }
        return result;
        // 만약 result가 true이고, win 객체가 null이 아니면 다음 블록을 실행합니다.
    }

    public HashSet winObject(){

        // 추첨 대상자 중에서 랜덤으로 뽑아 당첨 목록에 넣는 메소드
        // 인덱스를 이용해 win에 당첨자 저장
        // 이 때, 당첨자 수는 무조건 4명이며 이를 위해 추첨자 수는 4명 이상이어야 함
        // 만일 당첨자 목록에 삭제된 추첨 대상자가 있다면
        // 기존에 당첨된 사람은 제외하고 삭제된 사람의 자리만 새로운 추첨자로 채움
        if (lotterry.size() < 4){
            System.out.println("추첨 대상자가 4명 이상이어야 합니다");
        return null;
        // 의미 없는 값.
        }
        // Random random = new Random();
        ArrayList<Lottery> lc = new ArrayList<>(lotterry);
        // lc.addAll(lotterry); 도 사용 가능
        // 랜덤으로 뽑기 위해 lottery를 ArrayList에 담고,

        // HashSet --- > ArrayList

        // (최대값 - 최소값 + 1) + 최소값
        while (win.size() < 4) {

            // Lottery l = lc.get(random.nextInt(lc.size()));
            int random = (int) (Math.random() * lotterry.size());
            win.add(lc.get(random));
        }
        return win;
    }


    public TreeSet<Lottery> sortedWinObject(){
        // 이름으로 오름차순 정렬하되, 이름이 같으면 번호로 오름차순 하는
        // 정렬기준을 가지고 정렬된 결과를 반환
        // 이 때, 미리 만들어진 win을 가지고 정렬하기 때문에
        // 당첨 대상 확인을 꼭 먼저 해야함

        // TreeSet 생성자에게 정렬 기준을 정의한 new SortedLottery 객체의 인스턴스 전달
         TreeSet<Lottery> sortedWin = new TreeSet<>(new SortedLottery());
        // Treeset

       // TreeSet<Lottery> sortedWin = new TreeSet<>(new SortedLottery());
       // sortedWin.addAll()
        sortedWin.addAll(win);  //
        return sortedWin;
    }
    //
    public boolean searchWinner(Lottery l){
        // 전달 받은 l을 win에서 찾고 찾은 결과인 boolean 값 반환
        // 전달 받은 객체(Lottery)

        return win.contains(l);
        // set 참조변수.contains(객체) : 해당 Set 내에 객체가 포함되어있는지
        // 저장 여부 확인


    }






    }
