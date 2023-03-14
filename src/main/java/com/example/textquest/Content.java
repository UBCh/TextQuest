package com.example.textquest;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;


public class Content {

    public  static Map <Integer, String> questions= new HashMap<>();

    static {
	questions.put(1,"question number 1");
	questions.put(2,"question number 2");
	questions.put(3,"question number 3");
    }

    public  static Map <Integer, String> answersFail= new HashMap<>();

    static {
	answersFail.put(1,"answer number 1");
	answersFail.put(2,"answer number 2");
	answersFail.put(3,"answer number 3");
    }
    static int current=8;
    static String name="";
    static int level=0;
    static String idSession="";



    public static String getIdSession() {
	return idSession;
    }

    public static void setIdSession(String idSes) {
	idSession = idSes;
    }

    public static void setLevel(int lev) {
	level = lev;
    }

    public static Map<Integer, String> getQuestions() {
	return questions;
    }

    public static Map<Integer, String> getAnswersFail() {
	return answersFail;
    }

    public static void setCurrent(int curr) {
	current = curr;

    }

    public static void setName(String n) {
	name = n;
	    }

    public static String getName() {
	return name;
    }

    public static int getCurrent() {
	return current;
    }

    public static int getLevel() {
		return level;
    }
}
