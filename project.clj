(defproject js-test-in-cljs "0.0.1"
  :description "Test Javascript code in clojurescript"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.36"]
                 [org.clojure/test.check "0.9.0"]] 
  :clean-targets ^{:protect false} ["resources/public/test/js"]
  :plugins [[lein-doo "0.1.6"]]
  :source-paths ["src"]
  :cljsbuild {:builds
              {:test
               {:source-paths ["src"]
                :compiler
                {:main "js-test-in-cljs.test.runner"
                 :foreign-libs [{:file "main.js"
                                 :provides ["js.main"]}]
                 :optimizations :none
                 :output-to "resources/public/test/js/testable.js"
                 :output-dir "resources/public/test/js"}}}})
