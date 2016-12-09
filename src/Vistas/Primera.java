/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Facade.FacadeInter;
import Facade.MainFacade;
import utiles.MyFactory;

public class Primera extends javax.swing.JFrame {

    FacadeInter facade = (MainFacade) MyFactory.getObject("FACADE");

    public Primera() {
        initComponents();
        //AQUI LA CARGA DE LAS TABLAS
        TablaAlumno.setModel(facade.todoAlumnos());
        TablaProfesor.setModel(facade.todoProfes());
        TablaAsignatura.setModel(facade.todoAsignaturas());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelAlumno = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaAlumno = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        btnAgregarAlumno = new javax.swing.JButton();
        btnActualizarAlumno = new javax.swing.JButton();
        btnBorrarAlumno = new javax.swing.JButton();
        btnRefreshAlumno = new javax.swing.JButton();
        PanelProfesor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProfesor = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        btnAgregarProfesor = new javax.swing.JButton();
        btnActualizarProfesor = new javax.swing.JButton();
        btnBorrarProfesor = new javax.swing.JButton();
        btnRefreshProfesores = new javax.swing.JButton();
        PanelAsignatura = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaAsignatura = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        btnAgregarAsignatura = new javax.swing.JButton();
        btnActualizarAsignatura = new javax.swing.JButton();
        btnBorrarAsignatura = new javax.swing.JButton();
        btnRefreshAsignatura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TablaAlumno);

        jPanel5.setLayout(new java.awt.GridLayout(0, 4));

        btnAgregarAlumno.setText("Agregar");
        jPanel5.add(btnAgregarAlumno);

        btnActualizarAlumno.setText("Modificar");
        jPanel5.add(btnActualizarAlumno);

        btnBorrarAlumno.setText("Borrar");
        jPanel5.add(btnBorrarAlumno);

        btnRefreshAlumno.setText("REFRESH");
        btnRefreshAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshAlumnoActionPerformed(evt);
            }
        });
        jPanel5.add(btnRefreshAlumno);

        javax.swing.GroupLayout PanelAlumnoLayout = new javax.swing.GroupLayout(PanelAlumno);
        PanelAlumno.setLayout(PanelAlumnoLayout);
        PanelAlumnoLayout.setHorizontalGroup(
            PanelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelAlumnoLayout.setVerticalGroup(
            PanelAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAlumnoLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Alumnos", PanelAlumno);

        TablaProfesor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TablaProfesor);

        jPanel7.setLayout(new java.awt.GridLayout(0, 4));

        btnAgregarProfesor.setText("Agregar");
        btnAgregarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProfesorActionPerformed(evt);
            }
        });
        jPanel7.add(btnAgregarProfesor);

        btnActualizarProfesor.setText("Modificar");
        btnActualizarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProfesorActionPerformed(evt);
            }
        });
        jPanel7.add(btnActualizarProfesor);

        btnBorrarProfesor.setText("Borrar");
        btnBorrarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarProfesorActionPerformed(evt);
            }
        });
        jPanel7.add(btnBorrarProfesor);

        btnRefreshProfesores.setText("REFRESH");
        btnRefreshProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshProfesoresActionPerformed(evt);
            }
        });
        jPanel7.add(btnRefreshProfesores);

        javax.swing.GroupLayout PanelProfesorLayout = new javax.swing.GroupLayout(PanelProfesor);
        PanelProfesor.setLayout(PanelProfesorLayout);
        PanelProfesorLayout.setHorizontalGroup(
            PanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelProfesorLayout.setVerticalGroup(
            PanelProfesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelProfesorLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Profesores", PanelProfesor);

        TablaAsignatura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(TablaAsignatura);

        jPanel6.setLayout(new java.awt.GridLayout(0, 4));

        btnAgregarAsignatura.setText("Agregar");
        jPanel6.add(btnAgregarAsignatura);

        btnActualizarAsignatura.setText("Modificar");
        jPanel6.add(btnActualizarAsignatura);

        btnBorrarAsignatura.setText("Borrar");
        jPanel6.add(btnBorrarAsignatura);

        btnRefreshAsignatura.setText("RESFRESH");
        btnRefreshAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshAsignaturaActionPerformed(evt);
            }
        });
        jPanel6.add(btnRefreshAsignatura);

        javax.swing.GroupLayout PanelAsignaturaLayout = new javax.swing.GroupLayout(PanelAsignatura);
        PanelAsignatura.setLayout(PanelAsignaturaLayout);
        PanelAsignaturaLayout.setHorizontalGroup(
            PanelAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelAsignaturaLayout.setVerticalGroup(
            PanelAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAsignaturaLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Asignaturas", PanelAsignatura);
        PanelAsignatura.getAccessibleContext().setAccessibleName("Asignaturas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProfesorActionPerformed
        int aux = TablaProfesor.getSelectedRow();
        DialogProfesor JDProfesor = new DialogProfesor(this, true);

        //dni
        JDProfesor.txtDni.setText(TablaProfesor.getValueAt(aux, 0).toString());
        //nombre
        JDProfesor.txtNombre.setText(TablaProfesor.getValueAt(aux, 1).toString());
        //apellidos
        JDProfesor.txtApellidos.setText(TablaProfesor.getValueAt(aux, 2).toString());
        //domicilio
        JDProfesor.txtDomicilio.setText(TablaProfesor.getValueAt(aux, 3).toString());
        //telefono
        JDProfesor.txtTelefono.setText(TablaProfesor.getValueAt(aux, 4).toString());
        //asignaturas 5 - 10
        if (TablaProfesor.getValueAt(aux, 5) == null) {
            JDProfesor.txtAsig1.setText("asignatura 1");
        } else {
            JDProfesor.txtAsig1.setText(TablaProfesor.getValueAt(aux, 5).toString());
        }
        if (TablaProfesor.getValueAt(aux, 6) == null) {
            JDProfesor.txtAsig2.setText("asignatura 2");
        } else {
            JDProfesor.txtAsig2.setText(TablaProfesor.getValueAt(aux, 6).toString());
        }
        if (TablaProfesor.getValueAt(aux, 7) == null) {
            JDProfesor.txtAsig3.setText("asignatura 3");
        } else {
            JDProfesor.txtAsig3.setText(TablaProfesor.getValueAt(aux, 7).toString());
        }
        if (TablaProfesor.getValueAt(aux, 8) == null) {
            JDProfesor.txtAsig4.setText("asignatura 4");
        } else {
            JDProfesor.txtAsig4.setText(TablaProfesor.getValueAt(aux, 8).toString());
        }
        if (TablaProfesor.getValueAt(aux, 9) == null) {
            JDProfesor.txtAsig5.setText("asignatura 5");
        } else {
            JDProfesor.txtAsig5.setText(TablaProfesor.getValueAt(aux, 9).toString());
        }
        if (TablaProfesor.getValueAt(aux, 10) == null) {
            JDProfesor.txtAsig6.setText("asignatura 6");
        } else {
            JDProfesor.txtAsig6.setText(TablaProfesor.getValueAt(aux, 10).toString());
        }

        JDProfesor.setVisible(true);
    }//GEN-LAST:event_btnActualizarProfesorActionPerformed

    private void btnAgregarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProfesorActionPerformed
        DialogProfesor JDProfesor = new DialogProfesor(this, true);
        JDProfesor.setVisible(true);
    }//GEN-LAST:event_btnAgregarProfesorActionPerformed

    private void btnRefreshAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshAlumnoActionPerformed
        TablaAlumno.setModel(facade.todoAlumnos());
    }//GEN-LAST:event_btnRefreshAlumnoActionPerformed

    private void btnRefreshProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshProfesoresActionPerformed
        TablaProfesor.setModel(facade.todoProfes());
    }//GEN-LAST:event_btnRefreshProfesoresActionPerformed

    private void btnRefreshAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshAsignaturaActionPerformed
        TablaAsignatura.setModel(facade.todoAsignaturas());
    }//GEN-LAST:event_btnRefreshAsignaturaActionPerformed

    private void btnBorrarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarProfesorActionPerformed
        int aux = TablaProfesor.getSelectedRow();
        String dni = TablaProfesor.getValueAt(aux, 0).toString();
        System.out.println(dni);
        facade.deleteProfesor(TablaProfesor.getValueAt(aux, 0).toString());
    }//GEN-LAST:event_btnBorrarProfesorActionPerformed

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
            java.util.logging.Logger.getLogger(Primera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Primera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Primera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Primera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Primera().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel PanelAlumno;
    public javax.swing.JPanel PanelAsignatura;
    public javax.swing.JPanel PanelProfesor;
    public javax.swing.JTable TablaAlumno;
    public javax.swing.JTable TablaAsignatura;
    public javax.swing.JTable TablaProfesor;
    public javax.swing.JButton btnActualizarAlumno;
    public javax.swing.JButton btnActualizarAsignatura;
    public javax.swing.JButton btnActualizarProfesor;
    public javax.swing.JButton btnAgregarAlumno;
    public javax.swing.JButton btnAgregarAsignatura;
    public javax.swing.JButton btnAgregarProfesor;
    public javax.swing.JButton btnBorrarAlumno;
    public javax.swing.JButton btnBorrarAsignatura;
    public javax.swing.JButton btnBorrarProfesor;
    public javax.swing.JButton btnRefreshAlumno;
    public javax.swing.JButton btnRefreshAsignatura;
    public javax.swing.JButton btnRefreshProfesores;
    public javax.swing.JPanel jPanel5;
    public javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanel7;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
