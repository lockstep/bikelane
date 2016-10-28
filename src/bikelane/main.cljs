(ns bikelane.main
  (:require [bikelane.sign-up :as sign-up]
            [reagent.core :as r]))

(defn main []
  (r/render [sign-up/form] (.getElementById js/document "app")))

(main)
