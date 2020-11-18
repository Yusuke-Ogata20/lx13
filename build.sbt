lazy val common_project = Seq(
  organization := "prg20",
  version := "0.1-SNAPSHOT",

  fork in run          := true,
  connectInput in run  := true,
  cancelable in Global := true,
  )

lazy val scala_project = common_project ++ Seq(
  scalaVersion := "2.13.3",   // コンパイルに使う scalac のバージョン
  scalacOptions := Seq("-feature", "-unchecked", "-deprecation"),
  scalaSource in Compile := baseDirectory.value / "src",
  libraryDependencies += "org.scala-lang.modules" %% "scala-parallel-collections" % "0.2.0",
  )

lazy val root = (project in file(".")).settings(scala_project)
