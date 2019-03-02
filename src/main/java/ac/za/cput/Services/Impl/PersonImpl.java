/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.cput.Services.Impl;

import ac.za.cput.Services.Person;

/**
 *
 * @author BooBoo
 */
public class PersonImpl extends Person{
    
     Long id;
	
     String name;
     
     String Lname;
    

    public void firstname(String name){
         this.name = name;
        
    }
    public void lastName(String Lsname){
        this.Lname = Lsname;
    }
    public void setId(Long id){
        this.id = id;
    }
    
}
