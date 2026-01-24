package app.testframework

import com.bdmendes.smockito.Smockito
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import org.springframework.test.context.TestContextManager

trait Test extends AnyFunSpec with Matchers with Smockito
