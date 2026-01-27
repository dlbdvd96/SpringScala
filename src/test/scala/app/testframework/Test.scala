package app.testframework

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.mockito.MockitoSugar

trait Test extends AnyFunSpec with Matchers with MockitoSugar
