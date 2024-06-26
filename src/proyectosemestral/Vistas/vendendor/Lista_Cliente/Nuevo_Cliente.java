package proyectosemestral.Vistas.vendendor.Lista_Cliente;

import proyectosemestral.Controlador.CtrlCliente;
import proyectosemestral.Modelo.Cliente;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author cetecom
 */
public class Nuevo_Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Nuevo_vendedor1
     */
    public Nuevo_Cliente() {
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

        btgTipoDocumento = new javax.swing.ButtonGroup();
        pane_panel_principal = new javax.swing.JPanel();
        pane_fondo_Nuevo_Cliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pane_fondo_identifi = new javax.swing.JPanel();
        lbl_identificacion = new javax.swing.JLabel();
        pane_fondo_Nombre = new javax.swing.JPanel();
        lbl_Nombre = new javax.swing.JLabel();
        pane_fondo_email = new javax.swing.JPanel();
        lbl_e_email = new javax.swing.JLabel();
        pane_fondo_direccion = new javax.swing.JPanel();
        lbl_Direccion = new javax.swing.JLabel();
        pane_fondo_N = new javax.swing.JPanel();
        lbl_telefono = new javax.swing.JLabel();
        btn_volver = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        pane_fondo_fecha = new javax.swing.JPanel();
        lbl_fecha_nac = new javax.swing.JLabel();
        pane_fondo_identifi1 = new javax.swing.JPanel();
        lbl_identificacion1 = new javax.swing.JLabel();
        opcExtranjero = new javax.swing.JRadioButton();
        opcLocal = new javax.swing.JRadioButton();
        txtIdentificacion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidop = new javax.swing.JTextField();
        pane_fondo_Nombre1 = new javax.swing.JPanel();
        lbl_Nombre1 = new javax.swing.JLabel();
        txtApellidom = new javax.swing.JTextField();
        pane_fondo_Nombre3 = new javax.swing.JPanel();
        lbl_Nombre3 = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNrTelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pane_panel_principal.setBackground(new java.awt.Color(207, 207, 207));

        pane_fondo_Nuevo_Cliente.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Cliente");

        javax.swing.GroupLayout pane_fondo_Nuevo_ClienteLayout = new javax.swing.GroupLayout(pane_fondo_Nuevo_Cliente);
        pane_fondo_Nuevo_Cliente.setLayout(pane_fondo_Nuevo_ClienteLayout);
        pane_fondo_Nuevo_ClienteLayout.setHorizontalGroup(
            pane_fondo_Nuevo_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_fondo_Nuevo_ClienteLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pane_fondo_Nuevo_ClienteLayout.setVerticalGroup(
            pane_fondo_Nuevo_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_fondo_Nuevo_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pane_fondo_identifi.setBackground(new java.awt.Color(153, 153, 153));

        lbl_identificacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_identificacion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_identificacion.setText("Idenificacion");

        javax.swing.GroupLayout pane_fondo_identifiLayout = new javax.swing.GroupLayout(pane_fondo_identifi);
        pane_fondo_identifi.setLayout(pane_fondo_identifiLayout);
        pane_fondo_identifiLayout.setHorizontalGroup(
            pane_fondo_identifiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_fondo_identifiLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(lbl_identificacion)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        pane_fondo_identifiLayout.setVerticalGroup(
            pane_fondo_identifiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_fondo_identifiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_identificacion)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pane_fondo_Nombre.setBackground(new java.awt.Color(176, 176, 176));

        lbl_Nombre.setBackground(new java.awt.Color(238, 238, 238));
        lbl_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Nombre.setText("Nombre");

        javax.swing.GroupLayout pane_fondo_NombreLayout = new javax.swing.GroupLayout(pane_fondo_Nombre);
        pane_fondo_Nombre.setLayout(pane_fondo_NombreLayout);
        pane_fondo_NombreLayout.setHorizontalGroup(
            pane_fondo_NombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_fondo_NombreLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(lbl_Nombre)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        pane_fondo_NombreLayout.setVerticalGroup(
            pane_fondo_NombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_fondo_NombreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Nombre)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pane_fondo_email.setBackground(new java.awt.Color(176, 176, 176));

        lbl_e_email.setBackground(new java.awt.Color(238, 238, 238));
        lbl_e_email.setForeground(new java.awt.Color(255, 255, 255));
        lbl_e_email.setText("E-EMAIL");

        javax.swing.GroupLayout pane_fondo_emailLayout = new javax.swing.GroupLayout(pane_fondo_email);
        pane_fondo_email.setLayout(pane_fondo_emailLayout);
        pane_fondo_emailLayout.setHorizontalGroup(
            pane_fondo_emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_fondo_emailLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(lbl_e_email)
                .addContainerGap(114, Short.MAX_VALUE))
        );
        pane_fondo_emailLayout.setVerticalGroup(
            pane_fondo_emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_fondo_emailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_e_email)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pane_fondo_direccion.setBackground(new java.awt.Color(176, 176, 176));

        lbl_Direccion.setBackground(new java.awt.Color(238, 238, 238));
        lbl_Direccion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Direccion.setText("DIRECCION");

        javax.swing.GroupLayout pane_fondo_direccionLayout = new javax.swing.GroupLayout(pane_fondo_direccion);
        pane_fondo_direccion.setLayout(pane_fondo_direccionLayout);
        pane_fondo_direccionLayout.setHorizontalGroup(
            pane_fondo_direccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_fondo_direccionLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(lbl_Direccion)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        pane_fondo_direccionLayout.setVerticalGroup(
            pane_fondo_direccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_fondo_direccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Direccion)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pane_fondo_N.setBackground(new java.awt.Color(176, 176, 176));

        lbl_telefono.setBackground(new java.awt.Color(238, 238, 238));
        lbl_telefono.setForeground(new java.awt.Color(255, 255, 255));
        lbl_telefono.setText("N°TELEFONO");

        javax.swing.GroupLayout pane_fondo_NLayout = new javax.swing.GroupLayout(pane_fondo_N);
        pane_fondo_N.setLayout(pane_fondo_NLayout);
        pane_fondo_NLayout.setHorizontalGroup(
            pane_fondo_NLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_fondo_NLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(lbl_telefono)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        pane_fondo_NLayout.setVerticalGroup(
            pane_fondo_NLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_fondo_NLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_telefono)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        btn_volver.setBackground(new java.awt.Color(102, 102, 102));
        btn_volver.setForeground(new java.awt.Color(255, 255, 255));
        btn_volver.setText("VOLVER");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        btn_aceptar.setBackground(new java.awt.Color(102, 102, 102));
        btn_aceptar.setForeground(new java.awt.Color(255, 255, 255));
        btn_aceptar.setText("ACEPTAR");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        pane_fondo_fecha.setBackground(new java.awt.Color(176, 176, 176));

        lbl_fecha_nac.setBackground(new java.awt.Color(238, 238, 238));
        lbl_fecha_nac.setForeground(new java.awt.Color(255, 255, 255));
        lbl_fecha_nac.setText("Fecha Naciminento");

        javax.swing.GroupLayout pane_fondo_fechaLayout = new javax.swing.GroupLayout(pane_fondo_fecha);
        pane_fondo_fecha.setLayout(pane_fondo_fechaLayout);
        pane_fondo_fechaLayout.setHorizontalGroup(
            pane_fondo_fechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_fondo_fechaLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(lbl_fecha_nac)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pane_fondo_fechaLayout.setVerticalGroup(
            pane_fondo_fechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_fondo_fechaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_fecha_nac)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pane_fondo_identifi1.setBackground(new java.awt.Color(153, 153, 153));

        lbl_identificacion1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_identificacion1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_identificacion1.setText("Idenificacion");

        javax.swing.GroupLayout pane_fondo_identifi1Layout = new javax.swing.GroupLayout(pane_fondo_identifi1);
        pane_fondo_identifi1.setLayout(pane_fondo_identifi1Layout);
        pane_fondo_identifi1Layout.setHorizontalGroup(
            pane_fondo_identifi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_fondo_identifi1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(lbl_identificacion1)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        pane_fondo_identifi1Layout.setVerticalGroup(
            pane_fondo_identifi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_fondo_identifi1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lbl_identificacion1)
                .addGap(10, 10, 10))
        );

        btgTipoDocumento.add(opcExtranjero);
        opcExtranjero.setText("Extranjero");

        btgTipoDocumento.add(opcLocal);
        opcLocal.setText("Local");

        txtIdentificacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdentificacion.setText(" Pasaporte / RUT");
        txtIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionActionPerformed(evt);
            }
        });

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setText("Nombre");

        txtApellidop.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidop.setText("Apellido");

        pane_fondo_Nombre1.setBackground(new java.awt.Color(176, 176, 176));

        lbl_Nombre1.setBackground(new java.awt.Color(238, 238, 238));
        lbl_Nombre1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Nombre1.setText("Apellido Paterno");

        javax.swing.GroupLayout pane_fondo_Nombre1Layout = new javax.swing.GroupLayout(pane_fondo_Nombre1);
        pane_fondo_Nombre1.setLayout(pane_fondo_Nombre1Layout);
        pane_fondo_Nombre1Layout.setHorizontalGroup(
            pane_fondo_Nombre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_fondo_Nombre1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(lbl_Nombre1)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        pane_fondo_Nombre1Layout.setVerticalGroup(
            pane_fondo_Nombre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_fondo_Nombre1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Nombre1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtApellidom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidom.setText("Apellido");
        txtApellidom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidomActionPerformed(evt);
            }
        });

        pane_fondo_Nombre3.setBackground(new java.awt.Color(176, 176, 176));

        lbl_Nombre3.setBackground(new java.awt.Color(238, 238, 238));
        lbl_Nombre3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Nombre3.setText("Apellido Materno");

        javax.swing.GroupLayout pane_fondo_Nombre3Layout = new javax.swing.GroupLayout(pane_fondo_Nombre3);
        pane_fondo_Nombre3.setLayout(pane_fondo_Nombre3Layout);
        pane_fondo_Nombre3Layout.setHorizontalGroup(
            pane_fondo_Nombre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_fondo_Nombre3Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(lbl_Nombre3)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        pane_fondo_Nombre3Layout.setVerticalGroup(
            pane_fondo_Nombre3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_fondo_Nombre3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Nombre3)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        txtFechaNacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaNacimiento.setText("AAAA - MM - DD");

        txtDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDireccion.setText(" Direccion");

        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.setText("EXAMPLE@DUOCUC.CL");

        txtNrTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNrTelefono.setText("+56  9 5555 5555");

        javax.swing.GroupLayout pane_panel_principalLayout = new javax.swing.GroupLayout(pane_panel_principal);
        pane_panel_principal.setLayout(pane_panel_principalLayout);
        pane_panel_principalLayout.setHorizontalGroup(
            pane_panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_panel_principalLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(pane_panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pane_panel_principalLayout.createSequentialGroup()
                        .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_panel_principalLayout.createSequentialGroup()
                        .addGroup(pane_panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pane_panel_principalLayout.createSequentialGroup()
                                .addComponent(pane_fondo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDireccion))
                            .addGroup(pane_panel_principalLayout.createSequentialGroup()
                                .addComponent(pane_fondo_Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txtApellidop))
                            .addGroup(pane_panel_principalLayout.createSequentialGroup()
                                .addGroup(pane_panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pane_fondo_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pane_fondo_N, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(pane_panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail)
                                    .addComponent(txtNrTelefono)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pane_panel_principalLayout.createSequentialGroup()
                                .addGroup(pane_panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pane_fondo_identifi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane_panel_principalLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(pane_panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pane_fondo_identifi1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pane_fondo_Nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(20, 20, 20)
                                .addGroup(pane_panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pane_panel_principalLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(opcLocal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                        .addComponent(opcExtranjero)
                                        .addGap(20, 20, 20))
                                    .addComponent(txtIdentificacion)
                                    .addComponent(txtNombre)))
                            .addComponent(pane_fondo_Nuevo_Cliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pane_panel_principalLayout.createSequentialGroup()
                                .addGroup(pane_panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pane_panel_principalLayout.createSequentialGroup()
                                        .addComponent(pane_fondo_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(20, 20, 20))
                                    .addGroup(pane_panel_principalLayout.createSequentialGroup()
                                        .addComponent(pane_fondo_Nombre3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(22, 22, 22)))
                                .addGroup(pane_panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellidom)
                                    .addGroup(pane_panel_principalLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(txtFechaNacimiento)))))
                        .addGap(100, 100, 100))))
        );
        pane_panel_principalLayout.setVerticalGroup(
            pane_panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_panel_principalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(pane_fondo_Nuevo_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(pane_panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pane_fondo_identifi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIdentificacion))
                .addGap(20, 20, 20)
                .addGroup(pane_panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pane_fondo_identifi1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opcLocal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(opcExtranjero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pane_panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pane_fondo_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre))
                .addGap(20, 20, 20)
                .addGroup(pane_panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pane_fondo_Nombre1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtApellidop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pane_panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pane_fondo_Nombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(pane_panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pane_fondo_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFechaNacimiento))
                .addGap(20, 20, 20)
                .addGroup(pane_panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pane_fondo_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDireccion))
                .addGap(22, 22, 22)
                .addGroup(pane_panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pane_fondo_email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmail))
                .addGap(22, 22, 22)
                .addGroup(pane_panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pane_fondo_N, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNrTelefono))
                .addGap(40, 40, 40)
                .addGroup(pane_panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pane_panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pane_panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        //Recolectar los Datos
        Cliente cliente = new Cliente();
        
        if(opcLocal.isSelected() && cliente.validarRut(txtIdentificacion.getText())){
            cliente.setIdCliente(txtIdentificacion.getText());
        } else if(opcExtranjero.isSelected()){
            cliente.setIdCliente(txtIdentificacion.getText());
        } else{
         JOptionPane.showMessageDialog(this, "El RUT ingresado es INVALIDO","Validación", JOptionPane.WARNING_MESSAGE);
        }
        //Tipo Cliente
        if(this.opcLocal.isSelected()){
            cliente.setTipoCliente("LOCAL");
        } else if(this.opcExtranjero.isSelected()){
            cliente.setTipoCliente("EXTRANGERO");
        }
        
        cliente.setNombre(this.txtNombre.getText());
        cliente.setApellidoP(this.txtApellidop.getText());
        cliente.setApellidoM(this.txtApellidom.getText());
        
        // Fecha Nacimiento
        if(cliente.validarfechaNacimiento(txtFechaNacimiento.getText())){
            Date nac = new Date(txtFechaNacimiento.getText());
            cliente.setFechaNacimiento(nac);
        }else{
         JOptionPane.showMessageDialog(this, "LA FECHA DE NACIMIENTO ingresado es INVALIDO","Validación", JOptionPane.WARNING_MESSAGE);
        }
        
        
        cliente.setDireccion(this.txtDireccion.getText());
        
        if(cliente.validarEmail(txtEmail.getText())){
            cliente.setEmail(txtEmail.getText());
        }else{
         JOptionPane.showMessageDialog(this, "El EMAIL ingresado es INVALIDO","Validación", JOptionPane.WARNING_MESSAGE);
        }
        
        
        cliente.setTelefono(this.txtNrTelefono.getText());
        cliente.setEstado(true);
        
        //Guardo los datos en la BD
        CtrlCliente con = new CtrlCliente();
        if(con.guardarCliente(cliente)){
            
            JOptionPane.showMessageDialog(this, "SE GUARDO CORRECTAMENTE","Validación", JOptionPane.WARNING_MESSAGE);
        }else{
            
            JOptionPane.showMessageDialog(this, "HUBO UN ERROR AL GUARDAR LOS DATOS","Validación", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void txtApellidomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidomActionPerformed

    private void txtIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtIdentificacionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgTipoDocumento;
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_Direccion;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_Nombre1;
    private javax.swing.JLabel lbl_Nombre3;
    private javax.swing.JLabel lbl_e_email;
    private javax.swing.JLabel lbl_fecha_nac;
    private javax.swing.JLabel lbl_identificacion;
    private javax.swing.JLabel lbl_identificacion1;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JRadioButton opcExtranjero;
    private javax.swing.JRadioButton opcLocal;
    private javax.swing.JPanel pane_fondo_N;
    private javax.swing.JPanel pane_fondo_Nombre;
    private javax.swing.JPanel pane_fondo_Nombre1;
    private javax.swing.JPanel pane_fondo_Nombre3;
    private javax.swing.JPanel pane_fondo_Nuevo_Cliente;
    private javax.swing.JPanel pane_fondo_direccion;
    private javax.swing.JPanel pane_fondo_email;
    private javax.swing.JPanel pane_fondo_fecha;
    private javax.swing.JPanel pane_fondo_identifi;
    private javax.swing.JPanel pane_fondo_identifi1;
    private javax.swing.JPanel pane_panel_principal;
    private javax.swing.JTextField txtApellidom;
    private javax.swing.JTextField txtApellidop;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNrTelefono;
    // End of variables declaration//GEN-END:variables
}
