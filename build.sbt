organization := "com.isuzuki"

name := "scala-testing"

version := "1.0"

scalaVersion := "2.12.1"

scalacOptions ++= Seq("-deprecation", "-encoding", "UTF-8", "-target:jvm-1.8")

libraryDependencies ++= Seq(
  "org.scalatest"  %% "scalatest"  % "3.0.1"  % "test"
)
