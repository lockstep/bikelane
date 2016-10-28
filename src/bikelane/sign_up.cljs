(ns bikelane.sign-up
  (:require [reagent.core :as r]))

(def state (r/atom {::name "" ::email ""}))

(defn form []
  [:form
   [:div
    [:p "Current state: " @state]
    [:input {:type        "text"
             :placeholder "Name"
             :value       (::name @state)
             :on-change   #(swap! state assoc ::name (-> % .-target .-value))}]
    [:input {:type        "email"
             :placeholder "Email"
             :value       (::email @state)
             :on-change   #(swap! state assoc ::email (-> % .-target .-value))}]
    [:button {:type     "submit"
              :on-click #(js/alert @state)}
     "Instant Quote"]]])
