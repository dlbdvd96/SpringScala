package app.testframework

import com.bdmendes.smockito.Smockito
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

trait Test extends AnyFunSpec with Matchers with Smockito
