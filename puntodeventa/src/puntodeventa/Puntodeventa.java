/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puntodeventa;

import java.util.InputMismatchException;
import java.sql.SQLException;
import java.util.Scanner;


public class Puntodeventa {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        Scanner sca = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        
        conexion con=new conexion();
        metodos met=new metodos();
        
        while (!salir){
            
            System.out.println("-------------MENU--------------");
            System.out.println("------------------------------");
            System.out.println("------------------------------");
            System.out.println("0. DESEA CONSULTAR PRODUCTO");
            System.out.println("1. INSERTAR PRODUCTO");
            System.out.println("2. ELIMINAR PRODUCTO");
            System.out.println("3. ACTUALIZAR PRODUCTO");
            
            System.out.println("4. DESEA CONSULTAR VENTA");
            System.out.println("5. INSERTAR VENTA");
            System.out.println("6. ELIMINAR VENTA");
            System.out.println("7. ACTUALIZAR VENTA");
            
            System.out.println("8. DESEA CONSULTAR CLIENTE");
            System.out.println("9. INSERTAR CLIENTE");
            System.out.println("10. ELIMINAR CLIENTE");
            System.out.println("11. ACTUALIZAR CIENTE");
            
            System.out.println("12. SALIR");
            
            System.out.println("------------------------------");
            System.out.println("------------------------------");
            System.out.println("------------------------------");
            System.out.println("******************************");
            
                try{
                    System.out.print("ESCRIBE UNA DE LAS OPCIONES;");
                    opcion = sca.nextInt();
                     
                        switch(opcion){
                            case 0:
                                met.consultaProducto();
                                break;
                            case 1:
                                System.out.println("---INGRESE DATOS DEL PRODUCTO---");
                                System.out.println("INGRESE EL NOMBRE DEL PRODUCTO:");
                                String descripcion=sca.next();
                                System.out.println("INGRESE EL PRECIO:");
                                double precio=sca.nextDouble();
                                producto pro=new producto(descripcion,precio);
                                met.agregarProducto(pro);
                                break;
                            case 2:
                                System.out.println("INGRESE EL ID DEL PRODUCTO QUE DESEA ELIMINAR:");
                                int id_productoo=sca.nextInt();
                                met.eliminarProducto(id_productoo);
                                break;
                            case 3:
                                System.out.println("---INGRESE DATOS DEL PRODUCTO---");
                                System.out.println("INGRESE EL ID DEL PRODUCTO QUE DESEA ACTUALIZAR:");
                                int id_productooo=sca.nextInt();
                                System.out.println("INGRESE EL NOMBRE NUEVO:");
                                String descripcion3=sca.next();
                                System.out.println("INGRESE EL PRECIO NUEVO:");
                                double precio3=sca.nextDouble();
                                producto proc=new producto(descripcion3,precio3);
                                met.actualizarProducto(proc,id_productooo);
                                break;
                            case 4:
                                met.consultaVenta();  
                                break;
                            case 5:  
                                System.out.println("---INGRESE DATOS DE LA VENTA---");
                                System.out.println("INGRESE EL ID DEl PRODUCTO:");
                                int id_pro=sca.nextInt();
                                System.out.println("INGRESE EL ID DEl CLIENTE:");
                                int id_cli=sca.nextInt();
                                System.out.println("INGRESE LA CANTIDAD DE LA VENTA:");
                                double cantidad=sca.nextDouble();
                                System.out.println("INGRESE EL DESCUENTO DE LA VENTA:");
                                double descuento=sca.nextDouble();
                                System.out.println("INGRESE LA FECHA DE LA VENTA:");
                                int fecha=sca.nextInt();
                                venta ven=new venta(id_pro,id_cli,cantidad,descuento,fecha);
                                met.agregarVenta(ven); 
                                break;
                            case 6:
                                System.out.println("INGRESE EL ID DE LA VENTA QUE DESEA ELIMINAR:");
                                int id_ventaa=sca.nextInt();
                                met.eliminarVenta(id_ventaa);
                                break;
                            case 7:
                                int id_cliteee=1;
                                int id_produc=1;
                                System.out.println("---INGRESE DATOS DE LA VENTA A MODIFICAR---");
                                System.out.println("INGRESE EL ID DE LA VENTA QUE DESEA ACTUALIZAR:");
                                int id_ventaaa=sca.nextInt();                                
                                System.out.println("INGRESE LA CANTIDAD NUEVA:");
                                double cantidadd=sca.nextDouble();
                                System.out.println("INGRESE EL DESCUENTO NUEVO:");
                                double descuentoo=sca.nextDouble();
                                System.out.println("INGRESE A FECHA NUEVA:");
                                int fechaaa=sca.nextInt();
                                venta vent=new venta(id_cliteee,id_produc,cantidadd,descuentoo,fechaaa);
                                met.actualizarVenta(vent,id_ventaaa);
                                break;
                            case 8:
                                met.consultaCliente();
                                break;
                            case 9:
                                System.out.println("---INGRESE DATOS DEL NUEVO CLIENTE---");
                                System.out.println("INGRESE EL NOMBRE:");
                                String nombre=sca.next();
                                System.out.println("INGRESE EL RFC:");
                                String rfc=sca.next();
                                
                                datos dat=new datos(nombre,rfc);
                                met.agregarCliente(dat); 
                                break;
                            case 10:
                                System.out.println("INGRESE EL ID DEL CLIENTE  QUE DESEA ELIMINAR:");
                                int id_clientee=sca.nextInt();
                                met.eliminarCliente(id_clientee);
                                break;
                            case 11:
                                System.out.println("---INGRESE DATOS DEL CLIENTE A ACTUALIZAR---");
                                System.out.println("INGRESE EL ID DEL CLIENTE QUE DESEA ACTUALIZAR:");
                                int id_clienteee=sca.nextInt();
                                System.out.println("INGRESE EL NOMBRE DEL CLIENTE NUEVO:");
                                String nombree=sca.next();
                                System.out.println("INGRESE EL RFC NUEVO:");
                                String rfcc=sca.next();
                                datos dato=new datos(nombree,rfcc);
                                met.actualizarCliente(dato,id_clienteee);
                                break;
                            case 12:
                                salir = true;
                                break;
                                
                            default:
                                System.out.println("------------------------------");
                                System.out.println("******************************");
                                System.out.println("SELECCIONE UN NUMERO del 1 al 12");
                                System.out.println("------------------------------");
                                System.out.println("******************************");
                        }
                    
                }catch(InputMismatchException e){
                    System.out.print("Debes insertar un numero");
                    sca.next();
                }
        }
        
       
        
        
    }
    
}

