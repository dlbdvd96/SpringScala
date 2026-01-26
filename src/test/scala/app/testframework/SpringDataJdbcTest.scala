package app.testframework

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.simple.JdbcClient

import scala.compiletime.uninitialized

trait SpringDataJdbcTest extends SpringTest:

  @Autowired
  var jdbcClient: JdbcClient = uninitialized
