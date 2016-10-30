(ns bikelane.concept
  (:require [reagent-forms.core :as rf]
            [reagent.core :as r]))

(def vrf-state
  (r/atom {::name "" ::email "" ::lucky-number nil}))

(defn vanilla-reagent-form []
  [:form
   [:div "vanilla reagent form"
    [:p (str @vrf-state)]]
   [:div
    [:input {:type        "text"
             :id          "name"
             :placeholder "name"
             :value       (::name @vrf-state)
             :on-change   #(swap! vrf-state assoc ::name (rf/value-of %))}]
    [:input {:type        "email"
             :id          "email"
             :placeholder "email"
             :value       (::email @vrf-state)
             :on-change   #(swap! vrf-state assoc ::email (rf/value-of %))}]
    [:input {:type        "text"
             :id          "lucky-number"
             :placeholder "7"
             :value       (::lucky-number @vrf-state)
             :on-change   (fn [e]
                            (let [int   (js/parseInt (rf/value-of e))
                                  value (when-not (js/isNaN int) int)]
                              (swap! vrf-state assoc ::lucky-number value)))}]
    [:button {:type     "submit"
              :on-click #(js/alert @vrf-state)}
     "Instant Quote"]]])

(def rff-state
  (r/atom {:bikelane {:name "" :email "" :lucky-number nil}}))

(defn reagent-forms-form []
  [:form
   [:div "reagent forms form"
    [:p (str @rff-state)]]
   [rf/bind-fields
    [:div
     [:input {:field       :text
              :id          :bikelane.name
              :placeholder "name"}]
     [:input {:field       :email
              :id          :bikelane.email
              :placeholder "email"}]
     [:input {:field       :numeric
              :id          :bikelane.lucky-number
              :fmt         "%d"
              :placeholder 7}]
     [:button {:type     "submit"
               :on-click #(js/alert @rff-state)}
      "Instant Quote"]]
    rff-state]])
