//Programa Interest.java
//Cálculo de juros compostos usando a estrutura de repetição for

public class Interest{
    public static void main (String[] args){
        
        double amount; //quantia em depósito ao final de cada ano
        double principal = 1000.0; //capital inicial
        double rate = 0.05; //taxa de juros
        
        //exibe cabeçalhos
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        //cálculo da quantidade de depósito para cada um dos dez anos
        for (int year = 1; year <= 10; ++year)
        {
            //calcula nova quantidade durante ano especificado
            amount = principal * Math.pow(1.0 + rate, year);

            //exibe o ano e a quantia
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }//Fim método main
}//Fim da classe Interest