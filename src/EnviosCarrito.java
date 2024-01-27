/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumno
 */
public class EnviosCarrito {
    
    Factura face = new Factura();
    
    public void perfumesEnvio(String Pr1,String Pr2,String Pr3,String Ca1,String Ca2,String Ca3)
    {
    int producto1,producto2,producto3;
    int producto1Precio,producto2Precio,producto3Precio,envio;
     producto1 = Integer.parseInt(Ca1);
     producto1Precio = Integer.parseInt(Pr1);
     
     producto2 = Integer.parseInt(Ca2);
     producto2Precio = Integer.parseInt(Pr2);
     
     producto3 = Integer.parseInt(Ca3);
     producto3Precio = Integer.parseInt(Pr3);
     
     envio = ((producto1Precio*producto1) + (producto2Precio*producto2) + (producto3Precio*producto3));
     face.tomardatoPerfume(envio);
      face.Calculo();
    face.setVisible(true);
     //fac.setVisible(false);
    }
    
    public void carterasEnvio(String Pr1,String Pr2,String Pr3,String Ca1,String Ca2,String Ca3)
    {
    int producto1,producto2,producto3;
    int producto1Precio,producto2Precio,producto3Precio,envio1;
     producto1 = Integer.parseInt(Ca1);
     producto1Precio = Integer.parseInt(Pr1);
     
     producto2 = Integer.parseInt(Ca2);
     producto2Precio = Integer.parseInt(Pr2);
     
     producto3 = Integer.parseInt(Ca3);
     producto3Precio = Integer.parseInt(Pr3);
     
     envio1 = ((producto1Precio*producto1) + (producto2Precio*producto2) + (producto3Precio*producto3));
     face.tomardatoCartera(envio1);
     face.setVisible(false);
     face.Calculo();
    face.setVisible(true);
    }
    
     public void pantalonesEnvio(String Pr1,String Pr2,String Pr3,String Ca1,String Ca2,String Ca3)
    {
    int producto1,producto2,producto3;
    int producto1Precio,producto2Precio,producto3Precio,envio1;
     producto1 = Integer.parseInt(Ca1);
     producto1Precio = Integer.parseInt(Pr1);
     
     producto2 = Integer.parseInt(Ca2);
     producto2Precio = Integer.parseInt(Pr2);
     
     producto3 = Integer.parseInt(Ca3);
     producto3Precio = Integer.parseInt(Pr3);
     
     envio1 = ((producto1Precio*producto1) + (producto2Precio*producto2) + (producto3Precio*producto3));
     face.tomardatoPantalon(envio1);
     face.setVisible(false);
     face.Calculo();
    face.setVisible(true);
    }
     
      public void zapatosEnvio(String Pr1,String Pr2,String Pr3,String Ca1,String Ca2,String Ca3)
    {
    int producto1,producto2,producto3;
    int producto1Precio,producto2Precio,producto3Precio,envio1;
     producto1 = Integer.parseInt(Ca1);
     producto1Precio = Integer.parseInt(Pr1);
     
     producto2 = Integer.parseInt(Ca2);
     producto2Precio = Integer.parseInt(Pr2);
     
     producto3 = Integer.parseInt(Ca3);
     producto3Precio = Integer.parseInt(Pr3);
     
     envio1 = ((producto1Precio*producto1) + (producto2Precio*producto2) + (producto3Precio*producto3));
     face.tomardatoZapato(envio1);
     face.setVisible(false);
     face.Calculo();
    face.setVisible(true);
    }
      
       public void camisasEnvio(String Pr1,String Pr2,String Pr3,String Ca1,String Ca2,String Ca3)
    {
    int producto1,producto2,producto3;
    int producto1Precio,producto2Precio,producto3Precio,envio1;
     producto1 = Integer.parseInt(Ca1);
     producto1Precio = Integer.parseInt(Pr1);
     
     producto2 = Integer.parseInt(Ca2);
     producto2Precio = Integer.parseInt(Pr2);
     
     producto3 = Integer.parseInt(Ca3);
     producto3Precio = Integer.parseInt(Pr3);
     
     envio1 = ((producto1Precio*producto1) + (producto2Precio*producto2) + (producto3Precio*producto3));
     face.tomardatoCamisa(envio1);
     face.setVisible(false);
     face.Calculo();
    face.setVisible(true);
    }
}
