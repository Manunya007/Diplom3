package org.example.user;

import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;
import static org.example.constants.Constants.*;

public class UserSteps {

    @Step("Регистрация пользователя")
    public ValidatableResponse createUser(User user) {
        return given()
                .baseUri(HOME_PAGE_URL)
                .contentType(ContentType.JSON)
                .body(user)
                .when()
                .post(CREATE_USER)
                .then();
    }

    @Step("Авторизация пользователя")
    public ValidatableResponse loginUser(User user) {
        return given()
                .baseUri(HOME_PAGE_URL)
                .contentType(ContentType.JSON)
                .body(user)
                .when()
                .post(LOGIN_USER)
                .then();
    }

    @Step("Удаление пользователя")
    public ValidatableResponse deleteUser(String token) {
        return given()
                .baseUri(HOME_PAGE_URL)
                .contentType(ContentType.JSON)
                .header("Authorization", token)
                .when()
                .delete(DELETE_USER)
                .then();

    }
}