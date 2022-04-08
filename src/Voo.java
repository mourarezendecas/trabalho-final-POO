import java.util.Scanner;

public class Voo {
    
    Scanner input = new Scanner(System.in);
    
    public String partida;
    public String chegada; 
    public double valor; 
    public int dia, mes, assentos; 

    public Voo() {
        System.out.printf("Digite a partida: ");
        partida = input.next();
        System.out.printf("Digite a chegada: ");
        chegada = input.next();
        System.out.printf("Digite o valor: R$");
        valor = input.nextDouble();
        System.out.printf("Digite o dia: ");
        dia = input.nextInt();
        System.out.printf("Digite o mês: ");
        mes = input.nextInt();
        System.out.printf("Digite a quantidade de assentos disponíveis: ");
        assentos = input.nextInt();
    }
    
    public void stats()
    {
        System.out.println("PARTIDA: " + this.partida);
        System.out.println("CHEGADA: " + this.chegada);
        System.out.println("DIA: "+this.dia+"/"+this.mes);
        System.out.println("VALOR: R$"+this.valor);
        System.out.println("ASSENTOS DISPONÍVEIS: " +this.assentos);
    }
    
    public void reservaAssento()
    {
        this.assentos --; 
    }
    
}
