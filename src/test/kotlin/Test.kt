import io.restassured.RestAssured
import org.junit.Assert
import org.junit.Test

class Test {

    @Test
    fun `validar get start wars api`() {
        val endpoint = "https://swapi.dev/api/"
        var response = RestAssured.`when`().get(endpoint)

        response.prettyPrint()
        Assert.assertEquals("Teste", "${endpoint}people/", "${response.jsonPath().get<String>("people")}")


    }

}