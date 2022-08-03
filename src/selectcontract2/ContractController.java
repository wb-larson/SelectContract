/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selectcontract2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author wynn
 */
class ContractController {
    
    private ContractView theView;
    private ContractModel theModel;

    ContractController(ContractView theView, ContractModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        
        this.theView.addPrevListener(new PrevButtonListener());
        this.theView.addNextListener(new NextButtonListener());
        this.theView.addBidListener(new BidButtonListener());
        this.theView.addcomboBoxListener(new ComboListener());
                
        this.setUpDisplay();
        this.theView.setOriginCityList(this.theModel.getOriginCityList());
    }
    

    public void setUpDisplay() {

        try {
            if (theModel.foundContracts() == true) {
                Contract c = theModel.getTheContract();
                
                theView.setContractID(c.getContractID());
                theView.setDestCity(c.getDestCity());
                theView.setOriginCity(c.getOriginCity());
                theView.setOrderItem(c.getOrderItem());
                
                theView.updateContractViewPanel(theModel.getCurrentContractNum(), theModel.getContractCount());

            } else {
                theView.setContractID("N/A");
                theView.setDestCity("N/A");
                theView.setOriginCity("N/A");
                theView.setOrderItem("N/A");
            }
        } catch (Error ex) {
            System.out.println(ex);
            theView.displayErrorMessage("ERROR: There was a problem setting the contract. \n");
        }
        
        
    }
        
    class PrevButtonListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            if (theModel.getCurrentContractNum() == 0) {
                return;
            }
            
            try {
                theModel.prevContract();
            
            } catch (Exception ex) {
                System.out.println(ex);
                theView.displayErrorMessage("ERROR: There is a problem setting a previous contract.\n");
                        
            }
            
            setUpDisplay();
        }
    }
    
    class NextButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        
            if (theModel.getCurrentContractNum() == theModel.getContractCount() - 1) {
                return;
            }

            try {
                theModel.nextContract();

            } catch (Exception ex) {
                System.out.println(ex);
                theView.displayErrorMessage("ERROR: There is a problem setting the next contract.\n");

            }
//           ContractView.updateContractViewPanel(theModel.getCurrentContractNum(), theModel.getContractCount());
            setUpDisplay();

        }
    }
    
    class BidButtonListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            try {
                ConfirmBid cb;
                cb = new ConfirmBid(theView, true, theModel.getTheContract());
                cb.setLocationRelativeTo(null);
                cb.setVisible(true);
                
                     
            } catch (Exception ex) {
                System.out.println(ex);
                theView.displayErrorMessage("Error: The numbers entered must be integers.");
            }
        }
    }

        
    
    
    class ComboListener implements ItemListener {
        
        @Override
        public void itemStateChanged(ItemEvent e) {
            System.out.println(e.getItem().toString());
            if (e.getStateChange() == ItemEvent.SELECTED) {
                String selectedCity = e.getItem().toString();
                System.out.println(selectedCity);
                theModel.updateContractList(selectedCity);
                setUpDisplay();
            } // end of if
        } // end of itemStateChanged
    } // end of ComboListener
    
} // end of ContractController

