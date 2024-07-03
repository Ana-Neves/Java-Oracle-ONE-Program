package com.forumhub.entidades;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

public class Course {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
}

