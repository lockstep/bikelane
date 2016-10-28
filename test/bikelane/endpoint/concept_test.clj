(ns bikelane.endpoint.concept-test
  (:require [bikelane.endpoint.concept :as concept]
            [clojure.test :refer :all]
            [shrubbery.core :as shrub]))

(def handler
  (concept/concept-endpoint {}))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))
