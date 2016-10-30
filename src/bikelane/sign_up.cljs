(ns bikelane.sign-up
  (:require [reagent-forms.core :as rf]
            [reagent.core :as r]))

(def vrf-state (r/atom {::name "" ::email ""}))

(defn vanilla-reagent-form []
  [:form
   [:p "vanilla reagent form " @vrf-state]
   [:div
    [:input {:type        "text"
             :id          "name"
             :placeholder "name"
             :value       (::name @vrf-state)
             :on-change   #(swap! vrf-state
                                  assoc ::name (-> % .-target .-value))}]
    [:input {:type        "email"
             :id          "email"
             :placeholder "email"
             :value       (::email @vrf-state)
             :on-change   #(swap! vrf-state
                                  assoc ::email (-> % .-target .-value))}]
    [:button {:type     "submit"
              :on-click #(js/alert @vrf-state)}
     "Instant Quote"]]])

(def rff-state (r/atom {:bikelane {:sign-up/name "" :sign-up/email ""}}))

(defn reagent-forms-form []
  [:form
   [:p "reagent forms form " @rff-state]
   [rf/bind-fields
    [:div
     [:input {:field       :text
              :id          ::name
              :placeholder "name"}]
     [:input {:field       :email
              :id          ::email
              :placeholder "email"}]
     [:button {:type     "submit"
               :on-click #(js/alert @rff-state)}
      "Instant Quote"]]
    rff-state]])
