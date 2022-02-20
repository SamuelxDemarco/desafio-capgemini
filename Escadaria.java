public class Escadaria {
    public static void main(String args[]) {
        montaEscada(6);
      }
    public static void montaEscada(int numero){
        for(int i=1;i<=numero;i++){
            System.out.println(" ".repeat(numero-i)+"*".repeat(i));
    
        }
    }
}