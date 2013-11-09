(defproject rhapsode "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
  				 [ring/ring-core "1.2.1"]
  				 [ring/ring-jetty-adapter "1.2.1"]
  				 [compojure "1.1.6"]
  				 [markdown-clj "0.9.33"]
  				 [org.clojure/data.json "0.2.3"]]
  :plugins [[lein-ring "0.8.8"]]
  :ring {:handler rhapsode.core/app})
