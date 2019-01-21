organization := "akshay"
name := "FPInScala"
version := "0.0.1-SNAPSHOT"
scalaVersion := "2.12.8"

val Http4sVersion    = "0.18.21"
val circeVersion     = "0.11.0"
val LogbackVersion   = "1.2.3"
val ScalaTestVersion = "3.0.5"

lazy val root = (project in file("."))
  .settings(
    libraryDependencies ++= Seq(
      "io.circe"        %% "circe-core"          % circeVersion,
      "io.circe"        %% "circe-generic"       % circeVersion,
      "io.circe"        %% "circe-literal"       % circeVersion,
      "io.circe"        %% "circe-parser"        % circeVersion,
      "org.http4s"      %% "http4s-blaze-server" % Http4sVersion,
      "org.http4s"      %% "http4s-circe"        % Http4sVersion,
      "org.http4s"      %% "http4s-dsl"          % Http4sVersion,

      "org.scalatest"   %% "scalatest"           % ScalaTestVersion   % "test",      

      "ch.qos.logback"  %  "logback-classic"     % LogbackVersion
    ),
    addCompilerPlugin("org.spire-math" %% "kind-projector"     % "0.9.6"),
    addCompilerPlugin("com.olegpy"     %% "better-monadic-for" % "0.2.4")
  )

