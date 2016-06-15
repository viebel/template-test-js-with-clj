(defproject js-test-in-cljs "0.0.1"
  :description "Test Javascript code in clojurescript"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.36"]]
  :hooks [leiningen.cljsbuild]
  :clean-targets ^{:protect false} ["resources/public/fig/js"]
  :plugins [[lein-cljsbuild "1.1.1"]
            [lein-figwheel "0.5.4-3"]]
  :source-paths ["src"]
  :figwheel {:server-port 5018}
  :cljsbuild {:builds
              {:figwheel
               {:figwheel true
                :source-paths ["src"]
                :compiler
                {:main "js-test-in-cljs.test.runner"
                 :preamble ["js/main.js"]
                 :asset-path "fig/js"
                 :output-to "resources/public/fig/js/my.fig.js"
                 :output-dir "resources/public/fig/js"}}}})
