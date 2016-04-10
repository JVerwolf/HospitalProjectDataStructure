/*
 *
 */
package gui_components;

import hospital_components.Bed;
import hospital_components.CareFacility;
import hospital_components.Patient;
import java.awt.CardLayout;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author John Verwolf
 */
public class NewApplication extends javax.swing.JFrame {

    /**
     * Creates new form NewApplication
     */
    public NewApplication() {
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

        fileChooser = new javax.swing.JFileChooser();
        mainPanel = new javax.swing.JPanel();
        start = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        startLoad = new javax.swing.JButton();
        startNew = new javax.swing.JButton();
        cardBeds = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bedDisplay = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        bedNameAdd = new javax.swing.JTextField();
        bedLocation = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bedNew = new javax.swing.JButton();
        bedDelete = new javax.swing.JButton();
        bedAvailable = new javax.swing.JCheckBox();
        bedNameDelete = new javax.swing.JTextField();
        cardPatients = new javax.swing.JPanel();
        cardEmployees = new javax.swing.JPanel();
        cardReport = new javax.swing.JPanel();
        reportScrollArea = new javax.swing.JScrollPane();
        reportDisplay = new javax.swing.JTextArea();
        reportUpdate = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        editPatients = new javax.swing.JMenuItem();
        editBeds = new javax.swing.JMenuItem();
        editEmployees = new javax.swing.JMenuItem();
        reportsMenu = new javax.swing.JMenu();
        viewReport = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        fileChooser.setDialogTitle("Hospital Management Utility File Chooser");
        fileChooser.setFileFilter(new MyCustomFilter());
        fileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileChooserActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setText("Hospital Management Utility");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel2.setText("version 1.0");

        startLoad.setText("Load");
        startLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startLoadActionPerformed(evt);
            }
        });

        startNew.setText("New");
        startNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout startLayout = new javax.swing.GroupLayout(start);
        start.setLayout(startLayout);
        startLayout.setHorizontalGroup(
            startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(startLoad)
                .addGap(49, 49, 49)
                .addComponent(startNew)
                .addGap(156, 156, 156))
            .addGroup(startLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        startLayout.setVerticalGroup(
            startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addGroup(startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startNew)
                    .addComponent(startLoad))
                .addGap(51, 51, 51))
        );

        mainPanel.add(start, "start");

        jLabel3.setText("jLabel3");

        bedDisplay.setColumns(20);
        bedDisplay.setRows(5);
        jScrollPane2.setViewportView(bedDisplay);

        bedNameAdd.setText("Name");
        bedNameAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedNameAddActionPerformed(evt);
            }
        });

        bedLocation.setText("Location");

        jLabel4.setText("Name:");

        jLabel5.setText("Location:");

        bedNew.setText("New");
        bedNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedNewActionPerformed(evt);
            }
        });

        bedDelete.setText("Delete");

        bedAvailable.setText("Available");

        bedNameDelete.setText("Name to delete");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bedNameDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bedNameAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bedLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bedAvailable)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bedDelete)
                    .addComponent(bedNew))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bedNameAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bedLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bedNew)
                    .addComponent(bedAvailable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bedDelete)
                    .addComponent(bedNameDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout cardBedsLayout = new javax.swing.GroupLayout(cardBeds);
        cardBeds.setLayout(cardBedsLayout);
        cardBedsLayout.setHorizontalGroup(
            cardBedsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardBedsLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cardBedsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(cardBedsLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cardBedsLayout.setVerticalGroup(
            cardBedsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardBedsLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );

        mainPanel.add(cardBeds, "cardBeds");

        javax.swing.GroupLayout cardPatientsLayout = new javax.swing.GroupLayout(cardPatients);
        cardPatients.setLayout(cardPatientsLayout);
        cardPatientsLayout.setHorizontalGroup(
            cardPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        cardPatientsLayout.setVerticalGroup(
            cardPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );

        mainPanel.add(cardPatients, "cardPatients");

        javax.swing.GroupLayout cardEmployeesLayout = new javax.swing.GroupLayout(cardEmployees);
        cardEmployees.setLayout(cardEmployeesLayout);
        cardEmployeesLayout.setHorizontalGroup(
            cardEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        cardEmployeesLayout.setVerticalGroup(
            cardEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 413, Short.MAX_VALUE)
        );

        mainPanel.add(cardEmployees, "cardEmployees");

        cardReport.setFocusable(false);

        reportDisplay.setColumns(20);
        reportDisplay.setRows(5);
        reportScrollArea.setViewportView(reportDisplay);

        reportUpdate.setText("Update");
        reportUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardReportLayout = new javax.swing.GroupLayout(cardReport);
        cardReport.setLayout(cardReportLayout);
        cardReportLayout.setHorizontalGroup(
            cardReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reportScrollArea, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
            .addGroup(cardReportLayout.createSequentialGroup()
                .addComponent(reportUpdate)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        cardReportLayout.setVerticalGroup(
            cardReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardReportLayout.createSequentialGroup()
                .addComponent(reportScrollArea, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportUpdate))
        );

        mainPanel.add(cardReport, "cardReport");

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");
        editMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuActionPerformed(evt);
            }
        });

        editPatients.setText("Patients");
        editPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPatientsActionPerformed(evt);
            }
        });
        editMenu.add(editPatients);

        editBeds.setText("Beds");
        editBeds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBedsActionPerformed(evt);
            }
        });
        editMenu.add(editBeds);

        editEmployees.setText("Employees");
        editEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEmployeesActionPerformed(evt);
            }
        });
        editMenu.add(editEmployees);

        menuBar.add(editMenu);

        reportsMenu.setText("Reports");

        viewReport.setText("Reports");
        viewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReportActionPerformed(evt);
            }
        });
        reportsMenu.add(viewReport);

        menuBar.add(reportsMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void startLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startLoadActionPerformed
        fileOpenDialog(evt);
    }//GEN-LAST:event_startLoadActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        fileOpenDialog(evt);
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void fileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileChooserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileChooserActionPerformed

    private void editMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editMenuActionPerformed

    private void viewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewReportActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "cardReport");
    }//GEN-LAST:event_viewReportActionPerformed

    private void editEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEmployeesActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "cardEmployees");
    }//GEN-LAST:event_editEmployeesActionPerformed

    private void editBedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBedsActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "cardBeds");
    }//GEN-LAST:event_editBedsActionPerformed

    private void editPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPatientsActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "cardPatients");
    }//GEN-LAST:event_editPatientsActionPerformed

    private void startNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startNewActionPerformed
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "cardReport");

        //instantiate care facility
        cF = new CareFacility(JOptionPane.showInputDialog("Please enter a name for the carefacility"));
    }//GEN-LAST:event_startNewActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        fileSaveDialog(evt);
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void reportUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportUpdateActionPerformed
       FunctionalityUtils.updateReport(cF,reportDisplay);
    }//GEN-LAST:event_reportUpdateActionPerformed

    private void bedNameAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedNameAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bedNameAddActionPerformed
    /**
     * adds a bed to the care facility
     * @param evt action event
     */
    private void bedNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedNewActionPerformed
        String name = bedNameAdd.getText();
        String location = bedLocation.getText();
        Boolean available = bedAvailable.isSelected();
        Bed bed = new Bed(name,location,available,null);
        cF.addBed(bed);
       FunctionalityUtils.updateBedDisplay(cF, bedDisplay);
    }//GEN-LAST:event_bedNewActionPerformed
    
    /**
     * opens an file open dialog to open the specified file
     *
     * @param evt ActionEvent
     */
    private void fileOpenDialog(java.awt.event.ActionEvent evt) {
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            //get the file name
            String filename = fileChooser.getSelectedFile().toString();

            //ensure the file type is correct
            if (!filename.endsWith(".cf")) {
                File openFile = new File(filename);
                cF = CareFacility.load(openFile);
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
        //set card to cardReport
        CardLayout card = (CardLayout) mainPanel.getLayout();
        card.show(mainPanel, "cardReport");
    }

    /**
     * opens a save dialog and saves the file to the specified location
     *
     * @param evt ActionEvent
     */
    private void fileSaveDialog(java.awt.event.ActionEvent evt) {
        File setDir = new File(".");                //sets setDir to default file path
        fileChooser.setCurrentDirectory(setDir);    //set fileChooser to open at default file path

        int returnVal = fileChooser.showSaveDialog(this); //get the return value of a save Dialog box

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            //get the file name
            String filename = fileChooser.getSelectedFile().toString();

            //ensure the file type is correct
            if (!filename.endsWith(".cf")) {
                filename += ".cf";
            }
            File saveFile = new File(filename);
            //save CareFacility object to filepath
            cF.Save(saveFile);
        } else {
            System.out.println("File access cancelled by user.");
        }
    }

    /**
     * Internal class that filters what files can be chosen by the jFileChooser
     */
    class MyCustomFilter extends javax.swing.filechooser.FileFilter {

        @Override
        public boolean accept(File file) {
            // Allow only directories, or files with ".cf" extension
            return file.isDirectory() || file.getAbsolutePath().endsWith(".cf");
        }

        @Override
        public String getDescription() {
            // This description will be displayed in the dialog,            
            return "Care Facility File (*.cf)";
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewApplication().setVisible(true);
            }
        });
    }
    CareFacility cF;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JCheckBox bedAvailable;
    private javax.swing.JButton bedDelete;
    private javax.swing.JTextArea bedDisplay;
    private javax.swing.JTextField bedLocation;
    private javax.swing.JTextField bedNameAdd;
    private javax.swing.JTextField bedNameDelete;
    private javax.swing.JButton bedNew;
    private javax.swing.JPanel cardBeds;
    private javax.swing.JPanel cardEmployees;
    private javax.swing.JPanel cardPatients;
    private javax.swing.JPanel cardReport;
    private javax.swing.JMenuItem editBeds;
    private javax.swing.JMenuItem editEmployees;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem editPatients;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JTextArea reportDisplay;
    private javax.swing.JScrollPane reportScrollArea;
    private javax.swing.JButton reportUpdate;
    private javax.swing.JMenu reportsMenu;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JPanel start;
    private javax.swing.JButton startLoad;
    private javax.swing.JButton startNew;
    private javax.swing.JMenuItem viewReport;
    // End of variables declaration//GEN-END:variables

}
