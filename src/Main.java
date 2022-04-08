import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int opt, opt_main;
        
        
        
        Scanner input = new Scanner(System.in); 
        
        Administrador A1 = new Administrador("rezendecas", "1234");
        A1.setNome("Gabriel Rezende");
        
        Cliente C1 = new Cliente("marcioalcovias" ,"1234");
        C1.setNome("Marcio Alcovias");
        
        
        do{
        System.out.println("ACESSAR A AREA:");
        System.out.println("1 - ADM");
        System.out.println("2 - CLIENTE");
        System.out.println("0 - ENCERRAR SISTEMA");
        System.out.printf("OPÇÃO:");
        opt_main = input.nextInt();
                switch(opt_main)
                {
                    case 1: 
                        
                            System.out.printf("login: ");
                            String login = input.next(); 
                            System.out.printf("senha: ");
                            String senha = input.next();
                            
                            if(login!=A1.getUser()||senha!=A1.getSenha())
                            {
                                System.out.println(login.equals(A1.getUser()));
                                System.out.println(senha.equals(A1.getSenha()));
                            }

                        do{
                            System.out.println("AREA DO ADM");
                            
                            System.out.println("1 - INSERIR VOO");
                            System.out.println("2 - LISTAR TODOS OS VOOS");
                            System.out.println("3 - BUSCAR VOO");
                            System.out.println("4 - RESERVAR VOO");
                            System.out.println("0 - ENCERRAR");
                            System.out.printf("DIGITE A OPCAO: ");
                            opt = input.nextInt();
                            switch(opt)
                            {
                                case 1:
                                    A1.criaVoo();
                                    break;

                                case 2:
                                    A1.listaVoo();
                                    break;

                                case 3: 
                                    A1.buscaVoo();
                                    break;
                                    
                                case 4: 
                                    A1.reservaAssento();
                                    break;
                            }        
                          }while(opt!=0);
                    break;
                    
                    case 2: 
                        do{
                            System.out.println("1 - LISTAR TODOS OS VOOS");
                            System.out.println("2 - BUSCAR VOO");
                            System.out.println("3 - RESERVAR VOO");
                            System.out.println("0 - ENCERRAR");
                            System.out.printf("DIGITE A OPCAO: ");
                            opt = input.nextInt();
                            switch(opt)
                            {
                                case 1:
                                    A1.listaVoo();    
                                    break;
                                
                                case 2:
                                    A1.buscaVoo();    
                                    break;    

                                case 3:
                                    A1.reservaAssento();
                                    break;
                            }  
                        }while(opt!=0);
                        
                    }
        }
        while(opt_main!=0);
    }
}
