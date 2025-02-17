/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pokemon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Listas extends javax.swing.JFrame {

    /**
     * Creates new form Listas
     */
    private final DefaultListModel<String> modeloMochila;
    private final DefaultListModel<String> modeloLista;
    public Listas() {
        initComponents();
        modeloLista = new DefaultListModel<>();
listaMochila.setModel(modeloLista);

modeloMochila = new DefaultListModel<>();
listaPokemon.setModel(modeloMochila);

// Adiciona alguns Pokémons iniciais na mochila
modeloMochila.addElement("Pikachu – Elétrico – Nível 10");
modeloMochila.addElement("Charmander – Fogo – Nível 8");
modeloMochila.addElement("Squirtle – Água – Nível 7");

listaPokemon.addMouseListener(new MouseAdapter() {
    public void mouseClicked(MouseEvent evt) {
        if (evt.getClickCount() == 2) { // Clique duplo na lista
            mostrarDetalhesPokemon();
        }
    }
            private void mostrarDetalhesPokemon() {
            }
        });
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaMochila = new javax.swing.JList<>();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPokemon = new javax.swing.JList<>();
        btnMochila = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanel.setBackground(new java.awt.Color(153, 153, 153));

        listaMochila.setBackground(new java.awt.Color(255, 0, 0));
        jScrollPane1.setViewportView(listaMochila);

        btnAdicionar.setBackground(new java.awt.Color(0, 0, 0));
        btnAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionar.setText("Jogar Pokebola");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setBackground(new java.awt.Color(0, 0, 0));
        btnRemover.setForeground(new java.awt.Color(255, 255, 255));
        btnRemover.setText("Guardar Pokemon");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(listaPokemon);

        btnMochila.setBackground(new java.awt.Color(0, 0, 0));
        btnMochila.setForeground(new java.awt.Color(242, 242, 242));
        btnMochila.setText("Ver Mochila");

        javax.swing.GroupLayout JPanelLayout = new javax.swing.GroupLayout(JPanel);
        JPanel.setLayout(JPanelLayout);
        JPanelLayout.setHorizontalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btnMochila, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(JPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        JPanelLayout.setVerticalGroup(
            JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnRemover)
                    .addComponent(btnMochila))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
int selectedIndex = listaPokemon.getSelectedIndex(); // Obtém o índice do Pokémon selecionado
    if (selectedIndex != -1 && modeloLista.size() < 6) { // Limite de 6 Pokémons
        String pokemon = modeloMochila.getElementAt(selectedIndex); // Pega o Pokémon
        modeloMochila.remove(selectedIndex); // Remove da mochila
        modeloLista.addElement(pokemon); // Adiciona ao campo de batalha
    } else {
        JOptionPane.showMessageDialog(this, "Você só pode ter até 6 Pokémons no campo de batalha!", "Limite atingido", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
      int selectedIndex = listaMochila.getSelectedIndex(); // Obtém o índice do Pokémon
    if (selectedIndex != -1) { // Verifica se algo foi selecionado
        String pokemon = modeloLista.getElementAt(selectedIndex); // Pega o Pokémon
        modeloLista.remove(selectedIndex); // Remove do campo de batalha
        modeloMochila.addElement(pokemon); // Adiciona de volta à mochila
    }
    }//GEN-LAST:event_btnRemoverActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Listas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnMochila;
    private javax.swing.JButton btnRemover;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaMochila;
    private javax.swing.JList<String> listaPokemon;
    // End of variables declaration//GEN-END:variables
}
