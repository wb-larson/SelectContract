/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selectcontract2;

/**
 *
 * @author wynn
 */
public class SelectContract2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ContractView theView = new ContractView();
        ContractModel theModel = new ContractModel();
        ContractController theController;
        theController = new ContractController(theView, theModel);
        theView.setVisible(true);
        
        
    }
    
}
