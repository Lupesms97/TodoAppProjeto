/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.view;
import java.awt.Color;
import java.awt.Font;
/**
 *
 * @author lupes
 */
public class TelaTodoApp extends javax.swing.JFrame {

	/**
	 * Creates new form TelaTodoApp
	 */
	public TelaTodoApp() {
		initComponents();
		decorateTableTask();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                PainelListaVazia = new javax.swing.JPanel();
                txtPainelListaVaziaStatus = new javax.swing.JLabel();
                PainelListaVaziaIcon = new javax.swing.JLabel();
                PainelListaVaziaOrientacao = new javax.swing.JLabel();
                painelPrincipal = new javax.swing.JPanel();
                tituloPP = new javax.swing.JLabel();
                sloganPP = new javax.swing.JLabel();
                iconePP = new javax.swing.JLabel();
                painelProjeto = new javax.swing.JPanel();
                txtPainelProjetos = new javax.swing.JLabel();
                iconePainelProjeto = new javax.swing.JLabel();
                painelTarefa = new javax.swing.JPanel();
                txtPainelTarefas = new javax.swing.JLabel();
                iconPainelTarefas = new javax.swing.JLabel();
                painelListaBase = new javax.swing.JPanel();
                painelLista = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jList1 = new javax.swing.JList<>();
                PainelListaVaziaBase = new javax.swing.JPanel();
                jScrollPane2 = new javax.swing.JScrollPane();
                JTableTask = new javax.swing.JTable();

                PainelListaVazia.setBackground(new java.awt.Color(255, 255, 255));

                javax.swing.GroupLayout PainelListaVaziaLayout = new javax.swing.GroupLayout(PainelListaVazia);
                PainelListaVazia.setLayout(PainelListaVaziaLayout);
                PainelListaVaziaLayout.setHorizontalGroup(
                        PainelListaVaziaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 456, Short.MAX_VALUE)
                );
                PainelListaVaziaLayout.setVerticalGroup(
                        PainelListaVaziaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 227, Short.MAX_VALUE)
                );

                txtPainelListaVaziaStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                txtPainelListaVaziaStatus.setForeground(new java.awt.Color(153, 153, 255));
                txtPainelListaVaziaStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                txtPainelListaVaziaStatus.setText("Nenhuma tarefa por aqui");
                txtPainelListaVaziaStatus.setToolTipText("");

                PainelListaVaziaIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                PainelListaVaziaIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-clipboard-96.png"))); // NOI18N

                PainelListaVaziaOrientacao.setForeground(new java.awt.Color(153, 153, 153));
                PainelListaVaziaOrientacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                PainelListaVaziaOrientacao.setText("Clique no botão mais para adicionar um nova tarefa");

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setMinimumSize(new java.awt.Dimension(700, 800));

                painelPrincipal.setBackground(new java.awt.Color(153, 153, 255));
                painelPrincipal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

                tituloPP.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
                tituloPP.setForeground(new java.awt.Color(255, 255, 255));
                tituloPP.setText("TodoApp");

                sloganPP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                sloganPP.setForeground(new java.awt.Color(255, 255, 255));
                sloganPP.setText("Anote tudo, não esqueça nada!");

                iconePP.setForeground(new java.awt.Color(255, 255, 255));
                iconePP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/check.png"))); // NOI18N
                iconePP.setToolTipText("");

                javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
                painelPrincipal.setLayout(painelPrincipalLayout);
                painelPrincipalLayout.setHorizontalGroup(
                        painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(iconePP)
                                .addGap(18, 18, 18)
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(painelPrincipalLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(sloganPP))
                                        .addComponent(tituloPP))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                painelPrincipalLayout.setVerticalGroup(
                        painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tituloPP)
                                        .addComponent(iconePP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sloganPP)
                                .addContainerGap(12, Short.MAX_VALUE))
                );

                painelProjeto.setBackground(new java.awt.Color(255, 255, 255));
                painelProjeto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

                txtPainelProjetos.setBackground(new java.awt.Color(153, 153, 255));
                txtPainelProjetos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                txtPainelProjetos.setForeground(new java.awt.Color(153, 153, 255));
                txtPainelProjetos.setText("Projetos");

                iconePainelProjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-48.png"))); // NOI18N
                iconePainelProjeto.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                iconePainelProjetoMouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout painelProjetoLayout = new javax.swing.GroupLayout(painelProjeto);
                painelProjeto.setLayout(painelProjetoLayout);
                painelProjetoLayout.setHorizontalGroup(
                        painelProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelProjetoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtPainelProjetos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(iconePainelProjeto)
                                .addContainerGap())
                );
                painelProjetoLayout.setVerticalGroup(
                        painelProjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelProjetoLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPainelProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                        .addGroup(painelProjetoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(iconePainelProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                painelTarefa.setBackground(new java.awt.Color(255, 255, 255));
                painelTarefa.setBorder(javax.swing.BorderFactory.createEtchedBorder());

                txtPainelTarefas.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
                txtPainelTarefas.setForeground(new java.awt.Color(153, 153, 255));
                txtPainelTarefas.setText("Tarefas");

                iconPainelTarefas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-plus-48.png"))); // NOI18N
                iconPainelTarefas.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                iconPainelTarefasMouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout painelTarefaLayout = new javax.swing.GroupLayout(painelTarefa);
                painelTarefa.setLayout(painelTarefaLayout);
                painelTarefaLayout.setHorizontalGroup(
                        painelTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelTarefaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtPainelTarefas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(iconPainelTarefas)
                                .addGap(14, 14, 14))
                );
                painelTarefaLayout.setVerticalGroup(
                        painelTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelTarefaLayout.createSequentialGroup()
                                .addComponent(iconPainelTarefas)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(painelTarefaLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(txtPainelTarefas)
                                .addContainerGap())
                );

                painelListaBase.setBackground(new java.awt.Color(255, 255, 255));
                painelListaBase.setBorder(javax.swing.BorderFactory.createEtchedBorder());

                painelLista.setBackground(new java.awt.Color(255, 255, 255));

                jList1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                jList1.setModel(new javax.swing.AbstractListModel<String>() {
                        String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
                        public int getSize() { return strings.length; }
                        public String getElementAt(int i) { return strings[i]; }
                });
                jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
                jList1.setFixedCellHeight(50);
                jList1.setSelectionBackground(new java.awt.Color(153, 153, 255));
                jList1.setSelectionForeground(new java.awt.Color(153, 51, 255));
                jScrollPane1.setViewportView(jList1);

                javax.swing.GroupLayout painelListaLayout = new javax.swing.GroupLayout(painelLista);
                painelLista.setLayout(painelListaLayout);
                painelListaLayout.setHorizontalGroup(
                        painelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                );
                painelListaLayout.setVerticalGroup(
                        painelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                );

                javax.swing.GroupLayout painelListaBaseLayout = new javax.swing.GroupLayout(painelListaBase);
                painelListaBase.setLayout(painelListaBaseLayout);
                painelListaBaseLayout.setHorizontalGroup(
                        painelListaBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelListaBaseLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(painelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );
                painelListaBaseLayout.setVerticalGroup(
                        painelListaBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(painelListaBaseLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(painelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );

                PainelListaVaziaBase.setBackground(new java.awt.Color(255, 255, 255));
                PainelListaVaziaBase.setBorder(javax.swing.BorderFactory.createEtchedBorder());

                JTableTask.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null}
                        },
                        new String [] {
                                "Nome", "Descrição", "Praze", "Concluido"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
                        };
                        boolean[] canEdit = new boolean [] {
                                false, false, false, true
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                JTableTask.setGridColor(new java.awt.Color(255, 255, 255));
                JTableTask.setRowHeight(50);
                JTableTask.setSelectionBackground(new java.awt.Color(153, 153, 255));
                JTableTask.setSelectionForeground(new java.awt.Color(153, 51, 255));
                JTableTask.setShowHorizontalLines(true);
                jScrollPane2.setViewportView(JTableTask);

                javax.swing.GroupLayout PainelListaVaziaBaseLayout = new javax.swing.GroupLayout(PainelListaVaziaBase);
                PainelListaVaziaBase.setLayout(PainelListaVaziaBaseLayout);
                PainelListaVaziaBaseLayout.setHorizontalGroup(
                        PainelListaVaziaBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                );
                PainelListaVaziaBaseLayout.setVerticalGroup(
                        PainelListaVaziaBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2)
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(painelProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(painelListaBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(painelTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(PainelListaVaziaBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(painelProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(painelTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PainelListaVaziaBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(painelListaBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void iconePainelProjetoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconePainelProjetoMouseClicked
            TelaCadastroProjetosJDiolog telaCadastroProjeto = new TelaCadastroProjetosJDiolog(this, rootPaneCheckingEnabled);
            telaCadastroProjeto.setVisible(true);
        }//GEN-LAST:event_iconePainelProjetoMouseClicked

        private void iconPainelTarefasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconPainelTarefasMouseClicked
            TelaCadastroTarefasJDialog telaCadastroTarefas = new TelaCadastroTarefasJDialog(this, rootPaneCheckingEnabled);
            telaCadastroTarefas.setProject(null);
            telaCadastroTarefas.setVisible(true);

        }//GEN-LAST:event_iconPainelTarefasMouseClicked

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
				if ("Java swing".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(TelaTodoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TelaTodoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TelaTodoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TelaTodoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TelaTodoApp().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JTable JTableTask;
        private javax.swing.JPanel PainelListaVazia;
        private javax.swing.JPanel PainelListaVaziaBase;
        private javax.swing.JLabel PainelListaVaziaIcon;
        private javax.swing.JLabel PainelListaVaziaOrientacao;
        private javax.swing.JLabel iconPainelTarefas;
        private javax.swing.JLabel iconePP;
        private javax.swing.JLabel iconePainelProjeto;
        private javax.swing.JList<String> jList1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JPanel painelLista;
        private javax.swing.JPanel painelListaBase;
        private javax.swing.JPanel painelPrincipal;
        private javax.swing.JPanel painelProjeto;
        private javax.swing.JPanel painelTarefa;
        private javax.swing.JLabel sloganPP;
        private javax.swing.JLabel tituloPP;
        private javax.swing.JLabel txtPainelListaVaziaStatus;
        private javax.swing.JLabel txtPainelProjetos;
        private javax.swing.JLabel txtPainelTarefas;
        // End of variables declaration//GEN-END:variables

	/**
	 *
	 */
public void decorateTableTask(){
	
	
	JTableTask.getTableHeader().setFont(new Font("Serge UI", Font.BOLD, 14));
	JTableTask.getTableHeader().setBackground(new Color(153, 153, 255));
	JTableTask.getTableHeader().setForeground(new Color(153, 51,255 ));
	
	JTableTask.setAutoCreateRowSorter(true);
}
}