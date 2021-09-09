/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc229week02;

/**
 *
 * @author MoaathAlrajab
 */

public class NewClass {
    NewClass nxt;
    int id;
    NewClass (int id){ this.id=id; }
    @Override
    public String toString() { return "This class is "+this.id; }
   
    public static void main(String[] args) {
        
        NewClass c1=new NewClass(1);
        NewClass c2= new NewClass(2);
        c1.nxt=c2;
        NewClass c3= new NewClass(3);
        c2.nxt=c3;
        NewClass c4= new NewClass(4);
        c3.nxt= c4;
        NewClass c5= new NewClass(5);
        c4.nxt= c5;
        c5.nxt=c1;
        while(c1!= null){
            System.out.println(c1.toString());
            c1=c1.nxt;
            if (c1.id==1) break;
        }   
    }  
}
