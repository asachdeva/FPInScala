credentials += Credentials(Path.userHome / ".sbt" / ".credentials")

addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.3")
addSbtPlugin("org.lyranthe.sbt" % "partial-unification" % "1.1.0")
addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.1")
