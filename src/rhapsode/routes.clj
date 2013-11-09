(ns rhapsode.routes)

(def directory (clojure.java.io/file "/Users/petervanonselen/Development/rhapsode/resources/posts/"))

(defn latest []
	(slurp (str (.getPath directory) "/" (last (seq (.list directory))))))

(defn get-article [name]
	(slurp (str (.getPath directory) "/" name ".md")))

(defn get-archive []
	(rest (seq (.list directory))))