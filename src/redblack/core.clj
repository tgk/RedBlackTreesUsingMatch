(ns redblack.core
  (:require [clojure.core.match.core :as match]))

(let [node 1]
  (match/match [node]
    [[1]] :a0
    [a] a
    :else nil))

(let [node nil]
  (match/match
   [node]
   [([:black [:red [:red a x b] y c] z d] |
       [:black [:red a x [:red b y c]] z d] |
	 [:black a x [:red [:red b y c] z d]] |
	   [:black a x [:red b y [:red c z d]]])]
   [:red [:black a x b] y [:black c z d]]))