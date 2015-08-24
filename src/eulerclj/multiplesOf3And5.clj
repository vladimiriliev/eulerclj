(ns eulerclj.multiplesOf3And5)

(defn solution
  "Loop over the range 0 - 1000 and sum multiples of 3 and 5."
  []
(reduce #(if (or (= (mod %2 3) 0) (= (mod %2 5) 0)) (+ %1 %2) %1) (range 0 1000)))