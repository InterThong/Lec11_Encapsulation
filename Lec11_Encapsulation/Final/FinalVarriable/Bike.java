/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec11_Encapsulation.Final.FinalVarriable;

public class Bike {

    int speedLimit = 90;

    void run() {
        speedLimit = 400;
    }

    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
    }
}
