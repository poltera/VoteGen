/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hsr.univote.unigen.gui;

import ch.hsr.univote.unigen.db.DB4O;
import ch.hsr.univote.unigen.helper.ConfigHelper;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gian
 */
public class CryptoConfiguration extends javax.swing.JPanel {

    /**
     * Creates new form CryptoConfiguration
     */
    public CryptoConfiguration() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLblEncryption = new javax.swing.JLabel();
        jLblEncryptionAlgorithm = new javax.swing.JLabel();
        jCBEncryptionAlgorithm = new javax.swing.JComboBox();
        jLblEncryptionKeyLength = new javax.swing.JLabel();
        jSEncryptionKeyLength = new javax.swing.JSlider();
        jLblSignature = new javax.swing.JLabel();
        jLblSignatureKeyType = new javax.swing.JLabel();
        jCBSignatureKeyType = new javax.swing.JComboBox();
        jLblSignatureAlgorithm = new javax.swing.JLabel();
        jCBSignatureAlgorithm = new javax.swing.JComboBox();
        jLblSignatureKeyLength = new javax.swing.JLabel();
        jSSignatureKeyLength = new javax.swing.JSlider();
        lblHash = new java.awt.Label();
        jLblHashAlgorithm = new javax.swing.JLabel();
        jCBHashAlgorithm = new javax.swing.JComboBox();
        jLblHashCharEncoding = new javax.swing.JLabel();
        jCBHashCharEncoding = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lblSave = new java.awt.Label();
        jBtnSave = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        jLblEncryption.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("Bundle"); // NOI18N
        jLblEncryption.setText(bundle.getString("encryption")); // NOI18N
        jLblEncryption.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jLblEncryption, gridBagConstraints);

        jLblEncryptionAlgorithm.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLblEncryptionAlgorithm.setText(bundle.getString("algorithm")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jLblEncryptionAlgorithm, gridBagConstraints);

        jCBEncryptionAlgorithm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ElGamal" }));
        jCBEncryptionAlgorithm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBEncryptionAlgorithmActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jCBEncryptionAlgorithm, gridBagConstraints);

        jLblEncryptionKeyLength.setText(bundle.getString("keylength")); // NOI18N
        jLblEncryptionKeyLength.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jLblEncryptionKeyLength, gridBagConstraints);

        jSEncryptionKeyLength.setMajorTickSpacing(1024);
        jSEncryptionKeyLength.setMaximum(4096);
        jSEncryptionKeyLength.setMinimum(1024);
        jSEncryptionKeyLength.setMinorTickSpacing(1024);
        jSEncryptionKeyLength.setPaintLabels(true);
        jSEncryptionKeyLength.setPaintTicks(true);
        jSEncryptionKeyLength.setSnapToTicks(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jSEncryptionKeyLength, gridBagConstraints);

        jLblSignature.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLblSignature.setText(bundle.getString("signature")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jLblSignature, gridBagConstraints);

        jLblSignatureKeyType.setText(bundle.getString("keytype")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jLblSignatureKeyType, gridBagConstraints);

        jCBSignatureKeyType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RSA" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jCBSignatureKeyType, gridBagConstraints);

        jLblSignatureAlgorithm.setText(bundle.getString("algorithm")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jLblSignatureAlgorithm, gridBagConstraints);

        jCBSignatureAlgorithm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SHA256withRSA" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jCBSignatureAlgorithm, gridBagConstraints);

        jLblSignatureKeyLength.setText(bundle.getString("keylength")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jLblSignatureKeyLength, gridBagConstraints);

        jSSignatureKeyLength.setMajorTickSpacing(1024);
        jSSignatureKeyLength.setMaximum(4096);
        jSSignatureKeyLength.setMinimum(1024);
        jSSignatureKeyLength.setMinorTickSpacing(1024);
        jSSignatureKeyLength.setPaintLabels(true);
        jSSignatureKeyLength.setPaintTicks(true);
        jSSignatureKeyLength.setSnapToTicks(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jSSignatureKeyLength, gridBagConstraints);

        lblHash.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblHash.setText(bundle.getString("hash")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 32;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(lblHash, gridBagConstraints);

        jLblHashAlgorithm.setText(bundle.getString("algorithm")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 34;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jLblHashAlgorithm, gridBagConstraints);

        jCBHashAlgorithm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SHA-256" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 34;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jCBHashAlgorithm, gridBagConstraints);

        jLblHashCharEncoding.setText(bundle.getString("charencoding")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 36;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jLblHashCharEncoding, gridBagConstraints);

        jCBHashCharEncoding.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UTF-8" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 36;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jCBHashCharEncoding, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 30;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jSeparator1, gridBagConstraints);
        add(filler1, new java.awt.GridBagConstraints());

        jLabel4.setText("bit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jLabel4, gridBagConstraints);

        jLabel5.setText("bit");
        jLabel5.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(jSeparator2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 100;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(jSeparator3, gridBagConstraints);

        lblSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSave.setText(bundle.getString("save")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 102;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(lblSave, gridBagConstraints);

        jBtnSave.setText(bundle.getString("save")); // NOI18N
        jBtnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtnSave.setFocusTraversalPolicyProvider(true);
        jBtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSaveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 102;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(jBtnSave, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jCBEncryptionAlgorithmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBEncryptionAlgorithmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBEncryptionAlgorithmActionPerformed

    private void jBtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSaveActionPerformed
        Properties properties = new Properties();
        
        properties.setProperty("encryptionAlgorithm", jCBEncryptionAlgorithm.getSelectedItem().toString());
        properties.setProperty("encryptionKeyLength", String.valueOf(jSEncryptionKeyLength.getValue()));
        properties.setProperty("signatureKeyType", jCBSignatureKeyType.getSelectedItem().toString());
        properties.setProperty("signatureAlgorithm", jCBSignatureAlgorithm.getSelectedItem().toString());
        properties.setProperty("signatureKeyLength", String.valueOf(jSSignatureKeyLength.getValue()));
        properties.setProperty("hashAlgorithm", jCBHashAlgorithm.getSelectedItem().toString());
        properties.setProperty("charEncoding", jCBHashCharEncoding.getSelectedItem().toString());      
        
        new ConfigHelper().saveProperties("CryptoConfigFile", properties);
    }//GEN-LAST:event_jBtnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jBtnSave;
    private javax.swing.JComboBox jCBEncryptionAlgorithm;
    private javax.swing.JComboBox jCBHashAlgorithm;
    private javax.swing.JComboBox jCBHashCharEncoding;
    private javax.swing.JComboBox jCBSignatureAlgorithm;
    private javax.swing.JComboBox jCBSignatureKeyType;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLblEncryption;
    private javax.swing.JLabel jLblEncryptionAlgorithm;
    private javax.swing.JLabel jLblEncryptionKeyLength;
    private javax.swing.JLabel jLblHashAlgorithm;
    private javax.swing.JLabel jLblHashCharEncoding;
    private javax.swing.JLabel jLblSignature;
    private javax.swing.JLabel jLblSignatureAlgorithm;
    private javax.swing.JLabel jLblSignatureKeyLength;
    private javax.swing.JLabel jLblSignatureKeyType;
    private javax.swing.JSlider jSEncryptionKeyLength;
    private javax.swing.JSlider jSSignatureKeyLength;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private java.awt.Label lblHash;
    private java.awt.Label lblSave;
    // End of variables declaration//GEN-END:variables
}
