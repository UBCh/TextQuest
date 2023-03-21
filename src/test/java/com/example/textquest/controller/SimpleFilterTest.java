package com.example.textquest.controller;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.example.textquest.entities.Content;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.*;

class SimpleFilterTest {

    @BeforeAll
    static void setUpAll() {
	SelenideLogger.addListener("allure", new AllureSelenide());
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	Configuration.browserCapabilities = options;
    }

    @AfterAll
    static void tearDownAll() {
	SelenideLogger.removeListener("allure");

    }

    @Test
    void name() {
	open("/index.jsp");
	$("#submit").click();
	sleep(5000);
	String expected= Content.buttonWong.get(1);
//	String actual=$("#choice").getValue();
	$("#submit").click();
	open("/fundament.jsp");
	sleep(5000);
	String actual=Content.getTemp();
	assertEquals(expected, actual);

	closeWindow();
    }
}