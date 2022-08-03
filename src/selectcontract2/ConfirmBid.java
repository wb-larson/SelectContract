package selectcontract2;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import static java.time.format.DateTimeFormatter.RFC_1123_DATE_TIME;
import java.util.Currency;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author wynn
 */
public class ConfirmBid extends javax.swing.JDialog {

    /**
     * Creates new form ConfirmBid
     */
    public ConfirmBid(java.awt.Frame parent, boolean modal, Contract theContract) {
        super(parent, modal);
        initComponents();
        
        this.jLabelContractID.setText(theContract.getContractID());
        this.jLabelOrigin.setText(theContract.getOriginCity());
        this.jLabelDestination.setText(theContract.getDestCity());
        this.jLabelOrderItem.setText(theContract.getOrderItem());
        
        Integer startValue = 100;
        Integer minValue = 100;
        Integer maxValue = 10000;
        Integer stepValue = 50;
        
        SpinnerModel numModel =
            new SpinnerNumberModel(startValue,minValue, maxValue, stepValue);
        jSpinner1.setModel(numModel);
        
        
    }
    

    class SaveButtonListener implements ActionListener {
        

        @Override
        public void actionPerformed(ActionEvent e) {

//        File contractBids = new File("src/MyContractBids.txt");
//        FileWriter writer = new FileWriter("src/MyContractBids.txt");
            
	}
    }
    
    public String getBidName() {
        return jTextName.getText();
    }
            
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jTextName = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelContractID = new javax.swing.JLabel();
        jLabelOrigin = new javax.swing.JLabel();
        jLabelDestination = new javax.swing.JLabel();
        jLabelOrderItem = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Place Bid on Selected Contract");

        JButtonSave.setText("Save");
        JButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSaveActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jLabelName.setText("Name:");

        jSpinner1.setValue(100);

        jLabel2.setText("Place Bid");

        jLabel3.setText("You are placing a bid on the selected contract.");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabelContractID.setText("N/A");

        jLabelOrigin.setText("N/A");

        jLabelDestination.setText("N/A");

        jLabelOrderItem.setText("N/A");

        jLabel4.setText("Contract ID");

        jLabel5.setText("Origin");

        jLabel6.setText("Destination");

        jLabel7.setText("Order");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelContractID)
                        .addGap(59, 59, 59)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabelOrigin))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelDestination)
                        .addGap(35, 35, 35)))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOrderItem)
                    .addComponent(jLabel7))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContractID)
                    .addComponent(jLabelDestination)
                    .addComponent(jLabelOrderItem)
                    .addComponent(jLabelOrigin))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JButtonSave)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonCancel)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel3)
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelName)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonSave)
                    .addComponent(jButtonCancel))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSaveActionPerformed
        System.out.println(jSpinner1.getValue());  
        String optionsFileName = System.getProperty("user.dir") + "/src/selectcontract2/MyContractBids.txt";
//        LocalDate date = LocalDate.now();
//        String text = date.format(RFC_1123_DATE_TIME);
//        LocalDate parsedDate = LocalDate.parse(text, RFC_1123_DATE_TIME);
        
          ZonedDateTime date = ZonedDateTime.now();
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd YYYY HH:mm zzz");
  String formattedDate = date.format(formatter);
  //ZonedDateTime parsedDate = ZonedDateTime.parse(text, formatter);
  
     NumberFormat nF = NumberFormat.getCurrencyInstance();
     nF.setCurrency(Currency.getInstance(Locale.CANADA));
     
     String name = jTextName.getText();
     String contractID = jLabelContractID.getText();
     int bidAmount = Integer.parseInt( jSpinner1.getValue().toString());
     
    // nF.format(bidAmount);
        
        if (name.chars().allMatch(Character::isLetter) && !(name.isBlank())) {
            try {

            //      ZonedDatedTime currentDate;
              //    currentDate = ZonedDateTime.now();
                  FileWriter bidMessage = new FileWriter(optionsFileName, true);

                  bidMessage.append("\n" + name + "," + contractID + "," + nF.format(bidAmount) + "," + formattedDate);

                  bidMessage.close(); //always close the file when you're done :)
                  System.out.println("Successfully wrote to the file.");
                  JOptionPane.showMessageDialog(new JFrame(), ("Your bid as " + name + " with bid amount " + nF.format(bidAmount) + " has been saved."), "Dialog", JOptionPane.INFORMATION_MESSAGE);
                  dispose();
                } catch (IOException ex) {

                  System.out.println("An error occurred.");
                  ex.printStackTrace();

                }
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "Name must only contain alphabetical characters, and cannot be left blank.", "Dialog",
			    		JOptionPane.ERROR_MESSAGE);
        }
            
    }//GEN-LAST:event_JButtonSaveActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonSave;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelContractID;
    private javax.swing.JLabel jLabelDestination;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelOrderItem;
    private javax.swing.JLabel jLabelOrigin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextName;
    // End of variables declaration//GEN-END:variables
}
