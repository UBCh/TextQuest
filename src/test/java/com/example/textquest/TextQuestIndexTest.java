package com.example.textquest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.example.textquest.entities.Content;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TextQuestIndexTest {


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
	closeWindow();
	sleep(5000);
    }


    @Test
    @DisplayName("the user entered his name, and it was saved in the session")
    @Order(3)
    public void shouldStoreName() {
	var expected = "Player name : johny";
	var actual =$("#player_name").getText();
	assertEquals(expected, actual);
    }

    @Test
    @DisplayName("should get session id")
    @Order(2)
    public void shouldGetSessionId() {
	var expected = "";
	var actual =$("#idSession").getValue();
	assertNotEquals(expected, actual);
	    }

    @Test
    @DisplayName("gotta get the game number")
    @Order(1)
     public void shouldGetGameNumber() {
	$("#id_content").shouldBe(visible);
	var expected = "Current game: 1";
	var actual =$("#current_game").getText();
	assertEquals(expected, actual);
    }





}