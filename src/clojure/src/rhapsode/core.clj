(ns rhapsode.core
	(:use compojure.core
		  rhapsode.views)
	(:require [compojure.route :as route]))

(defroutes app
	(GET "/" [] (latest))
	(GET "/article/:name" [name] (get-article name))
	(GET "/article" [] (get-archive))
	(route/not-found "page not found"))