package app

import app.testframework.SpringWebMvcTest
import org.mockito.Mockito.doReturn
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest
import org.springframework.test.context.bean.`override`.mockito.MockitoBean

import scala.compiletime.uninitialized

@WebMvcTest(Array(classOf[AppController]))
class AppControllerTest extends SpringWebMvcTest:

  @MockitoBean
  var appService: AppService = uninitialized

  describe("AppController on /hello uri") {

    val stubbedResult = Array(User(15, "ANNA"))
    doReturn(stubbedResult)
      .when(appService)
      .getData

    it("should return the value returned by appService") {
      // When
      val actualResult: Array[User] =
        restTestClient.get
          .uri("/hello")
          .exchange
          .expectBody(classOf[Array[User]])
          .returnResult
          .getResponseBody

      // Then
      actualResult shouldEqual stubbedResult
    }
  }
