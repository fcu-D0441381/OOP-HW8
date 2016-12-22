package fcu.iecs.oop.pokemon;

public abstract class Pokemon implements Fightable{
	private int cp;
	private String nickName;
	private PokemonType type;
	
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public void setType(PokemonType type) {
		this.type = type;
	}
	
	public Pokemon(int a,String b,PokemonType c)
	{
		this.cp=a;
		this.nickName=b;
		this.type=c;
	}
	
}
