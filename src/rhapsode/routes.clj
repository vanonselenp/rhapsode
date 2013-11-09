(ns rhapsode.routes
	(:use markdown.core)
	(:require [clojure.data.json :as json]))

(def directory (clojure.java.io/file "/Users/petervanonselen/Development/rhapsode/resources/posts/"))

(defn latest []
	(json/write-str 
		{:title "This is the title"
		 :content (md-to-html-string (slurp (str (.getPath directory) "/" (last (seq (.list directory))))))}))

(defn get-article [name]
	(slurp (str (.getPath directory) "/" name ".md")))

(defn get-archive []
	(rest (seq (.list directory))))