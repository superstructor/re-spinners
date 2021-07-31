(defproject    superstructor/re-spinners "lein-git-inject/version"
  :description "Reagent wrapper for react-spinners"
  :url         "https://github.com/superstruct/re-spinners.git"
  :license     {:name "MIT"}

  :dependencies [[org.clojure/clojure       "1.10.3"   :scope "provided"]
                 [org.clojure/clojurescript "1.10.879" :scope "provided"
                  :exclusions [com.google.javascript/closure-compiler-unshaded
                               org.clojure/google-closure-library
                               org.clojure/google-closure-library-third-party]]
                 [thheller/shadow-cljs      "2.15.2"   :scope "provided"]
                 [reagent                   "1.1.0"    :scope "provided"]
                 [re-com                    "2.13.2"   :scope "provided"]]

  :plugins [[day8/lein-git-inject "0.0.14"]
            [lein-shadow          "0.3.1"]
            [lein-shell           "0.5.0"]]

  :middleware [leiningen.git-inject/middleware]

  :profiles {:dev {:dependencies [[binaryage/devtools "1.0.3"]]
                   :plugins      [[com.github.liquidz/antq "RELEASE"]
                                  [lein-pprint             "1.3.2"]]}}

  :source-paths ["src"]
  :test-paths ["test"]
  :resource-paths ["resources"]

  :clean-targets ^{:protect false} [:target-path
                                    "shadow-cljs.edn"
                                    "node_modules"
                                    "resources/public/scripts/compiled"]

  :deploy-repositories [["clojars" {:sign-releases false
                                    :url "https://clojars.org/repo"
                                    :username :env/CLOJARS_USERNAME
                                    :password :env/CLOJARS_TOKEN}]]

  :shadow-cljs {:builds {:demo {:target           :browser
                                :modules          {:demo {:init-fn re-spinners-demo.core/mount-root}}
                                :compiler-options {:closure-defines {re-spinners-demo.config/version "lein-git-inject/version"}}
                                :dev              {:asset-path       "/scripts/compiled/dev"
                                                   :output-dir       "resources/public/scripts/compiled/dev"
                                                   :compiler-options {:external-config {:devtools/config {:features-to-install [:formatters :hints]}}}}
                                :release          {:output-dir "resources/public/scripts/compiled/prod"}
                                :devtools         {:http-port        9000
                                                   :http-root        "resources/public"
                                                   :push-state/index "index_dev.html"}}

                         :karma-test
                               {:target    :karma
                                :ns-regexp "-test$"
                                :output-to "target/karma-test.js"}}}

  :release-tasks [["deploy" "clojars"]]
  
  :shell          {:commands {"karma" {:windows         ["cmd" "/c" "karma"]
                                       :default-command "karma"}}}

  :aliases {"watch" ["with-profile" "dev" "do"
                     ["clean"]
                     ["shadow" "watch" "demo"]]

            "ci"    ["do"
                     ["clean"]
                     ["shadow" "compile" "karma-test"]
                     ["shell" "karma" "start" "--single-run" "--reporters" "junit,dots"]]})

