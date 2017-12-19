# Public Configuration Service (PCS)

Servicio de configuracion pública que se encarga de servir:

* Asistencia Contextual
    * Faqs
    * Tutoriales
    * Release Notes
    * Videos de ayuda
    * Imagenes de ayuda

## Pre-requisitos

You will need the following things properly installed on your computer.

* [Git](https://git-scm.com/)
* [Maven](https://maven.apache.org/)


## Installation

* `$ git clone https://descinet.bbva.es/stash/.......git`
* `$ cd pcs`
* `$ mvn clean install`
* `$ mvn spring-boot:run`

## Running / Development

...

## Deploy
...

## Example

* URL:

    [http://localhost:8080/faqs/codification/v1](http://localhost:8080/faqs/codification/v1)

* Body:

   {"location":"location.index",
    "locationName":"locationName",
    "faqs":{
        "faq1":[
            {
            "id":"1850",
            "content":"texto de la faq spa",
            "lang":"spa"
            },
            {
            "id":"1852",
            "content":"texto de la faq eng",
            "lang":"eng"
            },
            {
            "id":"1854",
            "content":"texto de la faq cat",
            "lang":"cat"
            },
            {
            "id":"1856",
            "content":"texto de la faq glg",
            "lang":"glg"
            },
            {
            "id":"1858",
            "content":"texto de la faq eus",
            "lang":"eus"
            }
        ],
        "faq2":[
            {
            "id":"1851",
            "content":"texto2 de la faq spa",
            "lang":"spa"
            },
            {
            "id":"1853",
            "content":"texto de la faq eng",
            "lang":"eng"
            },
            {
            "id":"1855",
            "content":"texto2 de la faq cat",
            "lang":"cat"
            },
            {
            "id":"1857",
            "content":"texto2 de la faq glg",
            "lang":"glg"
            },
            {
            "id":"1859",
            "content":"texto2 de la faq eus",
            "lang":"eus"
            }
        ]}
    }
```

* Result:

{
    "templateFaq": {
        "location": "location.index",
        "code": "faqs",
        "faqs": [
            {
                "id": "@@locationNameFaq1Id",
                "title": "@@locationNameFaq1Title",
                "callbackId": "1"
            },
            {
                "id": "@@locationNameFaq2Id",
                "title": "@@locationNameFaq2Title",
                "callbackId": "1"
            }
        ]
    },
    "mappingFaq": {
        "mappings": [
            {
                "locationNameFaq1Title": [
                    {
                        "conditions": [
                            {
                                "lang": "spa"
                            }
                        ],
                        "value": "texto de la faq spa"
                    },
                    {
                        "conditions": [
                            {
                                "lang": "eng"
                            }
                        ],
                        "value": "texto de la faq eng"
                    },
                    {
                        "conditions": [
                            {
                                "lang": "cat"
                            }
                        ],
                        "value": "texto de la faq cat"
                    },
                    {
                        "conditions": [
                            {
                                "lang": "glg"
                            }
                        ],
                        "value": "texto de la faq glg"
                    },
                    {
                        "conditions": [
                            {
                                "lang": "eus"
                            }
                        ],
                        "value": "texto de la faq eus"
                    }
                ],
                "locationNameFaq1Id": [
                    {
                        "conditions": [
                            {
                                "lang": "spa"
                            }
                        ],
                        "value": "1850"
                    },
                    {
                        "conditions": [
                            {
                                "lang": "eng"
                            }
                        ],
                        "value": "1852"
                    },
                    {
                        "conditions": [
                            {
                                "lang": "cat"
                            }
                        ],
                        "value": "1854"
                    },
                    {
                        "conditions": [
                            {
                                "lang": "glg"
                            }
                        ],
                        "value": "1856"
                    },
                    {
                        "conditions": [
                            {
                                "lang": "eus"
                            }
                        ],
                        "value": "1858"
                    }
                ]
            },
            {
                "locationNameFaq2Title": [
                    {
                        "conditions": [
                            {
                                "lang": "spa"
                            }
                        ],
                        "value": "texto2 de la faq spa"
                    },
                    {
                        "conditions": [
                            {
                                "lang": "eng"
                            }
                        ],
                        "value": "texto de la faq eng"
                    },
                    {
                        "conditions": [
                            {
                                "lang": "cat"
                            }
                        ],
                        "value": "texto2 de la faq cat"
                    },
                    {
                        "conditions": [
                            {
                                "lang": "glg"
                            }
                        ],
                        "value": "texto2 de la faq glg"
                    },
                    {
                        "conditions": [
                            {
                                "lang": "eus"
                            }
                        ],
                        "value": "texto2 de la faq eus"
                    }
                ],
                "locationNameFaq2Id": [
                    {
                        "conditions": [
                            {
                                "lang": "spa"
                            }
                        ],
                        "value": "1851"
                    },
                    {
                        "conditions": [
                            {
                                "lang": "eng"
                            }
                        ],
                        "value": "1853"
                    },
                    {
                        "conditions": [
                            {
                                "lang": "cat"
                            }
                        ],
                        "value": "1855"
                    },
                    {
                        "conditions": [
                            {
                                "lang": "glg"
                            }
                        ],
                        "value": "1857"
                    },
                    {
                        "conditions": [
                            {
                                "lang": "eus"
                            }
                        ],
                        "value": "1859"
                    }
                ]
            }
        ]
    }
}
```
