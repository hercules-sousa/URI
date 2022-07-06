(defn func []
  (let [n1 (Integer/parseInt (read-line)), n2 (Integer/parseInt (read-line))]
    (println (format "X = %d" (+ n1 n2)))))

(func)
