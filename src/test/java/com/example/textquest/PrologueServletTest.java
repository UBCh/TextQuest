package com.example.textquest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.*;

class PrologueServletTest {


    @Test
    public void userCanLoginByUsername() {
	open("/index.jsp");
	$("#lname").setValue("johny");
	$("#submit").click();
	open("/fundament.jsp");
	$("#player_name").shouldHave(text("johny"));
    }

}