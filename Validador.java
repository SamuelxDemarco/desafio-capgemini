import java.util.List;

public class Validador {
    
    public static void main(String[] args) {
        System.out.println(validaSenha("Samu"));
        System.out.println(validaSenha("RoDriGues"));
        System.out.println(validaSenha("Sa4%LL"));
    }
    
    public static int validaSenha (String senha){
        
        int quantidadeValidacoes = 0;
        List<String> numeros = List.of("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
        List<String> caracteresEspeciais = List.of("!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "+");
        
        boolean validoMaiusculo = false;
        boolean validoMinisculo = false;
        boolean validoNumero = false;
        boolean validoEspecial = false;
        
        for (int i = 0; i < senha.length(); i++) {
            
            String caracter = senha.substring(i, i+1);
            
            if (!validoNumero && numeros.contains(caracter)) {
                validoNumero =  true;
            }
            
            if (!validoEspecial && caracteresEspeciais.contains(caracter)) {
                validoEspecial =  true;
            }
            
            String maiuscula = caracter.toUpperCase();
            if (!validoMaiusculo && maiuscula.equals(caracter)) {
                validoMaiusculo = true;
            }
            
            String minusculo = caracter.toLowerCase();
            if (!validoMinisculo && minusculo.equals(caracter)) {
                validoMinisculo = true;
            }
        
            
        }
        
        if (!validoNumero ) {
            quantidadeValidacoes = quantidadeValidacoes + 1;
        }
        
        if(!validoEspecial) {
            quantidadeValidacoes = quantidadeValidacoes +1;
        }
        
        if (!validoMaiusculo) {
            quantidadeValidacoes = quantidadeValidacoes +1;
        }
        
        if(!validoMinisculo) {
            quantidadeValidacoes = quantidadeValidacoes +1;
        }
         
        if (senha.length() < 6) {
            quantidadeValidacoes = quantidadeValidacoes +1;
        }
        
        return quantidadeValidacoes;
    }

}