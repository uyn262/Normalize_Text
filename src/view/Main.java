/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.NormalizeText;
import model.TextNormalizerModel;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        TextNormalizerModel model = new TextNormalizerModel();
        
        new NormalizeText(model).run();
    }
    
}
