package ch15;

import java.util.HashSet;
import java.util.Iterator;

public class SetRun {
    /*
    *  Set : 순서가 없고, 중복도 허용되지 않음

    *
*
    *  중복체크 ? : equals(), hashCode() 통해 중복 데이터가 체크됨
    *
    *
    * * */

    public static void main(String[] args) {

        HashSet<Student> hSet = new HashSet<>();

        hSet.add(new Student("기다운",70));
        hSet.add(new Student("최종군",40));
        hSet.add(new Student("기다운",70));


        System.out.print(hSet + " ");


        for(Student h : hSet){
            System.out.println();
        }

        Iterator<Student> it = hSet.iterator();

        for (; it.hasNext() ;){
            System.out.println(it.next());
        }

    }





}
class Student{
  private String name;
  private int score;

  public Student(String name, int score){

  }


    @Override
    public String toString() {
        return name + score;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return score == student.score && name.equals(student.name);
    }

    @Override
    public int hashCode() {
      String hash = name + score;
      return hash.hashCode();

    }



    // 모든 필드의 값이 동일한 경우 같은 hashCode를 반환
}
