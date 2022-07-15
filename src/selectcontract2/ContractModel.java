/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selectcontract2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author wynn
 */
class ContractModel {
    
    private ArrayList<Contract> theContracts;
    private int contractCounter; //contract's current index
    
    public ContractModel() {
        
        theContracts = new ArrayList<>();
        contractCounter = 0;
        
        try {            
            
            String filename = "/Users/wynn/NetBeansProjects/SelectContract2/src/selectcontract2/contracts.txt";
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
                    
            while ((line = bufferedReader.readLine()) != null) {
                
                String[] tokens = line.split(",", 4); // split the line containing contract info into 4 elements
                
                String contractID = tokens[Contract.INDEX_OF_CONTRACT_ID];
                String originCity = tokens[Contract.INDEX_OF_ORIGIN_CITY];
                String destCity = tokens[Contract.INDEX_OF_DEST_CITY];
                String orderItem = tokens[Contract.INDEX_OF_ORDER_ITEM];
                
                Contract dataContract = new Contract(contractID, originCity, destCity, orderItem);
                
                theContracts.add(dataContract);
                
            }
               // always close the file :)
        fileReader.close();
    }
        
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    } // end of constructor
    
    
    boolean foundContracts() {
        if (!theContracts.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    public Contract getTheContract() {
        return theContracts.get(contractCounter);
    }
    
    public int getContractCount() {
        return theContracts.size();
    }
    
    public int getCurrentContractNum() {
        return contractCounter;
    }
    
    public void nextContract() {
        if (contractCounter < getContractCount()) {
            contractCounter++;
        } 
    }
    
    public void prevContract() {
        if (contractCounter > 0) {
            contractCounter--;
        }
    }
    
    
}
