/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author carlos
 */
public class Porcentaje extends ActionSupport {
    
    private int numero;
    private int num1;
    private int num2;
    
    
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
    
    
    
    public int getNumero(){
        return numero;
    }
    
    public int sumar(int a,int b){
    
        return a+b;
    }
    
    public Porcentaje() {
    }
    
    public String execute() throws Exception {
        
        return SUCCESS;
    }
    
    public String cargarPrincipal(){
        numero=6;
        System.out.println("Cargo mediante metodo principal");
        return SUCCESS;
    }
    
    private int total;
    
    public int getTotal(){
        return total;
    }
    
    public String sumarNumeros(){
        total = num1 + num2;
        return SUCCESS;
    }
    
    
}
