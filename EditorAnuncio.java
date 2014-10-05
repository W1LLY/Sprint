/**
 * Ventana para insertar anuncios-solamente interfaz por el momento
 * 
 * @author Willy Sanchez Rojas 
 * @version 1.0
 */
import javax.swing.*;
import java.awt.*;
public class EditorAnuncio extends JFrame
{
    JButton aceptar;
    JButton cancelar;
    JTextField campoTexto;
    JButton registro;
    
    public EditorAnuncio()
    {
        campoTexto=new JTextField();
        this.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints contraints = new GridBagConstraints();
        contraints.gridx = 0;
        contraints.gridy=0;
        contraints.gridwidth =2;
        contraints.gridheight =2;
        contraints.fill=GridBagConstraints.BOTH;
        contraints.weighty=1.0;
        contraints.weightx=0.5;
        this.getContentPane().add(campoTexto,contraints);
        contraints.weighty=0.0;
        contraints.weightx=0.0;
        
        aceptar=new JButton("Aceptar");
        contraints.gridx=2;
        contraints.gridy=0;
        contraints.gridwidth=1;
        contraints.gridheight=1;
        contraints.fill=GridBagConstraints.NORTHWEST;
        contraints.weighty=1.0;
        this.getContentPane().add(aceptar,contraints);
        contraints.weighty=0.0;
        
        cancelar=new JButton("Cancelar");
        contraints.gridx=2;
        contraints.gridy=1;
        contraints.gridwidth=1;
        contraints.gridheight=1;
        contraints.fill=GridBagConstraints.NORTHWEST;
        contraints.weighty=1.0;
        this.getContentPane().add(cancelar,contraints);
        contraints.weighty=0.0;
        
        registro=new JButton("Ver Registro");
        contraints.gridx=1;
        contraints.gridy=2;
        contraints.gridwidth=1;
        contraints.gridheight=1;
        contraints.fill=GridBagConstraints.NORTH;
        contraints.weightx=0.5;
        this.getContentPane().add(registro,contraints);
        contraints.weightx=0.0;
        
        this.setSize(700,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[]args)
    {
        new EditorAnuncio();
    }
}
