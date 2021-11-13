
import java.awt.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sagit
 */
public class Succes extends javax.swing.JFrame
{
    String gender;
    String filename = null;
    byte[] person_image = null;
    public Succes()
    {
        initComponents();
        show_user();
    }
    
    public ArrayList<User> userList ()
    {
        ArrayList<User> usersList = new ArrayList<>();
        
        try
        {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:D:\\Documents\\NetBeansProjects\\JavaSQLITE\\src\\database.db";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM inputdata";
            Statement statement = con.createStatement ();
            ResultSet resultSet = statement.executeQuery ( query1 );
            User user;
            while ( resultSet.next () )
            {
                user = new User ( resultSet.getInt ( "sno" ), resultSet.getString ( "name" ),
                        resultSet.getString ( "address" ), resultSet.getString ( "gender" ),
                        resultSet.getString ( "knowledge" ), resultSet.getString ( "subject" ), resultSet.getBytes ( "image" ) );
                usersList.add ( user );
            }
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog ( null, e );
        }
        
        return usersList;
    }

    public void show_user()
    {
        ArrayList<User> list = userList ();
        DefaultTableModel model = (DefaultTableModel ) jTable1.getModel ();
        Object[] row = new Object[6];
        for ( int i = 0; i < list.size (); i++ )
        {
            row[0] = list.get ( i ).getSno ();
            row[1] = list.get ( i ).getName ();
            row[2] = list.get ( i ).getAddress ();
            row[3] = list.get ( i ).getGender ();
            row[4] = list.get ( i ).getKnowledge ();
            row[5] = list.get ( i ).getSubject ();
            model.addRow ( row );
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        coreJava = new javax.swing.JCheckBox();
        python = new javax.swing.JCheckBox();
        subject = new javax.swing.JComboBox<>();
        saveBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        lbl_img = new javax.swing.JLabel();
        imageBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        nameLabel.setText("Name");

        jLabel2.setText("Address");

        jLabel3.setText("Gender");

        jLabel4.setText("Knowledge");

        jLabel5.setText("Subject");

        buttonGroup1.add(male);
        male.setText("Male");

        buttonGroup1.add(female);
        female.setText("Female");

        coreJava.setText("Java");

        python.setText("python");

        subject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science", "Humanities", "Engineering" }));

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                saveBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                resetBtnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Sno", "Name", "Address", "Gender", "Knowledge", "Subject", "Image", "Date"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                deleteBtnActionPerformed(evt);
            }
        });

        imageBtn.setText("Choose Photo");
        imageBtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                imageBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(saveBtn)
                        .addGap(18, 18, 18)
                        .addComponent(updateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(deleteBtn)
                        .addGap(18, 18, 18)
                        .addComponent(resetBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(male)
                            .addComponent(coreJava))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(python)
                            .addComponent(female)))
                    .addComponent(address)
                    .addComponent(name)
                    .addComponent(subject, 0, 156, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_img, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(imageBtn)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_img, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(imageBtn)
                                .addGap(33, 33, 33))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(male)
                            .addComponent(female))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(coreJava)
                            .addComponent(python))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveBtn)
                            .addComponent(resetBtn)
                            .addComponent(updateBtn)
                            .addComponent(deleteBtn))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_saveBtnActionPerformed
    {//GEN-HEADEREND:event_saveBtnActionPerformed
        try
        {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:D:\\Documents\\NetBeansProjects\\JavaSQLITE\\src\\database.db";
            Connection con = DriverManager.getConnection(url);
            String query = "INSERT OR IGNORE INTO inputdata (name, address, gender, knowledge, subject, image) VALUES(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, name.getText());
            pst.setString(2, address.getText());
            if (male.isSelected())
            {
                gender = "Male";
            }
            if (female.isSelected())
            {
                gender = "Female";
            }
            pst.setString(3, gender);
            
            String knowledge = "";
            
            if (coreJava.isSelected())
            {
                knowledge += coreJava.getText() + " ";
            }
            
            if (python.isSelected())
            {
                knowledge += python.getText() + " ";
            }
            
            pst.setString(4, knowledge);
            
            String selectedSubject = "";
            selectedSubject = subject.getSelectedItem().toString();
            pst.setString(5, selectedSubject);
            pst.setBytes (6, person_image );
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            show_user();
            JOptionPane.showMessageDialog(null, "Insert OK");
            
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog ( null, e );
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_resetBtnActionPerformed
    {//GEN-HEADEREND:event_resetBtnActionPerformed
        name.setText("");
        address.setText("");
        buttonGroup1.clearSelection();
        coreJava.setSelected(false);
        python.setSelected(false);
        subject.setSelectedIndex(0);
        lbl_img.setIcon ( null );
    }//GEN-LAST:event_resetBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jTable1MouseClicked
    {//GEN-HEADEREND:event_jTable1MouseClicked
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        name.setText(model.getValueAt(i, 1).toString());
        address.setText(model.getValueAt(i, 2).toString());
        String sex = model.getValueAt(1, 3).toString();
        if (sex.equals("Male"))
        {
            male.setSelected(true);
        } else
        {
            female.setSelected(true);
        }
        
        String knowledge = model.getValueAt(i, 4).toString();
        switch (knowledge)
        {
            case "Java " :
                coreJava.setSelected(true);
                python.setSelected(false);
                break;
            
            case "Python " :
                coreJava.setSelected(false);
                python.setSelected(true);
                break;
                
            default:
                coreJava.setSelected(true);
                python.setSelected(true);
                break;
        }
        
        String subject1 = model.getValueAt(i, 5).toString();
        switch (subject1)
        {
            case "Computer Science" :
                subject.setSelectedIndex(0);
                break;
            
            case "Humanities" :
                subject.setSelectedIndex(1);
                break;
                
            case "Engineering" :
                subject.setSelectedIndex(2);
                break;
        }
        
        byte[] img = userList ().get ( i ).getPicture ();
        ImageIcon imageIcon = new ImageIcon (new ImageIcon (img).getImage ().getScaledInstance ( lbl_img.getWidth (), lbl_img.getHeight (), Image.SCALE_SMOOTH ));
        lbl_img.setIcon ( imageIcon );
    }//GEN-LAST:event_jTable1MouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_updateBtnActionPerformed
    {//GEN-HEADEREND:event_updateBtnActionPerformed
        try
        {
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:D:\\Documents\\NetBeansProjects\\JavaSQLITE\\src\\database.db";
            Connection con = DriverManager.getConnection(url);
            int row = jTable1.getSelectedRow ();
            String value = jTable1.getModel ().getValueAt ( row, 0 ).toString ();
            String query = "UPDATE inputdata SET name=?, address=?, gender=?, knowledge=?, subject=?, image=? WHERE sno=" + value;
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, name.getText());
            pst.setString(2, address.getText());
            if (male.isSelected())
            {
                gender = "Male";
            }
            if (female.isSelected())
            {
                gender = "Female";
            }
            pst.setString(3, gender);
    
            String knowledge = "";
    
            if (coreJava.isSelected())
            {
                knowledge += coreJava.getText() + " ";
            }
    
            if (python.isSelected())
            {
                knowledge += python.getText() + " ";
            }
    
            pst.setString(4, knowledge);
    
            String selectedSubject = "";
            selectedSubject = subject.getSelectedItem().toString();
            pst.setString(5, selectedSubject);
            pst.setBytes ( 6, person_image );
    
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            show_user();
            JOptionPane.showMessageDialog(null, "Update OK");
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog ( null, e );
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_deleteBtnActionPerformed
    {//GEN-HEADEREND:event_deleteBtnActionPerformed
        int opt = JOptionPane.showConfirmDialog ( null, "Are you sre to DELETE", "DELETE", JOptionPane.YES_NO_OPTION );
        if ( opt == 0 )
        {
            try
            {
                Class.forName ( "org.sqlite.JDBC" );
                String url = "jdbc:sqlite:D:\\Documents\\NetBeansProjects\\JavaSQLITE\\src\\database.db";
                Connection con = DriverManager.getConnection ( url );
                int row = jTable1.getSelectedRow ();
                String value = jTable1.getModel ().getValueAt ( row, 0 ).toString ();
                String query = "DELETE FROM inputdata WHERE sno=" + value;
                PreparedStatement pst = con.prepareStatement ( query );
                pst.executeUpdate ();
                DefaultTableModel model = ( DefaultTableModel ) jTable1.getModel ();
                model.setRowCount ( 0 );
                show_user ();
                JOptionPane.showMessageDialog ( null, "Delete OK" );
            }
            catch ( Exception e )
            {
                JOptionPane.showMessageDialog ( null, e );
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void imageBtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_imageBtnActionPerformed
    {//GEN-HEADEREND:event_imageBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser ();
        fileChooser.showOpenDialog ( null );
        File file = fileChooser.getSelectedFile ();
        filename = file.getAbsolutePath ();
        ImageIcon imageIcon = new ImageIcon (new ImageIcon (filename).getImage ().getScaledInstance ( lbl_img.getWidth (), lbl_img.getHeight (), Image.SCALE_SMOOTH ));
        lbl_img.setIcon ( imageIcon );
        try
        {
            File image = new File ( filename );
            FileInputStream fis = new FileInputStream ( image );
            ByteArrayOutputStream bos = new ByteArrayOutputStream ();
            byte[] buf = new byte[1024];
            for ( int i; (i = fis.read (buf)) != -1;)
            {
                bos.write ( buf, 0, i );
            }
            person_image = bos.toByteArray ();
        }
        catch ( FileNotFoundException e )
        {
            JOptionPane.showMessageDialog ( null, e );
        }
        catch ( IOException e )
        {
            JOptionPane.showMessageDialog ( null, e );
        }
    }//GEN-LAST:event_imageBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Succes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Succes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Succes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Succes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Succes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox coreJava;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton imageBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JCheckBox python;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JComboBox<String> subject;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
