package com.company;
import com.company.Contato;
import com.company.Fornecedor;
import com.company.Produto;
import com.company.Cesta;
import java.util.Scanner;
public class GerenciarProduto {

    public static void main(String[] args) {

        int op, retorno;

        Cesta Cesta = new Cesta();
        Scanner sc = new Scanner(System.in);


        System.out.println("1 - Adicionar Produto. ");
        System.out.println("2 - Listar Produtos. ");
        System.out.println("3 - Mostrar empregados.  ");
        System.out.println("4 - Somar Produto. ");

        do {
            System.out.println("Informe sua escolha: ");
            op = sc.nextInt();

            switch (op) {

                case 1:
                    Cesta.adcionarItem();
                    break;
                case 2:
                    Cesta.exibirLista();
                    break;
                case 3:
                    Cesta.registro();
                    break;
                case 4:
                    Cesta.calcularTotal();

            }

            System.out.println("Aperte 9 para repetir operação: ");
            retorno = sc.nextInt();
        }while(op != 9);
        System.out.println("Operação encerrada. ");





        sc.close();


    }
}
