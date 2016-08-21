/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.sun.org.apache.xml.internal.resolver.Catalog;
import expanse.manager.com.im.control.CategoryController;
import expanse.manager.model.Category;

/**
 *
 * @author Chamal Gunasinghe
 */
public class test {
    public static void main(String[] args) {
        Category c = new Category();
        c.setId(1);
        c.setName("Chamal");
        CategoryController.create(c);
    }
}
