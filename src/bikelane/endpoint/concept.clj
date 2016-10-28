(ns bikelane.endpoint.concept
  (:require [compojure.core :refer :all]
            [clojure.java.io :as io]))

(defn concept-endpoint [config]
  (GET "/concept" [] (io/resource "bikelane/endpoint/concept/concept.html")))
