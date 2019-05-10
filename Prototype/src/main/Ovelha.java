package main;

public class Ovelha implements Cloneable {
  private String name;
  public Ovelha(String name) { this.name = name; }
  public void setName(String name) { this.name = name; }
  public String getName() { return name; }
	 
  @Override
  public Ovelha clone() throws CloneNotSupportedException {
	  
	   return new Ovelha(name);
	 }
  
  
}