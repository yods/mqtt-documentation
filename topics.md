# Subscribing and Publishing messages

## Message Subscribing

In order to subscribe to messages we first need to connect to a channel.

code(
(ns mqtt-docs.core
  (:require [clojurewerkz.machine-head.client :as mh]))

(def channel (mh/connect "tcp://test.mosquitto.org:1883" "demo1"))
 )
