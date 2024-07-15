package com.kh.practice;


class DataClass03<L,R>{
    private L left;
    private R right;

    public L getLeft(){
        return left;
    }
    public void setLeft(L left){
        this.left = left;
    }
    public R getRight(){
        return right;
    }
    public  void setRight(R right){
        this.right = right;
    }
}
public class MultiGeneric {
    public static void main(String[] args) {

        DataClass03<String,Integer> d03 = new DataClass03<>();

        d03.setLeft("레프트");
        d03.setRight(100);

        String letf = d03.getLeft(); // 언박싱

        int right = d03.getRight(); // 언박싱

        System.out.println(d03.getLeft());
        System.out.println(d03.getRight());

        DataClass03<Double,Boolean> d2 = new DataClass03<>();

        d2.setLeft(111.22);
        d2.setRight(false);

        System.out.println(d2.getLeft());
        System.out.println(d2.getRight());




    }
}
