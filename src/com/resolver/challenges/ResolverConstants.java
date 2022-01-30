package com.resolver.challenges;

public class ResolverConstants {
	
	public static String HOMEPAGE_URL = "http://127.0.0.1:5500/index.html";
	
	//Test1 Constants
	public static String BTN_OPEN_MODAL = "//button[contains(.,'Open Modal')]";
	public static String INPUT_NAME_MODAL = "//input[@type='text' and @id='name']";
	public static String SENDTEXT_RESOLVER = "Resolver";
	public static String SENDTEXT_HYDERABAD = "Hyderabad";
	public static String INPUT_CITY_MODAL = "city";
	public static String BUTTON_ENTER = "//button[@id='enter']";
	public static String BUTTON_CLOSE = "//button[contains(.,'Close')]";
	public static String VERIFY_VALUES_TEST1 = "//span[@id='nameVal'] | //span[@id='cityVal']";
	
	//Test2 Constants
	public static String BTN_CLICKME = "//button[contains(.,'Click Me!')]";
	public static String DROPDOWN_LIST = "//ul[@class='dropdown-menu show']/li";
	public static String INPUT_SEARCH ="myInput";
	public static String INPUT_SEARCH_ANGULAR ="Angular";
	public static String INPUT_SEARCH_REACTJS ="ReactJS";
	
	//Test3 Constants
	public static String BTN_SEARCHME = "searchMe";
	public static String SEARCH_USA = "USA";
	public static String TABLE_ROWS = "//tbody[@id='someTable']/tr[not(contains(@style,'display: none;'))]";
	
	
	//Test4 Constants
	public static String BTN_DRAGME = "//button[@id='drag1']";
	public static String DIV_DROPPABLEHOLDER = "//div[@ondragover='allowDrop(event)']";
	public static String DIVHASDRAGME = "//div[@ondragover='allowDrop(event)']/button[@id='drag1']";
	public static String DRAGME_TEXT="Drag Me";
	
	

}
