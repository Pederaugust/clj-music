(ns clj-music.core
  (:require [edna.core :as edna]))

(def song-temp 135)

(def intro-bass
  [:fretless-bass {:octave 1 :tempo song-temp}
   [1/4
    :g {:octave 0} 1/8 :c {:octave 1} ; 3/8
    :g :a# :g {:octave 0} :c {:octave 1} :g ; 8/8
    {:octave 0} :c {:octave 1} :g ;10/8
    {:octave 0} :c {:octave 1} :g ; 12 /8
    :a# :g 1/4 :f ; 16/8
                  ;
    :g {:octave 0} 1/8 :c {:octave 1}
    :g :a# :g {:octave 0} :c {:octave 1} :g
    {:octave 0} :c {:octave 1} :g
    {:octave 0} :c {:octave 1} :g
    :a# :g 1/4 :f ; 32/8

    :+c {:octave 0} 1/8 :c {:octave 1}
    :+c :+d# :+c {:octave 0} :c {:octave 1} :+c
    {:octave 0} :c {:octave 1} :+c
    {:octave 0} :c {:octave 1} :+c
    :+d# :+c 1/4 :+g ; 48/8

    1/8 :+d 1/4 :+d 1/8 :+f# :+d 1/4 ; 53/8
    :d :d :d] ;59/8
   5/8
   {:octave 0} :c {:octave 1}
   [1/4
    :g {:octave 0} 1/8 :c {:octave 1} :g :a# :g {:octave 0} :c {:octave 1} :g
    {:octave 0} :c {:octave 1} :g
    {:octave 0} :c {:octave 1} :g
    :a# :g 1/4 :f
    :g {:octave 0} 1/8 :c {:octave 1} :g :a# :g {:octave 0} :c {:octave 1} :g
    {:octave 0} :c {:octave 1} :g
    {:octave 0} :c {:octave 1} :g
    :a# :g 1/4 :f
    :+c {:octave 0} 1/8 :c {:octave 1} :+c :+d# :+c {:octave 0} :c {:octave 1} :+c
    {:octave 0} :c {:octave 1} :+c
    {:octave 0} :c {:octave 1} :+c
    :+d# :+c 1/4 :+g 1/8 :+d 1/4 :+d 1/8 :+f# :+d 1/4
    :d :d :d]])

(def intro-melody
  [:midi-steel-drums
   {:tempo song-temp} 1/8
   :g 1/4 :+d 1/8 :g :+c# :+d :+c# :a#
   :g 1/4 :+d 1/8 :g :+c# :+d :+c# :a#
   :g 1/4 :+d 1/8 :g :+c# :+d :+c# :a#
   :g 1/4 :+d 1/8 :g :+c# :+d :+c# :a#
   :+c 1/4 :+g 1/8 :+c :+f# :+g :+f# :+d#
   :+c 1/4 :+g 1/8 :+c :+f# :+g :+f# :+d#
   :+d 1/4 :+a 1/8 :+d :+f# :+d 1/2 :+c])

(def verse-melody
  [:midi-string-ensemble-1
   {:tempo song-temp}
   1/4
   :a# :a# ; 4/8 ;
   1/8
   {:octave 0} :c {:octave 4} ;5/8
   1/4
   :a# :a# ; 9/8
   :a# :a# ; 13/8
   1/8 :g :+c ;15/8
   {:octave 0} :c {:octave 4} ;16/8

   1/4
   :a# :a# ; 4/8 ;
   1/8
   {:octave 0} :c {:octave 4} ;5/8
   1/4
   :a# :a# ; 9/8
   :a# :a# ; 13/8
   1/8 :g :+c ;15/8
   {:octave 0} :c {:octave 4} ;32/8

   1/4
   :a# :a# ; 4/8 ;
   1/8
   {:octave 0} :c {:octave 4} ;5/8
   1/4
   :a# :a# ; 9/8
   :a# :a# ; 13/8
   1/8 :g :+d ;15/8
   {:octave 0} :c {:octave 4} ;48/8 ;

   1/4
   :a :a
   1/8
   {:octave 0} :c {:octave 4} ; 53/8
   1/4
   :a :a ; 57/8
   :g 1/8 :f# ; 64/8

   ; pre-chorus
   1/8
   :a# :a#
   :+c :+c ; 4/8
   {:octave 0} :c {:octave 4}
   :g
   {:octave 0} :c {:octave 4}
   :a# :+c :+c :a# :+c
   {:octave 0} :c {:octave 4}
   :g
   {:octave 0} :c {:octave 4}
   :a# :+c :+c :a# :+c
   {:octave 0} :c {:octave 4}
   :g
   {:octave 0} :c {:octave 4}
   :a# :+c :+c :a# :+c
   {:octave 0} :c {:octave 4}
   :g
   {:octave 0} :c {:octave 4}
   {:octave 0} :c {:octave 4}
   :a# :a#
   1/4
   :+f :+d
   1/8
   :a# :+c :+c :a#
   1/4
   :+f :+d
   1/8
   :a# :+c :+c :a#
   1/4
   :+f :+d
   1/8
   :a# :+c :+c :a#
   1/4
   :+f :+d
   1/8
   :+c :a#
   1/2 :a
   1 :g])




;(edna/play! #{intro-bass
              ;[:midi-percussion {:octave 2 :tempo 135} 1/4 (repeat 26 :c)]])

;(Thread/sleep 13000) DUH
; DUH
(edna/play! #{intro-bass
              ;verse-melody
              intro-melody
              [:percussion {:octave 3 :tempo song-temp} 1/4 (repeat 64 :c)]})

;(edna/play! intro-melody)
