/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYECTO.ADMON.Producto;

import Clases.ClsCargaCombos;
import Clases.Sesion;
import Entidades.ClsProducto;
import Funcionalidades.ClsOperaProducto;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 *
 * @author Freak
 */
public class FRMIndex extends javax.swing.JInternalFrame {

    /**
     * Creates new form FRMIndex
     */
    public FRMIndex() {
        initComponents();
    }
    private Object[][] CargaProductoEnTabla() {
        String Filtro = "";
        List<ClsProducto> lstProducto = (new ClsOperaProducto()).ConsultaLista("", Filtro);
        Object Producto[][] = new Object[lstProducto.size()][ClsProducto.RelacionesProducto.CamposQueSeMuestranEnTabla.size()];
        try{
        for (int x = 0; x < lstProducto.size(); x++){
            for (int y = 0; y < ClsProducto.RelacionesProducto.CamposQueSeMuestranEnTabla.size(); y ++){
                Method getElemento = lstProducto.get(x).getClass().getMethod(ClsProducto.RelacionesProducto.CamposQueSeMuestranEnTabla.get(y).Entidad());
                Producto[x][y] = getElemento.invoke(lstProducto.get(x));
            }
        }
        }catch(IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException ex){
            System.out.println(ex.getMessage());
        }
        return Producto;
    }
    private String[] Titulos(){
        String Titulos[] = new String[ClsProducto.RelacionesProducto.CamposQueSeMuestranEnTabla.size()];
        for (int i = 0; i < ClsProducto.RelacionesProducto.CamposQueSeMuestranEnTabla.size(); i++){
            Titulos[i] = ClsProducto.RelacionesProducto.CamposQueSeMuestranEnTabla.get(i).Texto();
        }
        return Titulos;
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
        pnlBase = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProducto = new javax.swing.JTable();
        btnAlta = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText(Glosario.Glosario.Producto.FRMIndex_getTitulo());

        tblProducto.setModel(new javax.swing.table.DefaultTableModel(
            CargaProductoEnTabla(),
            Titulos()
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProducto.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tblProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProducto);

        btnAlta.setText(Glosario.Glosario.General_getAlta());
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBaseLayout = new javax.swing.GroupLayout(pnlBase);
        pnlBase.setLayout(pnlBaseLayout);
        pnlBaseLayout.setHorizontalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addComponent(btnAlta)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlBaseLayout.setVerticalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(pnlBase);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        if (Sesion.CierreVentana(NumeroDePantalla)){
            this.dispose();
        }
    }//GEN-LAST:event_formInternalFrameClosing

    private void tblProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductoMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 2){
            int row = tblProducto.rowAtPoint(evt.getPoint());
            Class[] Tipos = {ClsProducto.class};
            ClsProducto Producto = new ClsProducto();
            Producto.NumeroDeProducto(Long.parseLong(tblProducto.getValueAt(row, 0).toString()));
            Producto.NombreDeProducto(tblProducto.getValueAt(row, 1).toString());
            Producto.CveEstatus(ClsCargaCombos.CambiaClave("1","",tblProducto.getValueAt(row, 6).toString()));
            Producto.TextoEstatus(tblProducto.getValueAt(row, 6).toString());
            Object[] Parametros = {Producto};
            PROYECTO.DESKTOP.DesktopMain.AbrirPantalla("Producto.FRMDetalle", Tipos, Parametros, false);
            if (Sesion.CierreVentana(NumeroDePantalla)){
                this.dispose();
            }
        }
    }//GEN-LAST:event_tblProductoMouseClicked

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        // TODO add your handling code here:
        Class[] Tipos = new Class[0];
        Object[] Parametros = new Object[0];
        PROYECTO.DESKTOP.DesktopMain.AbrirPantalla("Producto.FRMAlta", Tipos, Parametros, false);
        if (Sesion.CierreVentana(NumeroDePantalla)){
            this.dispose();
        }
    }//GEN-LAST:event_btnAltaActionPerformed
    public long NumeroDePantalla(){
        return NumeroDePantalla;
    }
    private long NumeroDePantalla = 15;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JTable tblProducto;
    // End of variables declaration//GEN-END:variables
}