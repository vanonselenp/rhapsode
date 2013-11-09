(ns rhapsode.core
	(:use compojure.core)
	(:require [compojure.route :as route]))

(def directory (clojure.java.io/file "/Users/petervanonselen/Development/rhapsode/resources/posts/"))

(defn latest []
	(slurp (str (.getPath directory) "/" (last (seq (.list directory))))))

(defn get-article [name]
	(slurp (str (.getPath directory) "/" name ".md")))

(defn get-archive []
	(rest (seq (.list directory))))

(defroutes app
	(GET "/" [] (latest))
	(GET "/article/:name" [name] (get-article name))
	(GET "/archive" [] (get-archive))
	(route/not-found "page not found"))