package app

import app.testframework.Test

class AppServiceTest extends Test:

  val mockAppRepository: AppRepository = mock[AppRepository]
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
