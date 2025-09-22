package org.bookstore.books;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.ws.rs.core.Response;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest // @SpringBootTest
public class BookResourceTest {

    @Test
    public void testGetAllBook() {
        given()
                .header("Content-Type", "application/json")
                .when()
                .get("/api/books/")
                .then()
                .statusCode(Response.Status.OK.getStatusCode());
    }

    @Test
    public void testGetBookById() {
        given()
                .header("Content-Type", "application/json")
                .pathParam("id", "1")
        .when()
                .get("/api/books/{id}")
        .then()
                .statusCode(Response.Status.OK.getStatusCode())
                .body("title", CoreMatchers.is("title 1"));
    }
}
