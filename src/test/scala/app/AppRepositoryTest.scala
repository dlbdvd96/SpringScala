package app

import app.testframework.SpringTest
import org.scalatest.funspec.AnyFunSpec
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.data.jdbc.test.autoconfigure.DataJdbcTest
import org.springframework.jdbc.core.simple.JdbcClient

import scala.compiletime.uninitialized

@DataJdbcTest
class AppRepositoryTest extends SpringTest:

  @Autowired var testSubject: AppRepository = uninitialized
  @Autowired var jdbcClient: JdbcClient = uninitialized

  describe("AppRepository on getUserById") {

    jdbcClient.sql("INSERT INTO APP_USER (ID, NAME) VALUES (1, 'DAVIDE')")

    it("should return the value returned by appRepository") {
      // When
      val actualResult: Array[User] = testSubject.getUserById(1)

      // Then
      actualResult shouldEqual Array(User(1, "DAVIDE"))
    }
  }
