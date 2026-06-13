package app

import app.testframework.SpringDataJdbcTest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.data.jdbc.test.autoconfigure.DataJdbcTest

import scala.compiletime.uninitialized

@DataJdbcTest
class AppRepositoryTest extends SpringDataJdbcTest:

  @Autowired
  var testSubject: AppRepository = uninitialized

  describe("AppRepository on getUserById") {
    jdbcClient
      .sql("INSERT INTO APP_USER (ID, NAME) VALUES (1, 'DAVIDE')")
      .update

    it("should return the value returned by appRepository") {
      // When
      val actualResult: Option[User] = testSubject.getUserById(1)

      // Then
      actualResult.value shouldEqual User(1, "DAVIDE")
    }
  }
