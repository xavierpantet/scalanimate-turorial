// Build definitions
name := "Scalanimate tutorial"
version := "1.0.0"
scalaVersion := "2.12.2"

// ScalaJS configuration
enablePlugins(ScalaJSPlugin)
scalaJSUseMainModuleInitializer := true

// Dependencies to Scalanimate
libraryDependencies += "default" %%% "scalanimate" % "1.0.1"
resolvers += Resolver.bintrayRepo("xavierpantet", "scalanimate")
