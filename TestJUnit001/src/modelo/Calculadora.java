/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author endga
 */
public class Calculadora {

    private int num1;
    private int num2;

    public Calculadora() {
    }

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int Sumar() {
        if (this.num1 == 0 || this.num2 == 0) {
            return 0;
        } else {
            return this.num1 + this.num2;
        }
    }

    public int Restar() {
        if (this.num1 < this.num2) {
            return 0;
        } else {
            return this.num1 - this.num2;
        }
    }

    public int Multiplicar() {
        if (this.num2 == 0) {
            return 1;
        } else {
            return this.num1 * this.num2;
        }
    }

    public int Dividir() {
        if (this.num2 == 0) {
            return 0;
        } else {
            return this.num1 / this.num2;
        }
    }

    /*
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
     */
}
