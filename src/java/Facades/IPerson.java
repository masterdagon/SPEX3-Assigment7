/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Muggi
 */
public class IPerson implements IPersonFacade {
    
    private List<Person> list = new ArrayList();
    
    public Person addPerson(Person p){
        list.add(p);
        return p;
    }
public Person deletePerson(int id){
    
    for(Person p:list){
        if(p.getId() == id){
            list.remove(p);
            return p;
        }
    }
    return null;
}
public Person getPerson(int id){
    for(Person p:list){
        if(p.getId() == id){
            return p;
        }
    }
    return null;
}
public List<Person> getPersons(){
    return list;
    
}
public Person editPerson(Person p){
   return p; 
}
    
}
