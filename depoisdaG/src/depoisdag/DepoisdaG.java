
package depoisdag;

import console.Console;
public class DepoisdaG {

    
    public static void main(String[] args) {
        Console.write("Digite o tempo em segundos: ");
        int segundos = Console.readInt();
        float segundosHoras = segundos / 3600f;
        float segundosMinutos = segundos / 60f;
        Console.writeLn("Seu tempo em horas é: " + segundosHoras  + 
                "\nSeu tempo em minutos é: " + segundosMinutos);
        
        Console.write("\nDigite o tempo em minutos: ");
        int minutos = Console.readInt();
        float minutosHoras = minutos / 60f;
        float minutosSegundos = minutos * 60f;
        Console.writeLn("Seu tempo em horas é: " + minutosHoras  + 
                "\nSeu tempo em segundos é: " + minutosSegundos);
        
        Console.write("\nDigite o tempo em horas: ");
        int horas = Console.readInt();
        float horasMinutos = horas * 60f;
        float horasSegundos = horas * 3600f;
        Console.writeLn("Seu tempo em minutos é: " + horasMinutos  + 
                "\nSeu tempo em segundos é: " + horasSegundos);
        
    }
    
}
