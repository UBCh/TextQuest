package com.example.textquest;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class TextQuestServletTest {


    @Test
    public void userCanLoginByUsername() {
	open("/index.jsp");
	$("#lname").setValue("johny");
	$("#submit").click();
	open("/fundament.jsp");
	$("#player_name").shouldHave(text("johny"));
    }

}