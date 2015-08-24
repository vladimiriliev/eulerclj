(ns eulerclj.multiplesOf3And5)

(defn solution[]
(reduce #(if (or (= (mod %2 3) 0) (= (mod %2 5) 0)) (+ %1 %2) %1) (range 0 1000)))