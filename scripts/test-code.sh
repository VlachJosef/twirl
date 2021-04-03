#!/usr/bin/env bash

# Copyright (C) Lightbend Inc. <https://www.lightbend.com>

echo SCALA_VERSION=$SCALA_VERSION
sbt ++$SCALA_VERSION test || exit 1
sbt +publishLocal plugin/test plugin/scripted || exit 1
