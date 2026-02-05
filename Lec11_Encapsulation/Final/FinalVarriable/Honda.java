/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec11_Encapsulation.Final.FinalVarriable;

class Bike {

    void run() {
        System.out.println("running");
    }
}

class Honda extends Bike {

    void run() {
        System.out.println("running safety with 100kmph");
    }

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();
    }
}
