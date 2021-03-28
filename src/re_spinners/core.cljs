(ns re-spinners.core
  (:require
    ["react-spinners" :refer (BarLoader
                              BeatLoader
                              BounceLoader
                              CircleLoader
                              ClimbingBoxLoader
                              ClipLoader
                              ClockLoader
                              DotLoader
                              FadeLoader
                              GridLoader
                              HashLoader
                              MoonLoader
                              PacmanLoader
                              PropagateLoader
                              PuffLoader
                              PulseLoader
                              RingLoader
                              RiseLoader
                              RotateLoader
                              ScaleLoader
                              SkewLoader
                              SquareLoader
                              SyncLoader)]
    ["@emotion/react" :refer (css)]))

(defn bar-loader
  [{:keys [color height width style speed-multiplier]
    :or   {color            "#333"
           width            100
           height           4
           style            ""
           speed-multiplier 1}}]
  [:> BarLoader
   {:loading true
    :color   color
    :css     (css style)
    :width   width
    :height  height}])

(defn beat-loader
  [{:keys [color size margin style speed-multiplier]
    :or   {color            "#333"
           size             15
           margin           2
           style            ""
           speed-multiplier 1}}]
  [:> BeatLoader
   {:loading true
    :color   color
    :css     (css style)
    :size    size
    :margin  margin}])

(defn bounce-loader
  [{:keys [color size style speed-multiplier]
    :or   {color            "#333"
           size             60
           style            ""
           speed-multiplier 1}}]
  [:> BounceLoader
   {:loading true
    :color   color
    :css     (css style)
    :size    size}])

(defn circle-loader
  [{:keys [color size style speed-multiplier]
    :or   {color            "#333"
           size             50
           style            ""
           speed-multiplier 1}}]
  [:> CircleLoader
   {:loading true
    :color   color
    :css     (css style)
    :size    size}])

(defn climbing-box-loader
  [{:keys [color size style speed-multiplier]
    :or   {color            "#333"
           size             15
           style            ""
           speed-multiplier 1}}]
  [:> ClimbingBoxLoader
   {:loading true
    :color   color
    :css     (css style)
    :size    size}])

(defn clip-loader
  [{:keys [color size style speed-multiplier]
    :or   {color            "#333"
           size             35
           style            ""
           speed-multiplier 1}}]
  [:> ClipLoader
   {:loading true
    :color   color
    :css     (css style)
    :size    size}])

(defn clock-loader
  [{:keys [color size style speed-multiplier]
    :or   {color            "#333"
           size             50
           style            ""
           speed-multiplier 1}}]
  [:> ClockLoader
   {:loading true
    :color   color
    :css     (css style)
    :size    size}])

(defn dot-loader
  [{:keys [color size style speed-multiplier]
    :or   {color            "#333"
           size             60
           style            ""
           speed-multiplier 1}}]
  [:> DotLoader
   {:loading true
    :color   color
    :css     (css style)
    :size    size}])

(defn fade-loader
  [{:keys [color height width radius margin style speed-multiplier]
    :or   {color            "#333"
           height           15
           width            5
           radius           2
           margin           2
           style            ""
           speed-multiplier 1}}]
  [:> FadeLoader
   {:loading true
    :color   color
    :css     (css style)
    :height  height
    :width   width
    :radius  radius
    :margin  margin}])

(defn grid-loader
  [{:keys [color size margin style speed-multiplier]
    :or   {color            "#333"
           size             15
           margin           2
           style            ""
           speed-multiplier 1}}]
  [:> GridLoader
   {:loading true
    :color   color
    :css     (css style)
    :size    size
    :margin  margin}])

(defn hash-loader
  [{:keys [color size style speed-multiplier]
    :or   {color            "#333"
           size             50
           style            ""
           speed-multiplier 1}}]
  [:> HashLoader
   {:loading true
    :color   color
    :css     (css style)
    :size    size}])

(defn moon-loader
  [{:keys [color size style speed-multiplier]
    :or   {color            "#333"
           size             60
           style            ""
           speed-multiplier 1}}]
  [:> MoonLoader
   {:loading true
    :color   color
    :css     (css style)
    :size    size}])

(defn pacman-loader
  [{:keys [color size margin style speed-multiplier]
    :or   {color            "#333"
           size             25
           margin           2
           style            ""
           speed-multiplier 1}}]
  [:> PacmanLoader
   {:loading true
    :color   color
    :css     (css style)
    :size    size
    :margin  margin}])

(defn propagate-loader
  [{:keys [color size style speed-multiplier]
    :or   {color            "#333"
           size             15
           style            ""
           speed-multiplier 1}}]
  [:> PropagateLoader
   {:loading true
    :color   color
    :css     (css style)
    :size    size}])

(defn puff-loader
  [{:keys [color size style speed-multiplier]
    :or   {color            "#333"
           size             60
           style            ""
           speed-multiplier 1}}]
  [:> PuffLoader
   {:loading true
    :color   color
    :css     (css style)
    :size    size}])

(defn pulse-loader
  [{:keys [color size margin style speed-multiplier]
    :or   {color            "#333"
           size             15
           margin           2
           style            ""
           speed-multiplier 1}}]
  [:> PulseLoader
   {:loading true
    :color   color
    :css     (css style)
    :size    size
    :margin  margin}])

(defn ring-loader
  [{:keys [color size style speed-multiplier]
    :or   {color            "#333"
           size             60
           style            ""
           speed-multiplier 1}}]
  [:> RingLoader
   {:loading true
    :color   color
    :css     (css style)
    :size    size}])

(defn rise-loader
  [{:keys [color size margin style speed-multiplier]
    :or   {color            "#333"
           size             15
           margin           2
           style            ""
           speed-multiplier 1}}]
  [:> RiseLoader
   {:loading true
    :color   color
    :css     (css style)
    :size    size
    :margin  margin}])

(defn rotate-loader
  [{:keys [color size margin style speed-multiplier]
    :or   {color            "#333"
           size             15
           margin           2
           style            ""
           speed-multiplier 1}}]
  [:> RotateLoader
   {:loading true
    :color   color
    :css     (css style)
    :size    size
    :margin  margin}])

(defn scale-loader
  [{:keys [color height width radius margin style speed-multiplier]
    :or   {color            "#333"
           height           35
           width            4
           radius           2
           margin           2
           style            ""
           speed-multiplier 1}}]
  [:> ScaleLoader
   {:loading true
    :color   color
    :css     (css style)
    :height  height
    :width   width
    :radius  radius
    :margin  margin}])

(defn skew-loader
  [{:keys [color size style speed-multiplier]
    :or   {color            "#333"
           size             20
           style            ""
           speed-multiplier 1}}]
  [:> SkewLoader
   {:loading true
    :color   color
    :css     (css style)
    :size    size}])

(defn square-loader
  [{:keys [color size style speed-multiplier]
    :or   {color            "#333"
           size             50
           style            ""
           speed-multiplier 1}}]
  [:> SquareLoader
   {:loading true
    :color   color
    :css     (css style)
    :size    size}])

(defn sync-loader
  [{:keys [color size margin style speed-multiplier]
    :or   {color            "#333"
           size             15
           margin           2
           style            ""
           speed-multiplier 1}}]
  [:> SyncLoader
   {:loading true
    :color   color
    :css     (css style)
    :size    size
    :margin  margin}])
