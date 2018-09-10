(ns nippy-to-edn.core
  (:gen-class)
  (:require
    [byte-streams]
    [clojure.java.io :as io]
    [taoensso.nippy :as nippy]))

(defn -main
  []
  (with-open [r System/in]
     (prn (nippy/thaw (byte-streams/to-byte-array r))))
  (System/exit 0))
