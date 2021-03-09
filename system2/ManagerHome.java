
package meal.management.system2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ManagerHome extends javax.swing.JFrame {
    String userId, idM, nameM, phoneM, desigM, infoM;

    
    public ManagerHome() {
        initComponents();
    }

	public void deleteAllInfo(){

		preserveManagerAtMember();

		String query1 = "delete FROM `member` ;";    
		String query2 = "delete FROM `login` ;"; 
		String query3 = "delete FROM `Bazar` ;";
		String query4 = "delete FROM `Meal` ;";
		System.out.println(query1);
		System.out.println(query2);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sayed", "root", "");
			Statement stm = con.createStatement();
			

			stm.executeUpdate(query1);
			System.out.println("raihan");
			stm.executeUpdate(query2);
			stm.executeUpdate(query3);
			stm.executeUpdate(query4);
			
			stm.close();
			con.close();

			//insertIntoDB();
			JOptionPane.showMessageDialog(this, "Success !!!");
			
			
		}
        catch(Exception ex)
		{
			JOptionPane.showMessageDialog(this, "Oops !!!");
        }

	}
        public void preserveManagerAtMember()
	{	String manager2 = "Manager";

		String query = "SELECT `UserId`, `Name`, `PhoneNumber`, `Designation`, `Info` FROM `member` where `Designation` = '"+manager2+"' ;";     
        Connection con=null;//for connection
        Statement st = null;//for query execution
		ResultSet rs = null;//to get row by row result from DB
		System.out.println(query);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");//load driver
			System.out.println("driver loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sayed","root","");
			System.out.println("connection done");//connection with database established
			st = con.createStatement();//create statement
			System.out.println("statement created");
			rs = st.executeQuery(query);//getting result
			System.out.println("results received");
					
			while(rs.next()){
				idM = rs.getString("UserId");
				nameM = rs.getString("Name");
				phoneM = rs.getString("PhoneNumber");
				desigM = rs.getString("Designation");
				infoM = rs.getString("Info");
				System.out.println(idM + "   "+ nameM + "    "+desigM);
			}

               
			
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
        finally
		{
            try
			{
                if(rs!=null)
					rs.close();

                if(st!=null)
					st.close();

                if(con!=null)
					con.close();
            }
            catch(Exception ex){}
        }
	}
        
        public void insertIntoDB()
	{
		
		int status = 1;

		
		
		
		String query1 = "INSERT INTO member VALUES ('"+idM+"','"+nameM+"','"+ phoneM+"','"+desigM+"','"+infoM+"');";
		String query2 = "INSERT INTO login VALUES ('"+idM+"','"+idM+"',"+status+");";
		System.out.println(query1);
		System.out.println(query2);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sayed","root","");
			System.out.println("Okay");
			Statement stm = con.createStatement();
			System.out.println("Okay2");
			stm.executeUpdate(query1);
			System.out.println("Okay3");
			stm.executeUpdate(query2);
			System.out.println("Okay4");
			stm.close();
			con.close();
			//JOptionPane.showMessageDialog(this, "Success !!!");
		}
        catch(Exception ex)
		{
			JOptionPane.showMessageDialog(this, "Oops !!!");
        }
    }
        
        


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addMemberBtn = new javax.swing.JButton();
        entryMealBtn = new javax.swing.JButton();
        editMealBtn = new javax.swing.JButton();
        mealHistoryBtn = new javax.swing.JButton();
        entryBazarBtn = new javax.swing.JButton();
        editBazarBtn = new javax.swing.JButton();
        bazarHistoryBtn = new javax.swing.JButton();
        deleteMemberBtn = new javax.swing.JButton();
        financeHistoryBtn = new javax.swing.JButton();
        deleteAllBtn = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        exitbtn2 = new javax.swing.JButton();
        signOutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addMemberBtn.setText("Add Member");
        addMemberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemberBtnActionPerformed(evt);
            }
        });

        entryMealBtn.setText("Entry Meal");
        entryMealBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryMealBtnActionPerformed(evt);
            }
        });

        editMealBtn.setText("Edit Meal");
        editMealBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMealBtnActionPerformed(evt);
            }
        });

        mealHistoryBtn.setText("Meal History");
        mealHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mealHistoryBtnActionPerformed(evt);
            }
        });

        entryBazarBtn.setText("Entry Bazar");
        entryBazarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryBazarBtnActionPerformed(evt);
            }
        });

        editBazarBtn.setText("Edit Bazar");
        editBazarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBazarBtnActionPerformed(evt);
            }
        });

        bazarHistoryBtn.setText("Bazar History");
        bazarHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bazarHistoryBtnActionPerformed(evt);
            }
        });

        deleteMemberBtn.setText("Delete Member");
        deleteMemberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMemberBtnActionPerformed(evt);
            }
        });

        financeHistoryBtn.setText("Finance History");
        financeHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                financeHistoryBtnActionPerformed(evt);
            }
        });

        deleteAllBtn.setText("Delete All Info");
        deleteAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAllBtnActionPerformed(evt);
            }
        });

        jButton11.setText("View All Member");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        exitbtn2.setText("Exit");
        exitbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtn2ActionPerformed(evt);
            }
        });

        signOutBtn.setText("Sign Out");
        signOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(entryMealBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addMemberBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(mealHistoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(editMealBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(deleteAllBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(financeHistoryBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deleteMemberBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bazarHistoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(entryBazarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBazarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(149, 149, 149))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(exitbtn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signOutBtn)
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addMemberBtn)
                            .addComponent(entryBazarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(entryMealBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editBazarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editMealBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bazarHistoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mealHistoryBtn)
                            .addComponent(deleteMemberBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exitbtn2)
                            .addComponent(signOutBtn))
                        .addGap(121, 121, 121))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(financeHistoryBtn)
                        .addGap(18, 18, 18)
                        .addComponent(deleteAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11)
                        .addGap(308, 308, 308))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutBtnActionPerformed
        // TODO add your handling code here:
        Login ln = new Login();
        ln.setVisible(true);
        dispose();
    }//GEN-LAST:event_signOutBtnActionPerformed

    private void exitbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtn2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitbtn2ActionPerformed

    private void deleteAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAllBtnActionPerformed
        
        deleteAllInfo();
        insertIntoDB();
        
        /*Login ln = new Login();
        ln.setVisible(true);
        dispose();*/
    }//GEN-LAST:event_deleteAllBtnActionPerformed

    private void financeHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_financeHistoryBtnActionPerformed
        FinanceSummary fs = new FinanceSummary();
        fs.setVisible(true);
        dispose();
    }//GEN-LAST:event_financeHistoryBtnActionPerformed

    private void editBazarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBazarBtnActionPerformed
        EditBazar eb = new EditBazar();
        eb.setVisible(true);
        dispose();
    }//GEN-LAST:event_editBazarBtnActionPerformed

    private void entryBazarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryBazarBtnActionPerformed
        EntryBazar eb = new EntryBazar();
        eb.setVisible(true);
        dispose();
    }//GEN-LAST:event_entryBazarBtnActionPerformed

    private void mealHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mealHistoryBtnActionPerformed
        MealHistory mh = new MealHistory();
        mh.setVisible(true);
        dispose();
    }//GEN-LAST:event_mealHistoryBtnActionPerformed

    private void editMealBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMealBtnActionPerformed
        EditMeal em = new EditMeal();
        em.setVisible(true);
        dispose();
    }//GEN-LAST:event_editMealBtnActionPerformed

    private void entryMealBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryMealBtnActionPerformed
        // TODO add your handling code here:
        EntryMeal em = new EntryMeal();
        em.setVisible(true);
        dispose();
    }//GEN-LAST:event_entryMealBtnActionPerformed

    private void addMemberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemberBtnActionPerformed
        // TODO add your handling code here:
        AddMember am = new AddMember();
        am.setVisible(true);
        dispose();
    }//GEN-LAST:event_addMemberBtnActionPerformed

    private void bazarHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bazarHistoryBtnActionPerformed
        // TODO add your handling code here:
        BalanceHistory bh= new BalanceHistory();
        bh.setVisible(true);
        dispose();
    }//GEN-LAST:event_bazarHistoryBtnActionPerformed

    private void deleteMemberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMemberBtnActionPerformed
        // TODO add your handling code here:
        DeleteMember dm = new DeleteMember();
        dm.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_deleteMemberBtnActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       
        ViewALLMember VM = new ViewALLMember();
        VM.setVisible(true);
        dispose();
        
        
        
       // sm.setVisible(true);
        //dispose();
        
          
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMemberBtn;
    private javax.swing.JButton bazarHistoryBtn;
    private javax.swing.JButton deleteAllBtn;
    private javax.swing.JButton deleteMemberBtn;
    private javax.swing.JButton editBazarBtn;
    private javax.swing.JButton editMealBtn;
    private javax.swing.JButton entryBazarBtn;
    private javax.swing.JButton entryMealBtn;
    private javax.swing.JButton exitbtn2;
    private javax.swing.JButton financeHistoryBtn;
    private javax.swing.JButton jButton11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mealHistoryBtn;
    private javax.swing.JButton signOutBtn;
    // End of variables declaration//GEN-END:variables
}
