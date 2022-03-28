import io.restassured.RestAssured
import io.restassured.RestAssured.*
import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun `validar get start wars api`() {
        val endpoint = "https://swapi.dev/api/"
        `when`().
        get(endpoint).
        thenReturn().
        jsonPath().get<String>("people").also {
            Assert.assertEquals("Teste", "${endpoint}people/", it)
        }

    }

    @Test
    fun `post para a api do postman`() {

        val endpoint = "https://postman-echo.com/"

        given()
            .body("{`teste`: `1`}")
            .`when`()
            .post(endpoint + "post")
            .thenReturn().jsonPath().get<String>("data").also {
                println(it)
                Assert.assertEquals("Teste","{`teste`: `1`}", it )
            }
    }

}