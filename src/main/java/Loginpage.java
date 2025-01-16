
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author vkoct
 */
public class Loginpage extends javax.swing.JFrame {
File f= new File("C:\\e files\\RAPIDCLICKS");
int ln;
String Username,Password;
    /**
     * Creates new form Loginpage
     */
    public Loginpage() {
        initComponents();
    }
 
     public static boolean checkLogin(String username, String password) {
        File usersFile = new File("C:\\e files\\RAPIDCLICKS\\login.txt");
        
        try {
            Scanner scanner = new Scanner(usersFile);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                String fileUsername = parts[0];
                String filePassword = parts[1];
                
                if (username.equals(fileUsername) && password.equals(filePassword)) {
                    scanner.close();
                    return true;
                }
                 
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
      
      return false;
    }
    
//      
//  void createFolder(){
//      if(!f.exists()){
//      f.mkdirs();
//      }
//  }
//    
    
    
    

//  void readFile(){
//    try {
//        FileReader fr= new FileReader(f+"\\login.txt");
//              System.out.println("file exists");
//
//    } catch (FileNotFoundException ex) {
//        try {
//            FileWriter fw = new FileWriter(f+"\\login.txt");
//            System.out.println("File Created");
//        } catch (IOException ex1) {
//            Logger.getLogger(Loginpage.class.getName()).log(Level.SEVERE, null, ex1);
//        }
//    }
//  }
  
//  void addData(String uname,String pwd){
//    try {
//        RandomAccessFile raf = new RandomAccessFile(f+"\\login.txt","rw");
//        for(int i=0;i<ln;i++)
//        {
//            raf.readLine();
//        }
//        raf.writeBytes("\r\n");
//        raf.writeBytes("\r\n");
//
//        raf.writeBytes("Username: "+uname+"\r\n");
//        raf.writeBytes("Password: "+pwd+"\r\n");
//                
//                } catch (FileNotFoundException ex) {
//        Logger.getLogger(Loginpage.class.getName()).log(Level.SEVERE, null, ex);
//    } catch (IOException ex) {
//        Logger.getLogger(Loginpage.class.getName()).log(Level.SEVERE, null, ex);
//    }
//
//  }
//  
//  void CheckData(String uname,String pwd){
//    try {
//        RandomAccessFile raf= new RandomAccessFile(f+"\\login.txt","rw");
//        String line = raf.readLine();
//        Username=line.substring(10);
//        Password=raf.readLine().substring(10);
//        if(uname.equals(Username)& pwd.equals(Password))
//        {
//            JOptionPane.showMessageDialog(null,"Password Matched");
//        }
//        else{
//                    JOptionPane.showMessageDialog(null,"Wrong username/Password");
//
//        }
//        
//    } catch (FileNotFoundException ex) {
//        Logger.getLogger(Loginpage.class.getName()).log(Level.SEVERE, null, ex);
//    } catch (IOException ex) {
//        Logger.getLogger(Loginpage.class.getName()).log(Level.SEVERE, null, ex);
//    }
//  }

  
  
  
//  void logic(String uname,String pwd){
//    try {  
//        RandomAccessFile raf = new RandomAccessFile(f+"\\login.txt","rw");
//        
//        for(int i=0;i<ln;i+=3){
//            System.out.println("count "+i);
//            String forUser = raf.readLine().substring(10);
//            String forPswd = raf.readLine().substring(10); 
//           
//            if(uname.equals(forUser)& pwd.equals(forPswd))
//            {
//             
//             new Main().setVisible(true);
//            setVisible(false);
//             break;
//            }else if(i==(ln-1)){
//             JOptionPane.showMessageDialog(null,"Incorrect username/Password "+"\n"+ "Sign in if you are a new user");
//
//            }
//            for(int k=1;k<=0;k++)
//            {
//                raf.readLine();
//               
//            }
//        }
//    } catch (FileNotFoundException ex) {
//        Logger.getLogger(Loginpage.class.getName()).log(Level.SEVERE, null, ex);
//    } catch (IOException ex) {
//        Logger.getLogger(Loginpage.class.getName()).log(Level.SEVERE, null, ex);
//    }
//  }
  
//     void countLines(){
//    try {
//        ln=1;
//        RandomAccessFile raf= new RandomAccessFile(f+"\\login.txt","rw");
//        for(int i=0;raf.readLine()!=null;i++)
//        {
//            ln++;
//        }
//        System.out.println("Number of lines: "+ ln);
//         
//    } catch (FileNotFoundException ex) {
//        Logger.getLogger(Loginpage.class.getName()).log(Level.SEVERE, null, ex);
//    } catch (IOException ex) {
//        Logger.getLogger(Loginpage.class.getName()).log(Level.SEVERE, null, ex);
//    }
//      
//  }
  
 
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        uname = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        clr = new javax.swing.JButton();
        pwd = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        jButton1.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        jPanel1.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 120, -1));

        jButton2.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        jButton2.setText("Sign in");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        jLabel4.setText("If New User: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 90, 23));

        clr.setFont(new java.awt.Font("Comfortaa", 0, 14)); // NOI18N
        clr.setText("Clear All");
        clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrActionPerformed(evt);
            }
        });
        jPanel1.add(clr, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));
        jPanel1.add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 120, -1));

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Comfortaa", 1, 24)); // NOI18N
        jLabel1.setText("LOGIN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(315, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 760, 80));

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 750, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\background image.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 790, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrActionPerformed
        // TODO add your handling code here:
        uname.setText("");
        pwd.setText("");
    }//GEN-LAST:event_clrActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new SigninPage().setVisible(true);
        setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           String username = uname.getText();
        String password = new String(pwd.getPassword());
        
          
        boolean loginSuccessful = checkLogin(username, password);
        
        if (loginSuccessful) {
            JOptionPane.showMessageDialog(null, "Login successful!");
              new Main().setVisible(true);
               setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect username/Password"+"\n"+"Sign in if you are a new user");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        createFolder();
//        readFile();
//        countLines();
//        
//        logic(uname.getText(),pwd.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables

    private JLabel setText(String numberString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
