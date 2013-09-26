# MQTT Concepts

This is an introductory document on MQTT, the examples are using the clojure MQTT adapter for eclipse Paho called [machine head] (https://github.com/clojurewerkz/machine_head)

## What is MQTT

MQTT is a light weight protocol for the publishing and subscribing of device messages.  Clients can subscribe to specific topics or publish to specific topics in order to enable others to subscribe to them.


## Topics

Messages are published and subscribed through topics.  Clients can subscribe to specific topic or all topics.  Topics are organised in a hierarchical way all separated by a slash '/' for example 'energy/generation/realtime/nuclear/value'.  'energy' is the top level topic and subscribers can subscribe to topics at any level of the hierarchy.

- Subscribing to 'energy/#' means subscribing to 'energy' and all topics underneath.
- Subscribing to 'energy/+' means subscribing to all underneath energy but not the top level topic.

The string of a topic is arbitrary and determined by the publisher but the length is limited to 64k.

## QOS (Quality of Service)

MQTT has three levels of QOS from 0, 1, 2.  The higher the number the more effort to deliver the message the server needs to make.

- QOS 0 - The message is delivered at most once or not at all.  The message could get lost if the client disconnects.

- QOS 1 - The message is delivered at least once but might be multiple times in case of problems.  The message must be stored until the sender receives an acknowledgement by the receiver.

- QOS 2 - The message is delivered once only and no duplication occures.  The message is stored under the sender recieves acknowledgement that the message has been published by the receiver.  QOS 2 should only be used for vital messages as it is the slowest way of message delivery.
