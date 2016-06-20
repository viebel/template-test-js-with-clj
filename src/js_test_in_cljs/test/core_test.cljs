(ns js-test-in-cljs.test.core-test
  (:require
    [clojure.test.check :as tc]
    [clojure.test.check.generators :as gen]
    [clojure.test.check.properties :as prop :include-macros true]
    [clojure.test.check.clojure-test :as ct :refer-macros [defspec]]
    [cljs.test :refer-macros [deftest testing is are]]))


(deftest first-test
  (testing "trival"
    (is (= 9 (js/foo 3)))))


(defspec check-foo 200
  (prop/for-all [n gen/int]
                (= 0 (js/foo n))))



