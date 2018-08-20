/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taqyeddine.billing.com;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author moi
 */
public class parent_billing {
    
    public double labour;
    public double chrome;
    public double travel;
    public double copper;
    public double plastic;
    public double cTax;
    
    public double plabour =45;
    public double pchrome =7.8;
    public double ptravel =5.0;
    public double pcopper =5.5;
    public double pplastic =3.5;
    public double pTax =0.90;
    public double pVAT =0.90;
    public double ItemCost;
    
    //======================Amount Calculation=======================
    
    public double GetAmount(){
        ItemCost = labour+chrome+travel+copper+plastic ;
        return (ItemCost);
    }
    
    //================Tax Calculation================================
    
    public double cFindTax(double cAmount){
        double FindTax = cAmount -(pTax * cAmount);
        return(FindTax);
    }
    
    //================Tax Calculation================================
    
    public double cFindVat(double cAmount){
        double FindVAT = cAmount -(pVAT * cAmount);
        return(FindVAT);
    }
    
    
    //============================ Exit Methode======================
    
    private JFrame frame;
    public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame,"Confirme if you want to Exit","BillingSystem",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        } 
    }
    
    //===================Nembers Only==============================
    
    public void iNemberOnly(java.awt.event.KeyEvent evt){
        char iNember =evt.getKeyChar();
        if(!(Character.isDigit(iNember))||(iNember == KeyEvent.VK_BACK_SPACE)||(iNember==KeyEvent.VK_DELETE)){
            evt.consume();
        }  
    }
    
    
}
