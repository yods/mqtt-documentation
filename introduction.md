# MQTT Concepts

This is an introductory document on MQTT, the examples are using the clojure MQTT adapter for eclipse Paho called [machine head] (https://github.com/clojurewerkz/machine_head)

## What is MQTT

MQTT is a light weight protocol for the publishing and subscribing of device messages.  Clients can subscribe to specific topics or publish to specific topics in order to enable others to subscribe to them.


## Topics

Messages are published and subscribed through topics.  Clients can subscribe to specific topic or all topics.  Topics are organised in a hierarchical way all separated by a slash '/' for example 'energy/generation/realtime/nuclear/value'.  'energy' is the top level topic and subscribers can subscribe to topics at any level of the hierarchy.

- Subscribing to 'energy/#' means subscribing to 'energy' and all topics underneath.
- Subscribing to 'energy/+' means subscribing to all underneath energy but not the top level topic.

The string of a topic is arbitrary and determined by the publisher but the length is limited to 64k.
