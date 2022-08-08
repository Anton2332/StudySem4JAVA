package com.company;

public class DoubleVector {
        private double[] vector = null;
        public DoubleVector(double[] vector){
            this.vector = vector;
        }
        // Скалярний добуток векторів
        public double mult(DoubleVector anotherVector){
            double s = 0;
            for ( int i = 0; i < vector.length; i++ ){
                s += vector[i] * anotherVector.vector[i];
            }
            return s;
        }
        public static double mult(DoubleVector a, DoubleVector b){
            return a.mult(b);
        }

        public DoubleVector sum(DoubleVector anotherVector){
            double[] vec = new double[vector.length];
            for ( int i = 0; i < vector.length; i++ ){
                vec[i] = vector[i] + anotherVector.vector[i];
            }

            return new DoubleVector(vec);
        }

        public static DoubleVector sum(DoubleVector a, DoubleVector b){
            return a.sum(b);
        }

        public DoubleVector sub(DoubleVector anotherVector){
            double[] vec = new double[vector.length];
            for ( int i = 0; i < vector.length; i++ ){
                vec[i] = vector[i] - anotherVector.vector[i];
            }

            return new DoubleVector(vec);
        }

        public static DoubleVector sub(DoubleVector a, DoubleVector b){
            return a.sub(b);
        }

        public void multNum(double a){
            for(int i = 0;i<vector.length;i++){
                vector[i] = vector[i] * a;
            }
        }
        public  static  void multNum(DoubleVector a, double b){
            a.multNum(b);
        }

        public  String TestVector(){
            String text = "";
            for (int i = 0;i<vector.length;i++){
                text += vector[i] + " ";
            }
            return text;
        }
}
