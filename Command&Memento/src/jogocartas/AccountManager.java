package jogocartas;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
   private List<AccountMemento> mementoList = new ArrayList<AccountMemento>();

   public void add(AccountMemento state){
      mementoList.add(state);
   }

   public AccountMemento get(int index){
      return mementoList.get(index);
   }
}
