package team.ed.views;

import java.security.PublicKey;
import java.util.Scanner;

public class View {
    // Como no se necesitan estados que esten almacenando informacion, se obtara por trabajar las vistas con
    // metodos estaticos.
    public static void showHeaderPrincipal(){
        System.out.println("\t\t*************************************");
        System.out.println("\t\t* BIENVENIDO A LA CAJA REGISTRADORA *");
        System.out.println("\t\t*************************************");
    }

    public static void showMenuPrincipal(){
        System.out.println("\t\t\t 1. Comprar");
        System.out.println("\t\t\t 2. Vender");
        System.out.println("\t\t\t 3. Inventario");
        System.out.println("\t\t\t 4. Compras");
        System.out.println("\t\t\t 5. Ventas ");
        System.out.println("\t\t\t 6. Salir");
    }

    public static void showGetOption(){
        System.out.print("\t\tDigite la opcion: ");
    }

    public static void showGetAmount() {
        System.out.print("\t\tDigite la cantidad: ");
    }

    public static void showGetPrice() {
        System.out.print("\t\tDigite el precio: ");
    }
    public static int getOption() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    public static int getAmount(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    public static double getPrice(){
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }


    public static void showBuyHeader(){
        System.out.println("\t\t*******************************");
        System.out.println("\t\t*        MENU DE VENTAS       *");
        System.out.println("\t\t*******************************");
        showItemsMenu();
    }
    public static void showSaleHeader(){
        System.out.println("\t\t*******************************");
        System.out.println("\t\t*       MENU DE COMPRAS       *");
        System.out.println("\t\t*******************************");
        showItemsMenu();
    }

    public  static void showStockHeader(){
        System.out.println("\t\t*******************************************************");
        System.out.println("\t\t*                 I N V E N T A R I O                 *");
        System.out.println("\t\t*******************************************************");
        showItemsHeader();
    }

    public static void showItemsHeader(){
        System.out.println("\t\t--------------------------------------------------------");
        System.out.println("\t\t* PRODUCTO \t| CANTIDAD\t | Vr UNITARIO \t| Vr TOTAL  t|");
        System.out.println("\t\t--------------------------------------------------------");
    }

    public static void showBuyListHeader(){
        System.out.println("\t\t************************************************************");
        System.out.println("\t\t*                      C O M P R A S                       *");
        System.out.println("\t\t************************************************************");
        showItemsHeader();
    }

    public static void showSaleListHeader(){
        System.out.println("\t\t************************************************************");
        System.out.println("\t\t*                       V E N T A S                        *");
        System.out.println("\t\t************************************************************");
        showItemsHeader();
    }

    public static void showItemsMenu(){
        System.out.println("\t\t\t1. Papa");
        System.out.println("\t\t\t2. Arroz");
        System.out.println("\t\t\t3. Carne");
        System.out.println("\t\t\t4. Volver");
    }
}
