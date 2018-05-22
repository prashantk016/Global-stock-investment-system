/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Expert;

import business.Employee.Employee;
import business.Expert.SpeakerSession;
import business.Person.Person;
import business.Useraccount.UserAccount;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vrushali Shah
 */
public class AssignSpeakerSession extends javax.swing.JPanel {

    private JPanel speakerSessionContainer;
    private List<SpeakerSession> sessionList;
    private UserAccount account;
    private Employee emp;

    /**
     * Creates new form AssignSpeakerSession
     */
    public AssignSpeakerSession(JPanel speakerSessionContainer, List<SpeakerSession> sessionList, UserAccount account) {
        initComponents();
        this.speakerSessionContainer = speakerSessionContainer;
        this.sessionList = sessionList;
        this.account = account;

        populateTable();
    }

    public void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblSession.getModel();

        model.setRowCount(0);
        for (SpeakerSession session : sessionList) {
            if (((Person) session.getSpeaker()).equals(account.getPerson())) {
                Object[] row = new Object[5];
                row[0] = session;
                row[1] = session.getSpeaker().getFirstName() + " " + session.getSpeaker().getLastName();
                row[2] = session.getStatus();
                row[3] = session.getCapacity();
                model.addRow(row);
            }

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSession = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnManageSession = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tblSession.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SessionId", "ExpertName", "Status", "Total Seats"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSession);

        btnAdd.setBackground(new java.awt.Color(0, 153, 153));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add Session");
        btnAdd.setMaximumSize(new java.awt.Dimension(200, 200));
        btnAdd.setMinimumSize(new java.awt.Dimension(200, 200));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnManageSession.setText("Manage Session");
        btnManageSession.setBackground(new java.awt.Color(0, 153, 153));
        btnManageSession.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnManageSession.setForeground(new java.awt.Color(255, 255, 255));
        btnManageSession.setMaximumSize(new java.awt.Dimension(200, 200));
        btnManageSession.setMinimumSize(new java.awt.Dimension(200, 200));
        btnManageSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSessionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageSession, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageSession, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(231, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        AddSpeakerSessionJPanel panel = new AddSpeakerSessionJPanel(speakerSessionContainer, sessionList, account);
        speakerSessionContainer.add("AddSpeakerSessionJPanel", panel);
        CardLayout cardLayout = (CardLayout) speakerSessionContainer.getLayout();
        cardLayout.next(speakerSessionContainer);

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnManageSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSessionActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblSession.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a session first");
        } else {
            SpeakerSession session = (SpeakerSession) tblSession.getValueAt(selectedRow, 0);
           
                ManageSpeakerSessionJPanel panel = new ManageSpeakerSessionJPanel(speakerSessionContainer, session);
                speakerSessionContainer.add("ManageSpeakerSessionJPanel", panel);
                CardLayout cardLayout = (CardLayout) speakerSessionContainer.getLayout();
                cardLayout.next(speakerSessionContainer);
            

        }

    }//GEN-LAST:event_btnManageSessionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnManageSession;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSession;
    // End of variables declaration//GEN-END:variables
}