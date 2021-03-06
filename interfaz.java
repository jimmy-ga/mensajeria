import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import sincro.consola;
import java.util.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mari
 */
public class interfaz extends javax.swing.JFrame {

    /**
     * Creates new form inter
     */
    public interfaz() {
        initComponents();
        botones_direc.add(directo);
        botones_direc.add(indirecto);
        grupo_receive.add(explicito);
        grupo_receive.add(implicito);
        grupo_indirecto.add(dinamico);
        grupo_indirecto.add(estatico);
        grupo_largo.add(fijo);
        grupo_largo.add(variable);
        grupo_colas.add(fifo);
        grupo_colas.add(prioridad);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        botones_direc = new javax.swing.ButtonGroup();
        grupo_receive = new javax.swing.ButtonGroup();
        grupo_indirecto = new javax.swing.ButtonGroup();
        grupo_largo = new javax.swing.ButtonGroup();
        grupo_colas = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        directo = new javax.swing.JRadioButton();
        indirecto = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        explicito = new javax.swing.JRadioButton();
        implicito = new javax.swing.JRadioButton();
        dinamico = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        contenido = new javax.swing.JTextField();
        fijo = new javax.swing.JRadioButton();
        variable = new javax.swing.JRadioButton();
        largo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        estatico = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        prioridad = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        fifo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new AbsoluteLayout());

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new AbsoluteConstraints(400, 390, 97, 38));

        directo.setText("Directo");
        directo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                directoStateChanged(evt);
            }
        });
        directo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                directoMouseClicked(evt);
            }
        });
        directo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directoActionPerformed(evt);
            }
        });
        getContentPane().add(directo, new AbsoluteConstraints(79, 52, -1, -1));

        indirecto.setText("Indirecto");
        indirecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                indirectoMouseClicked(evt);
            }
        });
        getContentPane().add(indirecto, new AbsoluteConstraints(290, 50, -1, -1));

        jLabel2.setText("Send");
        getContentPane().add(jLabel2, new AbsoluteConstraints(134, 79, -1, -1));

        jLabel3.setText("Receive");
        getContentPane().add(jLabel3, new AbsoluteConstraints(134, 102, -1, -1));

        explicito.setText("Explicito");
        explicito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                explicitoMouseClicked(evt);
            }
        });
        getContentPane().add(explicito, new AbsoluteConstraints(154, 121, -1, -1));

        implicito.setText("Implicito");
        implicito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                implicitoMouseClicked(evt);
            }
        });
        getContentPane().add(implicito, new AbsoluteConstraints(154, 144, -1, -1));

        dinamico.setText("Dinamico");
        dinamico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dinamicoMouseClicked(evt);
            }
        });
        dinamico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dinamicoActionPerformed(evt);
            }
        });
        getContentPane().add(dinamico, new AbsoluteConstraints(320, 100, -1, -1));

        jLabel5.setText("Contenido");
        getContentPane().add(jLabel5, new AbsoluteConstraints(80, 220, -1, -1));

        jLabel6.setText("Largo");
        getContentPane().add(jLabel6, new AbsoluteConstraints(80, 240, -1, -1));
        getContentPane().add(contenido, new AbsoluteConstraints(140, 220, 81, -1));

        fijo.setText("Fijo");
        fijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fijoActionPerformed(evt);
            }
        });
        getContentPane().add(fijo, new AbsoluteConstraints(90, 260, -1, -1));

        variable.setText("Variable");
        getContentPane().add(variable, new AbsoluteConstraints(90, 290, -1, -1));
        getContentPane().add(largo, new AbsoluteConstraints(140, 260, 30, 20));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Direccionamiento"));

        estatico.setText("Estatico");
        estatico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estaticoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addComponent(estatico)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(estatico)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new AbsoluteConstraints(50, 20, 370, 160));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Formato"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new AbsoluteConstraints(50, 200, 250, 120));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Manejo de Colas"));

        prioridad.setText("Prioridad");

        jLabel8.setText("(minima 1, maxima 5)");

        fifo.setText("FIFO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fifo)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(prioridad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(fifo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prioridad)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new AbsoluteConstraints(50, 340, 250, 90));

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        ArrayList<String> valores = new ArrayList<String>();
        String cont = contenido.getText();
        String large = largo.getText();

        if (directo.isSelected() && explicito.isSelected()) {
            valores.add("directo"); // Añade el valor al ArrayList
            valores.add("explicito");
        }
        if (directo.isSelected() && implicito.isSelected()) {
            valores.add("directo");
            valores.add("implicito");
        }
        if (indirecto.isSelected() && estatico.isSelected()) {
            valores.add("indirecto");
            valores.add("estatico");
        }
        if (indirecto.isSelected() && dinamico.isSelected()) {
            valores.add("indirecto");
            valores.add("dinamico");
        }

        if(fijo.isSelected()) {
            valores.add("fijo");
            valores.add(large);
        }
        if (variable.isSelected()) {
            valores.add("variable");
        }
        if (fifo.isSelected()) {
            valores.add("fifo");
        }
        if (prioridad.isSelected()) {
            valores.add("prioridad");
        }

        else{
            valores.add(cont);
        }
		if (directo.isSelected() == false && indirecto.isSelected() == false){
			JOptionPane.showMessageDialog(null,"Debe escoger un tipo de direccionamiento.");
		}
		else if (fijo.isSelected() == false && variable.isSelected() == false){
			JOptionPane.showMessageDialog(null,"Debe escoger un tipo de largo de formato.");
		}
		else if (fifo.isSelected() == false && prioridad.isSelected() == false){
			JOptionPane.showMessageDialog(null,"Debe escoger un tipo de manejo de colas.");
		}
		else if (indirecto.isSelected() && estatico.isSelected() == false && dinamico.isSelected() == false){
			JOptionPane.showMessageDialog(null,"Debe escoger un tipo de direccionamiento indirecto.");
		}
		else if (directo.isSelected() && explicito.isSelected() == false && implicito.isSelected() == false){
			JOptionPane.showMessageDialog(null,"Debe escoger un tipo de direccionamiento directo.");
		}
        else if(fijo.isSelected() && largo.getText().length()==0){
		            JOptionPane.showMessageDialog(null,"Debe ingresar un largo.");
        }
        else if (contenido.getText().length() == 0){
		            JOptionPane.showMessageDialog(null,"Debe ingresar un contenido.");
        }
        else{
		try {
			//System.out.println(valores);
        consola v = new consola();
        this.setVisible(false);
			v.crear(valores);

		} catch (IOException ex) {
			Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}

    private void directoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void fijoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void directoStateChanged(javax.swing.event.ChangeEvent evt) {

    }

    private void directoMouseClicked(java.awt.event.MouseEvent evt) {
        dinamico.setEnabled(false);
        estatico.setEnabled(false);
        implicito.setEnabled(true);
        explicito.setEnabled(true);
    }

    private void indirectoMouseClicked(java.awt.event.MouseEvent evt) {
        dinamico.setEnabled(true);
        estatico.setEnabled(true);
        implicito.setEnabled(false);
        explicito.setEnabled(false);
    }

    private void explicitoMouseClicked(java.awt.event.MouseEvent evt) {
        indirecto.setEnabled(false);
        dinamico.setEnabled(false);
        estatico.setEnabled(false);
        implicito.setEnabled(true);
        explicito.setEnabled(true);    }

    private void implicitoMouseClicked(java.awt.event.MouseEvent evt) {
        indirecto.setEnabled(false);
        dinamico.setEnabled(false);
        estatico.setEnabled(false);
        implicito.setEnabled(true);
        explicito.setEnabled(true);    }

    private void estaticoMouseClicked(java.awt.event.MouseEvent evt) {
        directo.setEnabled(false);
        dinamico.setEnabled(true);
        estatico.setEnabled(true);
        implicito.setEnabled(false);
        explicito.setEnabled(false);    }

    private void dinamicoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void dinamicoMouseClicked(java.awt.event.MouseEvent evt) {
        directo.setEnabled(false);
        dinamico.setEnabled(true);
        estatico.setEnabled(true);
        implicito.setEnabled(false);
        explicito.setEnabled(false);     }

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.ButtonGroup botones_direc;
    private javax.swing.JTextField contenido;
    private javax.swing.JRadioButton dinamico;
    private javax.swing.JRadioButton directo;
    private javax.swing.JRadioButton estatico;
    private javax.swing.JRadioButton explicito;
    private javax.swing.JRadioButton fifo;
    private javax.swing.JRadioButton fijo;
    private javax.swing.ButtonGroup grupo_colas;
    private javax.swing.ButtonGroup grupo_indirecto;
    private javax.swing.ButtonGroup grupo_largo;
    private javax.swing.ButtonGroup grupo_receive;
    private javax.swing.JRadioButton implicito;
    private javax.swing.JRadioButton indirecto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField largo;
    private javax.swing.JRadioButton prioridad;
    private javax.swing.JRadioButton variable;
    // End of variables declaration
}
