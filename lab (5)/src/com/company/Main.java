package com.company;

public class Main {
    private double[] vector = null;
    public Main(double[] vector){
        this.vector = vector;
    }
    // Скалярний добуток векторів
    public double mult(Main anotherVector){
        double s = 0;
        for ( int i = 0; i < vector.length; i++ ){
            s += vector[i] * anotherVector.vector[i];
        }
        return s;
    }
    public static double mult(Main a, Main b){
        return a.mult(b);
    }

    public Main sum(Main anotherVector){
        double[] vec = new double[vector.length];
        for ( int i = 0; i < vector.length; i++ ){
            vec[i] = vector[i] + anotherVector.vector[i];
        }

        return new Main(vec);
    }

    public static Main  sum(Main a,Main b){
        return a.sum(b);
    }

    public Main sub(Main anotherVector){
        double[] vec = new double[vector.length];
        for ( int i = 0; i < vector.length; i++ ){
            vec[i] = vector[i] - anotherVector.vector[i];
        }

        return new Main(vec);
    }

    public static Main  sub(Main a,Main b){
        return a.sub(b);
    }

    public void multNum(double a){
        for(int i = 0;i<vector.length;i++){
            vector[i] = vector[i] * a;
        }
    }
    public  static  void multNum(Main a,double b){
        a.multNum(b);
    }

    public  void print(){
        for (int i = 0;i<vector.length;i++){
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }


    public static void main(String[] args){
        double[] a = {1, 2, 3, 4};
        double[] b = {1, 1, 1, 1};
        double[] c = {2, 2, 2, 2};
        Main v1 = new Main(a);
        Main v2 = new Main(b);
        Main v3 = new Main(c);
        System.out.println("v 1*v2=" + v1.mult(v2));
        System.out.println("v 1*v2=" + Main.mult(v1, v2));
        System.out.println("v 1*v3=" + v1.mult(v3));
        System.out.println("v1");
        v1.print();
        System.out.println("v2");
        v2.print();
        System.out.println("v1 + v2");
        v1.sum(v2).print();
        Main.sum(v1,v2).print();
        System.out.println("v1 - v2");
        v1.sub(v2).print();
        Main.sub(v1,v2).print();

        System.out.println("v1 * 2");
        v1.multNum(2.0);
        v1.print();

    }
}

