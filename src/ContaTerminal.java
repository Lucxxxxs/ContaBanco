/***************************************/
/*OBJETIVO: Simular receber dados ban- */
/*cários atraves do terminal.          */
/*AUTOR: Pedro Lucas.                  */
/*DATA: 08/05/2024.                    */
/***************************************/

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero;
        String agencia, nomeCliente;
        double saldo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, informe o nome do cliente: ");
        nomeCliente = teclado.next();

        System.out.println("Por favor, informe o número do cliente: ");
        numero = teclado.nextInt();

        System.out.println("Por favor, informe a agência do cliente: ");
        agencia = teclado.next();

        System.out.println("Por favor, informe o saldo do cliente: ");
        saldo = teclado.nextDouble();

        JOptionPane.showMessageDialog(null, "Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo de "+saldo+" já está disponível para saque.");

        teclado.close();
    }
}
