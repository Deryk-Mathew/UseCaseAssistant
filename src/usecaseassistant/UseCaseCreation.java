/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usecaseassistant;

import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Deryk Mathew
 */
public class UseCaseCreation extends javax.swing.JPanel {

    /**
     * Creates new form UseCaseCreationPanel
     * @param id
     */
    public UseCaseCreation(int id) {
        initComponents();
        UCID = id;
        String ucid = Integer.toString(id);
        jLabel2.setText(ucid);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TitleField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        descField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        priActorField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        secActorField = new javax.swing.JTextField();
        preconField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        postField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        triggerField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        scenarioInputField = new javax.swing.JTextField();
        scenarioAddButton = new javax.swing.JButton();
        submitUCButton = new javax.swing.JButton();

        jLabel1.setText("Use Case ID:");

        jLabel2.setText("jLabel2");

        jLabel3.setText("Use Case Title:");

        jLabel4.setText("Use Case Description:");

        jLabel5.setText("Primary Actor:");

        jLabel6.setText("Secondary Actor:");

        jLabel7.setText("Preconditions:");

        jLabel8.setText("Post-Conditions:");

        postField.setText("");

        jLabel9.setText("Trigger:");

        jLabel10.setText("Main Success Scenario:");

        jScrollPane1.setViewportView(jList1);

        scenarioInputField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                scenarioInputFieldKeyReleased(evt);
            }
        });

        scenarioAddButton.setText("Add");
        scenarioAddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                scenarioAddButtonMousePressed(evt);
            }
        });

        submitUCButton.setText("Submit");
        submitUCButton.setToolTipText("");
        submitUCButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                submitUCButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(submitUCButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(scenarioInputField)
                            .addComponent(triggerField)
                            .addComponent(postField)
                            .addComponent(preconField)
                            .addComponent(secActorField)
                            .addComponent(priActorField)
                            .addComponent(descField)
                            .addComponent(TitleField)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scenarioAddButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(descField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(priActorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(secActorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(preconField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(postField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(triggerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scenarioAddButton)
                    .addComponent(scenarioInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitUCButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TitleField.getAccessibleContext().setAccessibleName("UCTitleField");
        TitleField.getAccessibleContext().setAccessibleDescription("UCTitleField");
    }// </editor-fold>//GEN-END:initComponents

    private void scenarioAddButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scenarioAddButtonMousePressed
        DefaultListModel dlm = new DefaultListModel();
        if(scenarioInputField.getText().isEmpty() == false){
        String temp = scenarioInputField.getText();
        scenarioInputField.setText("");
        dlm.addElement(temp);
        scenario.add(temp);
        jList1.setModel(dlm);
        System.out.println(scenario);
        }else{
           JOptionPane.showMessageDialog(null, "Please enter a scenario step!"); 
        }
    }//GEN-LAST:event_scenarioAddButtonMousePressed

    private void scenarioInputFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scenarioInputFieldKeyReleased
        DefaultListModel dlm = new DefaultListModel();
        if(scenarioInputField.getText().isEmpty() == false){
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            
            String temp = scenarioInputField.getText();
            scenarioInputField.setText("");
            dlm.addElement(temp);
            scenario.add(temp);
            jList1.setModel(dlm);
            System.out.println(scenario);
        }}else{
            JOptionPane.showMessageDialog(null, "Please enter a scenario step!");
        }
    }//GEN-LAST:event_scenarioInputFieldKeyReleased

    private void submitUCButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitUCButtonMousePressed
        if(TitleField.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(null, "Title Field is Empty");
        }else{
            UCtitle = TitleField.getText();
        }
        if(descField.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(null, "Description Field is Empty");
        }else{
            UCdesc = descField.getText();
        }
        if(priActorField.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(null, "Primary Actor Field is Empty");
        }else{
            priActor = priActorField.getText();
        }
        if(secActorField.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(null, "Secondary Actor Field is Empty");
        }else{
            secActor = secActorField.getText();
        }
        if(preconField.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(null, "Precondition Field is Empty");
        }else{
            precon = preconField.getText();
        }
        if(postField.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(null, "Post-Condition Field is Empty");
        }else{
            postcon = postField.getText();
        }
        if(triggerField.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(null, "Trigger Field is Empty");
        }else{
            trigger = triggerField.getText();
        }
        if(scenario.isEmpty()== true){
            JOptionPane.showMessageDialog(null, "You have not entered scenario steps");
        }
    }//GEN-LAST:event_submitUCButtonMousePressed

    public int getUCID() {
        return UCID;
    }

    public void setUCID(int UCID) {
        this.UCID = UCID;
    }

    public String getUCtitle() {
        return UCtitle;
    }

    public void setUCtitle(String UCtitle) {
        this.UCtitle = UCtitle;
    }

    public String getUCdesc() {
        return UCdesc;
    }

    public void setUCdesc(String UCdesc) {
        this.UCdesc = UCdesc;
    }

    public String getPriActor() {
        return priActor;
    }

    public void setPriActor(String priActor) {
        this.priActor = priActor;
    }

    public String getSecActor() {
        return secActor;
    }

    public void setSecActor(String secActor) {
        this.secActor = secActor;
    }

    public String getPrecon() {
        return precon;
    }

    public void setPrecon(String precon) {
        this.precon = precon;
    }

    public String getPostcon() {
        return postcon;
    }

    public void setPostcon(String postcon) {
        this.postcon = postcon;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    private int UCID;
    private String UCtitle;
    private String UCdesc;
    private String priActor;
    private String secActor;
    private String precon;
    private String postcon;
    private String trigger;
    private ArrayList<String> scenario = new ArrayList();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TitleField;
    private javax.swing.JTextField descField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField postField;
    private javax.swing.JTextField preconField;
    private javax.swing.JTextField priActorField;
    private javax.swing.JButton scenarioAddButton;
    private javax.swing.JTextField scenarioInputField;
    private javax.swing.JTextField secActorField;
    private javax.swing.JButton submitUCButton;
    private javax.swing.JTextField triggerField;
    // End of variables declaration//GEN-END:variables
}
