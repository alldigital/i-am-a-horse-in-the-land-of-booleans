(ns i-am-a-horse-in-the-land-of-booleans
(:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (false? x) (nil? x))
    false
    true))

(defn bool [x]
    (if (true? x)
    true
    false))

(defn abs [x]
  ":(")

(defn divides? [divisor n]
  ":(")

(defn fizzbuzz [n]
  ":(")

(defn teen? [age]
  ":(")

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
