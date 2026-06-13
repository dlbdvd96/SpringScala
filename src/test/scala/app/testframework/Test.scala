package app.testframework

import org.mockito.MockitoSugar
import org.scalatest.OptionValues
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

trait Test extends AnyFunSpec with Matchers with OptionValues with MockitoSugar
