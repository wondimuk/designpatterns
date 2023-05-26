package org.collections.comparator;

import java.util.Objects;

public class Employee {
    private String name;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee() {
    }

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public static class Address {
        private String address1;
        private String address2;
        private String State;
        private String zipcode;

        @Override
        public String toString() {
            return "Address{" +
                    "address1='" + address1 + '\'' +
                    ", address2='" + address2 + '\'' +
                    ", State='" + State + '\'' +
                    ", zipcode='" + zipcode + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Address)) return false;
            Address address = (Address) o;
            return address1.equals(address.address1) && address2.equals(address.address2) && State.equals(address.State) && zipcode.equals(address.zipcode);
        }

        @Override
        public int hashCode() {
            return Objects.hash(address1, address2, State, zipcode);
        }

        public String getAddress1() {
            return address1;
        }

        public void setAddress1(String address1) {
            this.address1 = address1;
        }

        public String getAddress2() {
            return address2;
        }

        public void setAddress2(String address2) {
            this.address2 = address2;
        }

        public String getState() {
            return State;
        }

        public void setState(String state) {
            State = state;
        }

        public String getZipcode() {
            return zipcode;
        }

        public void setZipcode(String zipcode) {
            this.zipcode = zipcode;
        }

        public Address() {
        }

        public Address(String address1, String address2, String state, String zipcode) {
            this.address1 = address1;
            this.address2 = address2;
            State = state;
            this.zipcode = zipcode;
        }
    }
}
