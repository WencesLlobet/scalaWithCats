name := "scalaWithCats"

version := "0.1"

scalaVersion := "2.12.3"

libraryDependencies += "org.typelevel" %% "cats-core" % "1.0.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" 

scalacOptions ++= Seq(
  "-Xfatal-warnings",
  "-Ypartial-unification",
  "-unchecked"
)
