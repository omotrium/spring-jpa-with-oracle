package com.trium.demo.Entity;

import javax.persistence.*;




    @Entity
    @Table(name = "DEPARTMENT_TABLE")
    public class Department {


        @Column(name = "id")
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private  Integer id;
        @Column(name = "name")
        private  String name;

        public Department() {

        }

        public Department(Integer id,String name) {
            this.id = id;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Department{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
