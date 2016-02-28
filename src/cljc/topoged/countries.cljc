(ns topoged.countries
  (require
   [datomic.api :as d]))


(def members1 [
              {:db/id #db/id[:db.part/user -111000],
               :concept/name "Afghanistan",
               :concept/id #uuid "56d28366-8f14-4616-a75e-1cb8574f4112",
               :concept/representations [
                                         {:db/id #db/id[:db.part/user -112000],
                                          :representation/id #uuid "56d28366-bc0a-4b19-8987-6d0e8f754844",
                                          :representation/concept [:concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                                          :representation/value "Afghanistan",
                                          :representation/locale "en-US"} 
                                         {:db/id #db/id[:db.part/user -113000],
                                          :representation/id #uuid "56d28366-db57-4373-8ce2-678bf304f83e",
                                          :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                                          :representation/value "AF",
                                          :representation/locale "en-US"}]} ]
  )



(def state-names
  [
   "Utah"
                  
   ])


(defn to-state-map [name]
    {:db/id #db/id[:db.part/user],
     :concept/name name,
     :concept/id (d/squuid)
     :concept/representations [
                               {:db/id #db/id[:db.part/user],
                                :representation/id (d/squuid)
                                :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                                :representation/value name
                                :representation/locale "en-US"} 
                               ]} 
  )

(defn states []
  (map to-state-map state-names)
)


(def states-domain
  [
   {:db/id #db/id[:db.part/user],
    :domain/id (d/squuid)
    :domain/concept [:concept/key :place-state]
    :domain/name "States"
    :domain/members (states)
    }])



(def usa
  {:db/id #db/id[:db.part/user -111227],
   :concept/name "United States",
   :concept/id #uuid "56d28367-e3cd-4e8b-bdfa-1dc46ebd5882",
   :concept/domains states-domain
   :concept/representations [
                             {:db/id #db/id[:db.part/user -112227],
                              :representation/id #uuid "56d28367-0bf8-4352-be7c-6d4c316d3b0b",
                              :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "United States",
                              :representation/locale "en-US"} 
                             {:db/id #db/id[:db.part/user -113227],
                              :representation/id #uuid "56d28367-670d-4eb2-a655-68298da7a61f",
                              :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                              :representation/value "US",
                              :representation/locale "en-US"}]} 
  )


(def members
    [
     {:db/id #db/id[:db.part/user -111000],
  :concept/name "Afghanistan",
  :concept/id #uuid "56d28366-8f14-4616-a75e-1cb8574f4112",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112000],
                             :representation/id #uuid "56d28366-bc0a-4b19-8987-6d0e8f754844",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Afghanistan",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113000],
                             :representation/id #uuid "56d28366-db57-4373-8ce2-678bf304f83e",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "AF",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111001],
  :concept/name "Albania",
  :concept/id #uuid "56d28366-a773-419d-a739-de1112ea63f4",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112001],
                             :representation/id #uuid "56d28366-252e-4714-b597-e44e9f5a1a39",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Albania",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113001],
                             :representation/id #uuid "56d28366-1e94-4560-b6f4-9b48cb35f156",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "AL",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111002],
  :concept/name "Algeria",
  :concept/id #uuid "56d28366-1a1f-4e90-8cce-db299a6edb35",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112002],
                             :representation/id #uuid "56d28366-ef8e-4a71-9166-edacd76c9d03",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Algeria",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113002],
                             :representation/id #uuid "56d28366-a25e-4bf6-bc15-e468f70455f4",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "DZ",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111003],
  :concept/name "American Samoa",
  :concept/id #uuid "56d28366-7158-4ed6-9851-b7e0df88069d",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112003],
                             :representation/id #uuid "56d28366-2e11-441d-ad63-09be1ac1945f",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "American Samoa",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113003],
                             :representation/id #uuid "56d28366-8eac-4240-81fa-d06999a6723d",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "AS",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111004],
  :concept/name "Andorra",
  :concept/id #uuid "56d28366-ac6f-4c7f-9b07-d887a23378b6",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112004],
                             :representation/id #uuid "56d28366-fd38-4f79-9b1d-30c43d9efaaf",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Andorra",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113004],
                             :representation/id #uuid "56d28366-6704-462a-85da-74ba53d229c0",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "AD",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111005],
  :concept/name "Angola",
  :concept/id #uuid "56d28366-7b1a-48d8-997f-c53def2fc990",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112005],
                             :representation/id #uuid "56d28366-5c17-418d-939c-a7f406e6211c",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Angola",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113005],
                             :representation/id #uuid "56d28366-60bd-4a8d-9e6c-0b28b0abaa3f",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "AO",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111006],
  :concept/name "Anguilla",
  :concept/id #uuid "56d28366-6684-4233-a07a-d115838b1718",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112006],
                             :representation/id #uuid "56d28366-e191-4204-a569-8a730c5b9f82",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Anguilla",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113006],
                             :representation/id #uuid "56d28366-4014-4c52-9561-cf75aa478e0b",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "AI",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111007],
  :concept/name "Antarctica",
  :concept/id #uuid "56d28366-1c8d-46aa-ab79-df98a2366084",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112007],
                             :representation/id #uuid "56d28366-4110-4c83-8d29-c2a1b23d58f8",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Antarctica",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113007],
                             :representation/id #uuid "56d28366-4e8d-4697-a558-54d275d4ce7d",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "AQ",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111008],
  :concept/name "Antigua And Barbuda",
  :concept/id #uuid "56d28366-385f-4fb7-bf09-8de997fd18bb",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112008],
                             :representation/id #uuid "56d28366-64af-4ade-94a7-457cc94639e2",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Antigua And Barbuda",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113008],
                             :representation/id #uuid "56d28366-6c28-4423-b813-5554500d19b7",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "AG",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111009],
  :concept/name "Argentina",
  :concept/id #uuid "56d28366-52b3-439b-92ee-e5411a150db6",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112009],
                             :representation/id #uuid "56d28366-f6eb-4d1e-95bf-10834bc99ce0",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Argentina",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113009],
                             :representation/id #uuid "56d28366-2948-4c63-b178-da4ff47f244c",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "AR",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111010],
  :concept/name "Armenia",
  :concept/id #uuid "56d28366-cfff-4726-b53f-b6c65abca4ea",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112010],
                             :representation/id #uuid "56d28366-b5f2-49c4-9934-50015a996ea6",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Armenia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113010],
                             :representation/id #uuid "56d28366-15a8-4633-919f-5ed54c442e0a",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "AM",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111011],
  :concept/name "Aruba",
  :concept/id #uuid "56d28366-e8d9-49aa-9322-e181dcf1950c",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112011],
                             :representation/id #uuid "56d28366-4397-43ac-a35c-cd894b62bc3e",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Aruba",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113011],
                             :representation/id #uuid "56d28366-3e0b-4f45-ae6d-bff5bd021524",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "AW",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111012],
  :concept/name "Australia",
  :concept/id #uuid "56d28366-3ce9-4ace-af2a-8a7a79acf249",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112012],
                             :representation/id #uuid "56d28366-38bb-47b8-85ff-25018069dba7",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Australia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113012],
                             :representation/id #uuid "56d28366-a8a7-468c-a6d9-855710db52e0",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "AU",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111013],
  :concept/name "Austria",
  :concept/id #uuid "56d28366-cf87-4c8f-b803-ed5dd2cb99d7",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112013],
                             :representation/id #uuid "56d28366-f9ab-4b27-898c-cf29d5b8c344",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Austria",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113013],
                             :representation/id #uuid "56d28366-3502-4284-9ebe-f264f2610b0b",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "AT",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111014],
  :concept/name "Azerbaijan",
  :concept/id #uuid "56d28366-95c7-4a5d-bae0-94fc73c114d7",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112014],
                             :representation/id #uuid "56d28366-d871-4148-be8a-4e7595315153",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Azerbaijan",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113014],
                             :representation/id #uuid "56d28366-027f-4fae-8104-4c14df996b72",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "AZ",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111015],
  :concept/name "Bahamas",
  :concept/id #uuid "56d28366-8992-43e2-be5b-ff40238bf072",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112015],
                             :representation/id #uuid "56d28366-2e15-41e1-be07-00886fff52dd",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Bahamas",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113015],
                             :representation/id #uuid "56d28366-c07a-416b-81ff-390f19510c63",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "BS",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111016],
  :concept/name "Bahrain",
  :concept/id #uuid "56d28366-0ed2-4aa3-bda5-d9ce12a15cd4",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112016],
                             :representation/id #uuid "56d28366-8ba4-4d65-a20b-21272bc82110",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Bahrain",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113016],
                             :representation/id #uuid "56d28366-16e8-4628-8b41-9585bbb064ce",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "BH",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111017],
  :concept/name "Bangladesh",
  :concept/id #uuid "56d28366-0bb4-4c76-b66b-6c62ae027423",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112017],
                             :representation/id #uuid "56d28366-5840-464f-8eea-5902ebfa15c2",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Bangladesh",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113017],
                             :representation/id #uuid "56d28366-7f63-4811-97cf-ea47c1be5cb6",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "BD",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111018],
  :concept/name "Barbados",
  :concept/id #uuid "56d28366-fab4-449d-bcfd-40a1776d92ba",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112018],
                             :representation/id #uuid "56d28366-d854-41f4-b812-1b037fcd81d9",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Barbados",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113018],
                             :representation/id #uuid "56d28366-4b1d-42f4-96ad-0cece658e110",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "BB",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111019],
  :concept/name "Belarus",
  :concept/id #uuid "56d28366-645a-4b4c-a384-fc42a12e8f05",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112019],
                             :representation/id #uuid "56d28366-4a33-47d6-8e6b-730dc2f5c139",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Belarus",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113019],
                             :representation/id #uuid "56d28366-eb65-4786-8d92-2a412d6372be",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "BY",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111020],
  :concept/name "Belgium",
  :concept/id #uuid "56d28366-14dc-404a-8360-7ebf73d6bc3c",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112020],
                             :representation/id #uuid "56d28366-9185-450b-9771-5a3afba3e027",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Belgium",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113020],
                             :representation/id #uuid "56d28366-8371-41f6-9076-7969e03309d9",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "BE",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111021],
  :concept/name "Belize",
  :concept/id #uuid "56d28366-c5b7-4def-9998-3e148184baa5",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112021],
                             :representation/id #uuid "56d28366-3e96-4040-b93c-870c57e6ad15",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Belize",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113021],
                             :representation/id #uuid "56d28366-aacb-43a3-8223-7b19e94dfecf",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "BZ",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111022],
  :concept/name "Benin",
  :concept/id #uuid "56d28366-a1b3-4662-b472-631fd780ff29",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112022],
                             :representation/id #uuid "56d28366-6208-4690-bb26-77a3370b8c10",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Benin",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113022],
                             :representation/id #uuid "56d28366-315f-4f73-aa78-f3620c3ae039",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "BJ",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111023],
  :concept/name "Bermuda",
  :concept/id #uuid "56d28366-522d-4bd8-aa43-e596d61461b4",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112023],
                             :representation/id #uuid "56d28366-032e-4e66-966c-f70c941775fa",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Bermuda",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113023],
                             :representation/id #uuid "56d28366-f790-4fbd-bfa6-fb26ac4c5f09",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "BM",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111024],
  :concept/name "Bhutan",
  :concept/id #uuid "56d28366-4461-4d07-a401-217ca0aa2e25",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112024],
                             :representation/id #uuid "56d28366-405e-4a65-ad3a-370c67b5b5fd",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Bhutan",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113024],
                             :representation/id #uuid "56d28366-8a36-4d97-8faa-1a59d9178202",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "BT",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111025],
  :concept/name "Bolivia",
  :concept/id #uuid "56d28366-8b41-41f9-9cd8-205727c6f7ab",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112025],
                             :representation/id #uuid "56d28366-0c75-4832-8665-c6ae71055de6",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Bolivia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113025],
                             :representation/id #uuid "56d28366-33a5-4122-92e0-af799ebf3b48",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "BO",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111026],
  :concept/name "Bosnia And Herzegovina",
  :concept/id #uuid "56d28366-fe6b-47a7-920b-35a829aaa28d",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112026],
                             :representation/id #uuid "56d28366-1052-40c4-82cb-3c60852eb9b1",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Bosnia And Herzegovina",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113026],
                             :representation/id #uuid "56d28366-8100-4c56-808a-53d7ce6d6ad3",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "BA",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111027],
  :concept/name "Botswana",
  :concept/id #uuid "56d28366-5534-459a-a856-cf0455cce9d4",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112027],
                             :representation/id #uuid "56d28366-b58b-4b65-8169-71a3ea62b6c7",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Botswana",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113027],
                             :representation/id #uuid "56d28366-a204-4891-bf22-80e58c9c7506",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "BW",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111028],
  :concept/name "Bouvet Island",
  :concept/id #uuid "56d28366-0e72-4e94-9823-707f69269223",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112028],
                             :representation/id #uuid "56d28366-ae11-4781-9424-40239c55907c",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Bouvet Island",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113028],
                             :representation/id #uuid "56d28366-f3a3-46c6-b340-c83ad61da9a9",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "BV",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111029],
  :concept/name "Brazil",
  :concept/id #uuid "56d28366-009c-44b0-9df8-284a54908d8c",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112029],
                             :representation/id #uuid "56d28366-ad8d-4f01-90bc-9c9c28bd7605",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Brazil",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113029],
                             :representation/id #uuid "56d28366-3e38-46db-8406-eb9e692af57d",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "BR",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111030],
  :concept/name "British Indian Ocean Territory",
  :concept/id #uuid "56d28366-75e3-4409-a922-3da84e8c2ce7",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112030],
                             :representation/id #uuid "56d28366-5772-44b9-9161-c3d8f94afcae",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "British Indian Ocean Territory",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113030],
                             :representation/id #uuid "56d28366-c72d-40ca-9841-e5a920d3c64d",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "IO",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111031],
  :concept/name "Brunei Darussalam",
  :concept/id #uuid "56d28366-df05-4730-9222-181ea32c54de",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112031],
                             :representation/id #uuid "56d28366-05e8-46f7-bbdb-091bc63ff34f",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Brunei Darussalam",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113031],
                             :representation/id #uuid "56d28366-a498-4b18-9cce-ded5db3dd82c",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "BN",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111032],
  :concept/name "Bulgaria",
  :concept/id #uuid "56d28366-f54c-4164-8430-8385e05c83fc",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112032],
                             :representation/id #uuid "56d28366-5826-46fd-8250-34bcf8157854",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Bulgaria",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113032],
                             :representation/id #uuid "56d28366-6073-4cb2-b31c-1f5b428649a1",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "BG",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111033],
  :concept/name "Burkina Faso",
  :concept/id #uuid "56d28366-ed3b-49ab-a7c6-789009c511b6",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112033],
                             :representation/id #uuid "56d28366-3561-4bdb-85e4-74de7412d085",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Burkina Faso",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113033],
                             :representation/id #uuid "56d28366-bc41-4553-8ba2-3a8a69839237",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "BF",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111034],
  :concept/name "Burundi",
  :concept/id #uuid "56d28366-22a7-4f1a-9e46-eabc946543fe",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112034],
                             :representation/id #uuid "56d28366-41e5-4c32-aa24-a4c548624b3e",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Burundi",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113034],
                             :representation/id #uuid "56d28366-a506-479b-8203-75200e918d24",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "BI",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111035],
  :concept/name "Cambodia",
  :concept/id #uuid "56d28366-4139-413a-b153-008b56caf89a",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112035],
                             :representation/id #uuid "56d28366-4851-486a-a0e9-ee817363da56",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Cambodia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113035],
                             :representation/id #uuid "56d28366-4db4-4b7f-964d-45fe4d8fbaaf",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "KH",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111036],
  :concept/name "Cameroon",
  :concept/id #uuid "56d28366-6ee7-43c7-a6c8-33d2e35f29fe",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112036],
                             :representation/id #uuid "56d28366-6625-45af-8c45-fba32bcef491",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Cameroon",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113036],
                             :representation/id #uuid "56d28366-ecda-426f-a429-5215aa93be99",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "CM",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111037],
  :concept/name "Canada",
  :concept/id #uuid "56d28366-6e78-4149-a944-0aea1176dbfb",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112037],
                             :representation/id #uuid "56d28366-4906-45be-afd4-04a3e4eedb08",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Canada",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113037],
                             :representation/id #uuid "56d28366-27d4-4637-b18c-732270c5a2fd",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "CA",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111038],
  :concept/name "Cape Verde",
  :concept/id #uuid "56d28366-780f-45a1-b891-535d4e473eb2",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112038],
                             :representation/id #uuid "56d28366-14cf-42df-b807-0add936c8bb6",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Cape Verde",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113038],
                             :representation/id #uuid "56d28366-f7f4-499d-82e2-5b40a1b4ec58",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "CV",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111039],
  :concept/name "Cayman Islands",
  :concept/id #uuid "56d28366-3155-4747-8e2e-27ccfe0933c4",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112039],
                             :representation/id #uuid "56d28366-d286-4bbe-9195-7c4a69a24001",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Cayman Islands",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113039],
                             :representation/id #uuid "56d28366-3bd9-43c1-a3dc-b39b3a523c41",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "KY",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111040],
  :concept/name "Central African Republic",
  :concept/id #uuid "56d28366-f64a-4404-87b5-9cfe4fae6164",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112040],
                             :representation/id #uuid "56d28366-e8a1-4086-b4c3-4aaa7f529fc3",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Central African Republic",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113040],
                             :representation/id #uuid "56d28366-e4a8-49ce-bf87-bc2d05f03093",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "CF",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111041],
  :concept/name "Chad",
  :concept/id #uuid "56d28366-a7bb-412e-9cb2-e8d36cec333b",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112041],
                             :representation/id #uuid "56d28366-94d7-4435-b124-8c497ef38c17",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Chad",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113041],
                             :representation/id #uuid "56d28366-f458-47a8-bde9-fba530859fb4",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "TD",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111042],
  :concept/name "Chile",
  :concept/id #uuid "56d28366-28ce-4466-a163-02c05b2d9a4c",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112042],
                             :representation/id #uuid "56d28366-89ab-4dfc-bae4-8d7725556195",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Chile",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113042],
                             :representation/id #uuid "56d28366-d83b-4692-8bfe-d13fef8498c8",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "CL",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111043],
  :concept/name "China",
  :concept/id #uuid "56d28366-99bd-48db-b0f5-4891221e7409",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112043],
                             :representation/id #uuid "56d28366-129f-410d-b2c0-971c79e8e08e",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "China",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113043],
                             :representation/id #uuid "56d28366-cde8-489e-8b6c-db975e1412d9",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "CN",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111044],
  :concept/name "Christmas Island",
  :concept/id #uuid "56d28366-66ce-4ba0-ba02-5901c88cbf1b",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112044],
                             :representation/id #uuid "56d28366-e821-4c83-bf45-311f97203608",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Christmas Island",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113044],
                             :representation/id #uuid "56d28366-9e06-49b6-a9d6-45b849069db3",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "CX",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111045],
  :concept/name "Cocos (keeling) Islands",
  :concept/id #uuid "56d28366-2063-49d1-8ddd-da06453155e7",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112045],
                             :representation/id #uuid "56d28366-128c-449d-89f4-e7e4db4f4016",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Cocos (keeling) Islands",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113045],
                             :representation/id #uuid "56d28366-bc2b-43f7-8993-2fdfc18d5232",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "CC",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111046],
  :concept/name "Colombia",
  :concept/id #uuid "56d28366-9dd2-4ee5-868e-e6f3d8257593",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112046],
                             :representation/id #uuid "56d28366-ff4a-48eb-b54f-db8d8e3e66e2",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Colombia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113046],
                             :representation/id #uuid "56d28366-7a90-4bc0-b090-03bd12e84105",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "CO",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111047],
  :concept/name "Comoros",
  :concept/id #uuid "56d28366-6477-4cf2-a9df-568b850f0f00",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112047],
                             :representation/id #uuid "56d28366-245b-4f01-a5b2-a91e35a337e0",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Comoros",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113047],
                             :representation/id #uuid "56d28366-b5c5-4374-943d-24bec94d2789",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "KM",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111048],
  :concept/name "Congo",
  :concept/id #uuid "56d28366-1778-432f-8f05-d1c774e15c83",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112048],
                             :representation/id #uuid "56d28366-5047-4865-b60f-93747f83e426",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Congo",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113048],
                             :representation/id #uuid "56d28366-db4f-42bc-9bac-04b9f6310a9d",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "CG",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111049],
  :concept/name "Congo,
 The Democratic Republic Of The",
  :concept/id #uuid "56d28366-c457-481f-81d8-64c7f4b0924b",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112049],
                             :representation/id #uuid "56d28366-ceed-411d-9599-feddcc4bc352",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Congo,
 The Democratic Republic Of The",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113049],
                             :representation/id #uuid "56d28366-ab6a-4d3d-8122-bd30d4d666f6",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "CD",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111050],
  :concept/name "Cook Islands",
  :concept/id #uuid "56d28366-37d1-4fba-bfe4-ec0d79044abd",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112050],
                             :representation/id #uuid "56d28366-085b-4360-81a6-4511ca7a7891",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Cook Islands",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113050],
                             :representation/id #uuid "56d28366-33e6-4121-ac4d-6117b79cad56",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "CK",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111051],
  :concept/name "Costa Rica",
  :concept/id #uuid "56d28366-5989-432c-9a49-28096d842ed4",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112051],
                             :representation/id #uuid "56d28366-4bcf-4f82-9a0e-a45e045cff37",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Costa Rica",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113051],
                             :representation/id #uuid "56d28366-9816-40fc-a045-21bd86d163b4",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "CR",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111052],
  :concept/name "Cote D'ivoire",
  :concept/id #uuid "56d28366-03c1-4a7d-9d7c-f6f759402e0f",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112052],
                             :representation/id #uuid "56d28366-4182-49a7-8ef4-ac7b93a45bdb",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Cote D'ivoire",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113052],
                             :representation/id #uuid "56d28366-841f-42a0-84da-d42544fbf810",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "CI",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111053],
  :concept/name "Croatia",
  :concept/id #uuid "56d28366-93d4-4cb8-b6a2-5dc7ceaf3285",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112053],
                             :representation/id #uuid "56d28366-129b-4505-9c37-80b9f2dda790",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Croatia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113053],
                             :representation/id #uuid "56d28366-3a19-43b7-928c-1553048eec4e",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "HR",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111054],
  :concept/name "Cuba",
  :concept/id #uuid "56d28366-7443-46d7-97a7-0c32ae209bc9",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112054],
                             :representation/id #uuid "56d28366-5a34-4aad-bfe6-15dde0f935ef",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Cuba",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113054],
                             :representation/id #uuid "56d28366-dce1-45db-a764-3dcf5531b93d",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "CU",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111055],
  :concept/name "Cyprus",
  :concept/id #uuid "56d28366-1b75-4edf-b402-ee92482bc617",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112055],
                             :representation/id #uuid "56d28366-9b26-417d-86c6-8d4039b4377d",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Cyprus",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113055],
                             :representation/id #uuid "56d28366-212c-48dd-882c-4a54ddefb795",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "CY",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111056],
  :concept/name "Czech Republic",
  :concept/id #uuid "56d28366-4b99-4257-a2a8-c3385a1370f5",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112056],
                             :representation/id #uuid "56d28366-d229-46fe-90f3-451e7e13fd7a",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Czech Republic",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113056],
                             :representation/id #uuid "56d28366-7d96-4896-b6d5-c216ac911a3c",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "CZ",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111057],
  :concept/name "Denmark",
  :concept/id #uuid "56d28366-b5f8-4914-9e90-39cdb2332c17",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112057],
                             :representation/id #uuid "56d28366-35a7-49d0-89ab-057a04018996",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Denmark",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113057],
                             :representation/id #uuid "56d28366-2689-47d5-aa3d-c5d672f33480",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "DK",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111058],
  :concept/name "Djibouti",
  :concept/id #uuid "56d28366-c5ac-4356-aaac-85e74b2363d8",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112058],
                             :representation/id #uuid "56d28366-c932-4c99-b54c-8211905f1a50",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Djibouti",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113058],
                             :representation/id #uuid "56d28366-969c-44ec-b627-198b7b9c0d0b",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "DJ",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111059],
  :concept/name "Dominica",
  :concept/id #uuid "56d28366-1e64-4b2e-ba08-1e7ddc3af6bd",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112059],
                             :representation/id #uuid "56d28366-0089-4baf-aafe-cb728b32dd10",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Dominica",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113059],
                             :representation/id #uuid "56d28366-dbd2-4e8b-9516-76ec5f72899f",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "DM",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111060],
  :concept/name "Dominican Republic",
  :concept/id #uuid "56d28366-1b21-40d0-a48a-4d755f1af63e",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112060],
                             :representation/id #uuid "56d28366-151a-4af3-9e97-c546b887d609",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Dominican Republic",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113060],
                             :representation/id #uuid "56d28366-b40d-49f9-bfb0-4dcc12150854",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "DO",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111061],
  :concept/name "East Timor",
  :concept/id #uuid "56d28366-023d-40e3-9a88-61bf8c36044a",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112061],
                             :representation/id #uuid "56d28366-569f-4673-91c1-b786d9ccd306",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "East Timor",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113061],
                             :representation/id #uuid "56d28366-7b78-4e98-8582-53ccbff2597f",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "TP",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111062],
  :concept/name "Ecuador",
  :concept/id #uuid "56d28366-18ff-4df6-bf77-c9e275870da3",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112062],
                             :representation/id #uuid "56d28366-6ea3-4fdb-be4e-d8ce53fce17d",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Ecuador",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113062],
                             :representation/id #uuid "56d28366-8cf8-485c-b6b3-c4491b003fd1",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "EC",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111063],
  :concept/name "Egypt",
  :concept/id #uuid "56d28366-0de0-492d-aae2-06f94c629171",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112063],
                             :representation/id #uuid "56d28366-7c7c-4f71-908b-0f8b14790c0f",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Egypt",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113063],
                             :representation/id #uuid "56d28366-9684-4d45-acdb-a865a8847ffd",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "EG",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111064],
  :concept/name "El Salvador",
  :concept/id #uuid "56d28366-6266-4602-be3f-84722b4a761c",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112064],
                             :representation/id #uuid "56d28366-d1ca-4b32-b4dd-2e41b352bab2",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "El Salvador",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113064],
                             :representation/id #uuid "56d28366-1997-4e03-b047-0587e6b9418d",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "SV",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111065],
  :concept/name "Equatorial Guinea",
  :concept/id #uuid "56d28366-98e9-4412-b13a-54c8bafb5a1c",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112065],
                             :representation/id #uuid "56d28366-549e-4ad3-a205-e571c41a1a10",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Equatorial Guinea",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113065],
                             :representation/id #uuid "56d28366-819e-4c1a-9440-1d184220bab2",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "GQ",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111066],
  :concept/name "Eritrea",
  :concept/id #uuid "56d28366-d9f7-4444-806e-e3c5ebccbd9b",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112066],
                             :representation/id #uuid "56d28366-6aae-428a-9a60-61adb2ab1978",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Eritrea",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113066],
                             :representation/id #uuid "56d28366-bb17-4dad-b8b2-ffcd8bbaee17",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "ER",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111067],
  :concept/name "Estonia",
  :concept/id #uuid "56d28366-1652-470a-80f6-2737b21ef9b1",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112067],
                             :representation/id #uuid "56d28366-ef2c-4733-8713-77ed7a081870",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Estonia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113067],
                             :representation/id #uuid "56d28366-549f-4150-b01d-837bccff5b15",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "EE",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111068],
  :concept/name "Ethiopia",
  :concept/id #uuid "56d28366-c4d9-47d2-a92e-09673be596d2",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112068],
                             :representation/id #uuid "56d28366-ac6f-4ffa-ad6a-93745fd9c3b0",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Ethiopia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113068],
                             :representation/id #uuid "56d28366-baed-4a83-84e9-8b118a1b8e50",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "ET",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111069],
  :concept/name "Falkland Islands (malvinas)",
  :concept/id #uuid "56d28366-79bf-4f36-a044-bd31b09698d7",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112069],
                             :representation/id #uuid "56d28366-6b78-491f-8b61-b6695ca0a05f",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Falkland Islands (malvinas)",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113069],
                             :representation/id #uuid "56d28366-d21e-4a9f-b3f2-c88c01e16d3d",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "FK",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111070],
  :concept/name "Faroe Islands",
  :concept/id #uuid "56d28366-b1dd-4b8f-8b87-e5b3753d21a0",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112070],
                             :representation/id #uuid "56d28366-eb13-4323-8152-6765d06470c6",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Faroe Islands",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113070],
                             :representation/id #uuid "56d28366-84b3-4f36-b433-1fede746426a",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "FO",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111071],
  :concept/name "Fiji",
  :concept/id #uuid "56d28366-f806-4b40-a7eb-aa98c83a5114",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112071],
                             :representation/id #uuid "56d28366-1e1f-4538-865c-ecf04b9bbd9b",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Fiji",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113071],
                             :representation/id #uuid "56d28366-1ca3-4188-8169-74a8db1da043",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "FJ",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111072],
  :concept/name "Finland",
  :concept/id #uuid "56d28367-609b-4e62-9db3-83c2c4c64b5c",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112072],
                             :representation/id #uuid "56d28367-48b3-48da-aad5-78a521b6c8af",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Finland",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113072],
                             :representation/id #uuid "56d28367-6257-481e-8855-49c082e8a15f",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "FI",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111073],
  :concept/name "France",
  :concept/id #uuid "56d28367-5061-4650-ade0-f00d667f90e5",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112073],
                             :representation/id #uuid "56d28367-0298-48a7-af7a-a311febf23fe",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "France",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113073],
                             :representation/id #uuid "56d28367-aed3-45b3-b2ad-634e5fa73f74",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "FR",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111074],
  :concept/name "French Guiana",
  :concept/id #uuid "56d28367-6c84-4062-9d0d-acaa7f118de6",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112074],
                             :representation/id #uuid "56d28367-68d2-4e6e-bfd4-c37b24a09170",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "French Guiana",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113074],
                             :representation/id #uuid "56d28367-0a3d-433c-a976-c8cb4264566a",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "GF",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111075],
  :concept/name "French Polynesia",
  :concept/id #uuid "56d28367-cf4f-454b-8e2b-b9480600df23",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112075],
                             :representation/id #uuid "56d28367-eb5c-44bd-b12c-f7749e668a3a",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "French Polynesia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113075],
                             :representation/id #uuid "56d28367-39d4-4fb1-994a-40fe3c75663d",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "PF",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111076],
  :concept/name "French Southern Territories",
  :concept/id #uuid "56d28367-68f8-48ac-bfad-78d8d8bca989",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112076],
                             :representation/id #uuid "56d28367-0c0d-4827-a280-449e8da37908",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "French Southern Territories",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113076],
                             :representation/id #uuid "56d28367-b4a1-4cf4-8043-0e7251fff91f",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "TF",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111077],
  :concept/name "Gabon",
  :concept/id #uuid "56d28367-4f9d-4ac8-83fb-e98b73ea33df",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112077],
                             :representation/id #uuid "56d28367-4ea6-4c62-921c-28c117fe5d99",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Gabon",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113077],
                             :representation/id #uuid "56d28367-abc7-4e9e-bf8c-ec398f4fdb68",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "GA",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111078],
  :concept/name "Gambia",
  :concept/id #uuid "56d28367-1c21-4091-8eed-a6f5d3b19fea",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112078],
                             :representation/id #uuid "56d28367-7ffe-4f49-9061-1bd7818ce3e3",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Gambia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113078],
                             :representation/id #uuid "56d28367-fb53-4ebc-aa06-4773f4b14824",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "GM",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111079],
  :concept/name "Georgia",
  :concept/id #uuid "56d28367-8ed5-43ff-98f8-7be1214b18a6",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112079],
                             :representation/id #uuid "56d28367-4c17-4b56-81dc-38c86de63726",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Georgia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113079],
                             :representation/id #uuid "56d28367-b755-4d1a-a44e-da722943c4c5",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "GE",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111080],
  :concept/name "Germany",
  :concept/id #uuid "56d28367-f4a5-47f7-9375-6270056b6aa3",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112080],
                             :representation/id #uuid "56d28367-94d4-4ce4-9562-d94e8c3b3a58",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Germany",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113080],
                             :representation/id #uuid "56d28367-1bca-481d-b413-9a141eb39046",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "DE",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111081],
  :concept/name "Ghana",
  :concept/id #uuid "56d28367-886c-4ef6-a321-6e8cca8ef387",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112081],
                             :representation/id #uuid "56d28367-b9d1-4a42-b304-e4d9ba0b9a12",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Ghana",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113081],
                             :representation/id #uuid "56d28367-572a-4efa-903a-046b4c19488a",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "GH",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111082],
  :concept/name "Gibraltar",
  :concept/id #uuid "56d28367-dde3-4fa7-b4da-64722c8351a0",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112082],
                             :representation/id #uuid "56d28367-381e-4220-9233-8b88b5b9be15",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Gibraltar",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113082],
                             :representation/id #uuid "56d28367-2d09-4a15-a1fb-486d8b41363f",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "GI",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111083],
  :concept/name "Greece",
  :concept/id #uuid "56d28367-ad73-44ad-a855-a03f4405e755",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112083],
                             :representation/id #uuid "56d28367-2be1-4330-b254-d7aff3141534",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Greece",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113083],
                             :representation/id #uuid "56d28367-3249-4c73-9c7f-fa8ee22b4f81",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "GR",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111084],
  :concept/name "Greenland",
  :concept/id #uuid "56d28367-130c-49a1-ac7b-aa1badcf7d42",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112084],
                             :representation/id #uuid "56d28367-3924-4787-819c-f060025c1dc4",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Greenland",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113084],
                             :representation/id #uuid "56d28367-231e-471b-8f32-6211085b2c01",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "GL",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111085],
  :concept/name "Grenada",
  :concept/id #uuid "56d28367-db1a-4840-abba-4676a2c0ecea",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112085],
                             :representation/id #uuid "56d28367-6ee6-4a11-a618-811b7b90c7e7",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Grenada",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113085],
                             :representation/id #uuid "56d28367-1c34-467a-8170-b92d5ac9ee84",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "GD",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111086],
  :concept/name "Guadeloupe",
  :concept/id #uuid "56d28367-ba35-4f41-9598-a854ef136b66",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112086],
                             :representation/id #uuid "56d28367-8206-4d99-843b-bfa7fd18e062",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Guadeloupe",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113086],
                             :representation/id #uuid "56d28367-3668-4354-86dd-b5a9355a6961",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "GP",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111087],
  :concept/name "Guam",
  :concept/id #uuid "56d28367-6af3-4fd9-983b-d0bc51e0ddc8",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112087],
                             :representation/id #uuid "56d28367-b171-487c-bf84-82675a42d997",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Guam",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113087],
                             :representation/id #uuid "56d28367-b0b9-4942-b65c-e9d735872de8",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "GU",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111088],
  :concept/name "Guatemala",
  :concept/id #uuid "56d28367-1a45-4b1f-80f0-f40f1684ede8",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112088],
                             :representation/id #uuid "56d28367-60e6-403c-85c8-8f09dcdd287f",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Guatemala",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113088],
                             :representation/id #uuid "56d28367-1b7a-4f5c-b3a6-c13273e086d3",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "GT",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111089],
  :concept/name "Guinea",
  :concept/id #uuid "56d28367-ea62-488a-afea-3878b4851f8a",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112089],
                             :representation/id #uuid "56d28367-0603-40ed-9f94-ea1b49bb64ef",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Guinea",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113089],
                             :representation/id #uuid "56d28367-b179-43b7-9b02-9fa3d8a773f6",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "GN",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111090],
  :concept/name "Guinea-bissau",
  :concept/id #uuid "56d28367-b4d8-42c8-b347-62aee26cff6e",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112090],
                             :representation/id #uuid "56d28367-6c39-46f4-b1f1-07d3310a0b96",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Guinea-bissau",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113090],
                             :representation/id #uuid "56d28367-0f2b-49b9-82a8-8fb8a0859446",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "GW",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111091],
  :concept/name "Guyana",
  :concept/id #uuid "56d28367-3475-42d9-8798-7b9fb8f088fe",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112091],
                             :representation/id #uuid "56d28367-922e-4d70-a488-2513881de5f1",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Guyana",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113091],
                             :representation/id #uuid "56d28367-d8f9-4691-9f5f-0d987c07ea49",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "GY",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111092],
  :concept/name "Haiti",
  :concept/id #uuid "56d28367-d769-44d1-a45f-1196a3d6f3a1",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112092],
                             :representation/id #uuid "56d28367-9c63-44a1-ac43-d1288f41e1e2",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Haiti",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113092],
                             :representation/id #uuid "56d28367-7124-491c-ba1e-d54bfefdb0c3",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "HT",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111093],
  :concept/name "Heard Island And Mcdonald Islands",
  :concept/id #uuid "56d28367-2bce-49d9-89da-d9ed8acc53e4",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112093],
                             :representation/id #uuid "56d28367-8b4b-4f91-8cbc-6957a11281e1",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Heard Island And Mcdonald Islands",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113093],
                             :representation/id #uuid "56d28367-b96b-4c8e-ba44-04a3f07f5b85",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "HM",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111094],
  :concept/name "Holy See (vatican City State)",
  :concept/id #uuid "56d28367-d5a5-40ef-abf6-04f7549a5c9b",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112094],
                             :representation/id #uuid "56d28367-3530-4c0a-aab1-bcfacf3b0a79",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Holy See (vatican City State)",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113094],
                             :representation/id #uuid "56d28367-7c35-4056-8098-24f9750b6fb7",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "VA",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111095],
  :concept/name "Honduras",
  :concept/id #uuid "56d28367-31e1-4a75-8fa0-d31ec42d61e6",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112095],
                             :representation/id #uuid "56d28367-74af-4ff3-883a-bfc3fbb259a2",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Honduras",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113095],
                             :representation/id #uuid "56d28367-dc31-4300-9f2e-13d0ade93c0d",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "HN",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111096],
  :concept/name "Hong Kong",
  :concept/id #uuid "56d28367-0ff2-45a7-947f-0d66b7fc2772",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112096],
                             :representation/id #uuid "56d28367-f3f2-4ab6-a593-65396bbc561e",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Hong Kong",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113096],
                             :representation/id #uuid "56d28367-ab9b-44f3-b535-c0d47da3b0da",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "HK",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111097],
  :concept/name "Hungary",
  :concept/id #uuid "56d28367-64fc-4bb9-bf75-1422c10a2a2a",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112097],
                             :representation/id #uuid "56d28367-13eb-4b47-9d0f-e99db6a9e2a6",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Hungary",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113097],
                             :representation/id #uuid "56d28367-54b9-470d-b7b1-3bf5549f52f2",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "HU",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111098],
  :concept/name "Iceland",
  :concept/id #uuid "56d28367-207f-4a9b-a65b-88c981cb20ec",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112098],
                             :representation/id #uuid "56d28367-6614-48dd-9e6b-d49fad55ea94",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Iceland",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113098],
                             :representation/id #uuid "56d28367-5c89-4779-b438-1088af18d987",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "IS",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111099],
  :concept/name "India",
  :concept/id #uuid "56d28367-09c3-463a-8057-998af159b731",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112099],
                             :representation/id #uuid "56d28367-d294-4594-a256-2f323e4ea6c6",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "India",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113099],
                             :representation/id #uuid "56d28367-52f0-4dda-819b-a40ea36a8aa8",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "IN",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111100],
  :concept/name "Indonesia",
  :concept/id #uuid "56d28367-c839-493c-b794-86947687f3ca",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112100],
                             :representation/id #uuid "56d28367-54ee-4a42-89c0-4394edaf6964",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Indonesia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113100],
                             :representation/id #uuid "56d28367-bca4-4eff-89ae-432e3491f202",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "ID",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111101],
  :concept/name "Iran,
 Islamic Republic Of",
  :concept/id #uuid "56d28367-9d46-40a7-9a46-9372e221706f",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112101],
                             :representation/id #uuid "56d28367-aca0-48f3-bebb-d87364c3db36",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Iran,
 Islamic Republic Of",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113101],
                             :representation/id #uuid "56d28367-fb6c-4c5f-bd88-635d92506a16",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "IR",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111102],
  :concept/name "Iraq",
  :concept/id #uuid "56d28367-8423-40f6-8b14-a75c53729601",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112102],
                             :representation/id #uuid "56d28367-ef8c-4a8b-a47a-f08e1bc1c845",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Iraq",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113102],
                             :representation/id #uuid "56d28367-7a49-462a-9fce-0b9e985015aa",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "IQ",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111103],
  :concept/name "Ireland",
  :concept/id #uuid "56d28367-6e9c-42be-9d91-236433cbd87b",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112103],
                             :representation/id #uuid "56d28367-dc2b-42d7-a7c2-2a789952942d",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Ireland",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113103],
                             :representation/id #uuid "56d28367-1f00-4641-8baa-56df9823c9bb",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "IE",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111104],
  :concept/name "Israel",
  :concept/id #uuid "56d28367-ba27-40d0-b1d2-b7357c3e2472",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112104],
                             :representation/id #uuid "56d28367-ed80-4a90-969b-c38eff3bdfc0",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Israel",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113104],
                             :representation/id #uuid "56d28367-ee11-4fc4-823c-9e1b7424292a",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "IL",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111105],
  :concept/name "Italy",
  :concept/id #uuid "56d28367-580c-43e7-b729-caed848942c5",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112105],
                             :representation/id #uuid "56d28367-6c22-4fe9-afe7-085fdb8374cf",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Italy",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113105],
                             :representation/id #uuid "56d28367-a1b1-47fa-9bd8-0497893f8ee1",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "IT",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111106],
  :concept/name "Jamaica",
  :concept/id #uuid "56d28367-09ac-4f55-a0f6-9b80a915eb36",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112106],
                             :representation/id #uuid "56d28367-e5f2-44f4-bfcc-a5741a409af0",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Jamaica",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113106],
                             :representation/id #uuid "56d28367-7b0c-4706-963c-fc407f6d6c69",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "JM",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111107],
  :concept/name "Japan",
  :concept/id #uuid "56d28367-18c7-4113-a823-34e5dbab3f39",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112107],
                             :representation/id #uuid "56d28367-1d4c-48f5-8dd9-78c3fd72c909",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Japan",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113107],
                             :representation/id #uuid "56d28367-a9a3-490f-9e40-cd6bc6789802",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "JP",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111108],
  :concept/name "Jordan",
  :concept/id #uuid "56d28367-452d-4cc9-bb5a-208427eafc8c",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112108],
                             :representation/id #uuid "56d28367-2296-44af-a92e-05c7282e1928",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Jordan",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113108],
                             :representation/id #uuid "56d28367-42d0-4da1-b1f7-73fadc530dfe",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "JO",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111109],
  :concept/name "Kazakstan",
  :concept/id #uuid "56d28367-1c89-4c7b-8a6e-8d41b0595177",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112109],
                             :representation/id #uuid "56d28367-5b6c-4a22-a32b-598eaa62f83a",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Kazakstan",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113109],
                             :representation/id #uuid "56d28367-1c62-4c41-8d93-36bd669e2281",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "KZ",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111110],
  :concept/name "Kenya",
  :concept/id #uuid "56d28367-e10c-4e5f-95aa-a3f2b0fc6ee2",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112110],
                             :representation/id #uuid "56d28367-dc93-4167-9b4e-5cec3750615c",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Kenya",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113110],
                             :representation/id #uuid "56d28367-8d38-4419-badb-ba49b90d4e2c",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "KE",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111111],
  :concept/name "Kiribati",
  :concept/id #uuid "56d28367-f766-4aff-9783-260642ac6709",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112111],
                             :representation/id #uuid "56d28367-9944-4339-81be-fcae565e25f8",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Kiribati",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113111],
                             :representation/id #uuid "56d28367-1e1c-4d49-9894-c03d25e69093",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "KI",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111112],
  :concept/name "Korea,
 Democratic People's Republic Of",
  :concept/id #uuid "56d28367-095c-468d-b32f-c0ac0289eeca",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112112],
                             :representation/id #uuid "56d28367-1c25-4b37-ba32-5f510d8176ba",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Korea,
 Democratic People's Republic Of",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113112],
                             :representation/id #uuid "56d28367-907b-4245-94c3-16012906340e",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "KP",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111113],
  :concept/name "Korea,
 Republic Of",
  :concept/id #uuid "56d28367-375b-4a6f-a63c-d214e4eb5a6d",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112113],
                             :representation/id #uuid "56d28367-37b9-4f01-893c-c316dffbed30",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Korea,
 Republic Of",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113113],
                             :representation/id #uuid "56d28367-f0ff-446b-b16f-8ba244f5de06",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "KR",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111114],
  :concept/name "Kosovo",
  :concept/id #uuid "56d28367-f7bf-4106-8f64-214870d97b41",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112114],
                             :representation/id #uuid "56d28367-f94d-4c53-98a9-b88f141f7c42",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Kosovo",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113114],
                             :representation/id #uuid "56d28367-0e7b-491b-af91-e7b0aa088252",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "KV",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111115],
  :concept/name "Kuwait",
  :concept/id #uuid "56d28367-94d4-47da-a537-244e22abb5d4",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112115],
                             :representation/id #uuid "56d28367-b3c6-4133-af44-1a50c09e1365",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Kuwait",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113115],
                             :representation/id #uuid "56d28367-3a89-477b-93b7-2febf730ac0c",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "KW",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111116],
  :concept/name "Kyrgyzstan",
  :concept/id #uuid "56d28367-1433-438e-8d3d-a0119db0c61a",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112116],
                             :representation/id #uuid "56d28367-6675-4a8a-8c58-4cda6b0198db",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Kyrgyzstan",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113116],
                             :representation/id #uuid "56d28367-ab6a-40f6-8423-73fc3c99b9fb",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "KG",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111117],
  :concept/name "Lao People's Democratic Republic",
  :concept/id #uuid "56d28367-0836-4ffa-a7b8-638c83e411eb",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112117],
                             :representation/id #uuid "56d28367-bfe3-4b66-8e33-70810914d609",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Lao People's Democratic Republic",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113117],
                             :representation/id #uuid "56d28367-9223-4a5a-8646-e07be4781c1a",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "LA",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111118],
  :concept/name "Latvia",
  :concept/id #uuid "56d28367-8a9c-485b-9560-8443c903050e",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112118],
                             :representation/id #uuid "56d28367-2e92-4048-b209-ed1273e32713",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Latvia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113118],
                             :representation/id #uuid "56d28367-67e5-4d50-9d77-a022f06bc51e",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "LV",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111119],
  :concept/name "Lebanon",
  :concept/id #uuid "56d28367-fec3-4b7b-bb4a-f7e55ffb81d7",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112119],
                             :representation/id #uuid "56d28367-ee2d-491e-a73d-b0e9af5f1a48",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Lebanon",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113119],
                             :representation/id #uuid "56d28367-35fa-4bd6-8ce1-45bd2167c676",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "LB",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111120],
  :concept/name "Lesotho",
  :concept/id #uuid "56d28367-3188-40ee-a65f-5ca1d6a53061",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112120],
                             :representation/id #uuid "56d28367-c727-4c82-aaaf-a8351003731b",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Lesotho",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113120],
                             :representation/id #uuid "56d28367-87a5-475f-91d9-d1c866c2b208",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "LS",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111121],
  :concept/name "Liberia",
  :concept/id #uuid "56d28367-97fd-411b-ac5a-c1c8c8b25237",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112121],
                             :representation/id #uuid "56d28367-eed7-4c5c-822a-41f203402d0b",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Liberia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113121],
                             :representation/id #uuid "56d28367-bf21-4603-8aa8-b7393d8d25ea",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "LR",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111122],
  :concept/name "Libyan Arab Jamahiriya",
  :concept/id #uuid "56d28367-8c7e-4aa6-9770-0805f3ca0e1d",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112122],
                             :representation/id #uuid "56d28367-f7b4-47be-b8e8-2dccf5242239",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Libyan Arab Jamahiriya",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113122],
                             :representation/id #uuid "56d28367-c353-4753-be8a-ca287bbaeaf7",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "LY",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111123],
  :concept/name "Liechtenstein",
  :concept/id #uuid "56d28367-2b44-4d8b-b1f4-3b21a411e076",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112123],
                             :representation/id #uuid "56d28367-c645-4683-ac9b-81fff5a5ef83",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Liechtenstein",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113123],
                             :representation/id #uuid "56d28367-6d8b-42a0-97de-e4a3c11737ec",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "LI",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111124],
  :concept/name "Lithuania",
  :concept/id #uuid "56d28367-fa2d-49d2-bbd0-3c87822f623f",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112124],
                             :representation/id #uuid "56d28367-ab4e-42d4-9585-b064fb3677a8",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Lithuania",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113124],
                             :representation/id #uuid "56d28367-6e6e-492a-9316-476101bd4f85",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "LT",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111125],
  :concept/name "Luxembourg",
  :concept/id #uuid "56d28367-cc5e-4473-93f8-ccddd5f82ff5",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112125],
                             :representation/id #uuid "56d28367-3e2c-42df-86d0-7bb9192ac387",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Luxembourg",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113125],
                             :representation/id #uuid "56d28367-2aa4-4d42-a917-8fb80c7dae38",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "LU",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111126],
  :concept/name "Macau",
  :concept/id #uuid "56d28367-72d5-4545-9a8a-b1200b3a66df",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112126],
                             :representation/id #uuid "56d28367-a660-427f-81bc-579e41fd89b2",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Macau",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113126],
                             :representation/id #uuid "56d28367-37bc-40b6-9cc6-3f4057b51a0a",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "MO",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111127],
  :concept/name "Macedonia,
 The Former Yugoslav Republic Of",
  :concept/id #uuid "56d28367-92e6-4502-b496-9e93d9e56d27",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112127],
                             :representation/id #uuid "56d28367-e448-40ca-be83-8720beac313c",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Macedonia,
 The Former Yugoslav Republic Of",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113127],
                             :representation/id #uuid "56d28367-924d-4093-98ed-775f79b8aaa4",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "MK",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111128],
  :concept/name "Madagascar",
  :concept/id #uuid "56d28367-ab9c-44fd-ae9e-b8165db51be0",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112128],
                             :representation/id #uuid "56d28367-506b-47d1-a701-10b37ce49dac",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Madagascar",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113128],
                             :representation/id #uuid "56d28367-28cb-4a55-b3f2-88bf79332891",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "MG",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111129],
  :concept/name "Malawi",
  :concept/id #uuid "56d28367-6945-4599-97e1-728c3cb3b0bd",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112129],
                             :representation/id #uuid "56d28367-baa4-4640-b399-3f08035b283e",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Malawi",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113129],
                             :representation/id #uuid "56d28367-33c0-49e1-8707-1a2992ccfdd2",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "MW",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111130],
  :concept/name "Malaysia",
  :concept/id #uuid "56d28367-93b0-4f87-b88a-70f2ce0efb2c",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112130],
                             :representation/id #uuid "56d28367-1bc2-49a5-a72d-98280631c141",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Malaysia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113130],
                             :representation/id #uuid "56d28367-34a8-4699-a8c9-5180a2635d01",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "MY",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111131],
  :concept/name "Maldives",
  :concept/id #uuid "56d28367-19a0-4882-9d26-ae3d8ea03b0e",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112131],
                             :representation/id #uuid "56d28367-00cf-463b-a81d-3f2debf0d96a",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Maldives",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113131],
                             :representation/id #uuid "56d28367-228d-496e-9b4b-29882ee5da54",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "MV",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111132],
  :concept/name "Mali",
  :concept/id #uuid "56d28367-c433-4ac1-a3a6-047519b38257",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112132],
                             :representation/id #uuid "56d28367-b48f-4cdf-874f-219ca1c3e65d",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Mali",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113132],
                             :representation/id #uuid "56d28367-cd7c-432b-a6eb-024ffae2741c",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "ML",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111133],
  :concept/name "Malta",
  :concept/id #uuid "56d28367-a9df-4280-922e-6c17b9b0b2ec",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112133],
                             :representation/id #uuid "56d28367-be04-4ea4-b151-d15cdd1ff751",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Malta",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113133],
                             :representation/id #uuid "56d28367-7c02-4d33-9500-fbbc7ffe54e3",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "MT",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111134],
  :concept/name "Marshall Islands",
  :concept/id #uuid "56d28367-ff76-4a0e-af22-5dc1e978583e",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112134],
                             :representation/id #uuid "56d28367-6d6d-4b9e-8c62-37ace94475f9",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Marshall Islands",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113134],
                             :representation/id #uuid "56d28367-79cc-451c-8b44-13cb789f08b9",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "MH",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111135],
  :concept/name "Martinique",
  :concept/id #uuid "56d28367-1304-4836-a25b-b0df33778640",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112135],
                             :representation/id #uuid "56d28367-fd77-4d24-bf4e-14e887381dd7",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Martinique",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113135],
                             :representation/id #uuid "56d28367-3778-4886-a8aa-494f74c2aa2d",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "MQ",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111136],
  :concept/name "Mauritania",
  :concept/id #uuid "56d28367-df3e-40c2-96ea-d3e4ee1b78bc",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112136],
                             :representation/id #uuid "56d28367-ad7e-455a-a884-bc6a1ca39fbb",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Mauritania",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113136],
                             :representation/id #uuid "56d28367-222e-4e4a-8a66-47e42839edd1",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "MR",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111137],
  :concept/name "Mauritius",
  :concept/id #uuid "56d28367-b3d3-43cf-a372-04650ef1ad2c",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112137],
                             :representation/id #uuid "56d28367-4f2f-4baf-a233-91099f1a7aa5",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Mauritius",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113137],
                             :representation/id #uuid "56d28367-fc59-4be3-a299-c41c63563c6a",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "MU",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111138],
  :concept/name "Mayotte",
  :concept/id #uuid "56d28367-2d2d-4feb-a35b-1faffe596765",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112138],
                             :representation/id #uuid "56d28367-28d4-4560-b398-ef8441d17a74",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Mayotte",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113138],
                             :representation/id #uuid "56d28367-8943-4a7c-ab27-ce9a322fa6fb",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "YT",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111139],
  :concept/name "Mexico",
  :concept/id #uuid "56d28367-0e10-4d17-8c15-92040890f454",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112139],
                             :representation/id #uuid "56d28367-cc8e-4119-a52d-25aa4ebd701c",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Mexico",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113139],
                             :representation/id #uuid "56d28367-09d6-413a-a692-5311d590ca88",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "MX",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111140],
  :concept/name "Micronesia,
 Federated States Of",
  :concept/id #uuid "56d28367-6b9c-4479-b183-f3069de7fd18",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112140],
                             :representation/id #uuid "56d28367-1194-44f6-b906-96900a2184a3",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Micronesia,
 Federated States Of",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113140],
                             :representation/id #uuid "56d28367-ead0-4459-929f-847d59da7764",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "FM",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111141],
  :concept/name "Moldova,
 Republic Of",
  :concept/id #uuid "56d28367-dcc9-43e5-8a7e-e9773a9ef057",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112141],
                             :representation/id #uuid "56d28367-2cb7-4442-bdd2-dcda0a0bc24a",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Moldova,
 Republic Of",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113141],
                             :representation/id #uuid "56d28367-f563-4448-9435-709285096406",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "MD",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111142],
  :concept/name "Monaco",
  :concept/id #uuid "56d28367-6885-4836-87be-82c50586d29d",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112142],
                             :representation/id #uuid "56d28367-9f78-4ca6-8d89-6c1d97dc1df4",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Monaco",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113142],
                             :representation/id #uuid "56d28367-a2f2-4952-9477-f9b89d00a641",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "MC",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111143],
  :concept/name "Mongolia",
  :concept/id #uuid "56d28367-1cb8-4e46-8523-2f9c949715de",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112143],
                             :representation/id #uuid "56d28367-594d-4812-8c79-9a786095fbd0",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Mongolia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113143],
                             :representation/id #uuid "56d28367-2bf7-4af6-910d-62b5c16d8eb2",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "MN",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111144],
  :concept/name "Montserrat",
  :concept/id #uuid "56d28367-2b4e-4a48-bc7d-8d95c735cb73",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112144],
                             :representation/id #uuid "56d28367-3298-4ce5-b26c-a9565339ac7b",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Montserrat",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113144],
                             :representation/id #uuid "56d28367-3913-40d2-8fda-09e5f343eb19",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "MS",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111145],
  :concept/name "Montenegro",
  :concept/id #uuid "56d28367-90d9-4ca8-a6d4-696ab32bf3d6",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112145],
                             :representation/id #uuid "56d28367-b6ec-4839-a2ee-485438fc38ae",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Montenegro",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113145],
                             :representation/id #uuid "56d28367-9d07-4a51-abd3-42663056a0e4",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "ME",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111146],
  :concept/name "Morocco",
  :concept/id #uuid "56d28367-bc4c-4324-a2d0-ed89ca515271",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112146],
                             :representation/id #uuid "56d28367-0a46-4eed-9935-9ad11df67912",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Morocco",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113146],
                             :representation/id #uuid "56d28367-f397-4feb-a449-daedc4a962d1",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "MA",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111147],
  :concept/name "Mozambique",
  :concept/id #uuid "56d28367-9e7c-4a33-a3e8-167ed0ea9f4e",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112147],
                             :representation/id #uuid "56d28367-482a-4861-a8b8-f5ff7ff385d6",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Mozambique",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113147],
                             :representation/id #uuid "56d28367-c689-4c85-a296-9d4c7878cc0d",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "MZ",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111148],
  :concept/name "Myanmar",
  :concept/id #uuid "56d28367-217c-40ef-897a-5477f3823bcb",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112148],
                             :representation/id #uuid "56d28367-a9b4-4419-9d52-a763f34963be",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Myanmar",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113148],
                             :representation/id #uuid "56d28367-1163-4b60-92fe-2c9a8ecb35a7",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "MM",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111149],
  :concept/name "Namibia",
  :concept/id #uuid "56d28367-a93f-4605-a995-22bf0d31bc5c",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112149],
                             :representation/id #uuid "56d28367-1433-4a5f-aea4-148ec53e951f",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Namibia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113149],
                             :representation/id #uuid "56d28367-9e7a-482b-82a9-ca2fbf42de6e",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "NA",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111150],
  :concept/name "Nauru",
  :concept/id #uuid "56d28367-2e75-4833-979c-9eb6c5d24e25",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112150],
                             :representation/id #uuid "56d28367-4032-44ce-ace0-5f9b90232b57",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Nauru",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113150],
                             :representation/id #uuid "56d28367-ca39-44a9-bd18-bc1839cbd4e7",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "NR",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111151],
  :concept/name "Nepal",
  :concept/id #uuid "56d28367-ce63-4e0c-b8ac-713ce4119a4d",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112151],
                             :representation/id #uuid "56d28367-5764-4978-9b4f-b09a58787944",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Nepal",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113151],
                             :representation/id #uuid "56d28367-a910-4993-ac44-8bba30220bb0",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "NP",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111152],
  :concept/name "Netherlands",
  :concept/id #uuid "56d28367-2402-45b2-876d-8f8152ed4f33",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112152],
                             :representation/id #uuid "56d28367-6b49-4a59-83ab-179c8da003aa",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Netherlands",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113152],
                             :representation/id #uuid "56d28367-0db0-483c-a81e-4f0ceb8c4bed",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "NL",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111153],
  :concept/name "Netherlands Antilles",
  :concept/id #uuid "56d28367-cae0-4e0e-9d35-30be20b2baf5",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112153],
                             :representation/id #uuid "56d28367-4aff-4f89-aed5-9bb58e00b81e",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Netherlands Antilles",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113153],
                             :representation/id #uuid "56d28367-98cb-42a7-b878-28ffde2a195d",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "AN",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111154],
  :concept/name "New Caledonia",
  :concept/id #uuid "56d28367-53f3-494c-81e3-87e85c91152d",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112154],
                             :representation/id #uuid "56d28367-18d6-43a1-9eea-f2b1b8ac7708",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "New Caledonia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113154],
                             :representation/id #uuid "56d28367-9d15-4ebb-a25e-4c3e65b4ae89",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "NC",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111155],
  :concept/name "New Zealand",
  :concept/id #uuid "56d28367-8dc9-4340-a8f4-99607d88942d",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112155],
                             :representation/id #uuid "56d28367-204a-49e1-9c83-aade1d887771",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "New Zealand",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113155],
                             :representation/id #uuid "56d28367-2529-475e-a8be-5756274217af",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "NZ",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111156],
  :concept/name "Nicaragua",
  :concept/id #uuid "56d28367-f3b5-45ed-be71-80ce1eb5c838",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112156],
                             :representation/id #uuid "56d28367-7d8e-4e0c-9d91-a9459aea9d2c",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Nicaragua",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113156],
                             :representation/id #uuid "56d28367-90d8-4671-beaf-5ae8881c1f00",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "NI",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111157],
  :concept/name "Niger",
  :concept/id #uuid "56d28367-96a6-4ead-9aba-cc76a07e4c56",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112157],
                             :representation/id #uuid "56d28367-0110-472d-8515-a93b5d6c7c6e",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Niger",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113157],
                             :representation/id #uuid "56d28367-937f-45ca-8711-e98e417d3cb8",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "NE",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111158],
  :concept/name "Nigeria",
  :concept/id #uuid "56d28367-b941-4c7d-95e3-ad2b77933895",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112158],
                             :representation/id #uuid "56d28367-4cd5-4b4e-b647-ead26e54beb1",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Nigeria",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113158],
                             :representation/id #uuid "56d28367-060b-476b-9127-ad246a9a8e31",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "NG",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111159],
  :concept/name "Niue",
  :concept/id #uuid "56d28367-ac31-4c6e-8c45-3c0ace29683f",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112159],
                             :representation/id #uuid "56d28367-e346-4c69-917f-152a09f87226",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Niue",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113159],
                             :representation/id #uuid "56d28367-35fb-43bd-814c-d334fcc31bb7",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "NU",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111160],
  :concept/name "Norfolk Island",
  :concept/id #uuid "56d28367-5311-48a5-8a9d-8d62105f0ea6",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112160],
                             :representation/id #uuid "56d28367-d5ac-4e33-b4b7-10feac3013f8",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Norfolk Island",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113160],
                             :representation/id #uuid "56d28367-cd81-46d9-99bf-b9b6d49232a1",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "NF",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111161],
  :concept/name "Northern Mariana Islands",
  :concept/id #uuid "56d28367-06e2-4259-b0de-2a31d3958d04",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112161],
                             :representation/id #uuid "56d28367-4cf9-457b-98d9-cfb229bf3c25",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Northern Mariana Islands",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113161],
                             :representation/id #uuid "56d28367-c3ad-4d9e-be1c-d59f7c27327c",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "MP",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111162],
  :concept/name "Norway",
  :concept/id #uuid "56d28367-7566-4bd9-9882-84b60ddd7231",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112162],
                             :representation/id #uuid "56d28367-4872-4a5c-a3d1-d7115d79ff54",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Norway",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113162],
                             :representation/id #uuid "56d28367-9859-4552-a803-ac36ce586f0b",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "NO",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111163],
  :concept/name "Oman",
  :concept/id #uuid "56d28367-5c28-4052-9746-6f3d60590668",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112163],
                             :representation/id #uuid "56d28367-c144-4175-b60f-02d5859d99f2",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Oman",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113163],
                             :representation/id #uuid "56d28367-de7c-4c0b-bb7a-2fc3b78cc30d",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "OM",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111164],
  :concept/name "Pakistan",
  :concept/id #uuid "56d28367-91b8-4483-b52a-69490c06430e",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112164],
                             :representation/id #uuid "56d28367-450a-44f4-b01a-61abb0c51438",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Pakistan",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113164],
                             :representation/id #uuid "56d28367-6354-4878-9f42-bec6f702f923",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "PK",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111165],
  :concept/name "Palau",
  :concept/id #uuid "56d28367-921e-42df-9a8f-b0b989b24d51",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112165],
                             :representation/id #uuid "56d28367-0016-4f45-80b6-373ef8281df2",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Palau",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113165],
                             :representation/id #uuid "56d28367-e848-48c8-a234-02cc39cf812e",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "PW",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111166],
  :concept/name "Palestinian Territory,
 Occupied",
  :concept/id #uuid "56d28367-8faf-41b9-9be7-1e163ee80c73",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112166],
                             :representation/id #uuid "56d28367-cb3c-4f5e-aac9-19ff9fb01133",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Palestinian Territory,
 Occupied",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113166],
                             :representation/id #uuid "56d28367-89c6-4a69-be76-a3b80a819de7",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "PS",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111167],
  :concept/name "Panama",
  :concept/id #uuid "56d28367-252d-4503-98e8-485a7b0d1388",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112167],
                             :representation/id #uuid "56d28367-0f32-4052-8a77-b58605c39297",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Panama",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113167],
                             :representation/id #uuid "56d28367-6110-4eee-b560-ea670940467a",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "PA",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111168],
  :concept/name "Papua New Guinea",
  :concept/id #uuid "56d28367-e2b5-4a52-82c5-ff4d8030ffa4",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112168],
                             :representation/id #uuid "56d28367-b54b-4cd1-bfb6-a7ef82fbcfda",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Papua New Guinea",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113168],
                             :representation/id #uuid "56d28367-48f8-45e5-ab3b-a0542db9b2f4",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "PG",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111169],
  :concept/name "Paraguay",
  :concept/id #uuid "56d28367-4b40-4767-a1b8-6b317bfd0134",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112169],
                             :representation/id #uuid "56d28367-ca73-4a5d-bb7c-7b3f5c0b58d6",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Paraguay",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113169],
                             :representation/id #uuid "56d28367-cea9-42be-9277-1b9500d2f4ad",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "PY",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111170],
  :concept/name "Peru",
  :concept/id #uuid "56d28367-6beb-40b0-9f9a-ba6353f52f5e",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112170],
                             :representation/id #uuid "56d28367-17a4-4f12-8bae-933e505a6d95",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Peru",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113170],
                             :representation/id #uuid "56d28367-bfbf-4513-b738-262918629ca1",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "PE",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111171],
  :concept/name "Philippines",
  :concept/id #uuid "56d28367-cb2e-4b45-89be-ac5edc699d9c",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112171],
                             :representation/id #uuid "56d28367-470e-4bb3-a3f0-c0e114430718",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Philippines",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113171],
                             :representation/id #uuid "56d28367-dec2-4d9d-a5a6-9917a22ee3c1",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "PH",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111172],
  :concept/name "Pitcairn",
  :concept/id #uuid "56d28367-d463-498c-917a-bebbfd766708",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112172],
                             :representation/id #uuid "56d28367-97ba-4751-b27f-857e17fef947",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Pitcairn",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113172],
                             :representation/id #uuid "56d28367-0b03-4341-8724-dc3dafc7488b",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "PN",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111173],
  :concept/name "Poland",
  :concept/id #uuid "56d28367-08e7-46e0-9bb0-d37ed1397425",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112173],
                             :representation/id #uuid "56d28367-802d-4040-a83b-b3060111f506",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Poland",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113173],
                             :representation/id #uuid "56d28367-42c5-4407-86dd-e7ff87091b0d",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "PL",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111174],
  :concept/name "Portugal",
  :concept/id #uuid "56d28367-1121-4fc4-81c3-e69019d6895f",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112174],
                             :representation/id #uuid "56d28367-c785-4a20-8974-d24bf4723192",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Portugal",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113174],
                             :representation/id #uuid "56d28367-d399-4be7-a1ce-3b69fde23858",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "PT",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111175],
  :concept/name "Puerto Rico",
  :concept/id #uuid "56d28367-004d-431f-8b02-1c7645646d8e",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112175],
                             :representation/id #uuid "56d28367-3fda-4255-9bb5-91661a702d7c",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Puerto Rico",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113175],
                             :representation/id #uuid "56d28367-0a29-4435-9257-98692f120727",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "PR",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111176],
  :concept/name "Qatar",
  :concept/id #uuid "56d28367-891c-4920-8630-b6dee15e6357",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112176],
                             :representation/id #uuid "56d28367-1168-413f-9181-4c795471747d",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Qatar",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113176],
                             :representation/id #uuid "56d28367-7783-4981-b3a0-d69e7249d9ac",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "QA",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111177],
  :concept/name "Reunion",
  :concept/id #uuid "56d28367-213f-413f-8d0e-b1b884928184",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112177],
                             :representation/id #uuid "56d28367-4bfd-429e-96bc-f5d1418af412",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Reunion",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113177],
                             :representation/id #uuid "56d28367-c8d9-4184-94e2-b32f5e9dd194",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "RE",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111178],
  :concept/name "Romania",
  :concept/id #uuid "56d28367-3197-401b-9112-1b6938108516",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112178],
                             :representation/id #uuid "56d28367-2c6f-4667-89a9-9f267b94bd0d",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Romania",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113178],
                             :representation/id #uuid "56d28367-1cfb-4a4a-918e-2425506bd555",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "RO",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111179],
  :concept/name "Russian Federation",
  :concept/id #uuid "56d28367-831f-494e-aa83-4b3de84bcc2d",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112179],
                             :representation/id #uuid "56d28367-eb29-4bbc-828b-6594d0cdb572",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Russian Federation",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113179],
                             :representation/id #uuid "56d28367-0dda-4cb1-abb6-1c12bff261f9",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "RU",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111180],
  :concept/name "Rwanda",
  :concept/id #uuid "56d28367-71c3-4a57-8483-bb2431fb23e2",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112180],
                             :representation/id #uuid "56d28367-c75f-4694-ac28-8f323df2ede9",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Rwanda",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113180],
                             :representation/id #uuid "56d28367-8ef9-458d-8779-a70214da8bf9",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "RW",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111181],
  :concept/name "Saint Helena",
  :concept/id #uuid "56d28367-c2e8-40a7-9718-97e04a4d1edf",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112181],
                             :representation/id #uuid "56d28367-2e67-4c6a-8f68-d3744e2df216",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Saint Helena",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113181],
                             :representation/id #uuid "56d28367-2065-48f6-812d-0e526e4f7458",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "SH",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111182],
  :concept/name "Saint Kitts And Nevis",
  :concept/id #uuid "56d28367-8d59-4da6-9d8f-4ba836b45b52",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112182],
                             :representation/id #uuid "56d28367-0abd-4ab2-8d4c-add0248d887f",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Saint Kitts And Nevis",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113182],
                             :representation/id #uuid "56d28367-c584-4635-905a-a2d52af7887f",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "KN",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111183],
  :concept/name "Saint Lucia",
  :concept/id #uuid "56d28367-b733-44bd-a1e1-7c8d238dbb72",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112183],
                             :representation/id #uuid "56d28367-86b0-4e86-be96-24bc3162679b",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Saint Lucia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113183],
                             :representation/id #uuid "56d28367-7eed-409f-9237-5e831564d220",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "LC",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111184],
  :concept/name "Saint Pierre And Miquelon",
  :concept/id #uuid "56d28367-5866-4090-a8aa-06d81254f13f",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112184],
                             :representation/id #uuid "56d28367-747a-46c3-8e4e-af21a35ced81",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Saint Pierre And Miquelon",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113184],
                             :representation/id #uuid "56d28367-a7f6-41df-a047-39060e085af6",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "PM",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111185],
  :concept/name "Saint Vincent And The Grenadines",
  :concept/id #uuid "56d28367-0e7c-4d6c-8573-867db81169b6",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112185],
                             :representation/id #uuid "56d28367-fbba-4cda-a852-c9b9207a044c",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Saint Vincent And The Grenadines",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113185],
                             :representation/id #uuid "56d28367-04a2-48cf-8b5e-6bf7a95c547f",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "VC",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111186],
  :concept/name "Samoa",
  :concept/id #uuid "56d28367-d1b5-41d0-aaa3-801de8bfe1bd",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112186],
                             :representation/id #uuid "56d28367-2e3f-4f1c-96a0-e6935ad42855",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Samoa",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113186],
                             :representation/id #uuid "56d28367-24ba-402b-9d16-658aa0a80b18",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "WS",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111187],
  :concept/name "San Marino",
  :concept/id #uuid "56d28367-e27c-46d7-9959-e4bee005f51c",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112187],
                             :representation/id #uuid "56d28367-61a6-4be1-a363-617ef406ec8b",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "San Marino",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113187],
                             :representation/id #uuid "56d28367-f0b6-41fd-b116-213edd879fe5",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "SM",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111188],
  :concept/name "Sao Tome And Principe",
  :concept/id #uuid "56d28367-56c0-44eb-a1bd-ae96f77ea81b",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112188],
                             :representation/id #uuid "56d28367-e5b9-4b83-9715-8a9e33ba8394",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Sao Tome And Principe",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113188],
                             :representation/id #uuid "56d28367-c105-4deb-a60e-2cd0505d83a5",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "ST",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111189],
  :concept/name "Saudi Arabia",
  :concept/id #uuid "56d28367-ad2a-499e-b292-ce3c8cc15dec",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112189],
                             :representation/id #uuid "56d28367-9e36-4ab6-a76b-2461edd900a6",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Saudi Arabia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113189],
                             :representation/id #uuid "56d28367-4d9d-40a5-ad5e-0d3e9fb33dfc",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "SA",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111190],
  :concept/name "Senegal",
  :concept/id #uuid "56d28367-1b0b-492d-aba8-45b0190851ff",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112190],
                             :representation/id #uuid "56d28367-3c83-42aa-a4f2-856f97df31cd",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Senegal",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113190],
                             :representation/id #uuid "56d28367-3a46-4ae7-bf57-951c9f705959",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "SN",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111191],
  :concept/name "Serbia",
  :concept/id #uuid "56d28367-f80f-4ce1-a286-b2beac3fbb72",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112191],
                             :representation/id #uuid "56d28367-4c59-49b8-bcc9-36c6ae53b177",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Serbia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113191],
                             :representation/id #uuid "56d28367-097d-4287-9700-4a0777e7ae10",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "RS",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111192],
  :concept/name "Seychelles",
  :concept/id #uuid "56d28367-067e-4485-b172-0448bf78f16d",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112192],
                             :representation/id #uuid "56d28367-37f8-46f1-bce3-7e9c0f98e2c8",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Seychelles",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113192],
                             :representation/id #uuid "56d28367-a2b6-4658-b03f-782edd7b952c",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "SC",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111193],
  :concept/name "Sierra Leone",
  :concept/id #uuid "56d28367-c675-4839-8cf1-80cc8555a571",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112193],
                             :representation/id #uuid "56d28367-ff0c-48ca-8784-7da7548b1faa",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Sierra Leone",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113193],
                             :representation/id #uuid "56d28367-2588-4f5a-90d1-d2ca76aee23a",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "SL",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111194],
  :concept/name "Singapore",
  :concept/id #uuid "56d28367-3d5b-432c-9d5e-3264db6de1d2",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112194],
                             :representation/id #uuid "56d28367-6929-4f32-adf4-a06553341fb9",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Singapore",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113194],
                             :representation/id #uuid "56d28367-1eb7-4c8b-a833-ab07cff1be30",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "SG",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111195],
  :concept/name "Slovakia",
  :concept/id #uuid "56d28367-54dc-41ad-9ddb-dcf55185cd1c",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112195],
                             :representation/id #uuid "56d28367-c499-4e33-acea-91cf81ead2d6",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Slovakia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113195],
                             :representation/id #uuid "56d28367-1dc4-4e07-873f-0d8bacf0f40e",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "SK",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111196],
  :concept/name "Slovenia",
  :concept/id #uuid "56d28367-ba67-43e8-8a2b-1423ee367cea",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112196],
                             :representation/id #uuid "56d28367-f45e-4598-b022-f13b37cd7ec9",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Slovenia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113196],
                             :representation/id #uuid "56d28367-fb65-4610-92c4-3b897ee7a5e3",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "SI",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111197],
  :concept/name "Solomon Islands",
  :concept/id #uuid "56d28367-f687-43d1-9e6f-8a227b03d0db",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112197],
                             :representation/id #uuid "56d28367-a04a-4e9c-b92d-a0f40f014e11",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Solomon Islands",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113197],
                             :representation/id #uuid "56d28367-6ec8-4710-b14d-416276ec49ee",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "SB",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111198],
  :concept/name "Somalia",
  :concept/id #uuid "56d28367-9a7d-4741-9bee-6121d6ab4195",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112198],
                             :representation/id #uuid "56d28367-a0ea-46f2-81a0-f36fa8aeaee0",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Somalia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113198],
                             :representation/id #uuid "56d28367-5aaa-49d1-a798-de4fc5ae7961",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "SO",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111199],
  :concept/name "South Africa",
  :concept/id #uuid "56d28367-19ba-479a-aaf3-423d28674404",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112199],
                             :representation/id #uuid "56d28367-bcbb-4cf2-a333-07b7d48fb1dd",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "South Africa",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113199],
                             :representation/id #uuid "56d28367-c42c-4211-864d-806a577f2291",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "ZA",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111200],
  :concept/name "South Georgia And The South Sandwich Islands",
  :concept/id #uuid "56d28367-bb90-4283-a2a4-2798f8b7745d",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112200],
                             :representation/id #uuid "56d28367-bfba-473f-9387-8ad1fdad2ffd",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "South Georgia And The South Sandwich Islands",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113200],
                             :representation/id #uuid "56d28367-cb91-48e1-a523-fb2fde8ee587",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "GS",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111201],
  :concept/name "Spain",
  :concept/id #uuid "56d28367-246e-4dc7-a8d1-333e5e715554",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112201],
                             :representation/id #uuid "56d28367-aabe-4bd1-87e8-0708e7a1752e",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Spain",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113201],
                             :representation/id #uuid "56d28367-ccfe-4e82-9bf9-cd796a40799f",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "ES",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111202],
  :concept/name "Sri Lanka",
  :concept/id #uuid "56d28367-9dd6-4c43-b095-a1f5193555e4",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112202],
                             :representation/id #uuid "56d28367-cc1e-461b-812c-ca16541f8b57",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Sri Lanka",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113202],
                             :representation/id #uuid "56d28367-a73a-4107-bd57-9e76dccc23f4",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "LK",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111203],
  :concept/name "Sudan",
  :concept/id #uuid "56d28367-8d6e-4ca8-b052-0c35a374493e",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112203],
                             :representation/id #uuid "56d28367-2155-4145-9e29-c93702a552ba",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Sudan",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113203],
                             :representation/id #uuid "56d28367-ffa0-4286-ae9d-71bf3eb569a2",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "SD",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111204],
  :concept/name "Suriname",
  :concept/id #uuid "56d28367-3c85-4a1a-a80e-e881ca1a168c",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112204],
                             :representation/id #uuid "56d28367-2e2b-447a-a15a-e1530f8ade98",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Suriname",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113204],
                             :representation/id #uuid "56d28367-4f5b-40bb-89cf-b2c51b3e79bb",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "SR",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111205],
  :concept/name "Svalbard And Jan Mayen",
  :concept/id #uuid "56d28367-9b95-4574-a643-df404331cc5f",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112205],
                             :representation/id #uuid "56d28367-e175-4e67-a765-81d23b5e6e8f",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Svalbard And Jan Mayen",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113205],
                             :representation/id #uuid "56d28367-d9b1-4ab2-abbe-836654afd131",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "SJ",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111206],
  :concept/name "Swaziland",
  :concept/id #uuid "56d28367-4d94-4994-a41a-639982f49874",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112206],
                             :representation/id #uuid "56d28367-657c-4e2b-b2ac-0de18ede582b",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Swaziland",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113206],
                             :representation/id #uuid "56d28367-3e04-4dcd-859b-57c32e542849",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "SZ",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111207],
  :concept/name "Sweden",
  :concept/id #uuid "56d28367-d974-4761-a8f2-aadd4d831bd5",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112207],
                             :representation/id #uuid "56d28367-ae76-4da6-8270-51aa5907bf0c",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Sweden",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113207],
                             :representation/id #uuid "56d28367-8d97-4b9d-80db-a52cd457286c",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "SE",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111208],
  :concept/name "Switzerland",
  :concept/id #uuid "56d28367-3510-4475-a701-809b7e9b70e2",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112208],
                             :representation/id #uuid "56d28367-f725-4237-a341-217465ed31a8",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Switzerland",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113208],
                             :representation/id #uuid "56d28367-2c87-4eb8-8544-b2ac5d4ec587",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "CH",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111209],
  :concept/name "Syrian Arab Republic",
  :concept/id #uuid "56d28367-ff0e-4210-a900-2a3cf38e1c82",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112209],
                             :representation/id #uuid "56d28367-71e4-4069-8708-6cebec1a2073",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Syrian Arab Republic",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113209],
                             :representation/id #uuid "56d28367-9d3c-423f-8bc5-bc7f8aacf66d",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "SY",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111210],
  :concept/name "Taiwan,
 Province Of China",
  :concept/id #uuid "56d28367-7524-4aeb-8e1f-9fc4ae2e0b0d",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112210],
                             :representation/id #uuid "56d28367-fbe1-43f5-bcf6-b1dec702d243",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Taiwan,
 Province Of China",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113210],
                             :representation/id #uuid "56d28367-7f6d-4e34-b869-fc5937206bc5",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "TW",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111211],
  :concept/name "Tajikistan",
  :concept/id #uuid "56d28367-b4a3-4be7-a9c4-3a02bf055202",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112211],
                             :representation/id #uuid "56d28367-ffdc-4309-9815-60791fc142bb",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Tajikistan",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113211],
                             :representation/id #uuid "56d28367-f256-4713-bc92-10d547b7b337",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "TJ",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111212],
  :concept/name "Tanzania,
 United Republic Of",
  :concept/id #uuid "56d28367-2b83-4e83-afab-6b15a7228485",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112212],
                             :representation/id #uuid "56d28367-b6e9-4864-9638-3cf1016bc8f1",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Tanzania,
 United Republic Of",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113212],
                             :representation/id #uuid "56d28367-6656-4f81-bce1-7870933a2f3c",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "TZ",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111213],
  :concept/name "Thailand",
  :concept/id #uuid "56d28367-a5db-46b8-82b0-979b7fcb81a4",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112213],
                             :representation/id #uuid "56d28367-c649-41b6-81bc-1004c4575c3c",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Thailand",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113213],
                             :representation/id #uuid "56d28367-c973-44c6-8c1f-80bcd7480d2b",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "TH",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111214],
  :concept/name "Togo",
  :concept/id #uuid "56d28367-541a-4810-9095-be4e83923e92",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112214],
                             :representation/id #uuid "56d28367-4e3f-4422-998a-99be57adac21",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Togo",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113214],
                             :representation/id #uuid "56d28367-5783-40a6-90e9-efca9736907b",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "TG",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111215],
  :concept/name "Tokelau",
  :concept/id #uuid "56d28367-e23b-45eb-b27f-cd3f1d2d0385",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112215],
                             :representation/id #uuid "56d28367-600d-4481-8c99-ef1c802e492b",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Tokelau",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113215],
                             :representation/id #uuid "56d28367-bc68-427f-8412-9409ef9d386f",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "TK",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111216],
  :concept/name "Tonga",
  :concept/id #uuid "56d28367-2d29-4d7d-9c37-a6d848c5a8aa",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112216],
                             :representation/id #uuid "56d28367-395f-466a-b397-4e133be4f33d",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Tonga",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113216],
                             :representation/id #uuid "56d28367-1309-4baa-9eaa-7c22441988ec",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "TO",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111217],
  :concept/name "Trinidad And Tobago",
  :concept/id #uuid "56d28367-122d-46b4-87e7-a421f5941b49",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112217],
                             :representation/id #uuid "56d28367-85fc-4441-9963-f7a69bb129ef",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Trinidad And Tobago",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113217],
                             :representation/id #uuid "56d28367-3299-41a0-8981-d5aea0eea583",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "TT",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111218],
  :concept/name "Tunisia",
  :concept/id #uuid "56d28367-6cd4-4b1e-a347-0a89c5aade93",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112218],
                             :representation/id #uuid "56d28367-feec-419d-a38f-910c83c7796b",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Tunisia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113218],
                             :representation/id #uuid "56d28367-dc53-4ba7-b575-32b8eb4cc735",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "TN",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111219],
  :concept/name "Turkey",
  :concept/id #uuid "56d28367-e642-4259-aa2f-0f40b52a94a7",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112219],
                             :representation/id #uuid "56d28367-9f12-48ec-adf1-d296ed3414de",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Turkey",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113219],
                             :representation/id #uuid "56d28367-7dba-40de-9790-71aa89c0ee7b",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "TR",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111220],
  :concept/name "Turkmenistan",
  :concept/id #uuid "56d28367-f89c-40cc-af16-7e8dfebaa112",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112220],
                             :representation/id #uuid "56d28367-12c4-4dcf-b9be-48d288592fe1",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Turkmenistan",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113220],
                             :representation/id #uuid "56d28367-2155-4efc-98bf-83bba13ca66f",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "TM",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111221],
  :concept/name "Turks And Caicos Islands",
  :concept/id #uuid "56d28367-f3be-41d6-8ec3-7df5a2c321c2",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112221],
                             :representation/id #uuid "56d28367-308b-40bb-b42e-59a91bccf746",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Turks And Caicos Islands",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113221],
                             :representation/id #uuid "56d28367-8115-4095-96a2-1fc6771033b2",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "TC",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111222],
  :concept/name "Tuvalu",
  :concept/id #uuid "56d28367-2294-4adf-9adc-733863f11824",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112222],
                             :representation/id #uuid "56d28367-f9b9-4d2c-9dcf-c285a932a90c",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Tuvalu",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113222],
                             :representation/id #uuid "56d28367-e3d4-40ee-a1da-c86f231ea283",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "TV",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111223],
  :concept/name "Uganda",
  :concept/id #uuid "56d28367-d37b-4fe8-8f4f-01364271fe95",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112223],
                             :representation/id #uuid "56d28367-bc8c-4387-8386-422ca68f01bf",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Uganda",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113223],
                             :representation/id #uuid "56d28367-0469-4f30-ac80-027538421096",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "UG",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111224],
  :concept/name "Ukraine",
  :concept/id #uuid "56d28367-398f-41e7-9215-a717d32ed756",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112224],
                             :representation/id #uuid "56d28367-032d-44d8-baa7-abd81ed2003f",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Ukraine",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113224],
                             :representation/id #uuid "56d28367-f02e-40d8-ad16-b9a29211e483",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "UA",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111225],
  :concept/name "United Arab Emirates",
  :concept/id #uuid "56d28367-bfc4-4234-80d2-62081fe49966",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112225],
                             :representation/id #uuid "56d28367-e8fe-4429-8dbd-625fe15de265",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "United Arab Emirates",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113225],
                             :representation/id #uuid "56d28367-c031-454f-92c7-5bd9a2305790",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "AE",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111226],
  :concept/name "United Kingdom",
  :concept/id #uuid "56d28367-8f87-47d7-881d-765f6981b799",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112226],
                             :representation/id #uuid "56d28367-8829-4788-92d4-4b71607d8818",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "United Kingdom",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113226],
                             :representation/id #uuid "56d28367-72fc-40be-b33f-07465e4e19ab",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "GB",
                             :representation/locale "en-US"}]} 
     usa
 {:db/id #db/id[:db.part/user -111228],
  :concept/name "United States Minor Outlying Islands",
  :concept/id #uuid "56d28367-7923-4cf3-aa61-ec5916263a33",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112228],
                             :representation/id #uuid "56d28367-0641-4383-9e1a-b0ce67fc4856",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "United States Minor Outlying Islands",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113228],
                             :representation/id #uuid "56d28367-a769-4ebe-9d4b-70ac6a04c5ca",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "UM",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111229],
  :concept/name "Uruguay",
  :concept/id #uuid "56d28367-6e4c-4ea9-a385-c0bd635b9c7b",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112229],
                             :representation/id #uuid "56d28367-af5e-43d2-a75b-0d4bf11c0109",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Uruguay",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113229],
                             :representation/id #uuid "56d28367-ec05-4af2-abe8-75215afc7b9d",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "UY",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111230],
  :concept/name "Uzbekistan",
  :concept/id #uuid "56d28367-79a2-4c80-a9ad-3bd578f3e000",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112230],
                             :representation/id #uuid "56d28367-77b1-4a64-aa0d-04242ef40e88",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Uzbekistan",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113230],
                             :representation/id #uuid "56d28367-6607-4bcd-aa0d-01cf48613db8",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "UZ",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111231],
  :concept/name "Vanuatu",
  :concept/id #uuid "56d28367-8e54-4938-80c7-0fcef9156ad5",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112231],
                             :representation/id #uuid "56d28367-5af1-49ce-8348-61ec85c85217",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Vanuatu",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113231],
                             :representation/id #uuid "56d28367-2bc1-4b82-bbb8-214038d80615",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "VU",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111232],
  :concept/name "Venezuela",
  :concept/id #uuid "56d28367-8b8c-4bac-a986-dea827178fee",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112232],
                             :representation/id #uuid "56d28367-7030-4ade-804f-65b8ce99ca06",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Venezuela",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113232],
                             :representation/id #uuid "56d28367-7e90-4589-a0af-e04e6629eb0d",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "VE",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111233],
  :concept/name "Viet Nam",
  :concept/id #uuid "56d28367-8468-4fc4-b7f5-608879c3d247",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112233],
                             :representation/id #uuid "56d28367-1535-4e1b-8282-dbb7fd9708e1",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Viet Nam",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113233],
                             :representation/id #uuid "56d28367-2348-4b5d-977d-3e5716f816d7",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "VN",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111234],
  :concept/name "Virgin Islands,
 British",
  :concept/id #uuid "56d28367-d256-4837-af47-3578fed12cd1",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112234],
                             :representation/id #uuid "56d28367-4395-412e-aa57-8e24096e05c3",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Virgin Islands,
 British",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113234],
                             :representation/id #uuid "56d28367-5ae5-4256-a117-14419e3f03fa",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "VG",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111235],
  :concept/name "Virgin Islands,
 U.s.",
  :concept/id #uuid "56d28367-f646-4527-9eb4-8f2712b3977e",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112235],
                             :representation/id #uuid "56d28367-e453-44b7-bdeb-9dd05ceec8e9",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Virgin Islands,
 U.s.",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113235],
                             :representation/id #uuid "56d28367-1d7e-47f2-95ee-a9f0156bba53",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "VI",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111236],
  :concept/name "Wallis And Futuna",
  :concept/id #uuid "56d28367-e82b-4df2-90ee-3e8cf0b53d83",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112236],
                             :representation/id #uuid "56d28367-fd8b-4003-9efb-1160f30660f6",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Wallis And Futuna",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113236],
                             :representation/id #uuid "56d28367-5b1d-428a-a78f-d2ea347927b1",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "WF",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111237],
  :concept/name "Western Sahara",
  :concept/id #uuid "56d28367-ad0f-4caa-b3b4-af45e21017ca",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112237],
                             :representation/id #uuid "56d28367-a654-41c2-9898-0c233ef38700",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Western Sahara",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113237],
                             :representation/id #uuid "56d28367-1f6f-4f4c-a4bb-35fe8f3ae588",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "EH",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111238],
  :concept/name "Yemen",
  :concept/id #uuid "56d28367-b5f3-41f5-aa86-75457e465687",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112238],
                             :representation/id #uuid "56d28367-b4fd-4eb7-8597-d5ed7272f6a6",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Yemen",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113238],
                             :representation/id #uuid "56d28367-5dbd-49d2-a30a-6f53fa762c89",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "YE",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111239],
  :concept/name "Zambia",
  :concept/id #uuid "56d28367-f9d9-4547-b4c4-b1ea70be94e7",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112239],
                             :representation/id #uuid "56d28367-4726-4f63-9bee-875936e5c881",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Zambia",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113239],
                             :representation/id #uuid "56d28367-a99b-418d-992f-295fb7b36081",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "ZM",
                             :representation/locale "en-US"}]} 
 {:db/id #db/id[:db.part/user -111240],
  :concept/name "Zimbabwe",
  :concept/id #uuid "56d28367-4143-40bc-8af5-90c1bd842e67",
  :concept/representations [
                            {:db/id #db/id[:db.part/user -112240],
                             :representation/id #uuid "56d28367-2e97-41c6-9eec-12727bff7959",
                             :representation/concept [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ],
                             :representation/value "Zimbabwe",
                             :representation/locale "en-US"} 
                            {:db/id #db/id[:db.part/user -113240],
                             :representation/id #uuid "56d28367-eaee-49fa-8d00-a990e003f1f4",
                             :representation/concept  [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ],
                             :representation/value "ZW",
                             :representation/locale "en-US"}]}

])


(def countries-domain
  [
   {:db/id #db/id[:db.part/user -121000],
    :domain/id #uuid "56d2861d-be1e-4059-9d32-c06eb4e06eff"
    :domain/concept [:concept/id #uuid "56d2757b-4832-4027-8475-a16fa3fa1559"] ;#db/id [:db.part/user -10001]
    :domain/name "Countries"
    :domain/members members
    }])


;; (def countries
;;   [["AF" "Afghanistan"]
;;    ["AL" "Albania"]
;; ["DZ" "Algeria"]
;; ["AS" "American Samoa"]
;; ["AD" "Andorra"]
;; ["AO" "Angola"]
;; ["AI" "Anguilla"]
;; ["AQ" "Antarctica"]
;; ["AG" "Antigua And Barbuda"]
;; ["AR" "Argentina"]
;; ["AM" "Armenia"]
;; ["AW" "Aruba"]
;; ["AU" "Australia"]
;; ["AT" "Austria"]
;; ["AZ" "Azerbaijan"]
;; ["BS" "Bahamas"]
;; ["BH" "Bahrain"]
;; ["BD" "Bangladesh"]
;; ["BB" "Barbados"]
;; ["BY" "Belarus"]
;; ["BE" "Belgium"]
;; ["BZ" "Belize"]
;; ["BJ" "Benin"]
;; ["BM" "Bermuda"]
;; ["BT" "Bhutan"]
;; ["BO" "Bolivia"]
;; ["BA" "Bosnia And Herzegovina"]
;; ["BW" "Botswana"]
;; ["BV" "Bouvet Island"]
;; ["BR" "Brazil"]
;; ["IO" "British Indian Ocean Territory"]
;; ["BN" "Brunei Darussalam"]
;; ["BG" "Bulgaria"]
;; ["BF" "Burkina Faso"]
;; ["BI" "Burundi"]
;; ["KH" "Cambodia"]
;; ["CM" "Cameroon"]
;; ["CA" "Canada"]
;; ["CV" "Cape Verde"]
;; ["KY" "Cayman Islands"]
;; ["CF" "Central African Republic"]
;; ["TD" "Chad"]
;; ["CL" "Chile"]
;; ["CN" "China"]
;; ["CX" "Christmas Island"]
;; ["CC" "Cocos (keeling) Islands"]
;; ["CO" "Colombia"]
;; ["KM" "Comoros"]
;; ["CG" "Congo"]
;; ["CD" "Congo, The Democratic Republic Of The"]
;; ["CK" "Cook Islands"]
;; ["CR" "Costa Rica"]
;; ["CI" "Cote D'ivoire"]
;; ["HR" "Croatia"]
;; ["CU" "Cuba"]
;; ["CY" "Cyprus"]
;; ["CZ" "Czech Republic"]
;; ["DK" "Denmark"]
;; ["DJ" "Djibouti"]
;; ["DM" "Dominica"]
;; ["DO" "Dominican Republic"]
;; ["TP" "East Timor"]
;; ["EC" "Ecuador"]
;; ["EG" "Egypt"]
;; ["SV" "El Salvador"]
;; ["GQ" "Equatorial Guinea"]
;; ["ER" "Eritrea"]
;; ["EE" "Estonia"]
;; ["ET" "Ethiopia"]
;; ["FK" "Falkland Islands (malvinas)"]
;; ["FO" "Faroe Islands"]
;; ["FJ" "Fiji"]
;; ["FI" "Finland"]
;; ["FR" "France"]
;; ["GF" "French Guiana"]
;; ["PF" "French Polynesia"]
;; ["TF" "French Southern Territories"]
;; ["GA" "Gabon"]
;; ["GM" "Gambia"]
;; ["GE" "Georgia"]
;; ["DE" "Germany"]
;; ["GH" "Ghana"]
;; ["GI" "Gibraltar"]
;; ["GR" "Greece"]
;; ["GL" "Greenland"]
;; ["GD" "Grenada"]
;; ["GP" "Guadeloupe"]
;; ["GU" "Guam"]
;; ["GT" "Guatemala"]
;; ["GN" "Guinea"]
;; ["GW" "Guinea-bissau"]
;; ["GY" "Guyana"]
;; ["HT" "Haiti"]
;; ["HM" "Heard Island And Mcdonald Islands"]
;; ["VA" "Holy See (vatican City State)"]
;; ["HN" "Honduras"]
;; ["HK" "Hong Kong"]
;; ["HU" "Hungary"]
;; ["IS" "Iceland"]
;; ["IN" "India"]
;; ["ID" "Indonesia"]
;; ["IR" "Iran, Islamic Republic Of"]
;; ["IQ" "Iraq"]
;; ["IE" "Ireland"]
;; ["IL" "Israel"]
;; ["IT" "Italy"]
;; ["JM" "Jamaica"]
;; ["JP" "Japan"]
;; ["JO" "Jordan"]
;; ["KZ" "Kazakstan"]
;; ["KE" "Kenya"]
;; ["KI" "Kiribati"]
;; ["KP" "Korea, Democratic People's Republic Of"]
;; ["KR" "Korea, Republic Of"]
;; ["KV" "Kosovo"]
;; ["KW" "Kuwait"]
;; ["KG" "Kyrgyzstan"]
;; ["LA" "Lao People's Democratic Republic"]
;; ["LV" "Latvia"]
;; ["LB" "Lebanon"]
;; ["LS" "Lesotho"]
;; ["LR" "Liberia"]
;; ["LY" "Libyan Arab Jamahiriya"]
;; ["LI" "Liechtenstein"]
;; ["LT" "Lithuania"]
;; ["LU" "Luxembourg"]
;; ["MO" "Macau"]
;; ["MK" "Macedonia, The Former Yugoslav Republic Of"]
;; ["MG" "Madagascar"]
;; ["MW" "Malawi"]
;; ["MY" "Malaysia"]
;; ["MV" "Maldives"]
;; ["ML" "Mali"]
;; ["MT" "Malta"]
;; ["MH" "Marshall Islands"]
;; ["MQ" "Martinique"]
;; ["MR" "Mauritania"]
;; ["MU" "Mauritius"]
;; ["YT" "Mayotte"]
;; ["MX" "Mexico"]
;; ["FM" "Micronesia, Federated States Of"]
;; ["MD" "Moldova, Republic Of"]
;; ["MC" "Monaco"]
;; ["MN" "Mongolia"]
;; ["MS" "Montserrat"]
;; ["ME" "Montenegro"]
;; ["MA" "Morocco"]
;; ["MZ" "Mozambique"]
;; ["MM" "Myanmar"]
;; ["NA" "Namibia"]
;; ["NR" "Nauru"]
;; ["NP" "Nepal"]
;; ["NL" "Netherlands"]
;; ["AN" "Netherlands Antilles"]
;; ["NC" "New Caledonia"]
;; ["NZ" "New Zealand"]
;; ["NI" "Nicaragua"]
;; ["NE" "Niger"]
;; ["NG" "Nigeria"]
;; ["NU" "Niue"]
;; ["NF" "Norfolk Island"]
;; ["MP" "Northern Mariana Islands"]
;; ["NO" "Norway"]
;; ["OM" "Oman"]
;; ["PK" "Pakistan"]
;; ["PW" "Palau"]
;; ["PS" "Palestinian Territory, Occupied"]
;; ["PA" "Panama"]
;; ["PG" "Papua New Guinea"]
;; ["PY" "Paraguay"]
;; ["PE" "Peru"]
;; ["PH" "Philippines"]
;; ["PN" "Pitcairn"]
;; ["PL" "Poland"]
;; ["PT" "Portugal"]
;; ["PR" "Puerto Rico"]
;; ["QA" "Qatar"]
;; ["RE" "Reunion"]
;; ["RO" "Romania"]
;; ["RU" "Russian Federation"]
;; ["RW" "Rwanda"]
;; ["SH" "Saint Helena"]
;; ["KN" "Saint Kitts And Nevis"]
;; ["LC" "Saint Lucia"]
;; ["PM" "Saint Pierre And Miquelon"]
;; ["VC" "Saint Vincent And The Grenadines"]
;; ["WS" "Samoa"]
;; ["SM" "San Marino"]
;; ["ST" "Sao Tome And Principe"]
;; ["SA" "Saudi Arabia"]
;; ["SN" "Senegal"]
;; ["RS" "Serbia"]
;; ["SC" "Seychelles"]
;; ["SL" "Sierra Leone"]
;; ["SG" "Singapore"]
;; ["SK" "Slovakia"]
;; ["SI" "Slovenia"]
;; ["SB" "Solomon Islands"]
;; ["SO" "Somalia"]
;; ["ZA" "South Africa"]
;; ["GS" "South Georgia And The South Sandwich Islands"]
;; ["ES" "Spain"]
;; ["LK" "Sri Lanka"]
;; ["SD" "Sudan"]
;; ["SR" "Suriname"]
;; ["SJ" "Svalbard And Jan Mayen"]
;; ["SZ" "Swaziland"]
;; ["SE" "Sweden"]
;; ["CH" "Switzerland"]
;; ["SY" "Syrian Arab Republic"]
;; ["TW" "Taiwan, Province Of China"]
;; ["TJ" "Tajikistan"]
;; ["TZ" "Tanzania, United Republic Of"]
;; ["TH" "Thailand"]
;; ["TG" "Togo"]
;; ["TK" "Tokelau"]
;; ["TO" "Tonga"]
;; ["TT" "Trinidad And Tobago"]
;; ["TN" "Tunisia"]
;; ["TR" "Turkey"]
;; ["TM" "Turkmenistan"]
;; ["TC" "Turks And Caicos Islands"]
;; ["TV" "Tuvalu"]
;; ["UG" "Uganda"]
;; ["UA" "Ukraine"]
;; ["AE" "United Arab Emirates"]
;; ["GB" "United Kingdom"]
;; ["US" "United States"]
;; ["UM" "United States Minor Outlying Islands"]
;; ["UY" "Uruguay"]
;; ["UZ" "Uzbekistan"]
;; ["VU" "Vanuatu"]
;; ["VE" "Venezuela"]
;; ["VN" "Viet Nam"]
;; ["VG" "Virgin Islands, British"]
;; ["VI" "Virgin Islands, U.s."]
;; ["WF" "Wallis And Futuna"]
;; ["EH" "Western Sahara"]
;; ["YE" "Yemen"]
;; ["ZM" "Zambia"]
;;    ["ZW" "Zimbabwe"]])


;; (defn to-map [[code name] id rep-id rep-id2]

   
;;    {:db/id  (d/tempid :db.part/user id)
;;     :concept/name name
;;     :concept/id  (d/squuid)
;;     :concept/representations [
;;                               {:db/id (d/tempid :db.part/user rep-id)
;;                                :representation/id (d/squuid)
;;                                :representation/concept  [  :concept/id #uuid "56d2767c-fd6c-4665-b71a-0c3dc82e92b3" ]
;;                                :representation/value    name
;;                                :representation/locale   "en-US"}
                              
;;                               {:db/id (d/tempid :db.part/user rep-id2)
;;                                :representation/id  (d/squuid)
;;                                :representation/concept   [ :concept/id #uuid "56d276bf-56d8-4563-9b68-3707d73f03af" ]
;;                                :representation/value    code
;;                                :representation/locale   "en-US"}]
;;     }
;;    )


