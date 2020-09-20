package com.company;


public class Vector {
    int x;
    int y;
    int z;

    // Конструктор
    Vector(int[] args) {
        this.x = args[0];
        this.y = args[1];
        this.z = args[2];
    }

    public static void main(String[] args) {
        int[] coordArray1 = {5, 10, 15};
        int[] coordArray2 = {3, 5, 12};
        Vector v1 = new Vector(coordArray1);
        Vector v2 = new Vector(coordArray2);

        System.out.println(vectorLength(v1));
        System.out.println(scalar(v1, v2));
//        System.out.println(vectorMult(v1, v2));
    }

    static double vectorLength(Vector v){
        return Math.sqrt(v.x*v.x + v.y*v.y + v.z*v.z);
    }

    static double scalar(Vector v1, Vector v2){
        return v1.x*v2.x + v1.y*v2.y + v1.z*v2.z;
    }

    static double vectorMult(Vector v1, Vector v2){
        double vmult = v1.y*v2.z - v1.y*v2.y;
        return vmult;
    }
}
