package app.testframework

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.resttestclient.autoconfigure.AutoConfigureRestTestClient
import org.springframework.test.web.servlet.client.RestTestClient

import scala.compiletime.uninitialized

@AutoConfigureRestTestClient
abstract class SpringWebMvcTest extends SpringTest:

  @Autowired
  var restTestClient: RestTestClient = uninitialized
