package com.example.textquest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.LogEventListener;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class TextQuestServletTest {


    @BeforeAll
    static void setUpAll() {
	SelenideLogger.addListener("allure", new AllureSelenide());
	Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
	open("/index.jsp");
	$("#lname").setValue("johny");
	$("#submit").click();
    }

    @AfterAll
    static void tearDownAll() {
	SelenideLogger.removeListener("allure");
    }

    @DisplayName("should show the select page")
    @Test
    void shouldShowSelectPage() {
	$("id_nav").shouldBe(visible);

    }

    @Test
    @DisplayName("the user entered his name, and it was saved in the session")
    public void shouldStoreName() {
	var expected = "Player name : johny";
	var actual =$("#player_name").getOwnText();
	assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should get session id")
    public void shouldGetSessionId() {
	var expected = "";
	var actual =$("#idSession").getOwnText();
	assertNotEquals(expected, actual);
	    }

    @Test
    @DisplayName("gotta get the game number")
     public void shouldGetGameNumber() {
	var expected = "Current game: 1";
	var actual =$("#current_game").getOwnText();
	assertEquals(expected, actual);
    }



    



}