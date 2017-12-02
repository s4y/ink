(ns boot.new.ink
  (:require [boot.new.templates :refer [renderer name-to-path ->files]]))

(def render (renderer "ink"))

(defn ink
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (println "Generating fresh 'boot new' ink project.")
    (->files data
             ["src/{{sanitized}}/foo.clj" (render "foo.clj" data)])))