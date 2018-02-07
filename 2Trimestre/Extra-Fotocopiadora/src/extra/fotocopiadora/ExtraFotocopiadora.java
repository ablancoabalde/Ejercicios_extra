package extra.fotocopiadora;

import javax.swing.JOptionPane;

public class ExtraFotocopiadora {

    public static void main(String[] args) {
        boolean exit=true;
        Metodos obx=new Metodos();

        int opcion=4;

        // Bucle para trabajar con la app
        do {
            /*
            Try para que no deje de funcionar cuando pulse cancelar en el JOptionPane y cierre la app
             */
            try {
                opcion=Integer.parseInt(JOptionPane.showInputDialog("Opciones:\n "
                        +"1) Enviar\n "
                        +"2) Imprimir\n"
                        +"3) Ver cola\n"
                        +"4) Salir\n"));

                switch (opcion) {
                    case 1:
                        obx.enviar(new Texto(
                                JOptionPane.showInputDialog("Texto a imprimir"),
                                Integer.parseInt(JOptionPane.showInputDialog("Unidades a imprimir"))
                        ));
                        break;
                    case 2:
                        obx.imprimir();
                        break;
                    case 3:
                        obx.verCola();
                        break;
                    case 4:

                        exit=false;
                        break;

                }
            } catch (NumberFormatException excepcion) {
                System.out.println("Aplicación cerrada");
                exit=false;
            }

        } while (exit==true);
    }

}
