(ns js-test-in-cljs.test.runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [js-test-in-cljs.test.core-test]))

(doo-tests 'js-test-in-cljs.test.core-test)
