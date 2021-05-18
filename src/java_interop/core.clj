(ns java-interop.core
  (:gen-class)
  (:import (car Car)))

(Car/staticFn)

(.toJson (new Car "Fiat"))

(.drive (new Car "Fiat"))

(-> (new Car "Fiat")
    .drive)