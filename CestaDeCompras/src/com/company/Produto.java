package com.company;
import com.company.Fornecedor;
public class Produto {
    //Attributes
    private int codigo;
    private String descricao;
    private double preco;
    private int quantidade;

    //Constructors

    //Methods

    public Produto(){

    }

    public Produto(int codigo, int quantidade,double preco){

        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;

    }

    public void revelaFornecedor(){

        Fornecedor Forc = new Fornecedor("Mogi mirim. ", "SP");
        System.out.println(Forc);


    }


    //Verificar se o condicional está correto
public void Negativar(){ // metodo para não receber valores negativos
    if(codigo < 0 && quantidade < 0 && preco < 0){
        System.out.println(codigo);
        System.out.println(quantidade);
        System.out.println(preco);
        revelaFornecedor();

    }else{
        System.out.println("Valores invalidos!");
    }
}


//methods getters and setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    //method toString


    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
