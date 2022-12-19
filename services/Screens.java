package services;

public class Screens {
    static public void initialScreen(){
        System.out.println("========================================================================================");
        System.out.println("========================================================================================");
        System.out.println("============================ Sistema Bancário ==========================================");
        System.out.println("========================================================================================");
        System.out.println("========================================================================================");
    }

    public static void menu() {
        System.out.println("VOCÊ DESEJA:");
        System.out.println("1 - ABRIR UMA CONTA.");
        System.out.println("2 - LISTAR CLIENTES CADASTRADOS");
        System.out.println("3 - DEPOSITAR NA CONTA CORRENTE");
    }


}
