package BancoObjetosEClasses;
//classe Account que contém uma variável de instância nome
// e métodos para configurar e obter seu valor.


public class Account {

	private String name; //variável de instância
	
	//método para definir o nome no objeto
	// o uso do this.(nome da variável) é uma boa prática
	//da programação pois isto miniza o uso de vários identifcadores
	public void setName(String name)
	{
		this.name = name; //armazena o nome
	}
	
	
	//retorna a String que pertence a váriavel de instância criada
	//por nós a name no caso que foi definido dentro da classe
	//(String name)
	//método para recuperar o nome do objeto
	public String getName()
	{
		return name; //retorna valor do nome para o chamador
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
     