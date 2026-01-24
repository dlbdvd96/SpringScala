package app

import org.springframework.data.relational.core.mapping.Column

import scala.annotation.meta.field

case class User(
    @(Column @field)("ID") id: Int,
    @(Column @field)("NAME") username: String
)
