package com.company;
import java.util.ArrayList;
import java.util.List;
import com.company.Produto;
import java.util.Scanner;
public class Cesta {

//Declarar um atributo chamado itens como um lista dinâmica de produtos (ArrayList)
 List<Produto> itens = new ArrayList<>();


 int codigo, qtde;
 double preco;

 Scanner sc = new Scanner(System.in);

 //methods

    public void adcionarItem(){

        System.out.println("Informe o código: ");
        codigo = sc.nextInt();
        System.out.println("Informe a quantidade: ");
        qtde = sc.nextInt();
        System.out.println("Informe o preço: ");
        preco = sc.nextDouble();

        itens.add(new Produto(codigo, qtde, preco));


    }

    public void exibirLista(){

        for(Produto item : itens){

            imprimir();

        }

    }



    public void registro(){


        Contato Contato = new Contato();
        Contato.informarContato();
        Produto Produto = new Produto();
        Produto.revelaFornecedor();


    }

    public double calcularTotal(){

         preco  = preco * qtde;
        System.out.println(preco);

        return 0;

    }

    public void imprimir(){

        System.out.println(codigo);
        System.out.println(qtde);
        System.out.println(preco);

    }

}
