(defproject fuarrrkitchan "0.1.0-SNAPSHOT"
  :description "fuarrrk"
  :license {:name "GPL 2"
            :url "https://www.gnu.org/licenses/gpl-2.0.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-3196"]]

  :profiles {:dev {:dependencies [[weasel "0.6.0"]]}}

  :plugins [[lein-cljsbuild "1.0.5"]
            [com.cemerick/clojurescript.test "0.3.1"]]

  :source-paths ["src/clj" "src/cljs"]

  :cljsbuild {:builds [{:id "dev"
                        :source-paths ["dev" "src/cljs"]
                        :compiler {:main cljs.fuarrrkitchan.core
                                   :output-to "resources/public/js/fuarrrkitchan.js"
                                   :output-dir "resources/public/js/out"
                                   :asset-path "js/out"
                                   :optimizations :none
                                   :source-map true}}
                       {:id "release"
                        :source-paths ["src/cljs"]
                        :compiler {:main cljs.fuarrrkitchan.core
                                   :output-to "resources/public/js/fuarrrkitchan.js"
                                   :optimizations :advanced
                                   :source-map "fuarrrkitchan.js.map"}}]})
