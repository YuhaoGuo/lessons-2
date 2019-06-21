package com.zoumf77;

/**
 * 含有state和method
 * 有类变量
 * 有实例变量
 * @author zmf
 *
 */
public class StandardClassDemo {
	
	public static String name="我专门卖萝卜"; //类变量；实例变量  state 属性
	private int items=0;
	private float amount=0.00f; //实例变量；成员变量
	private String notes="";
	
	static final String STORENAME = "GREENSTORE";//常数
	
	
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		StandardClassDemo.name = name;
	}
	
	
	//参数
	public StandardClassDemo(int items, float amount, String notes) {
		super();
		this.items = items;
		this.amount = amount;
		this.notes = notes;
	}
	
	
	public StandardClassDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getItems() {
		return items;
	}
	public void setItems(int items) {
		this.items = items;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	
	
	public String toString(){
		return "STORENAME="+STORENAME+" ;name="+name+"; items="+items+"; amount="+amount+"; notes="+notes;
	}
	
	public static void main(String[] args){
		
		StandardClassDemo radish=new StandardClassDemo(100,234.56f,"萝卜");
		
		System.out.println("radish:"+radish.toString());
		
		StandardClassDemo chineseCabbage=new StandardClassDemo(200,334.56f,"白菜");
		
		System.out.println("chineseCabbage:"+chineseCabbage.toString());
		
		chineseCabbage.setName("我也卖白菜");
		
		System.out.println("radish:"+radish.toString());
	}

}
