addSbtPlugin("com.typesafe.play" % "interplay" % sys.props.get("interplay.version").getOrElse("2.1.5"))

// For the Cross Build
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.33")

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "0.6.1")

addSbtPlugin("com.typesafe"      % "sbt-mima-plugin" % "0.6.4")
addSbtPlugin("de.heikoseeberger" % "sbt-header"      % "5.3.0")
addSbtPlugin("org.scalameta"     % "sbt-scalafmt"    % "2.2.1")

addSbtPlugin("com.dwijnand" % "sbt-dynver" % "4.0.0")
