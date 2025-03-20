import java.util.Scanner;

public class Operadores {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int operacao =0 ;
        int n1 =0;
        int n2=0;
    
        
        System.out.println("digite a operação que deseja realizar :  1-soma 2- subtracão 3-divisão 4- multiplicação ");
        operacao = ler.nextInt();
        System.out.println("Digite os numero 1");
        n1 = ler.nextInt();
        System.out.println("digite o numero  2");
         n2 = ler.nextInt();
        
        if (operacao==1){
            System.out.println(n1+n2);
        
        }else if(operacao ==2){
            System.out.println(n1-n2);
        }else if(operacao ==3){
            System.out.println(n1/n2);
        }else if(operacao == 4){
            System.out.println(n1*n2);
        }else{
            System.out.println("Opcão invalida "); 
        }
        
    }

}
