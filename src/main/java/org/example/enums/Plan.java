package org.example.enums;

public enum Plan {
        BASIC(1, "Basic"),
        PREMIUM(2, "Premium"),
        ULTIMATE(3, "Ultimate");

        private final int id;
        private final String name;

        Plan(int id, String name) {
                this.id = id;
                this.name = name;
        }

        public int getId() {
                return id;
        }

        public String getName() {
                return name;
        }
}