package ArbolExpresiones;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Dibujo extends javax.swing.JPanel {

    public Dibujo(int x, int y) {
        initComponents();
        this.setSize(x, y);

    }
    char[] datos;
    int[] x;
    int[] y;
    int[] xx;
    int[] yy;
    int incrementoX = 40;
    int incrementoY = 40;
    int incrementoLinea = 15;

    int pX = 0;
    int pY = 0;

    public void darletras(String texto) {
        pX = (this.getWidth() / 2) - 20;
        pY = 0;

        datos = new char[texto.length()];
        x = new int[datos.length];
        y = new int[datos.length];

        xx = new int[datos.length * 4];
        yy = new int[datos.length * 4];

        datos[0] = texto.charAt(0);
        int lineaX = 0;
        int lineaY = 0;
        x[0] = pX;
        y[0] = pY;
        // +ab

        for (int i = 1; i < texto.length(); i++) {

            if (!esOperador(texto.charAt(i)) && esOperador(texto.charAt(i - 1))) {
                datos[i] = texto.charAt(i);
                pX -= incrementoX;
                x[i] = pX;
                pY += incrementoY;
                y[i] = pY;

                xx[lineaX++] = x[i - 1] + incrementoLinea;
                yy[lineaY++] = y[i - 1] + incrementoLinea;

                xx[lineaX++] = pX + incrementoLinea;
                yy[lineaY++] = pY + incrementoLinea;
            } else if (!esOperador(texto.charAt(i)) && !esOperador(texto.charAt(i - 1)) && !esOperador(texto.charAt(i - 2))) {
                datos[i] = texto.charAt(i);
                pX = x[i - 1];
                pX += (incrementoX * 2);
                pY = y[i - 3];
                x[i] = pX;
                y[i] = pY;

                buscar(datos, xx, yy, lineaX++, lineaY++);
                /*xx[lineaX++]=x[i-2]+incrementoLinea;
                yy[lineaY++]=y[i-2]+incrementoLinea;*/
                xx[lineaX++] = x[i] + incrementoLinea;
                yy[lineaY++] = y[i] + incrementoLinea;

            } else if (!esOperador(texto.charAt(i)) && !esOperador(texto.charAt(i - 1))) {
                datos[i] = texto.charAt(i);
                pX = x[i - 1];
                pX += (incrementoX * 2);
                x[i] = pX;
                y[i] = pY;

                xx[lineaX++] = x[i - 2] + incrementoLinea;
                yy[lineaY++] = y[i - 2] + incrementoLinea;

                xx[lineaX++] = x[i] + incrementoLinea;
                yy[lineaY++] = y[i] + incrementoLinea;

            } else if (esOperador(texto.charAt(i)) && esOperador(texto.charAt(i - 1))) {
                datos[i] = texto.charAt(i);
                pX -= (incrementoX * 2);
                x[i] = pX;
                pY += incrementoY;
                y[i] = pY;
                xx[lineaX++] = x[i - 1] + incrementoLinea;
                yy[lineaY++] = y[i - 1] + incrementoLinea;
                xx[lineaX++] = x[i] + incrementoLinea;
                yy[lineaY++] = y[i] + incrementoLinea;
            } else if (esOperador(texto.charAt(i)) && !esOperador(texto.charAt(i - 1)) && !esOperador(texto.charAt(i + 1))) {
                datos[i] = texto.charAt(i);
                pX += (incrementoX * 2);
                x[i] = pX;
                pY = y[i - 3];
                y[i] = pY;
                xx[lineaX++] = x[i - 4] + incrementoLinea;
                yy[lineaY++] = y[i - 4] + incrementoLinea;
                xx[lineaX++] = x[i] + incrementoLinea;
                yy[lineaY++] = y[i] + incrementoLinea;
            } else if (esOperador(texto.charAt(i)) && !esOperador(texto.charAt(i - 1)) && esOperador(texto.charAt(i + 1))) {
                datos[i] = texto.charAt(i);
                pX += (incrementoX * 2);
                x[i] = pX;
                pY = y[i - 3];
                y[i] = pY;

                buscar(datos, xx, yy, lineaX++, lineaY++);
                /*xx[lineaX++]=x[i-2]+incrementoLinea;
                yy[lineaY++]=y[i-2]+incrementoLinea;*/
                xx[lineaX++] = x[i] + incrementoLinea;
                yy[lineaY++] = y[i] + incrementoLinea;
            } else if (esOperador(texto.charAt(i)) && !esOperador(texto.charAt(i - 1))) {
                datos[i] = texto.charAt(i);
                pX += (incrementoX * 2);
                x[i] = pX;
                pY = y[i - 3];
                y[i] = pY;

                xx[lineaX++] = x[i - 2] + incrementoLinea;
                yy[lineaY++] = y[i - 2] + incrementoLinea;
                xx[lineaX++] = x[i] + incrementoLinea;
                yy[lineaY++] = y[i] + incrementoLinea;
            }

        }
    }
    int nivel = 0;

    public void buscar(char[] data, int[] px, int[] py, int l1, int l2) {
        boolean encontrado = false;
        int c = 0;
        while (!encontrado) {
            if (esOperador(data[c]) && esOperador(data[c + 1])) {
                if (nivel > 0) {
                    xx[l1] = x[c] + incrementoLinea;
                    yy[l2] = y[c] + incrementoLinea;
                } else if (esOperador(data[c + 2])) {
                    xx[l1] = x[c + 1] + incrementoLinea;
                    yy[l2] = y[c + 1] + incrementoLinea;
                    nivel++;
                } else {
                    xx[l1] = x[c] + incrementoLinea;
                    yy[l2] = y[c] + incrementoLinea;
                }

                encontrado = true;
            }
            c++;
        }
    }

    public boolean esOperador(char texto) {
        if (texto == '-' || texto == '+' || texto == '*' || texto == '/') {
            return true;
        } else {
            return false;
        }
    }

    public void paint(Graphics g) {
        //se crea la base donde se dibujara los árboles
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.decode("#99ccff"));
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight()); //Tomando como referencia de un rectángulo

        //Seleccionamos el tipo de fuente que se van a dibujas las letras dentro de los círculos
        Font trb = new Font("Century Gothic", Font.BOLD, 20);
        g2d.setFont(trb);
        g2d.setColor(Color.black); //Seleccionamos el color de la letra
        int lx = 0;
        int ly = 0;

        for (int i = 0; i < (datos.length * 2) - 2; i++) {
            g2d.drawLine(xx[i], yy[i++], xx[i], yy[i]);
        }

        for (int i = 0; i < datos.length; i++) {

            g2d.setColor(Color.blue); //Dibujamos los circulos y donde se almacenma el carácter
            g2d.fillOval(x[i], y[i], 30, 30);
            g2d.setColor(Color.WHITE);
            g2d.drawString(datos[i] + "", x[i] + 10, y[i] + 20);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(602, 133));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
