(ns bikelane.main
  (:require [bikelane.sign-up :as sign-up]
            [reagent.core :as r]))

(defn main []
  (r/render [sign-up/vanilla-reagent-form] (.getElementById js/document "app1"))
  (r/render [sign-up/reagent-forms-form] (.getElementById js/document "app2")))

(main)
