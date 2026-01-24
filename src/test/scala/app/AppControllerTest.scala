package app

import app.testframework.SpringTest
import org.mockito.Mockito.doReturn
import org.scalatest.funspec.AnyFunSpec
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.resttestclient.autoconfigure.AutoConfigureRestTestClient
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest
import org.springframework.test.context.bean.`override`.mockito.MockitoBean
import org.springframework.test.web.servlet.client.RestTestClient

import scala.compiletime.uninitialized

@WebMvcTest(Array(classOf[AppController]))
@AutoConfigureRestTestClient
class AppControllerTest extends SpringTest:

  @Autowired var restTestClient: RestTestClient = uninitialized
  @MockitoBean var appService: AppService = uninitialized

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
