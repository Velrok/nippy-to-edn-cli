(defproject nippy-to-edn "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [byte-streams "0.2.4"]
                 [com.taoensso/nippy "2.14.0"]]
  :main nippy-to-edn.core
  :uberjar-name "nippy-to-edn.jar")
