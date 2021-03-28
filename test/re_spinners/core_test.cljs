(ns re-spinners.core-test
  (:require
    [clojure.test :refer [deftest is testing async use-fixtures]]
    [re-spinners.core :as re-spinners]))

(deftest returns-component
  (is (vector? (re-spinners/bar-loader {}))))
