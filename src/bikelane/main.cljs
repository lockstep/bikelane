(ns bikelane.main
  (:require [bikelane.concept :as concept]
            [reagent.core :as r]))

(defn main []
  (r/render [concept/vanilla-reagent-form] (.getElementById js/document "app1"))
  (r/render [concept/reagent-forms-form] (.getElementById js/document "app2")))

(main)
