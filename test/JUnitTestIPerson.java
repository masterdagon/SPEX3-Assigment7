/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Facades.IPerson;
import Facades.Person;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Muggi
 */
public class JUnitTestIPerson {
    
    Person person;
    IPerson iperson;
    
    public JUnitTestIPerson() {
        
    }
    
    @Before
    public void setUp() {
        person = new Person("John","Doe","555666",1);
        iperson = new IPerson();
    }
    
    @Test
    public void addPerson(){
        Person test = iperson.addPerson(person);
        assertEquals(test,person);
    }
    
    @Test
    public void addPersonGetPerson(){
        Person temp = iperson.addPerson(person);
        Person temp2 = iperson.getPerson(1);
        assertEquals(temp,temp2);
    }
    
    @Test
    public void addPersonGetPersons(){
        Person temp = iperson.addPerson(person);
        Person temp2 = iperson.getPersons().get(0);
        assertEquals(temp,temp2);
    }
    
}
