/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exaprac2;
import javax.swing.JOptionPane;
/**
 *
 * @author CerratoJordan
 */
public class JoseCerrato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       String [] productos = new String[10];
       int [] cantidad = new int[10];
       double [] precio = new double[10];
       int menu,cP=0;
       String msj="";
       double total= 0;
       double iva=0;
       String m1 = "";
       
       do{
           menu = Integer.parseInt( JOptionPane.showInputDialog("------------MENÚ----------\n 1- Ingresar productos\n 2- Mostrar Productos\n 3- Salir "));
      
            switch(menu){
                case 1: 
                    cP= Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos Ingresara"));
                     for (int i = 0; i < cP; i++) {
                           productos[i] = JOptionPane.showInputDialog((i+1)+"° Producto");
                           cantidad[i]= Integer.parseInt( JOptionPane.showInputDialog("Cantidad"));
                           precio[i]= Double.parseDouble(JOptionPane.showInputDialog("Precio $"));
                    }
                      m1="S";
                    break;
                case 2:
                    for (int i = 0; i < cP; i++) {
                        total += precio[i]*cantidad[i];
                        
                        msj += "Producto:  " +productos[i]+"  Cantidad:  "+ cantidad[i]+"  Precio Unit:  $" + precio[i]+"  PrecioTot:  $"+total+"\n";
                    } 
                    iva= total*0.13;
                    total = total+iva;
                    JOptionPane.showMessageDialog(null,msj+"\nTOTAL DE LA COMPRA IVA INCLUIDO:  $"+total);
                    m1="S";
                    break;
                case 3: 
                    m1="N";
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Error Ingrese un Numero Correcto");
                     m1="S";
                    break;


            }
       }while(m1=="S" || m1=="s");
    
    }
}
