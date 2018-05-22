/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import business.Customer.Customer;
import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Enterprise.FinancialEnterprise;
import business.Enterprise.GovernmentEnterprise;
import business.Network.Network;
import business.Organisation.ExpertOrganization;
import business.Organisation.InvestmentAndRiskOrganization;
import business.Organisation.Organisation;
import business.Stock.Risk;
import business.Useraccount.UserAccount;
import business.WorkQueue.AdviceWorkRequest;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date;
import java.util.Hashtable;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Prashant Kabra (kabra.p@husky.neu.edu)
 */
public class RequestAdviceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestAdviceJPanel
     */
    private UserAccount account;
    private EcoSystem ecosystem;
    private JPanel adviceContainer;
    private boolean isFinEnterprise;

    public RequestAdviceJPanel(JPanel adviceContainer, EcoSystem ecosystem, UserAccount account) {
        initComponents();
        this.adviceContainer = adviceContainer;
        this.account = account;
        this.ecosystem = ecosystem;
        riskSlider.setMaximum(40);
        riskSlider.setPaintTicks(true);
        riskSlider.setPaintLabels(true);
        riskSlider.setMinimum(0);
        riskSlider.setSnapToTicks(true);

        Hashtable labels
                = new Hashtable();
        labels.put(0, new JLabel("low"));
        // labels.put(10, new JLabel("low-medium"));
        labels.put(20, new JLabel("medium"));
        //labels.put(30, new JLabel("medium-high"));
        labels.put(40, new JLabel("high"));
        riskSlider.setLabelTable(labels);

       
        networkCombo.setEditable(false);
        enterpriseCombo.setEditable(false);

        networkCombo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                populateEnterpriseCombo((Network) networkCombo.getSelectedItem());

            }
        });
        enterpriseCombo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                isFinEnterprise = ((Enterprise) enterpriseCombo.getSelectedItem() instanceof FinancialEnterprise);
                countryList.setEnabled(isFinEnterprise);

            }
        });
         populateNetworkCombo();
        networkCombo.setSelectedIndex(0);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        networkCombo = new javax.swing.JComboBox<Network>();
        enterpriseCombo = new javax.swing.JComboBox<Enterprise>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        countryList = new javax.swing.JList<Network>();
        riskSlider = new javax.swing.JSlider();
        jLabel15 = new javax.swing.JLabel();
        btnRequestAdvice = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 0));
        jLabel12.setText("Networks");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 0));
        jLabel13.setText("Enterprise");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 153, 0));
        jLabel14.setText("Risk");

        countryList.setBackground(new java.awt.Color(240, 240, 240));
        countryList.setToolTipText("Hold CTRL for multiple selection");
        countryList.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        jScrollPane1.setViewportView(countryList);

        riskSlider.setMajorTickSpacing(20);
        riskSlider.setMaximum(40);
        riskSlider.setMinorTickSpacing(10);
        riskSlider.setPaintLabels(true);
        riskSlider.setPaintTicks(true);
        riskSlider.setSnapToTicks(true);
        riskSlider.setValue(0);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 153, 0));
        jLabel15.setText("Select Counties");

        btnRequestAdvice.setBackground(new java.awt.Color(0, 153, 153));
        btnRequestAdvice.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnRequestAdvice.setForeground(new java.awt.Color(255, 255, 255));
        btnRequestAdvice.setText("Request");
        btnRequestAdvice.setMaximumSize(new java.awt.Dimension(200, 200));
        btnRequestAdvice.setMinimumSize(new java.awt.Dimension(200, 200));
        btnRequestAdvice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestAdviceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(networkCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(riskSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(352, 352, 352))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(btnRequestAdvice, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel13)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(networkCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(12, 12, 12)
                        .addComponent(enterpriseCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(riskSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel15))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(btnRequestAdvice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(497, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
   private void populateNetworkCombo() {
        DefaultListModel<Network> dlm = new DefaultListModel<>();

        for (Network n : ecosystem.getNetworkDirectory().getNetworkList()) {
            networkCombo.addItem(n);
            dlm.addElement(n);
        }

        countryList.setModel(dlm);
    }

    private void populateEnterpriseCombo(Network n) {
        enterpriseCombo.removeAllItems();
        for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
            if (!(e instanceof GovernmentEnterprise)) {
                enterpriseCombo.addItem(e);
            }
        }

    }
    private void btnRequestAdviceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestAdviceActionPerformed
        // TODO add your handling code here:
        
        AdviceWorkRequest awr = new AdviceWorkRequest();
        awr.setSender(account);
        awr.setRequestDate(new Date());
        awr.setStatus("Requested");
        awr.setRisk(Risk.getRiskFromValue(riskSlider.getValue()));
        Enterprise e = (Enterprise) enterpriseCombo.getSelectedItem();
        if (isFinEnterprise) {
            if(countryList.getSelectedValuesList().size()==0){
                 JOptionPane.showMessageDialog(null, "Please select atleast one country");
                 return;
            }
            for (Network n : countryList.getSelectedValuesList()) {
                awr.getNetworks().add(n);
            }

            for (Organisation o : e.getOrganisationDirectory().getOrganisationList()) {
                if (o instanceof InvestmentAndRiskOrganization) {
                    o.getWorkQueue().getWorkRequestList().add(awr);
                    awr.setOrganisation(o);
                }
            }
        } else {
            awr.setNetworks(null);
            for (Organisation o : e.getOrganisationDirectory().getOrganisationList()) {
                if (o instanceof ExpertOrganization) {
                    o.getWorkQueue().getWorkRequestList().add(awr);
                    awr.setOrganisation(o);
                }
            }
        }

            Customer c = (Customer) account.getPerson();
            c.getWorkQueue().addWorkRequest(awr);

            networkCombo.setSelectedIndex(0);
            countryList.clearSelection();
            riskSlider.setValue(0);
        
    }//GEN-LAST:event_btnRequestAdviceActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRequestAdvice;
    private javax.swing.JList<Network> countryList;
    private javax.swing.JComboBox<Enterprise> enterpriseCombo;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Network> networkCombo;
    private javax.swing.JSlider riskSlider;
    // End of variables declaration//GEN-END:variables
}