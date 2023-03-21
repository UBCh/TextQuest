package com.example.textquest.entities;


import java.util.HashMap;
import java.util.Map;


public class Content {
static String temp="";
    public  static Map <Integer, String> questions= new HashMap<>();

    static {
	questions.put(1,"На стене справа выбиты символы древнего языка, они требуют поклониться погребенному здесь богу.");
	questions.put(2,"Ты Поклонился!!!. И спокойно проходишь внутрь. Ты достаёшь факел из заплечного мешка. Ты зажигаешь его. Неровный, колеблющийся свет освещает коридор, пол покрыт пылью. Ты идёшь вперёд довольно долгое время, пока не натыкаешься на развилку, вправо и влево, два пути. Что выберешь?");
	questions.put(3," Ты пошел налево!!! и спокойно проходишь.Ты долго петляешь по коридорам, избегаешь ловушек (давно сломанных, впрочем), перепрыгиваешь через дыры в полу. Так доходишь до тронного зала. Ты видишь трон вдалеке, на нём полуразложившийся труп восседает, единственное сокровище — богато украшенный скипетр в его руке. Ты доходишь до трона. Ты смотришь на скипетр.");
    }

    public  static Map <Integer, String> answersFail= new HashMap<>();

    static {
	answersFail.put(1,"Ты вошел без уважения и стены раздавливают тебя.");
	answersFail.put(2,"Ты пошел направо и натыкаешься на ловушку. Стрелы из стен пронзают тебя.");
	answersFail.put(3,"Пытаешься вырвать скипетр. Труп пробуждается и убивает тебя.Ибо воровать не хорошо!!!");
    }

    public  static Map <Integer, String>  rightButton= new HashMap<>();

    public static String setTemp(String t) {
	temp = t;
	return temp;
    }

    public static String getTemp() {
	return temp;
    }

    static {
	rightButton.put(1,"bow down");
	rightButton.put(2,"Налево");
	rightButton.put(3,"Просто уходи");
    }

    public  static Map <Integer, String> buttonWong= new HashMap<>();

    static {
	buttonWong.put(1,"to hell with superstition");
	buttonWong.put(2,"Герои идут направо");
	buttonWong.put(3,"Хватай добычу");
    }




    public static int level=1;

    public static Map<Integer, String> getRightButton() {
	return rightButton;
    }

    public static Map<Integer, String> getButtonWong() {
	return buttonWong;
    }

    public static void plusLevel() {
	level = level+1;
    }

    public static Map<Integer, String> getQuestions() {
	return questions;
    }

    public static Map<Integer, String> getAnswersFail() {
	return answersFail;
    }



    public static int getLevel() {
		return level;
    }
}
