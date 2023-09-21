// Classe Carro
public class Carro {
    // Atributos da classe
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;

    // Construtor para inicializar os atributos
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false; // Carro começa desligado
    }

    // Método para ligar o carro
    public void ligar() {
        ligado = true;
        System.out.println("Carro ligado!");
    }

    // Método para desligar o carro
    public void desligar() {
        ligado = false;
        System.out.println("Carro desligado!");
    }

    // Método para mostrar informações do carro
    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Ligado: " + (ligado ? "Sim" : "Não"));
    }

    // Método main para demonstrar a instanciação de objetos e chamada de métodos
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro meuCarro = new Carro("Ford", "Fiesta", 2020);
        
        // Chamando os métodos do objeto
        meuCarro.mostrarInfo();
        meuCarro.ligar();
        meuCarro.mostrarInfo();
        meuCarro.desligar();
        meuCarro.mostrarInfo();
    }
}

