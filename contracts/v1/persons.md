FORMAT: 1A

# Person

Get persons

## Resource persons [/api/example/persons]

### Get persons [GET]

+ Request

    + Headers

                Accept: application/vnd.example.person.v1+json
                Content-Type: application/vnd.example.person.v1+json

+ Response 200 (application/vnd.example.person.v1+json)

    + Body

                {
                    "_links": {
                        "self": {
                            "href": "/api/example/persons"
                        }
                    },
                    "total": 2,
                    "count": 2,
                    "_embedded": {
                        "persons": [
                            { "name": "Tony", "age": 23 },
                            { "name": "Sunny", "age": 19 }
                        ]
                    }   
                }
    
    + Schema

                {
                    "$schema": "http://json-schema.org/draft-07/schema",
                    "$id": "http://example.com/example.json",
                    "type": "object",
                    "title": "The root schema",
                    "description": "The root schema comprises the entire JSON document.",
                    "default": {},
                    "examples": [
                        {
                            "_links": {
                                "self": {
                                    "href": "/api/example/persons"
                                }
                            },
                            "total": 2,
                            "count": 2,
                            "_embedded": {
                                "persons": [
                                    {
                                        "name": "Tony",
                                        "age": 23
                                    },
                                    {
                                        "name": "Sunny",
                                        "age": 19
                                    }
                                ]
                            }
                        }
                    ],
                    "required": [
                        "_links",
                        "total",
                        "count",
                        "_embedded"
                    ],
                    "properties": {
                        "_links": {
                            "$id": "#/properties/_links",
                            "type": "object",
                            "title": "The _links schema",
                            "description": "An explanation about the purpose of this instance.",
                            "default": {},
                            "examples": [
                                {
                                    "self": {
                                        "href": "/api/example/persons"
                                    }
                                }
                            ],
                            "required": [
                                "self"
                            ],
                            "properties": {
                                "self": {
                                    "$id": "#/properties/_links/properties/self",
                                    "type": "object",
                                    "title": "The self schema",
                                    "description": "An explanation about the purpose of this instance.",
                                    "default": {},
                                    "examples": [
                                        {
                                            "href": "/api/example/persons"
                                        }
                                    ],
                                    "required": [
                                        "href"
                                    ],
                                    "properties": {
                                        "href": {
                                            "$id": "#/properties/_links/properties/self/properties/href",
                                            "type": "string",
                                            "title": "The href schema",
                                            "description": "An explanation about the purpose of this instance.",
                                            "default": "",
                                            "examples": [
                                                "/api/example/persons"
                                            ]
                                        }
                                    },
                                    "additionalProperties": true
                                }
                            },
                            "additionalProperties": true
                        },
                        "total": {
                            "$id": "#/properties/total",
                            "type": "integer",
                            "title": "The total schema",
                            "description": "An explanation about the purpose of this instance.",
                            "default": 0,
                            "examples": [
                                2
                            ]
                        },
                        "count": {
                            "$id": "#/properties/count",
                            "type": "integer",
                            "title": "The count schema",
                            "description": "An explanation about the purpose of this instance.",
                            "default": 0,
                            "examples": [
                                2
                            ]
                        },
                        "_embedded": {
                            "$id": "#/properties/_embedded",
                            "type": "object",
                            "title": "The _embedded schema",
                            "description": "An explanation about the purpose of this instance.",
                            "default": {},
                            "examples": [
                                {
                                    "persons": [
                                        {
                                            "name": "Tony",
                                            "age": 23
                                        },
                                        {
                                            "name": "Sunny",
                                            "age": 19
                                        }
                                    ]
                                }
                            ],
                            "required": [
                                "persons"
                            ],
                            "properties": {
                                "persons": {
                                    "$id": "#/properties/_embedded/properties/persons",
                                    "type": "array",
                                    "title": "The persons schema",
                                    "description": "An explanation about the purpose of this instance.",
                                    "default": [],
                                    "examples": [
                                        [
                                            {
                                                "name": "Tony",
                                                "age": 23
                                            },
                                            {
                                                "name": "Sunny",
                                                "age": 19
                                            }
                                        ]
                                    ],
                                    "additionalItems": true,
                                    "items": {
                                        "$id": "#/properties/_embedded/properties/persons/items",
                                        "anyOf": [
                                            {
                                                "$id": "#/properties/_embedded/properties/persons/items/anyOf/0",
                                                "type": "object",
                                                "title": "The first anyOf schema",
                                                "description": "An explanation about the purpose of this instance.",
                                                "default": {},
                                                "examples": [
                                                    {
                                                        "name": "Tony",
                                                        "age": 23
                                                    }
                                                ],
                                                "required": [
                                                    "name",
                                                    "age"
                                                ],
                                                "properties": {
                                                    "name": {
                                                        "$id": "#/properties/_embedded/properties/persons/items/anyOf/0/properties/name",
                                                        "type": "string",
                                                        "title": "The name schema",
                                                        "description": "An explanation about the purpose of this instance.",
                                                        "default": "",
                                                        "examples": [
                                                            "Tony"
                                                        ]
                                                    },
                                                    "age": {
                                                        "$id": "#/properties/_embedded/properties/persons/items/anyOf/0/properties/age",
                                                        "type": "integer",
                                                        "title": "The age schema",
                                                        "description": "An explanation about the purpose of this instance.",
                                                        "default": 0,
                                                        "examples": [
                                                            23
                                                        ]
                                                    }
                                                },
                                                "additionalProperties": true
                                            }
                                        ]
                                    }
                                }
                            },
                            "additionalProperties": true
                        }
                    },
                    "additionalProperties": true
                }

