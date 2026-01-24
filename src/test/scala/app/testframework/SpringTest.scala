package app.testframework

import org.scalatest.funspec.AnyFunSpec
import org.springframework.test.context.TestContextManager

trait SpringTest extends Test:
  new TestContextManager(this.getClass).prepareTestInstance(this)
