/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package ColaPrioridad;

public class CustomerPriority {

    private int id;
    private String name;
    //private int pri;

    public CustomerPriority( int i, String n ){
        this.id=i;
        this.name=n;
        //this.pri=p;
    }

    public CustomerPriority(String n){
        this.name=n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
