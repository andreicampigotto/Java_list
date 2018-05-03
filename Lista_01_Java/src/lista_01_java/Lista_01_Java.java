
package lista_01_java;
import console.Console;

public class Lista_01_Java {

    public static void main(String[] args) {
        Console.write("Digite sua Idade em anos: ");
        int anos = Console.readInt();
        int anosMeses = anos*12;
        int anosDias = anos*365;
        Console.writeLn("Sua idade em meses é: " +anosMeses + 
                "\nSua idade em dias é :" + anosDias);
         Console.write("Digite sua idade em meses: ");
        int meses = Console.readInt();
        int mesesAnos = meses/12;
        int mesesDias = meses*30;
        Console.writeLn("Sua idade em meses é: " +mesesAnos + 
                "\nSua idade em dias é :" + mesesDias);
         Console.write("Digite sua idade em dias: ");
        int dias = Console.readInt();
        int diasAnos = dias/365;
        int diasMeses = dias/30;
        Console.writeLn("Sua idade em anos é: " +diasAnos + 
                "\nSua idade em meses é :" + diasMeses);
    }
    
}
