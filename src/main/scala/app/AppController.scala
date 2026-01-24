package app

import org.springframework.web.bind.annotation.{GetMapping, RestController}

@RestController
class AppController(appService: AppService):

  @GetMapping(Array("/hello"))
  def getData: Array[User] = appService.getData
