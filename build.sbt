name := "spark-wordcount"

version := "0.1"

scalaVersion := "2.11.12"

val sparkVersion = "2.2.0"
libraryDependencies ++= Seq (
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion
)