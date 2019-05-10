package jogocartas;


public class Application{

 

  public MenuItem createMenuItem(String label, Command command){
    return new MenuItem(label, command);
  }

  public Menu createMenu(){
    return new Menu();
  }

 public static void main(String[] args){

    Application application = new Application();
    Menu menu = application.createMenu();

    Command mementoCommand = new MementoCommand();

    MenuItem mementoItem = application.createMenuItem("Memento", mementoCommand);

    menu.add(mementoItem);

    mementoItem.clicked();

  }
}