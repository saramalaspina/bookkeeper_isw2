#!/usr/bin/env bash
set -e

CLASS="org.apache.bookkeeper.bookie.Journal"
EVOSUITE_JAR="$(pwd)/tools/evosuite-1.2.0.jar"

echo "▶ Build BookKeeper (server module)..."
mvn -DskipTests test-compile

echo "▶ Build classpath..."
mvn dependency:build-classpath \
  -DincludeScope=test \
  -Dmdep.outputFile=evosuite.classpath

CP="target/classes:$(cat evosuite.classpath)"

echo "▶ EvoSuite on $CLASS"
java -Xmx4g -jar "$EVOSUITE_JAR" \
  -class "$CLASS" \
  -projectCP "$CP" \
  -Djunit=4 \
  -Dcriterion=BRANCH \
  -Dsearch_budget=120
