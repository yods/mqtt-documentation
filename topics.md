# Subscribing and Publishing messages

MQTT uses a pub/sub messaging system.  Publishers and subscribers do not need to know about each other.  The publisher sends the message with a topic and the subscribe only cares about the topic rather than where the message comes from.

## Topics
Topics are usually organised as trees using '/' to denote subtopics, e.g. "pollution/london/redbridge/value"

Subscribers can either subscribe topic values matching the full string or subscribe to messages at the higher level of the hierarchy using the #.  For exampleto subscribe to all pollution messages from London subscribe to "pollution/london/#"

## Connection
In order to subscribe or publish to messages we first need to connect to a channel.

    (ns mqtt-docs.core
      (:require [clojurewerkz.machine-head.client :as mh]))

    (def client (mh/connect "tcp://test.mosquitto.org:1883" "demo1"))

The above calls the machine head client and connects to the test mosquitto broker.

## Message Publishing

Publishing to a topic is simple as the topic strings are arbitrary and the value can be either string or numbers

    (mh/publish client "pollution/london/redbridge/value" "0.2")

## Message Subscribing
