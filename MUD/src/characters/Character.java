/**
 * 
 */
package characters;

import items.Item;

import java.util.List;


/**
 * @author ryan
 *
 */
public abstract class Character {
	protected String name;
	protected String race;
	protected String character_class;
	protected int level;
	protected int armor_rating;
	protected int xp;
	protected int strength;
	protected int intelligence;
	protected int wisdom;
	protected int dexterity;
	protected int constitution;
	protected int charisma;
	protected int luck;
	protected int hp;
	protected int mp;
	protected int sp;
	protected int sex;
	protected String description;
	protected List<Item> inventory;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the race
	 */
	public String getRace() {
		return race;
	}
	/**
	 * @param race the race to set
	 */
	public void setRace(String race) {
		this.race = race;
	}
	/**
	 * @return the character_class
	 */
	public String getCharacter_class() {
		return character_class;
	}
	/**
	 * @param character_class the character_class to set
	 */
	public void setCharacter_class(String character_class) {
		this.character_class = character_class;
	}
	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}
	/**
	 * @return the armor_rating
	 */
	public int getArmor_rating() {
		return armor_rating;
	}
	/**
	 * @param armor_rating the armor_rating to set
	 */
	public void setArmor_rating(int armor_rating) {
		this.armor_rating = armor_rating;
	}
	/**
	 * @return the xp
	 */
	public int getXp() {
		return xp;
	}
	/**
	 * @param xp the xp to set
	 */
	public void setXp(int xp) {
		this.xp = xp;
	}
	/**
	 * @return the strength
	 */
	public int getStrength() {
		return strength;
	}
	/**
	 * @param strength the strength to set
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}
	/**
	 * @return the intelligence
	 */
	public int getIntelligence() {
		return intelligence;
	}
	/**
	 * @param intelligence the intelligence to set
	 */
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	/**
	 * @return the wisdom
	 */
	public int getWisdom() {
		return wisdom;
	}
	/**
	 * @param wisdom the wisdom to set
	 */
	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}
	/**
	 * @return the dexterity
	 */
	public int getDexterity() {
		return dexterity;
	}
	/**
	 * @param dexterity the dexterity to set
	 */
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	/**
	 * @return the constitution
	 */
	public int getConstitution() {
		return constitution;
	}
	/**
	 * @param constitution the constitution to set
	 */
	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}
	/**
	 * @return the charisma
	 */
	public int getCharisma() {
		return charisma;
	}
	/**
	 * @param charisma the charisma to set
	 */
	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}
	/**
	 * @return the luck
	 */
	public int getLuck() {
		return luck;
	}
	/**
	 * @param luck the luck to set
	 */
	public void setLuck(int luck) {
		this.luck = luck;
	}
	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}
	/**
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}
	/**
	 * @return the mp
	 */
	public int getMp() {
		return mp;
	}
	/**
	 * @param mp the mp to set
	 */
	public void setMp(int mp) {
		this.mp = mp;
	}
	/**
	 * @return the sp
	 */
	public int getSp() {
		return sp;
	}
	/**
	 * @param sp the sp to set
	 */
	public void setSp(int sp) {
		this.sp = sp;
	}
	/**
	 * @return the sex
	 */
	public int getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(int sex) {
		this.sex = sex;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the inventory
	 */
	public List<Item> getInventory() {
		return inventory;
	}
	/**
	 * @param inventory the inventory to set
	 */
	public void setInventory(List<Item> inventory) {
		this.inventory = inventory;
	}
	
	
}
