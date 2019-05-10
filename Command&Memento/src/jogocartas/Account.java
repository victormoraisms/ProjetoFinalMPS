package jogocartas;

public class Account {
   private String state;

   public void setState(String state){
      this.state = state;
      System.out.println("Setado estado da conta: " + state + ". Porem nao foi salvo. \n");
   }

   public String getState(){
      return state;
   }

   public AccountMemento saveStateToMemento(){
	   System.out.println("Salvo estado da conta: " + state + "\n");
      return new AccountMemento(state);
   }

   public void getStateFromMemento(AccountMemento memento){
      state = memento.getState();
   }
}