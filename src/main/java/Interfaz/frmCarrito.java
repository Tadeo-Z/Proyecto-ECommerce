package Interfaz;

import entidades.Carrito;
import entidades.Producto;
import entidades.Pedido;
import negocio.Pedidos;
import negocio.Productos;
import negocio.Carritos;
import entidades.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import negocio.TMCarrito;
import servicio.Fecha;

/**
 *
 * @author yalam
 */
public class frmCarrito extends javax.swing.JFrame {

    private Carrito carrito;
    private Usuario usuario;
    private TMCarrito modelo;
    private ArrayList<Producto> productoLista = new ArrayList<>();
    private float suma = 0.0f;
    private List<Carrito> carritoLista ;
    
    
    /**
     * Constructor de la clase frmCarrito. Inicializa y configura el formulario.
     */
    public frmCarrito() {
        initComponents();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * Método constructor que inicializa la ventana del carrito con el carrito
     * de compra y el usuario que hizo log in
     *
     * @param carrito el carrito de compra
     * @param usuario el usuario que hizo log in
     */
    public frmCarrito(Carrito carrito, Usuario usuario) {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        //productoLista.add(producto);
        this.carrito = carrito;
        this.usuario = usuario;
        Producto producto = null;
        Productos negocioProductos = new Productos();
        
        for (int i = 0; i < this.carrito.getIdProducto().size(); i++) {
            int idProducto = this.carrito.getIdProducto().get(i);
            
            System.out.println("ID del producto: " + idProducto);
            producto = negocioProductos.obtenerProducto(idProducto);
            
            productoLista.add(producto);
            this.suma = this.suma + producto.getPrecio();
        }

        modelo = new TMCarrito(/*carritoLista,*/ productoLista);
        jTable1.setModel(modelo);
        
        campoTextoTotal.setText(String.valueOf(this.suma));
       
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
        jLabel2 = new javax.swing.JLabel();
        volverButton = new javax.swing.JButton();
        botonPagar = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoTextoTotal = new javax.swing.JTextField();

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

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("CARRITO");

        volverButton.setBackground(new java.awt.Color(0, 0, 0));
        volverButton.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        volverButton.setForeground(new java.awt.Color(255, 255, 255));
        volverButton.setText("VOLVER");
        volverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverButtonActionPerformed(evt);
            }
        });

        botonPagar.setBackground(new java.awt.Color(51, 51, 255));
        botonPagar.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        botonPagar.setForeground(new java.awt.Color(255, 255, 255));
        botonPagar.setText("PAGAR");
        botonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPagarActionPerformed(evt);
            }
        });

        eliminarButton.setBackground(new java.awt.Color(255, 0, 0));
        eliminarButton.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        eliminarButton.setForeground(new java.awt.Color(255, 255, 255));
        eliminarButton.setText("ELIMINAR");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("TOTAL: $");

        campoTextoTotal.setEditable(false);
        campoTextoTotal.setForeground(new java.awt.Color(0, 255, 51));
        campoTextoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTextoTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(volverButton)
                        .addGap(62, 62, 62)
                        .addComponent(eliminarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonPagar)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoTextoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoTextoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(volverButton)
                        .addComponent(eliminarButton)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void volverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverButtonActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_volverButtonActionPerformed

    private void campoTextoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTextoTotalActionPerformed

        
    }//GEN-LAST:event_campoTextoTotalActionPerformed
    /**
     * Se verifica que el pago sea valido para agregarlo a pedidos.
     * @param evt 
     */
    private void botonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPagarActionPerformed
        // TODO add your handling code here:
        
        Pedido pedido = new Pedido(new Fecha().toString() , this.suma, this.usuario.getIdUsuario(), this.carrito);
        Pedidos negocioPedido = new Pedidos();
        
        
        if(this.suma==0){
            JOptionPane.showMessageDialog(null, "Error: No existen productos en el carrito", "Error", JOptionPane.INFORMATION_MESSAGE); 

        }
        else{
            negocioPedido.registrarPedido(pedido);
            Pedido pedidoProducto = negocioPedido.obtenerPedido(this.usuario.getIdUsuario());
            Carritos negocioCarrito = new Carritos();
            this.carrito.setIdPedido(pedidoProducto.getIdPedido());
            this.carrito.setIdUsuario(this.usuario.getIdUsuario());
            negocioCarrito.registrarCarrito(this.carrito);
            this.suma = 0.0f;
            this.setVisible(false);
            JOptionPane.showMessageDialog(null, "Pedido registrado", "Exito", JOptionPane.INFORMATION_MESSAGE); 
            System.out.println("pedido registrado");

        }
        
        this.carrito.getIdProducto().clear();
        
    }//GEN-LAST:event_botonPagarActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
            try {
            carrito.getIdProducto().remove(jTable1.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Se elimino el producto al carrito con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE); 
        } catch (IndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Error: No existe el producto seleccionado", "Error", JOptionPane.INFORMATION_MESSAGE); 
        }
            
            
            frmCarrito carritoVentana = new frmCarrito(this.carrito, this.usuario);
            this.dispose();
            carritoVentana.setVisible(true);
    }//GEN-LAST:event_eliminarButtonActionPerformed

/**
 * Declaracion de variables
 */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonPagar;
    private javax.swing.JTextField campoTextoTotal;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton volverButton;
    // End of variables declaration//GEN-END:variables
}
