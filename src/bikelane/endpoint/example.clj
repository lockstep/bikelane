(ns bikelane.endpoint.example
  (:require [compojure.core :refer :all]
            [clojure.java.io :as io]))

(defn example-endpoint [{{db :spec} :db}]
  (context "/example" []
    (GET "/" []
      (io/resource "bikelane/endpoint/example/example.html"))))
