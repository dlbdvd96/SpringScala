package app

import app.testframework.Test
import com.bdmendes.smockito.Mock
import org.mockito.Mockito.doReturn

class AppServiceTest extends Test:

  val mockAppRepository: Mock[AppRepository] = mock[AppRepository]
  val testSubject = AppService(mockAppRepository)

  describe("AppService on getData") {

    val stubbedUsers = Array(User(10, "CARLO"))
    doReturn(stubbedUsers)
      .when(mockAppRepository)
      .getAllUsers

    it("should return the value returned by appRepository") {
      // When
      val actualResult: Array[User] = testSubject.getData

      // Then
      actualResult shouldEqual stubbedUsers
    }
  }
