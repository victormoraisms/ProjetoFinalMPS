package jogocartas;

import java.util.Scanner;

public class MementoCommand implements Command{
   public void execute() {
   
      Account originator = new Account();
      AccountManager zelador = new AccountManager();
      Scanner in = new Scanner(System.in);
      String estado = null;
      
      originator.setState(inserirEstado(estado, in));
      originator.setState(inserirEstado(estado, in));
      zelador.add(originator.saveStateToMemento());
      
      originator.setState(inserirEstado(estado, in));
      zelador.add(originator.saveStateToMemento());
      
      originator.setState(inserirEstado(estado, in));
      System.out.println("Estado atual da conta: " + originator.getState() + "\n");		
      
      originator.getStateFromMemento(zelador.get(0));
      System.out.println("Primeira estado da conta salvo: " + originator.getState());
      originator.getStateFromMemento(zelador.get(1));
      System.out.println("Segundo estado da conta salvo: " + originator.getState());
   }
   
   public String inserirEstado(String estado, Scanner in) {
	   
	   System.out.println("Insira um estado da conta:");
	      
	      do {
	    	  
	    	  estado = in.nextLine();
	    	  
	      }while(estado.isEmpty());
	   
	   return estado;
   }
}
