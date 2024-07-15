package controller;

import model.vo.Member;

import java.util.*;

public class MemberController {


    HashMap map = new HashMap();

    public boolean joinMembership(String id, Member m) {

        if (!map.containsKey(id)) {
            map.put(id, m);
            return true;
        } else {
            return false;
        }
    }

    public String logIn(String id, String password) {

        Member mem = (Member) map.get(id); // Map에서 id(key)에 해당하는 데이터를 조회

        if (mem != null) { // 데이터가 있다면......
            if (mem.getPassword().equals(password)) {
                return mem.getName();
                // 저장된 비밀번호와 전달된 비밀번호를 비교
                // 같다면, 해당 객체의 이름 데이터를 반환
            }
        }
        return null; // 그 외에 모든 경우는 null 반환...

        // 기 : 기다림의 끝에 먼저
        // 다 : 가온 그대는 마치
        // 운 : 명 처럼 느껴졌다
    }

    public boolean changePassword(String id, String oldPw, String newpW) {

        Member m = (Member) map.get(id);
        if (m != null) {
            if (m.getPassword().equals(oldPw)) { // 저장된 비밀번화와 입력된 기존 비밀번호가 같다면
                // 새로운 비밀번호로 변경
                m.setPassword(newpW);
                return true;
            } // map 저장된 객체의 주소를 m 참조변수가 가리키고 있으므로 setter로 처리 가능하다
        }
        return false;
    }

    public void changeName(String id, String newName) {

        // 전달 받은 name이 저장된 데이터의 이름과 같으면
        // key로 오름차순 해주는 객체에 해당 id와 이름 저장 후 객체 반환



        if (map.containsKey(id)) { // Map에 해당 id의 데이터가 존재한다면(포함되어있다면)
            Member m = (Member) map.get(id); // 데이터를 조회해와서 객체의 name 필드의 값을 변경
            m.setName(newName);
        }


    }

    public TreeMap sameName(String name) {

        TreeMap tMap = new TreeMap(new Comparator<String>() {

            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });

        // (HashMap) map 의 키 목록 조회 : keySet()

        for (Object k : map.keySet()) {
            Member m = (Member) map.get(k);
            if(m.getName().equals(name)){
                tMap.put(k,m.getName());
            }
        }
            return tMap;
    }
}
