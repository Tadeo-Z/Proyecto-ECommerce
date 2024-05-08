package Interfaz;

import entidades.Producto;
import entidades.Usuario;
import entidades.Carrito;
import static java.awt.image.ImageObserver.HEIGHT;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import negocio.Productos;
import negocio.TMProducto;

/**
 *
 * @author yalam
 */
public class frmProducto extends javax.swing.JFrame {

    private List<Producto> productos;
    private TMProducto modelo;
    private Usuario usuario; //Objeto usuario que te traes desde la ventana de LogIn para utilizarlo en otros frames como el frmProducto o en frmPedidos
    private Carrito carrito = new Carrito();

    /**
     * Contructor frmProducto que inicializa los componentes de la ventana
     */
    public frmProducto() {
        initComponents();
    }

    /**
     * Constructor frmProducto que inicializa los componentes de la ventana e
     * inicializa el usuario con el que se inició sesión
     *
     * @param usuario el usuario con el que se inició sesión
     */
    public frmProducto(Usuario usuario) {
        initComponents();
        this.usuario = usuario;
        productos = new ArrayList<>();
        productos.add(new Productos().obtenerProducto(1));
        productos.add(new Productos().obtenerProducto(2));
        productos.add(new Productos().obtenerProducto(3));
        productos.add(new Productos().obtenerProducto(4));
        productos.add(new Productos().obtenerProducto(5));
        productos.add(new Productos().obtenerProducto(6));
        productos.add(new Productos().obtenerProducto(7));
        productos.add(new Productos().obtenerProducto(8));
        productos.add(new Productos().obtenerProducto(9));
        productos.add(new Productos().obtenerProducto(10));
        modelo = new TMProducto(productos);

        jTable1.setModel(modelo);

        textoNombre.setText(usuario.getEmail());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        campoTextoIdProducto = new javax.swing.JTextField();
        botonCarrito = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        botonPedidos = new javax.swing.JButton();
        Usuario = new javax.swing.JLabel();
        textoNombre = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        botonCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("idProducto");

        campoTextoIdProducto.setColumns(5);

        botonCarrito.setBackground(new java.awt.Color(0, 51, 204));
        botonCarrito.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonCarrito.setForeground(new java.awt.Color(255, 255, 255));
        botonCarrito.setText("Carrito");
        botonCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCarritoActionPerformed(evt);
            }
        });

        botonAgregar.setBackground(new java.awt.Color(51, 255, 51));
        botonAgregar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel2.setText("Productos");

        botonPedidos.setBackground(new java.awt.Color(255, 153, 0));
        botonPedidos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonPedidos.setForeground(new java.awt.Color(255, 255, 255));
        botonPedidos.setText("Historial De Pedidos");
        botonPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPedidosActionPerformed(evt);
            }
        });

        Usuario.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        Usuario.setText("Usuario:");

        btnActualizar.setBackground(new java.awt.Color(255, 153, 0));
        btnActualizar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar Datos");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar Cuenta");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        botonCerrarSesion.setBackground(new java.awt.Color(255, 51, 51));
        botonCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        botonCerrarSesion.setText("Cerrar sesión");
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTextoIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(botonAgregar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonCarrito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonPedidos)
                        .addGap(174, 174, 174)
                        .addComponent(botonCerrarSesion)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(btnActualizar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(Usuario)
                        .addComponent(textoNombre))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnActualizar)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoTextoIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregar))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCarrito)
                    .addComponent(botonPedidos)
                    .addComponent(botonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Manejador de eventos para el botón "Carrito". Se ejecuta cuando se hace
     * clic en el botón. Abre una nueva ventana de carrito de compras y pasa los
     * productos y el usuario actual a la nueva ventana.
     *
     * @param evt El evento de acción que desencadenó esta función.
     */
    private void botonCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCarritoActionPerformed
        // TODO add your handling code here:
        frmCarrito carritoVentana = new frmCarrito(this.carrito, this.usuario);
        carritoVentana.setVisible(true);
    }//GEN-LAST:event_botonCarritoActionPerformed
    /**
     * Manejador de eventos para el botón "Agregar". Se ejecuta cuando se hace
     * clic en el botón. Agrega el ID de un producto al carrito de compras si el
     * campo de texto no está vacío. Muestra un mensaje de error si el campo de
     * texto está vacío.
     *
     * @param evt El evento de acción que desencadenó esta función.
     */
    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        Productos negocioProducto = new Productos();

        String idProductoTexto = campoTextoIdProducto.getText().trim();
        if (!idProductoTexto.isEmpty()) {
            try {
                int idProducto = Integer.parseInt(idProductoTexto);
                Producto productoExistente = negocioProducto.obtenerProducto(idProducto);
                if (productoExistente != null) {
                    carrito.getIdProducto().add(idProducto);
                    campoTextoIdProducto.setText("");
                    JOptionPane.showMessageDialog(null, "Se agregó el producto al carrito con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    campoTextoIdProducto.setText("");
                    JOptionPane.showMessageDialog(null, "Error: ese producto no existe", "Error ingreso de ID del producto", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                campoTextoIdProducto.setText("");
                JOptionPane.showMessageDialog(null, "Error: el ID del producto debe ser un número entero", "Error ingreso de ID del producto", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error: campo vacío, escribe un ID de algún producto", "Error ingreso de ID del producto", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    /**
     * Manejador de eventos para el botón "Pedidos". Se ejecuta cuando se hace
     * clic en el botón. Abre una nueva ventana de pedidos y pasa el usuario
     * actual a la nueva ventana.
     *
     * @param evt El evento de acción que desencadenó esta función.
     */
    private void botonPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPedidosActionPerformed
        // TODO add your handling code here:
        frmPedidos pedidosVentana = new frmPedidos(this.usuario);
        pedidosVentana.setVisible(true);
    }//GEN-LAST:event_botonPedidosActionPerformed

    /**
     * Manejador de evento para el botón "Actualizar". se ejecuta cuando se hace
     * cliic en el botón. Abre una nueva ventana para actualizar los datos del
     * usuario.
     *
     * @param evt el evento de acción al dar clic en el botón actualizar datos
     */
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        frmActualizar ventanaActualizar = new frmActualizar(this.usuario, this);
        ventanaActualizar.setVisible(true);
    }//GEN-LAST:event_btnActualizarActionPerformed

    /**
     * Manejador de evento para el botón "Eliminar". se ejecuta cuando se hace
     * cliic en el botón. Abre una nueva ventana para eliminar la cuenta del
     * usuario.
     *
     * @param evt el evento de acción al dar clic en el botón eliminar
     */
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        frmEliminar ventanaEliminar = new frmEliminar(this);
        ventanaEliminar.setVisible(true);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        frmLogin login = new frmLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCerrarSesionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonCarrito;
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonPedidos;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JTextField campoTextoIdProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel textoNombre;
    // End of variables declaration//GEN-END:variables
}
