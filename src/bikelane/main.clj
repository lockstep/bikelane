(ns bikelane.main
  (:gen-class)
  (:require [clojure.java.io :as io]
            [com.stuartsierra.component :as component]
            [duct.util
             [runtime :refer [add-shutdown-hook]]
             [system :refer [load-system]]]
            [environ.core :refer [env]]
            [hanami.core :as hanami]))

(defn -main [& args]
  (let [bindings {'http-port (Integer/parseInt (:port env "3000"))
                  'db-uri    (hanami/jdbc-uri (:database-url env))}
        system   (->> (load-system [(io/resource "bikelane/system.edn")] bindings)
                      (component/start))]
    (add-shutdown-hook ::stop-system #(component/stop system))
    (println "Started HTTP server on port" (-> system :http :port))))
