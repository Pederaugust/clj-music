(ns clj-music.astronomia
  (:require [edna.core :as edna]))

(edna/play! #{[:midi-electric-piano-1
               {:octave 4 :tempo 125}
               1/8
               :+c :a# :a :f :g
               {:octave 0} :c {:octave 4}
               :g :+d :+c
               {:octave 0} :c {:octave 4}
               :a# :a
               {:octave 0} :c {:octave 4}
               :a :a :+c
               {:octave 0} :c {:octave 4}
               :a# :a :g
               {:octave 0} :c {:octave 4}
               :g
               :+a# :+a :+a# :+a :+a#
               :g
               {:octave 0} :c {:octave 4}
               :g
               :+a# :+a :+a# :+a :+a#]
              [:acoustic-bass
               {:tempo 125}
               1/2 {:octave 0} :c {:octave 2}
               1/4 :d# 1/8 :d#
               1/4 :d# 1/8 :d#
               {:octave 0} :c {:octave 2}
               1/4 :f 1/8 :f
               1/4 :f 1/8 :f
               {:octave 0} :c {:octave 2}
               1/4 :g 1/8 :g
               1/4 :g 1/8 :g
               1/4 :g 1/8 :g
               1/4 :g 1/8 :g
               1/4 :g 1/8 :g
               1/4 :g 1/8 :g]})
