//Inicio del código

package Presentacion;

/**
*
* @ author
*/
import java.awt.Graphics;
import javax.swing.ImageIcon;
public class FondoFormulario extends javax.swing.JPanel {
public FondoFormulario(){
this.setSize(395, 493);
}
@ Override
public void paintComponent(Graphics g){
ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/Presentacion/Imagenes/FondoFormulario.png" ) ) ;

g.drawImage(imagenFondo.getImage(),0,0,395, 493, null);
setOpaque(false);
super.paintComponent(g);
}

}
