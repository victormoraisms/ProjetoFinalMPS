package jogocartas;

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2003
 * Company:
 * @author
 * @version 1.0
 */

public class MenuItem {

  private String label;
  private Command command;

  public MenuItem(String label, Command command) {
    this.label = label;
    this.command = command;
  }

  public void clicked(){
    command.execute();
  }
}