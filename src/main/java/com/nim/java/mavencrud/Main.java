/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nim.java.mavencrud;

import com.nim.java.domino.Producto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Nimrod
 */
public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myConnectionBD");
        EntityManager em = emf.createEntityManager();
        Producto p = em.find(Producto.class, 2);
        
        System.out.println(p);
        
        em.close();
        emf.close();
    }
    
}
