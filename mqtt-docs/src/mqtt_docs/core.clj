(ns mqtt-docs.core
  (:require [clojurewerkz.machine-head.client :as mh]))

(def channel (mh/connect "tcp://test.mosquitto.org:1883" "demo1"))
