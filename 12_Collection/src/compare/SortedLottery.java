package compare;
import model.vo.Lottery;
import java.util.Comparator;



// 정렬 관련된 기준.
// implements Comparator<Lottery> 인터페이스 구현
public class SortedLottery implements Comparator<Lottery> {
    // 오버라이딩 하지 않으면 추상 클래스 상태이다.

    // 이름으로 오름차순 정렬, 이름이 같으면 번호로 오름차순 하는 정렬
    public int compare(Lottery o1, Lottery o2) {
        // 첫번째 객체 이름과 두번째 객체 이름과 비교

        // 0 : 같으면 A와 B가 같은때
        // - 양수 A가 B보다 클 때 A B 순서대로 정렬
        // - 음수(0>) A가 B보다 작을 때.
        int nameCompare = o1.getName().compareTo(o2.getName());
        if (nameCompare == 0) {
            // 이름이 같을 경우 번호로 정렬 기준 확인.
            return o1.getPhone().compareTo(o2.getPhone());
        }
        return nameCompare;
    }




}
