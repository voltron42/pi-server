(ns pi-server.server-test
  (:require [clojure.test :refer :all]
            [pi-server.server :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest test-server
  (is (build-app)))