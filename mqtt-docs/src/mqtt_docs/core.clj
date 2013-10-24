(ns mqtt-docs.core
  (:require [clojurewerkz.machine-head.client :as mh]))

(def pub (mh/connect "tcp://localhost:1883" "demo1"))
(def sub (mh/connect "tcp://localhost:1883" "demo2"))
(defn publish-to-topic [client topic payload]
  (mh/publish client topic payload))

(publish-to-topic pub "polution/london/test/value" "0.2")


(defn subscribe-to-topic [client topics handler-fn]
  (let [subconn (mh/subscribe client [topics] handler-fn)]
    (println "connected to subscriber")
    (.get)))
(subscribe-to-topic sub "polution/london/test/value" (fn [topic meta payload] (println payload)))

(mh/pending-delivery-tokens pub)

(println "thi")
