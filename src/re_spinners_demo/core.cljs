(ns re-spinners-demo.core
  (:require
    [reagent.core :as r]
    [reagent.dom :as rdom]
    [re-com.core :as rc :refer [at]]
    [re-spinners.core :as re-spinners]))

(defn main
  []
  ;; TODO: labels, arguments.
  (let []
    (fn []
      [rc/v-box
       :gap      "31px"
       :children [[rc/title
                   :level :level2
                   :label "Reagent react-spinners Wrapper Demo"]
                  [rc/h-box
                   :children [[rc/box
                               :align   :center
                               :justify :center
                               :width   "212px"
                               :child   [re-spinners/bar-loader]]
                              [rc/box
                               :align   :center
                               :justify :center
                               :width   "212px"
                               :child   [re-spinners/beat-loader]]
                              [rc/box
                               :align   :center
                               :justify :center
                               :width   "212px"
                               :child   [re-spinners/bounce-loader]]]]
                  [rc/h-box
                   :children [[rc/box
                               :align   :center
                               :justify :center
                               :width   "212px"
                               :child   [re-spinners/circle-loader]]
                              [rc/box
                               :align   :center
                               :justify :center
                               :width   "212px"
                               :child   [re-spinners/climbing-box-loader]]
                              [rc/box
                               :align   :center
                               :justify :center
                               :width   "212px"
                               :child   [re-spinners/clip-loader]]]]
                  [rc/h-box
                   :children [[rc/box
                               :align   :center
                               :justify :center
                               :width   "212px"
                               :child   [re-spinners/clock-loader]]
                              [rc/box
                               :align   :center
                               :justify :center
                               :width   "212px"
                               :child   [re-spinners/dot-loader]]
                              [rc/box
                               :align   :center
                               :justify :center
                               :width   "212px"
                               :child   [re-spinners/fade-loader]]]]
                  [rc/h-box
                   :children [[rc/box
                               :align   :center
                               :justify :center
                               :width   "212px"
                               :child   [re-spinners/grid-loader]]
                              [rc/box
                               :align   :center
                               :justify :center
                               :width   "212px"
                               :child   [re-spinners/hash-loader]]
                              [rc/box
                               :align   :center
                               :justify :center
                               :width   "212px"
                               :child   [re-spinners/moon-loader]]]]
                  [rc/h-box
                   :children [[rc/box
                               :align   :center
                               :justify :center
                               :width   "212px"
                               :child   [re-spinners/pacman-loader]]
                              [rc/box
                               :align   :center
                               :justify :center
                               :width   "212px"
                               :child   [re-spinners/propagate-loader]]
                              [rc/box
                               :align   :center
                               :justify :center
                               :width   "212px"
                               :child   [re-spinners/puff-loader]]]]
                  [rc/h-box
                   :children [[rc/box
                               :align   :center
                               :justify :center
                               :width   "212px"
                               :child   [re-spinners/pulse-loader]]
                              [rc/box
                               :align   :center
                               :justify :center
                               :width   "212px"
                               :child   [re-spinners/ring-loader]]
                              [rc/box
                               :align   :center
                               :justify :center
                               :width   "212px"
                               :child   [re-spinners/rise-loader]]]]
                  [rc/h-box
                   :children [[rc/box
                               :align   :center
                               :justify :center
                               :width   "212px"
                               :child   [re-spinners/rotate-loader]]
                              [rc/box
                               :align   :center
                               :justify :center
                               :width   "212px"
                               :child   [re-spinners/scale-loader]]
                              [rc/box
                               :align   :center
                               :justify :center
                               :width   "212px"
                               :child   [re-spinners/skew-loader]]]]
                  [rc/h-box
                   :children [[rc/box
                               :align   :center
                               :justify :center
                               :width   "212px"
                               :child   [re-spinners/square-loader]]
                              [rc/box
                               :align   :center
                               :justify :center
                               :width   "212px"
                               :child   [re-spinners/sync-loader]]]]]])))




(defn get-element-by-id
  [id]
  (.getElementById js/document id))

(defn ^:dev/after-load mount-root
  []
  (rdom/render [main] (get-element-by-id "app")))