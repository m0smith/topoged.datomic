(ns topoged.organize
  (require
   [datomic.api :as d]
   [topoged.countries :as c]
   ))


(def datomic-url "datomic:mem:topoged")
(def datomic-url "datomic:free://localhost:4334/topoged")

(let [db-protocol "tcp"            ; "file|mem|tcp"
      db-host     "localhost:4335" ; "path|host:port"
      db-name     "topoged"]
 
  (def db {:classname   "org.h2.Driver" ; must be in classpath
           :subprotocol "h2"
           :subname (str db-protocol "://" db-host "/" db-name)
           ; Any additional keys are passed to the driver
           ; as driver-specific properties.
           :user     "sa"
           :password ""}))

;; (require '[clojure.java.jdbc :as j])
;; (j/db-do-commands db
;;                     (j/create-table-ddl :fruit
;;                                            [:name "varchar(32)"]
;;                                            [:appearance "varchar(32)"]
;;                                            [:cost :int]
;;                                            [:grade :real]))


(defn load-edn [uri file]
  (let [conn (d/connect uri)
        schema (load-file file)]
    (d/transact conn schema))
  )

(defn load-map [uri m]
  (let [conn (d/connect uri)]

    (d/transact conn m))
  )

(defn load-schema [uri]
  (load-edn uri "resources/datomic/schema.edn"))

(defn database [uri]
  (d/create-database uri))

(defn init [uri]
  (load-schema uri)
  (load-edn uri "resources/datomic/concepts.edn")
  (load-map uri c/countries-domain)
  )

(defn database-drop [uri]
  (d/delete-database uri))


(defn add [uri]
  (d/transact (d/connect uri)
              [{:db/id #db/id [:db.part/user]
                :concept/name "hamster"
                :concept/id #uuid "56d25c94-01bf-4882-80ff-fd682151850d"}]))

(defn find [uri]
  (let [db (d/db (d/connect uri))]
    (d/q '[:find ?guid :where [_ :concept/guid ?guid]]  db)))
