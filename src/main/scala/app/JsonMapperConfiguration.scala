package app

import org.springframework.context.annotation.{Bean, Configuration}
import tools.jackson.databind.json.JsonMapper
import tools.jackson.module.scala.ScalaModule
import tools.jackson.module.scala.deser.UntypedObjectDeserializerModule

@Configuration
class JsonMapperConfiguration:

  @Bean
  def jsonMapper: JsonMapper =
    JsonMapper.builder
      .addModule(
        ScalaModule
          .builder()
          .addAllBuiltinModules()
          .removeModule(UntypedObjectDeserializerModule)
          .build()
      )
      .build
