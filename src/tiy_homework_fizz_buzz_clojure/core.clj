(ns tiy-homework-fizz-buzz-clojure.core)

(defn fizz-buzz [start stop]
  (println
    (for [x (range start (+ stop 1))]
      (cond
        (and (= (mod x 3) 0) (= (mod x 5))) (str "FizzBuzz ")
        (= (mod x 3) 0) (str "Fizz ")
        (= (mod x 5) 0) (str "Buzz ")
        :else (str x " " )
        )
      )
    )
  )

(fizz-buzz 1 100)