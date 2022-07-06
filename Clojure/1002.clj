(defn area [r]
  (let [n 3.14159]
    (println (format "A=%.4f" (* n (* r r))))))

(let [r (Double/parseDouble (read-line))]
  (clojure.string/replace (area r) #"," "."))
