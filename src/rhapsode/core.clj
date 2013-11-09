(ns rhapsode.core
	(:use compojure.core
		  rhapsode.routes)
	(:require [compojure.route :as route]))

(defroutes app
	(GET "/" [] (latest))
	(GET "/article/:name" [name] (get-article name))
	(GET "/archive" [] (get-archive))
	(route/not-found "page not found"))