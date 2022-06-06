package com.company;

public class Fornecedor {
    //Attributes
    private int código;
    private String RazaoSoc;
    private String Endereco;
    private String cidade;
    private String estado;

    //Constructors


    public void Fornecedor() { //construtor default

    }
    public Fornecedor(String cidade, String estado){ //Construtor que define cidade e estado como padrão
        this.cidade = cidade;
        this.estado = estado;
    }
    //Methods

   public Fornecedor(int codigo, String RazaoSoc, String Endereco, String cidade, String estado, Contato contato){

   }
   public Fornecedor(int codigo, String RazaoSoc, String Endereco, Contato c){

}



    //Verificar se o condicional está correto
public void negativar(int codigo){ //metodo para não receber codigo negativo
        if(codigo > 0){
            System.out.println(codigo);
        }else{
            System.out.println("Codigo não pode receber valores negativos!");
        }
}

//methods getters and setters

    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public String getRazaoSoc() {
        return RazaoSoc;
    }

    public void setRazaoSoc(String razaoSoc) {
        RazaoSoc = razaoSoc;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    //method toString

    @Override
    public String toString() {
        return "Fornecedor{" +
                "código=" + código +
                ", RazaoSoc='" + RazaoSoc + '\'' +
                ", Endereco='" + Endereco + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
