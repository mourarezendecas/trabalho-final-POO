import java.util.Scanner;

public class Administrador extends Usuario{
    Scanner input = new Scanner(System.in); 
    
    Voo V[] = new Voo[500]; 
    int opt, i=0; 
    
    public Administrador(String user, String senha) {
        super(user, senha);
    }
    
    public void criaVoo(){
        do{
            Voo V1 = new Voo(); 
            V[i] = V1;
            System.out.println("Deseja inserir mais voos?");
            i++; 
            System.out.printf("1 - Sim / 0 - Não: ");
            opt = input.nextInt(); 
        }
        while(opt!=0); 
    }
    
    public void listaVoo()
    {
        if(i==0)
        {
            System.out.println("NENHUM VOO INSERIDO");
        }
        else{
        System.out.println("--LISTANDO VOOS--");
        for(int j=0;j<i;j++)
        {
            System.out.println("--------");
            V[j].stats();
        }
        }
    }
    
    public void reservaAssento()
    {
        if(i==0)
        {
            System.out.println("NÃO HÁ VOOS CADASTRADOS!!!");
        }
        else{
        int opt_search = 0; 
        System.out.println("1 - BUSCAR POR CIDADE DE PARTIDA");
        System.out.println("2 - BUSCAR POR DIA DE PARTIDA");
        System.out.printf("Digite a opção desejada: ");
        opt_search = input.nextInt(); 
        
        if(opt_search==1)
                    {
                        System.out.printf("DIGITE O NOME DA CIDADE: ");
                        String cidade = input.next(); 
                        for(int j=0;j<i;j++)
                        {
                            if(V[j].partida.equals(cidade))
                            {
                                System.out.println("VOO Nº" +(j+1));
                                V[j].stats();
                            }
                        }
                        System.out.printf("DIGITE O VOO ESCOLHIDO: ");
                        int escolha = input.nextInt();
                        V[escolha-1].reservaAssento(); 
                        System.out.println("ASSENTO RESERVADO COM SUCESSO!!!");
                    }
                    else
                    {
                        System.out.printf("DIGITE O DIA DE PARTIDA: ");
                        int dia_partida = input.nextInt(); 
                        for(int j=0;j<i;j++)
                        {
                            if(V[j].dia==dia_partida)
                            {
                                System.out.println("VOO Nº" +(j+1));
                                V[j].stats();
                            }
                        }
                        
                        System.out.printf("DIGITE O VOO ESCOLHIDO: ");
                        int escolha = input.nextInt();
                        V[escolha-1].reservaAssento(); 
                        System.out.println("ASSENTO RESERVADO COM SUCESSO!!!");
                    }
        }
    }
    
    public void buscaVoo()
    {
        if(i==0)
        {
            System.out.println("NÃO HÁ VOOS CADASTRADOS!!!");
        }
        else{
        int opt_search = 0; 
        System.out.println("1 - BUSCAR POR CIDADE DE PARTIDA");
        System.out.println("2 - BUSCAR POR DIA DE PARTIDA");
        System.out.printf("Digite a opção desejada: ");
        opt_search = input.nextInt(); 
        
        if(opt_search==1)
                    {
                        System.out.printf("DIGITE O NOME DA CIDADE: ");
                        String cidade = input.next(); 
                        for(int j=0;j<i;j++)
                        {
                            if(V[j].partida.equals(cidade))
                            {
                                V[j].stats();
                            }
                        }
                    }
                    else
                    {
                        System.out.printf("DIGITE O DIA DE PARTIDA: ");
                        int dia_partida = input.nextInt(); 
                        for(int j=0;j<i;j++)
                        {
                            if(V[j].dia==dia_partida)
                            {
                                V[j].stats();
                            }
                        }
                    }
        }
    }
    
}
