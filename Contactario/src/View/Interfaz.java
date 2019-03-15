
package Model;

import Model.Contacts;
import Model.GestorBaseDatosDAOImpl;
import Model.Threads;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author plbogado
 */
public class Interfaz extends javax.swing.JFrame {

    GestorBaseDatosDAOImpl agenda = new GestorBaseDatosDAOImpl();
    DefaultTableModel model;
    Threads e = new Threads();

    public Interfaz() {
        e.start();

        this.setUndecorated(true);
        initComponents();

        setLocationRelativeTo(null);
        accesoTxt(false);
        btnAgregar.setEnabled(false);
        btnAceptMod.setEnabled(false);
        btnAceptMod.setVisible(false);

    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContacto = new javax.swing.JPanel();
        lblApellido = new javax.swing.JLabel();
        lblAlias = new javax.swing.JLabel();
        lblMail = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new java.awt.TextField();
        txtApellido = new java.awt.TextField();
        txtAlias = new java.awt.TextField();
        txtEmail = new java.awt.TextField();
        txtTelefono = new java.awt.TextField();
        btnValidarMail = new javax.swing.JButton();
        btnValidarTel = new javax.swing.JButton();
        pnlTable = new javax.swing.JScrollPane();
        tblContactos = new javax.swing.JTable();
        pnlBotones = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnMostrarTodos = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblCantContactos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        txtBusqueda = new java.awt.TextField();
        btnBusqueda = new javax.swing.JButton();
        lblBuscar = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnAceptMod = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGENDON");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblApellido.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        lblApellido.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblApellido.setText("Last Name");

        lblAlias.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        lblAlias.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAlias.setText("Nick");

        lblMail.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        lblMail.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblMail.setText("E-mail");

        lblTelefono.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        lblTelefono.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTelefono.setText("Phone");

        lblNombre.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNombre.setText("Name");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtAlias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAliasActionPerformed(evt);
            }
        });
        txtAlias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAliasKeyTyped(evt);
            }
        });

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        btnValidarMail.setText(" Check Email.");
        btnValidarMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarMailActionPerformed(evt);
            }
        });

        btnValidarTel.setText("Check Phone");
        btnValidarTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarTelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlContactoLayout = new javax.swing.GroupLayout(pnlContacto);
        pnlContacto.setLayout(pnlContactoLayout);
        pnlContactoLayout.setHorizontalGroup(
            pnlContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContactoLayout.createSequentialGroup()
                .addGroup(pnlContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContactoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(pnlContactoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pnlContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnValidarMail)
                    .addComponent(btnValidarTel))
                .addGap(21, 21, 21))
            .addGroup(pnlContactoLayout.createSequentialGroup()
                .addGroup(pnlContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContactoLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblApellido))
                    .addGroup(pnlContactoLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lblAlias))
                    .addGroup(pnlContactoLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(pnlContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMail)
                            .addComponent(lblTelefono)))
                    .addGroup(pnlContactoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlContactoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlContactoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtAlias, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlContactoLayout.setVerticalGroup(
            pnlContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContactoLayout.createSequentialGroup()
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblApellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAlias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAlias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValidarMail))
                .addGap(7, 7, 7)
                .addGroup(pnlContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlContactoLayout.createSequentialGroup()
                        .addComponent(lblTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnValidarTel))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(pnlContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, 290));

        tblContactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido", "Alias", "Email", "Telefono"
            }
        ));
        tblContactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblContactosMouseClicked(evt);
            }
        });
        pnlTable.setViewportView(tblContactos);
        if (tblContactos.getColumnModel().getColumnCount() > 0) {
            tblContactos.getColumnModel().getColumn(0).setPreferredWidth(20);
            tblContactos.getColumnModel().getColumn(3).setPreferredWidth(40);
            tblContactos.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        getContentPane().add(pnlTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 770, 110));

        btnModificar.setText("Update");
        btnModificar.setBorder(new javax.swing.border.MatteBorder(null));
        btnModificar.setName("btnModificar"); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Delete");
        btnBorrar.setActionCommand("");
        btnBorrar.setBorder(new javax.swing.border.MatteBorder(null));
        btnBorrar.setName("btnBorrar"); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnMostrarTodos.setText("View All");
        btnMostrarTodos.setBorder(new javax.swing.border.MatteBorder(null));
        btnMostrarTodos.setName("btnMostrarTodos"); // NOI18N
        btnMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosActionPerformed(evt);
            }
        });

        btnAgregar.setText("Add");
        btnAgregar.setBorder(new javax.swing.border.MatteBorder(null));
        btnAgregar.setName("btnAgregar"); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnSalir.setText("Exit");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMostrarTodos, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(pnlBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 150, 220));
        getContentPane().add(lblCantContactos, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, 40, 20));

        jLabel1.setText("Contacts");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 490, 60, 20));

        jLabel2.setText("Quantity");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 70, 20));

        Titulo.setBackground(new java.awt.Color(0, 0, 0));
        Titulo.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Contacts");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 170, 70));
        getContentPane().add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 290, 30));

        btnBusqueda.setText("Search");
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 290, 40));

        lblBuscar.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        lblBuscar.setText("Search Contacts");
        lblBuscar.setToolTipText("");
        getContentPane().add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 110, 30));

        btnNuevo.setText("New entry");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 110, 40));
        btnNuevo.getAccessibleContext().setAccessibleName("btnNuevo");

        btnAceptMod.setText("Update OK");
        btnAceptMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptModActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 110, 40));

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 120, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

         int fila = tblContactos.getSelectedRow();
            if(fila>=0){
        
        if (!txtNombre.getText().isEmpty()) {
            btnAceptMod.setVisible(true);
            btnAceptMod.setEnabled(true);
            btnAgregar.setEnabled(false);
            accesoTxt(true);
        }
        }else{JOptionPane.showMessageDialog(null, "Not selected any contact to modify");}
    }//GEN-LAST:event_btnModificarActionPerformed

    
    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        //BORRAR
        
        int fila = tblContactos.getSelectedRow();
        if (fila >= 0) {
            String contacto = (String) tblContactos.getValueAt(fila, 0);           
            if (JOptionPane.showConfirmDialog(null, "Are you sure you want to delete :  "+ txtNombre.getText()+" ?", "WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                
            agenda.eliminar(contacto);
            
            agenda.mostrarTodos();
            tblContactos.setModel(agenda.model);
            limpiarTxt();
            JOptionPane.showMessageDialog(null, "Contact was deleted"+txtNombre.getText()+""+txtApellido.getText()+" Successfully");
            }else{JOptionPane.showMessageDialog(null, "Contact "+ txtNombre.getText()+" do not deleted");}
        } else {
            JOptionPane.showMessageDialog(null, "not select any contact");
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    // Tomar como otro Ejemplo
    /*int indice=(Integer) tblMostrarEmpleado.getValueAt(tblMostrarEmpleado.getSelectedRow(),1);  
        
        Empleado E = new Empleado();
               for (Empleado Emp : Gest.loadAllEmpleado()) {
            if (Emp.getLegajo()== indice){
                E=Emp;
                break;
            }
            System.out.println(Emp.getLegajo());
        }
        Gest.DeleteEmpleado(E);*/
    private void btnMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosActionPerformed
        
        agenda.mostrarTodos();
        tblContactos.setModel(agenda.model);
        lblCantContactos.setText(Integer.toString(agenda.contarTodos()));
        e.StopThread();
    }//GEN-LAST:event_btnMostrarTodosActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //AGREGAR

        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String alias = txtAlias.getText();
        String email = txtEmail.getText();
        String telefono = txtTelefono.getText();

        if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtAlias.getText().isEmpty() || txtEmail.getText().isEmpty() || txtTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Missing fill fields");
        } else {
            Contacts cd = new Contacts(nombre, apellido, alias, email, telefono);
            cd.toString();
            agenda.agregar(cd);
            agenda.mostrarTodos();
            lblCantContactos.setText(Integer.toString(agenda.contarTodos()));
            tblContactos.setModel(agenda.model);
            limpiarTxt();
            btnAgregar.setEnabled(false);
            btnBorrar.setEnabled(true);
            btnModificar.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Contact Added Successfully");
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
        

    }//GEN-LAST:event_btnSalirActionPerformed

    private void tblContactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblContactosMouseClicked
        accesoTxt(false);
        int fila = tblContactos.getSelectedRow();
        String id = (String) tblContactos.getValueAt(fila, 0);
        String nombre = (String) tblContactos.getValueAt(fila, 1);
        String apellido = (String) tblContactos.getValueAt(fila, 2);
        String alias = (String) tblContactos.getValueAt(fila, 3);
        String email = (String) tblContactos.getValueAt(fila, 4);
        String telefono = (String) tblContactos.getValueAt(fila, 5);

        int iduno = Integer.parseInt(id);
        Contacts mod = new Contacts(iduno, nombre, apellido, alias, email, telefono);
        System.out.println(mod.toString());

        txtNombre.setText(nombre);
        txtApellido.setText(apellido);
        txtAlias.setText(alias);
        txtEmail.setText(email);
        txtTelefono.setText(telefono);


    }//GEN-LAST:event_tblContactosMouseClicked

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        //Busqueda
        String contactoBuscar = txtBusqueda.getText();

        System.out.println("Search...: \n" + contactoBuscar + "\n");

        agenda.buscar(contactoBuscar);
        tblContactos.setModel(agenda.model);


    }//GEN-LAST:event_btnBusquedaActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtNombre.requestFocus();
        limpiarTxt();
        btnAceptMod.setVisible(false);
        btnAgregar.setEnabled(true);
        btnModificar.setEnabled(false);
        btnBorrar.setEnabled(false);
        accesoTxt(true);


    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAceptModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptModActionPerformed
        try {
            
            int fila = tblContactos.getSelectedRow();
           
            String id = (String) tblContactos.getValueAt(fila, 0);
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String alias = txtAlias.getText();
            String email = txtEmail.getText();
            String telefono = txtTelefono.getText();

            int idUno = Integer.parseInt(id);
            Contacts mod = new Contacts(nombre, apellido, alias, email, telefono);

            agenda.modificar(mod, idUno);
            agenda.mostrarTodos();
            tblContactos.setModel(agenda.model);

            limpiarTxt();
            btnAceptMod.setVisible(false);
            accesoTxt(false);
            btnModificar.setEnabled(true);
           
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Fail", "ERROR", 1);

        }

    }//GEN-LAST:event_btnAceptModActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
    limpiarTxt();
    accesoTxt(false);
     
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnValidarTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarTelActionPerformed

        if (ValidarTelefono(txtTelefono.getText())) {
            JOptionPane.showMessageDialog(null, "Right!!!");
        } else {
            JOptionPane.showMessageDialog(null, "verify please, bad number", "Invlid", 1);
        }
    }//GEN-LAST:event_btnValidarTelActionPerformed

    private void btnValidarMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarMailActionPerformed
        //VALIDAR EMAIL
        if (ValidarEmail(txtEmail.getText())) {
            JOptionPane.showMessageDialog(null, "Right!!", "OK", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Email not Right", "Invalid", 1);
        }

    }//GEN-LAST:event_btnValidarMailActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();

        if (Character.isLetter(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped

    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtAliasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAliasKeyTyped
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtAliasKeyTyped

    private void txtAliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAliasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAliasActionPerformed

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();

        if (Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();

        }
    }//GEN-LAST:event_txtNombreKeyTyped

    //validacion
    public static Boolean ValidarTelefono(String telefono) {
        final String ValidPhone = "^\\+?\\d{1,3}?[- .]?\\(?(?:\\d{2,3})\\)?[- .]?\\d\\d\\d[- .]?\\d\\d\\d\\d$";
        Pattern pattern = Pattern.compile(ValidPhone);

        Matcher matcher = pattern.matcher(telefono);
        return matcher.matches();

    }
   

    public static Boolean ValidarEmail(String email) {
        final String VALIDAREMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(VALIDAREMAIL);

        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public void accesoTxt(boolean x) {
        txtNombre.setEnabled(x);
        txtApellido.setEnabled(x);
        txtAlias.setEnabled(x);
        txtTelefono.setEnabled(x);
        txtEmail.setEnabled(x);

    }

    public void limpiarTxt() {
        if(txtNombre.getText().length() !=0){
        txtNombre.setText("");}
        if(txtApellido.getText().length() !=0){
        txtApellido.setText("");}
        if(txtAlias.getText().length() !=0){
        txtAlias.setText("");}
        if(txtTelefono.getText().length()!=0){
        txtTelefono.setText("");}
        if(txtEmail.getText().length()!=0){
        txtEmail.setText("");}

    }

    //------------------------------------------------------------------------------------  
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnAceptMod;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrarTodos;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnValidarMail;
    private javax.swing.JButton btnValidarTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAlias;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblCantContactos;
    private javax.swing.JLabel lblMail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlContacto;
    private javax.swing.JScrollPane pnlTable;
    private javax.swing.JTable tblContactos;
    private java.awt.TextField txtAlias;
    private java.awt.TextField txtApellido;
    private java.awt.TextField txtBusqueda;
    private java.awt.TextField txtEmail;
    private java.awt.TextField txtNombre;
    private java.awt.TextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
