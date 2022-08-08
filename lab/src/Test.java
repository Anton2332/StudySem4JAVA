import java.util.ArrayList;

public class Test {
    private String str1;
    private String[] arr1;
    private String arrTrue;
    private int ball;

    Test(String s,String[] a,String tr){
        str1 = s;
        arr1 = a;
        arrTrue = tr;
    }

    public String getStr1(){
        return str1;
    }

    public String[] getArr1(){
        return arr1;
    }

    public String getArrTrue(){
        return arrTrue;
    }

    public int getBall(){
        return ball;
    }

    public void setBall(int b){
        ball = b;
    }

}
