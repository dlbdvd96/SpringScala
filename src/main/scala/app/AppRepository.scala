package app

import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.Repository
import org.springframework.data.repository.query.Param

trait AppRepository extends Repository[User, Int]:

  @Query("SELECT * FROM APP_USER WHERE ID=:id")
  def getUserById(@Param("id") id: Int): Option[User]

  @Query("SELECT * FROM APP_USER")
  def getAllUsers: Array[User]
