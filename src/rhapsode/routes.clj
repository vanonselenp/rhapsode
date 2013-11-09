(ns rhapsode.routes
	(:use markdown.core))

(def directory (clojure.java.io/file "/Users/petervanonselen/Development/rhapsode/resources/posts/"))

(defn latest []
	(md-to-html-string (slurp (str (.getPath directory) "/" (last (seq (.list directory)))))))

(defn get-article [name]
	(slurp (str (.getPath directory) "/" name ".md")))

(defn get-archive []
	(rest (seq (.list directory))))