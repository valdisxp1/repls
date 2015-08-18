scalaVersion := "2.11.5"

libraryDependencies += "com.nativelibs4java" %% "scalacl" % "0.3-SNAPSHOT"

// Avoid sbt-related macro classpath issues.
fork := true

// Scalaxy/Reified snapshots are published on the Sonatype repository.
resolvers += Resolver.sonatypeRepo("snapshots")
