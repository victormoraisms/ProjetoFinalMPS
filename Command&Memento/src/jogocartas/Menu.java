package jogocartas;

import java.util.Collection;
import java.util.ArrayList;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2003
 * Company:
 * @author
 * @version 1.0
 */

public class Menu{

  private Collection menuItens;

  public Menu() {
    this.menuItens = new ArrayList();
  }

  public void add (MenuItem menuItem){
    this.menuItens.add(menuItem);
  }
}