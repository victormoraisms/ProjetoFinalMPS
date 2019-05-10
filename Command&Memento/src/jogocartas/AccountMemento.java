package jogocartas;

public class AccountMemento {
   private String state;

   public AccountMemento(String state){
      this.state = state;
   }

   public String getState(){
      return state;
   }

   public void setState(String state) {
	   this.state = state;
   }	
   
}